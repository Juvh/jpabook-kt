package juv.study.books.jpakt.jpql

import javax.persistence.*

@Entity(name = "JpqlOrder")
@Table(name = "jpql_orders")
class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val orderId: Long? = null,

    var orderAmount: Int,

    @ManyToOne
    @JoinColumn(name = "memberId")
    var member: Member? = null,

    @Embedded
    var address: Address
) {
}