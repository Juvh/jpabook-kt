package juv.study.books.jpakt.collection

import juv.study.books.jpakt.embedded.Address
import javax.persistence.*

@Entity(name = "CollectionMember")
@Table(name = "collection_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Embedded
    var homeAddress: Address,

    @ElementCollection
    @CollectionTable(name = "collection_favorite_foods", joinColumns = [JoinColumn(name = "memberId")])
    @Column(name = "foodName")
    var favoriteFoods: MutableSet<String> = mutableSetOf(),

    @ElementCollection
    @CollectionTable(name = "collection_addresses", joinColumns = [JoinColumn(name = "memberId")])
    var addressHistory: MutableList<Address> = mutableListOf()
) {
}