package juv.study.books.jpakt.bidirectional

import javax.persistence.*

@Entity(name = "bi_team")
@Table(name = "bi_dir_teams")
class Team(
    @Id
    @GeneratedValue
    val teamId: Long? = null,

    @Column(length = 255)
    var name: String
) {
    @OneToMany(mappedBy = "team")
    var members: MutableList<Member> = mutableListOf()

}