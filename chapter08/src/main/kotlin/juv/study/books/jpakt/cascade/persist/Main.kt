package juv.study.books.jpakt.cascade.persist

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

    // 1st child
    val child1 = Child(parent = parent)
    parent.children.add(child1)

    // 2nd child
    val child2 = Child(parent = parent)
    parent.children.add(child2)

    // save parent
    entityManager.persist(parent)

    tx.commit()

    entityManager.close()
}