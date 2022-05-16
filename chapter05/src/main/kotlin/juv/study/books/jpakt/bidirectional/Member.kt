package juv.study.books.jpakt.bidirectional

import javax.persistence.*

@Entity(name = "bi_member")
@Table(name = "bi_dir_members")
class Member(
    @Column(length = 255)
    val userName: String
) {
    @Id
    @GeneratedValue
    val memberId: Long? = null

    @ManyToOne
    @JoinColumn(name = "teamId")
    var team: Team? = null
        set(newTeam) {
            team?.members?.remove(this)

            field = newTeam
            team?.members?.add(this)
        }
}