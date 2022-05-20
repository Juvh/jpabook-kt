package juv.study.books.jpakt.practice

import javax.persistence.*

@Entity
@Table(name = "categories")
class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var name: String,

    @ManyToOne
    @JoinColumn(name = "parentId")
    var parent: Category? = null,

    @OneToMany(mappedBy = "parent")
    var children: MutableList<Category> = mutableListOf()
) {
    @ManyToMany
    @JoinTable(
        name = "category_items",
        joinColumns = [JoinColumn(name = "categoryId")],
        inverseJoinColumns = [JoinColumn(name = "itemId")]
    )
    var items: MutableList<Item> = mutableListOf()

    fun addChildCategory(child: Category) {
        this.children.add(child)
        child.parent = this
    }

    fun addItem(item: Item) {
        this.items.add(item)
    }
}