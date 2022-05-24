package juv.study.books.jpakt.noidentify.onetoone

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.MapsId
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity(name = "NoIdentifyO2oBoardDetail")
@Table(name = "no_identify_o2o_board_details")
class BoardDetail(
    @Id
    val boardId: Long? = null,

    var content: String,

    @MapsId
    @OneToOne
    @JoinColumn(name = "boardId")
    val board: Board
) {

}
