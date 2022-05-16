package juv.study.books.jpakt.unidirectional

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "uni_dir_teams")
class Team(
    @Id
    @GeneratedValue
    val teamId: Long? = null,

    @Column(length = 255)
    var name: String,
)