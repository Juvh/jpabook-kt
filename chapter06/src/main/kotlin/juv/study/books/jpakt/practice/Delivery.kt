package juv.study.books.jpakt.practice

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
) {
    @OneToOne(mappedBy = "delivery")
    var order: Order? = null
}