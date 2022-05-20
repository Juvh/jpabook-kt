package juv.study.books.jpakt.many2many.pk

import javax.persistence.*

@Entity(name = "M2mPkMember")
@Table(name = "m2m_pk_members")
class Member(
    @Id
    @GeneratedValue
    val id: Long? = null,

    val userName: String
) {

    @OneToMany(mappedBy = "member")
    var orders: MutableList<Order> = mutableListOf()

}