package juv.study.books.jpakt.compositekey.identify.embeddedid

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class GrandChildId(
    val childId: ChildId? = null,
    @Column
    val grandChildId: String
) : java.io.Serializable
