package juv.study.books.jpakt

import javax.persistence.*

@Entity
@TableGenerator(
    name = "board_seq_generator",
    table = "my_sequences",
    pkColumnName = "board_seq",
    allocationSize = 1
)
class TableIdBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "board_seq_generator")
    val id: Long? = null
}