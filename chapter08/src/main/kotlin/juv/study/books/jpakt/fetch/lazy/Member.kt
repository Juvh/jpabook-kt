package juv.study.books.jpakt.fetch.lazy

import javax.persistence.*

@Entity(name = "LazyMember")
@Table(name = "lazy_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId: Long? = null,

    val userName: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teamId")
    var team: Team? = null
) {
}