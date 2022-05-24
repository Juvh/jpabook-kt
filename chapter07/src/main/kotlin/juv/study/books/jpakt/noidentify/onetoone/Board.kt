package juv.study.books.jpakt.noidentify.onetoone

import javax.persistence.*

@Entity(name = "NoIdentifyO2oBoard")
@Table(name = "no_identify_o2o_boards")
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boardId")
    val id: Long? = null,

    val title: String,

    @OneToOne(mappedBy = "board")
    var boardDetail: BoardDetail? = null
) {
}