package juv.study.books.jpakt.unidirectional

import juv.study.books.jpakt.entityManagerFactory
import javax.persistence.EntityManager

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction

    tx.begin()

    testSave(entityManager)

    queryLogicJoin(entityManager)

    updateRelation(entityManager)

    deleteRelation(entityManager)

    tx.commit()

    entityManager.close()
    entityManagerFactory.close()
}

private fun testSave(entityManager: EntityManager) {
    println("================ testSave ================")
    val team = Team(name = "Team1")
    entityManager.persist(team)

    val member1 = Member(userName = "Member1", team = team)
    entityManager.persist(member1)

    val member2 = Member(userName = "Member2", team = team)
    entityManager.persist(member2)
}

private fun queryLogicJoin(entityManager: EntityManager) {
    println("================ queryLogicJoin ================")
    val jpql = "SELECT m FROM Member m JOIN m.team t WHERE t.name = :teamName"

    val results = entityManager.createQuery(jpql, Member::class.java)
        .setParameter("teamName", "Team1")
        .resultList

    for (member in results) {
        println("[query] member.userName = ${member.userName}")
    }
}

private fun updateRelation(entityManager: EntityManager) {
    println("================ updateRelation ================")

    val newTeam = Team(name = "Team2")
    entityManager.persist(newTeam)

    val member = entityManager.find(Member::class.java, 2L)
    member.team = newTeam
}

private fun deleteRelation(entityManager: EntityManager) {
    println("================ deleteRelation ================")

    val member = entityManager.find(Member::class.java, 2L)
    member.team = null
}