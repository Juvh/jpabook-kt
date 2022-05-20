package juv.study.books.jpakt.many2many.pk

import juv.study.books.jpakt.entityManagerFactory


fun main() {
    save()
    find()
    entityManagerFactory.close()
}

fun find() {
    val entityManager = entityManagerFactory.createEntityManager()

    val order = entityManager.find(Order::class.java, 3L)

    println("member = ${order.member.userName}")
    println("product = ${order.product.name}")
    println("orderAmount = ${order.orderAmount}")

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
    val memberProduct = Order(member = member, product = product, orderAmount = 2)
    entityManager.persist(memberProduct)

    tx.commit()
    entityManager.close()
}