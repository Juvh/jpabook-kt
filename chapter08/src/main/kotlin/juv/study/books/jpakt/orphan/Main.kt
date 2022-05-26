package juv.study.books.jpakt.orphan

import entityManagerFactory

fun main() {
    save()

    deleteChild()

    entityManagerFactory.close()
}

fun deleteChild() {
    val entityManager = entityManagerFactory.createEntityManager()

    val tx = entityManager.transaction
    tx.begin()

    val parent = entityManager.find(Parent::class.java, 1L)

    parent.children.removeAt(0)

    println("==== tx commit")
    tx.commit()
    entityManager.close()
}

fun save() {
    val entityManager = entityManagerFactory.createEntityManager()

    val tx = entityManager.transaction
    tx.begin()

    val parent = Parent()
    entityManager.persist(parent)

    // 1st child
    val child1 = Child(parent = parent)
    parent.children.add(child1)
    entityManager.persist(child1)

    // 2nd child
    val child2 = Child(parent = parent)
    parent.children.add(child2)
    entityManager.persist(child2)

    tx.commit()

    entityManager.close()
}