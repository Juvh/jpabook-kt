package juv.study.books.jpakt.inheritance.singletable

import javax.persistence.*

@Entity(name = "SingleTableItem")
@Table(name = "single_table_items")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
abstract class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var name: String,
    var price: Int
) {
}