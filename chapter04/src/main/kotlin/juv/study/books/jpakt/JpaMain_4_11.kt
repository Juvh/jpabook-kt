package juv.study.books.jpakt

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction

    tx.begin()
    val board = SequenceBoard()

    entityManager.persist(board)

    tx.commit()

    println("board.id = ${board.id}")

    entityManager.close()
    entityManagerFactory.close()
}