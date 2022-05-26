package juv.study.books.jpakt.cascade.no

import entityManagerFactory

fun main() {
    save()

    entityManagerFactory.close()
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