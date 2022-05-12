package juv.study.books.jpakt

import javax.persistence.EntityManager
import javax.persistence.Persistence

fun main() {
    // Entity Manager Factory 생성
    val entityManagerFactory = Persistence.createEntityManagerFactory("jpabook")

    // Entity Manager 생성
    val entityManager = entityManagerFactory.createEntityManager()

    // Transaction 획득
    val tx = entityManager.transaction

    try {
        tx.begin()              // Transaction 시작
        logic(entityManager)    // biz logic
        tx.commit()             // Transaction commit
    } catch (e: Exception) {
        e.printStackTrace()
        tx.rollback()           // Transaction rollback
    } finally {
        entityManager.close()   // Entity Manager close
    }

    entityManagerFactory.close()    // Entity Manager Factory close

}

fun logic(entityManager: EntityManager) {
    val id: Long = 1
    val member = Member(id = id, userName = "Juv", age = 2)

    // Create
    entityManager.persist(member)

    // Update
    member.age = 20

    // Read - single
    val findMember = entityManager.find(Member::class.java, id)
    println(findMember)

    // Read - List
    val members = entityManager.createQuery("SELECT m FROM Member m", Member::class.java)
        ?.resultList

    println("members.size=${members?.size} , members = $members")

    // Delete
    entityManager.remove(member)
}
