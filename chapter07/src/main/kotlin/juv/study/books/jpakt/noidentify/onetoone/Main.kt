package juv.study.books.jpakt.noidentify.onetoone

import entityManagerFactory
import juv.study.books.jpakt.noidentify.parentchild.Child
import juv.study.books.jpakt.noidentify.parentchild.GrandChild
import juv.study.books.jpakt.noidentify.parentchild.Parent

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()

    val board = Board(title = "Subject")
    entityManager.persist(board)

    val boardDetail = BoardDetail(board = board, content = "Contents")
    entityManager.persist(boardDetail)

    tx.commit()
    entityManager.close()
    entityManagerFactory.close()
}