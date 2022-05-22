package juv.study.books.jpakt.tableperclass

import javax.persistence.*

@Entity(name = "TablePerClassItem")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class Item(
    @Id
    @GeneratedValue
    val id: Long? = null,
    var name: String,
    var price: Int
) {
}