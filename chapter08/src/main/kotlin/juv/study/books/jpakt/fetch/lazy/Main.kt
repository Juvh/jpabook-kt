package juv.study.books.jpakt.fetch.lazy

import entityManagerFactory

fun main() {
    save()

    val entityManager = entityManagerFactory.createEntityManager()

    println("=== Get Member Start")
    val member = entityManager.find(Member::class.java, 1L)
    println("=== Get Member End")
    val team = member.team
    println("## team : ${team?.teamId}")

    entityManager.close()
    entityManagerFactory.close()
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