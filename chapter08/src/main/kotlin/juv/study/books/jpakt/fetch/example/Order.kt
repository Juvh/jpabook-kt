package juv.study.books.jpakt.fetch.example

import javax.persistence.*

@Entity(name = "FetchExOrder")
@Table(name = "fetch_ex_orders")
class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val orderId: Long? = null
) {
}