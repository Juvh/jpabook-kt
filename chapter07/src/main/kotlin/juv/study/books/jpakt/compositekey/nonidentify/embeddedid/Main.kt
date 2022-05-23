package juv.study.books.jpakt.compositekey.nonidentify.embeddedid

import entityManagerFactory

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()

    val parent = Parent(id = ParentId("parent_id_1", "parent_id_2"), name = "Parent 1")
    entityManager.persist(parent)
    val child = Child(id = "child_1", name = "Child 1", parent = parent)
    entityManager.persist(child)

    tx.commit()
    entityManager.close()
    entityManagerFactory.close()
}