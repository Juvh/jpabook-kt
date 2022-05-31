package juv.study.books.jpakt.overview

import javax.persistence.*

@Entity(name = "JpqlOverviewMember")
@Table(name = "jpql_ov_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var userName: String
) {
    override fun toString(): String {
        return "Member(id=$id, userName='$userName')"
    }
}