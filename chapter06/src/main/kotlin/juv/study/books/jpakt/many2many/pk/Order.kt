package juv.study.books.jpakt.many2many.pk

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity(name = "M2mPkOrder")
@Table(name = "m2m_pk_orders")
class Order(
    @Id
    @GeneratedValue
    val orderId: Long? = null,
    val orderAmount: Int,

    @ManyToOne
    @JoinColumn(name = "memberId")
    var member: Member,

    @ManyToOne
    @JoinColumn(name = "productId")
    var product: Product
)