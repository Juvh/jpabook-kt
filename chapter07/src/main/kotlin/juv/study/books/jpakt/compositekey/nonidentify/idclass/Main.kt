package juv.study.books.jpakt.compositekey.nonidentify.idclass

import entityManagerFactory
import juv.study.books.jpakt.compositekey.identify.idclass.Child

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()

    val parent = Parent(id1 = "my_id_1", id2 = "my_id_2", name = "Parent 1")
    val child = Child(id = "child_1", parent = parent)
    entityManager.persist(parent)
    entityManager.persist(child)

    tx.commit()
    entityManager.close()
    entityManagerFactory.close()
}