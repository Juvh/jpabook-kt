package juv.study.books.jpakt

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction

    tx.begin()
    val board = Board()

    entityManager.persist(board)

    tx.commit()

    println("board.id = ${board.id}")

    entityManager.close()
    entityManagerFactory.close()
}