package juv.study.books.jpakt

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()

    // main() 실행시키면 members table의 create 문이 실행된다.

    entityManager.close()
    entityManagerFactory.close()
}