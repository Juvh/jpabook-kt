package juv.study.books.jpakt.practice.order

import juv.study.books.jpakt.practice.BaseEntity
import juv.study.books.jpakt.practice.item.Item
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "order_items")
class OrderItem (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId")
    var order: Order,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId")
    val item: Item,

    val orderPrice: Int,

    val count: Int
) : BaseEntity(createdAt = LocalDateTime.now())