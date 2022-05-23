package juv.study.books.jpakt.compositekey.identify.idclass

import entityManagerFactory

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()

    val parent = Parent(id = "parent1", name = "Parent 1")
    val child = Child(childId = "child_1", parent = parent, name = "Child 1")
    val grandChild = GrandChild(child = child, id = "grand child 1", name = "Grand Child 1")
    entityManager.persist(parent)
    entityManager.persist(child)
    entityManager.persist(grandChild)

    tx.commit()
    entityManager.close()
    entityManagerFactory.close()
}