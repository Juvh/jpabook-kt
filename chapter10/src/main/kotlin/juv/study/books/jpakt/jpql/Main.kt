package juv.study.books.jpakt.jpql

import juv.study.books.jpakt.entityManagerFactory
import juv.study.books.jpakt.execute
import java.math.BigDecimal
import javax.persistence.Query
import javax.persistence.TypedQuery

fun main() {
    println()
    println("==================== save ====================")
    save()

    kindOfQuery()

    parameterBinding()

    projection()

    entityManagerFactory.close()
}

private fun projection() {
    println()
    println("==================== Embedded Projection ====================")
    embeddedProjection()

    println()
    println("==================== Scala type Projection ====================")
    scalaTypeProjection()

    println()
    println("==================== Complex Projection ====================")
    complexProjection()

    println()
    println("==================== Complex Projection with New ====================")
    complexProjectionWithNew()
}

private fun kindOfQuery() {
    println()
    println("==================== Typed Query ====================")
    typedQuery()

    println()
    println("==================== Query ====================")
    query()
}

private fun parameterBinding() {
    println()
    println("==================== Named Parameter ====================")
    namedParameter()

    println()
    println("==================== Positional Parameter ====================")
    positionalParameter()
}

private fun complexProjectionWithNew() = execute { em ->
    em.createQuery("SELECT new juv.study.books.jpakt.jpql.UserDto(m.userName, m.age) FROM JpqlMember m")
        .resultList
        .forEach(::println)
}

private fun complexProjection() = execute { em ->
    val query = em.createQuery("SELECT m.userName, m.age FROM JpqlMember m")
    query.resultList
        .forEach {
            val row = it as Array<*>
            println("userName = ${row[0]}")
            println("age = ${row[1]}")
        }
}

private fun scalaTypeProjection() = execute { em ->
    em.createQuery("SELECT DISTINCT m.userName FROM JpqlMember m", String::class.java)
        .resultList
        .forEach(::println)

    em.createQuery("SELECT AVG(o.orderAmount) FROM JpqlOrder o", java.lang.Double::class.java)
        .singleResult
        .let(::println)
}

private fun embeddedProjection() = execute { em ->
    val addresses = em.createQuery("SELECT o.address FROM JpqlOrder o", Address::class.java).resultList

    addresses.forEach(::println)
}

private fun typedQuery() = execute { em ->
    val query: TypedQuery<Member> = em.createQuery("SELECT m FROM JpqlMember m", Member::class.java)
    val resultList = query.resultList
    resultList.forEach(::println)
}

private fun query() = execute { em ->
    val query: Query = em.createQuery("SELECT m.userName, m.age FROM JpqlMember m")
    query.resultList.forEach {
        val result: Array<*> = it as Array<*>
        println("userName = ${result[0]}")
        println("age = ${result[1]}")
    }
}

private fun namedParameter() = execute { em ->
    val userNameParam = "kim2"
    val query = em.createQuery("SELECT m FROM JpqlMember m WHERE m.userName = :userName", Member::class.java)
    query.setParameter("userName", userNameParam)
    query.resultList.forEach(::println)
}

private fun positionalParameter() = execute { em ->
    val userNameParam = "kim2"
    val query = em.createQuery("SELECT m FROM JpqlMember m WHERE m.userName = ?1", Member::class.java)
        .setParameter(1, userNameParam)

    query.resultList.forEach(::println)
}

private fun save() = execute { em ->
    val member1 = Member(userName = "kim", age = 10)
    val member2 = Member(userName = "kim2", age = 18)
    val member3 = Member(userName = "kim3", age = 30)

    em.persist(member1)
    em.persist(member2)
    em.persist(member3)

    em.persist(
        Order(
            orderAmount = 1,
            member = member1,
            address = Address(city = "Seoul", street = "SEL St.", zipcode = "12345")
        )
    )
    em.persist(
        Order(
            orderAmount = 2,
            member = member2,
            address = Address(city = "Seoul2", street = "SEL2 St.", zipcode = "54321")
        )
    )
    em.persist(
        Order(
            orderAmount = 3,
            member = member3,
            address = Address(city = "Seoul3", street = "SEL3 St.", zipcode = "93842")
        )
    )
}