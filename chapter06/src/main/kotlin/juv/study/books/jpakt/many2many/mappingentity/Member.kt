package juv.study.books.jpakt.many2many.mappingentity

import javax.persistence.*

@Entity(name = "M2mMeMember")
@Table(name = "m2m_me_members")
class Member(
    @Id
    @GeneratedValue
    val id: Long? = null,

    val userName: String
) {

    @OneToMany(mappedBy = "member")
    var memberProducts: MutableList<MemberProduct> = mutableListOf()

}