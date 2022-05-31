package juv.study.books.jpakt.overview

import com.querydsl.jpa.impl.JPAQuery
import juv.study.books.jpakt.entityManagerFactory
import juv.study.books.jpakt.execute

fun main() {
    save()

    println()
    println("==================== JPQL ====================")
    jpql()

    println()
    println("==================== Criteria ====================")
    criteria()

    println()
    println("==================== QueryDsl ====================")
    queryDsl()

    println()
    println("==================== Native SQL ====================")
    nativeSql()

    entityManagerFactory.close()
}

fun nativeSql() = execute { em ->
    val sql = "SELECT id, userName FROM jpql_ov_members WHERE userName = 'kim'"
    val members = em.createNativeQuery(sql, Member::class.java).resultList
    members.forEach(::println)
}

fun queryDsl() = execute { em ->
    val query = JPAQuery<QMember>(em)
    val member = QMember.member

    val members = query.select(member)
        .from(member)
        .where(member.userName.eq("kim"))
        .fetch()

    members.forEach(::println)
}

private fun jpql() = execute { em ->

    val jpql = "SELECT m FROM JpqlOverviewMember AS m WHERE m.userName = 'kim'"

    val members = em.createQuery(jpql, Member::class.java).resultList

    members.forEach(::println)
}

private fun criteria() = execute { em ->
    val cb = em.criteriaBuilder
    val query = cb.createQuery(Member::class.java)

    val m = query.from(Member::class.java)

    val criteriaQuery = query.select(m)
        .where(cb.equal(m.get<String>("userName"), "kim"))

    val members = em.createQuery(criteriaQuery).resultList

    members.forEach(::println)

}

private fun save() = execute { em ->
    em.persist(Member(userName = "kim"))
    em.persist(Member(userName = "kim2"))
    em.persist(Member(userName = "kim3"))
}