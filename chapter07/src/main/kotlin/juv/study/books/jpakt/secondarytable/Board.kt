package juv.study.books.jpakt.secondarytable

import javax.persistence.*

@Entity(name = "2ndaryTableBoard")
@Table(name = "2ndary_table_boards")
@SecondaryTable(
    name = "2ndary_table_board_details",
    pkJoinColumns = [PrimaryKeyJoinColumn(name = "boardDetailId")]
)
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boardId")
    val id: Long? = null,

    var title: String,

    @Column(table = "2ndary_table_board_details")
    var content: String? = null
) {
}