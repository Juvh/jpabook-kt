package juv.study.books.jpakt.practice

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "orders")
class Order (
    @Id
    @GeneratedValue
    val id: Long? = null,

    // need to mapping
    val memberId: Long,

    @Temporal(TemporalType.TIMESTAMP)
    val orderDate: Date,

    @Enumerated(EnumType.STRING)
    var status: OrderStatus
)