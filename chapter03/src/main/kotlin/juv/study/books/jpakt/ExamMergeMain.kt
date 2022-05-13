package juv.study.books.jpakt

fun main() {
    val member: Member = createMember(123L, "Meber_123")

    mergeMember(member)
}

fun mergeMember(member: Member) {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()
    val merged = entityManager.merge(member)
    tx.commit()

    println("Detached member = ${member.userName}")
    println("Managed member = ${merged.userName}")

    println("entityManager contains member = ${entityManager.contains(member)}")
    println("entityManager contains merged member = ${entityManager.contains(merged)}")

    entityManager.close()
}

fun createMember(id: Long, userName: String): Member {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()

    val member = Member(id, userName, 30)

    entityManager.persist(member)
    tx.commit()

    entityManager.close()   // member는 준영속 상태가 된다.

    return member
}
