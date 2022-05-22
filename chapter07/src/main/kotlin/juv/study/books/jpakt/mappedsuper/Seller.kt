package juv.study.books.jpakt.mappedsuper

import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "MappedSuperSeller")
@Table(name = "mapped_super_sellers")
class Seller(
    name: String,
    var shopName: String
) : BaseEntity(name = name) {
}