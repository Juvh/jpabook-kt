package juv.study.books.jpakt.compositekey.identify.embeddedid

import entityManagerFactory

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()

    val parent = Parent(id = "parent1", name = "Parent 1")
    val child = Child(id = ChildId(childId = "child_1"), parent = parent, name = "Child 1")
    val grandChild =
        GrandChild(id = GrandChildId(grandChildId = "grand child 1"), child = child, name = "Grand Child 1")
    entityManager.persist(parent)
    entityManager.persist(child)
    entityManager.persist(grandChild)

    tx.commit()
    entityManager.close()
    entityManagerFactory.close()
}