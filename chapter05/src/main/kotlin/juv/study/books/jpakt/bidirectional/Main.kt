package juv.study.books.jpakt.bidirectional

import juv.study.books.jpakt.entityManagerFactory
import javax.persistence.EntityManager

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction

    tx.begin()
    testSave(entityManager)
    tx.commit()

    tx.begin()
    biDirection(entityManager)
    tx.commit()

    entityManager.close()
    entityManagerFactory.close()
}

fun biDirection(entityManager: EntityManager) {
    println("================ biDirection ================")

    val team = entityManager.find(Team::class.java, 1L)

    val members = team.members
    for (member in members) {
        println("member.userName = ${member.userName}")
    }
}

private fun testSave(entityManager: EntityManager) {
    println("================ testSave ================")
    val team = Team(name = "Team1")
    entityManager.persist(team)

    val member1 = Member(userName = "Member1")
    member1.team = team
    entityManager.persist(member1)

    val member2 = Member(userName = "Member2")
    member2.team = team
    entityManager.persist(member2)

    entityManager.flush()
}