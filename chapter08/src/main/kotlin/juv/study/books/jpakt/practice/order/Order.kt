package juv.study.books.jpakt.practice.order

import juv.study.books.jpakt.practice.BaseEntity
import juv.study.books.jpakt.practice.delivery.Delivery
import juv.study.books.jpakt.practice.member.Member
import java.time.LocalDateTime
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "orders")
class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Temporal(TemporalType.TIMESTAMP)
    val orderDate: Date = Date(),

    @Enumerated(EnumType.STRING)
    var status: OrderStatus
) : BaseEntity(createdAt = LocalDateTime.now()) {

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "memberId")
    var member: Member? = null
        set(value) {
            field?.orders?.remove(this)
            field = value
            field?.orders?.add(this)
        }

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "deliveryId")
    var delivery: Delivery? = null
        set(value) {
            field = value
            delivery?.order = this
        }

    @OneToMany(mappedBy = "order")
    var orderItems: MutableList<OrderItem> = mutableListOf()

    fun addOrderItem(orderItem: OrderItem) {
        orderItems.add(orderItem)
        orderItem.order = this
    }
}