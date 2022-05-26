package juv.study.books.jpakt.practice

import entityManagerFactory
import juv.study.books.jpakt.practice.delivery.Delivery
import juv.study.books.jpakt.practice.delivery.DeliveryStatus
import juv.study.books.jpakt.practice.item.Album
import juv.study.books.jpakt.practice.item.Item
import juv.study.books.jpakt.practice.order.Order
import juv.study.books.jpakt.practice.order.OrderItem
import juv.study.books.jpakt.practice.order.OrderStatus

fun main() {

    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction
    tx.begin()

    val albumItem = Album(name = "Item A", price = 1000, stockQuantity = 99999, artist = "Singer")

    val order = Order(status = OrderStatus.ORDER)
    order.delivery = Delivery(city = "Seoul", street = "Street 123", zipcode = "09876", status = DeliveryStatus.PENDING)
    order.orderItems.add(OrderItem(order = order, item = albumItem, orderPrice = 1000, count = 1))

    entityManager.persist(order)

    tx.commit()
    entityManager.close()
    entityManagerFactory.close()
}