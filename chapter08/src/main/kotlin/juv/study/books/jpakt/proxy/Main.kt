package juv.study.books.jpakt.proxy

import entityManagerFactory

fun main() {
    save()
    printUserAndTeam(1L)
    printUser(1L)
    printUserWithProxy(1L)
    entityManagerFactory.close()
}

fun printUserWithProxy(memberId: Long) {
    println()
    println("================ printUserWithProxy ================")

    val entityManager = entityManagerFactory.createEntityManager()

    val member = entityManager.getReference(Member::class.java, memberId)
    println(">>>>> got member")

    println("User name : ${member.userName}")

    entityManager.close()
}

fun printUser(memberId: Long) {
    println()
    println("================ printUser ================")

    val entityManager = entityManagerFactory.createEntityManager()

    val member = entityManager.find(Member::class.java, memberId)
    println(">>>>> got member")

    println("User name : ${member.userName}")

    entityManager.close()
}

fun printUserAndTeam(memberId: Long) {
    println()
    println("================ printUserAndTeam ================")

    val entityManager = entityManagerFactory.createEntityManager()

    val member = entityManager.find(Member::class.java, memberId)
    val team = member.team
    println("User name : ${member.userName}")
    println("Team name : ${team?.name}")

    entityManager.close()
}

private fun save() {
    val entityManager = entityManagerFactory.createEntityManager()

    val tx = entityManager.transaction
    tx.begin()

    val team = Team(name = "Team A")
    val member = Member(userName = "User 1", team = team)
    entityManager.persist(team)
    entityManager.persist(member)

    tx.commit()

    entityManager.close()
}