package juv.study.books.jpakt.practice

import javax.persistence.*

@Entity
@Table(name = "order_items")
class OrderItem (
    @Id
    @GeneratedValue
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "orderId")
    var order: Order,

    @ManyToOne
    @JoinColumn(name = "itemId")
    val item: Item,

    val orderPrice: Int,

    val count: Int
)