package juv.study.books.jpakt.many2many.mappingentity

import juv.study.books.jpakt.entityManagerFactory

fun main() {
    save()
    find()
    entityManagerFactory.close()
}

fun find() {
    val entityManager = entityManagerFactory.createEntityManager()

    val memberProductId = MemberProductId(member = 1, product = 2)
    val memberProduct = entityManager.find(MemberProduct::class.java, memberProductId)

    println("member = ${memberProduct.member.userName}")
    println("product = ${memberProduct.product.name}")
    println("orderAmount = ${memberProduct.orderAmount}")

    entityManager.close()
}

fun save() {
    val entityManager = entityManagerFactory.createEntityManager()

    val tx = entityManager.transaction
    tx.begin()

    // Save Member
    val member = Member(userName = "Member 1")
    entityManager.persist(member)

    // Save Product
    val product = Product(name = "Product A")
    entityManager.persist(product)

    // Save MemberProduct
    val memberProduct = MemberProduct(member = member, product = product, orderAmount = 2)
    entityManager.persist(memberProduct)

    tx.commit()
    entityManager.close()
}
