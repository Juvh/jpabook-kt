package juv.study.books.jpakt.many2many.jointable

import juv.study.books.jpakt.entityManagerFactory
import javax.persistence.EntityManager

fun main() {
    val entityManager = entityManagerFactory.createEntityManager()

    save(entityManager)
    entityManager.close()

    find()

    findInverse()

    entityManagerFactory.close()
}

fun findInverse() {
    val entityManager = entityManagerFactory.createEntityManager()

    val product = entityManager.find(Product::class.java, 1L)

    for (member in product.members) {
        println("member.userName = ${member.userName}")
    }

    entityManager.close()
}

fun find() {
    val entityManager = entityManagerFactory.createEntityManager()

    val member = entityManager.find(Member::class.java, 2L)
    for (product in member.products) {
        println("product.name = ${product.name}")
    }

    entityManager.close()
}

fun save(entityManager: EntityManager) {
    val tx = entityManager.transaction
    tx.begin()

    val product = Product(name = "Product A")
    entityManager.persist(product)

    val member = Member(userName = "Member 1")
    // member.products.add(product)
    member.addProducts(product)
    entityManager.persist(member)

    tx.commit()
}
