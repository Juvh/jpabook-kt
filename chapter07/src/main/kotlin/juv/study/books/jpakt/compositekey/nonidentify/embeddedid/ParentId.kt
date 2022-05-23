package juv.study.books.jpakt.compositekey.nonidentify.embeddedid

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class ParentId(
    @Column
    val id1: String,
    @Column
    val id2: String
) : java.io.Serializable {
}
