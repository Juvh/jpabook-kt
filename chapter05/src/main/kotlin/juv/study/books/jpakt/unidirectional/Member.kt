package juv.study.books.jpakt.unidirectional

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "uni_dir_members")
class Member(
    @Id
    @GeneratedValue
    val memberId: Long? = null,

    @ManyToOne
    @JoinColumn(name = "teamId")
    var team: Team? = null,

    @Column(length = 255)
    val userName: String
)