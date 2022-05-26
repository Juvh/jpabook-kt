package juv.study.books.jpakt.fetch.eager

import javax.persistence.*

@Entity(name = "EagerMember")
@Table(name = "eager_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId: Long? = null,

    val userName: String,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teamId")
    var team: Team? = null
) {
}