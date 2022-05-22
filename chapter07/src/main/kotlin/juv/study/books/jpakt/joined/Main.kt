package juv.study.books.jpakt.joined

import entityManagerFactory

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()

    entityManager.close()
    entityManagerFactory.close()
}