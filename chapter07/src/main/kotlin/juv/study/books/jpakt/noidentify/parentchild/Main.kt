package juv.study.books.jpakt.noidentify.parentchild

import entityManagerFactory

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()

    val parent = Parent(name = "Parent 1")
    val child = Child(parent = parent, name = "Child 1")
    val grandChild = GrandChild(child = child, name = "Grand Child 1")

    entityManager.persist(parent)
    entityManager.persist(child)
    entityManager.persist(grandChild)

    tx.commit()
    entityManager.close()
    entityManagerFactory.close()
}