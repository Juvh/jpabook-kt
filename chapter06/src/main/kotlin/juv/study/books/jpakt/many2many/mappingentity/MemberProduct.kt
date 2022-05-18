package juv.study.books.jpakt.many2many.mappingentity

import javax.persistence.*

@Entity(name = "M2mMeMemberProduct")
@Table(name = "m2m_me_member_products")
@IdClass(value = MemberProductId::class)
class MemberProduct (
    @Id
    @ManyToOne
    @JoinColumn(name = "memberId")
    var member: Member,

    @Id
    @ManyToOne
    @JoinColumn(name = "productId")
    var product: Product,

    var orderAmount: Int = 0
)

