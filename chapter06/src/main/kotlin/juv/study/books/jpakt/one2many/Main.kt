package juv.study.books.jpakt.one2many

import juv.study.books.jpakt.entityManagerFactory
import javax.persistence.EntityManager

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction

    tx.begin()

    testSave(entityManager)

    tx.commit()
    entityManager.close()
    entityManagerFactory.close()
}

fun testSave(entityManager: EntityManager) {
    val member1 = Member(userName = "member1")
    val member2 = Member(userName = "member2")

    val team = Team(name = "Team1")
    team.members.add(member1)
    team.members.add(member2)

    entityManager.persist(member1)
    entityManager.persist(member2)
    entityManager.persist(team)
}
