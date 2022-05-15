package juv.study.books.jpakt.practice

import javax.persistence.*

@Entity
@Table(name = "order_items")
class OrderItem (
    @Id
    @GeneratedValue
    val id: Long? = null,

    val orderId: Long,

    val itemId: Long,

    val orderPrice: Int,

    val count: Int
)