package juv.study.books.jpakt

import javax.persistence.EntityManager
import javax.persistence.Persistence

fun main() {

    // Entity Manager 생성
    val entityManager = entityManagerFactory.createEntityManager()

    logic(entityManager)

    entityManager.close()   // Entity Manager close
    entityManagerFactory.close()    // Entity Manager Factory close

}

fun logic(entityManager: EntityManager) {
    // Transaction 획득
    val tx = entityManager.transaction
    tx.begin()              // Transaction 시작

    val id: Long = 1
    val member1 = Member(id = id, userName = "Juv", age = 2)
    val member2 = Member(id = id + 1, userName = "Juv", age = 2)

    // Create
    entityManager.persist(member1)
    println("persist member1")
    entityManager.persist(member2)
    println("persist member2")

    println("transaction commit")
    tx.commit()             // Transaction commit
}
