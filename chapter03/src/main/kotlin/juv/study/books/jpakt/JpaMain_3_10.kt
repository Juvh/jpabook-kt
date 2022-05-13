package juv.study.books.jpakt

import javax.persistence.Persistence

fun main() {

    // Entity Manager 생성
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction

    tx.begin()
    println("-----Transaction begin-----")

    val member = entityManager.find(Member::class.java, 1L)
    println("Entity Manager close-----")
    entityManager.close()

    println("-----Transaction commit start-----")
    tx.commit()
    println("-----Transaction commit end-----")
}