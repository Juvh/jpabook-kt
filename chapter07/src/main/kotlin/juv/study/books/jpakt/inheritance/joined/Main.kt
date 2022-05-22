package juv.study.books.jpakt.inheritance.joined

import entityManagerFactory

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()

    entityManager.close()
    entityManagerFactory.close()
}