package juv.study.books.jpakt.practice

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "orders")
class Order(
    @Id
    @GeneratedValue
    val id: Long? = null,

    @Temporal(TemporalType.TIMESTAMP)
    val orderDate: Date,

    @Enumerated(EnumType.STRING)
    var status: OrderStatus
) {
    @ManyToOne
    @JoinColumn(name = "memberId")
    var member: PMember? = null
        set(value) {
            field?.orders?.remove(this)
            field = value
            field?.orders?.add(this)
        }

    @OneToMany(mappedBy = "order")
    var orderItems: MutableList<OrderItem> = mutableListOf()

    fun addOrderItem(orderItem: OrderItem) {
        orderItems.add(orderItem)
        orderItem.order = this
    }
}