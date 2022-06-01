package juv.study.books.jpakt.jpql

import javax.persistence.*

@Entity(name = "JpqlMember")
@Table(name = "jpql_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId: Long? = null,

    var userName: String,
    var age: Int
) {
    override fun toString(): String {
        return "Member(memberId=$memberId, userName='$userName')"
    }
}