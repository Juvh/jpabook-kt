package juv.study.books.jpakt.practice.delivery

import juv.study.books.jpakt.practice.order.Order
import juv.study.books.jpakt.practice.BaseEntity
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "deliveries")
class Delivery(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val city: String,
    val street: String,
    val zipcode: String,
    @Enumerated(EnumType.STRING)
    val status: DeliveryStatus
) : BaseEntity(createdAt = LocalDateTime.now()) {
    @OneToOne(mappedBy = "delivery")
    var order: Order? = null
}