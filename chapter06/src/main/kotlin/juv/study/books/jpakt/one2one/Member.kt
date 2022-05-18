package juv.study.books.jpakt.one2one

import javax.persistence.*

@Entity(name = "One2OneMember")
@Table(name = "oto_members")
class Member(
    @Id
    @GeneratedValue
    val memberId: Long? = null,

    val userName: String
) {
    @OneToOne
    @JoinColumn(name = "lockerId")
    var locker: Locker? = null
}