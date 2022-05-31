package juv.study.books.jpakt

import javax.persistence.EntityManager
import javax.persistence.Persistence

val entityManagerFactory = Persistence.createEntityManagerFactory("jpabook")

fun execute(act: (entityManager: EntityManager) -> Unit) {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()

    act(entityManager)

    tx.commit()
    entityManager.close()
}

annotation class NoArg