package juv.study.books.jpakt

import javax.persistence.*

@Entity
@Table(name = "sequence_board")
@SequenceGenerator(
    name = "board_seq_generator",
    sequenceName = "board_seq",
    initialValue = 1,
    allocationSize = 1
)
class SequenceBoard(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_seq_generator")
    val id: Long? = null
)