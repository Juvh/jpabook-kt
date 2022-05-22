package juv.study.books.jpakt.inheritance.tableperclass

import entityManagerFactory

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()

    val tx = entityManager.transaction
    tx.begin()

    entityManager.persist(Book(name = "Book1", price = 100, author = "Author1"))
    entityManager.persist(Album(name = "Album1", price = 300, artist = "Artist123"))
    entityManager.persist(Movie(name = "Movie1", price = 700, director = "Director 28", actor = "Actor 1230890"))

    tx.commit()

    entityManager.close()
    entityManagerFactory.close()
}