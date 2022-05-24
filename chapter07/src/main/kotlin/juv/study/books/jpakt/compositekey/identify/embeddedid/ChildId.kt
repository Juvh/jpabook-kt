package juv.study.books.jpakt.compositekey.identify.embeddedid

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class ChildId(
    val parentId: String? = null,
    @Column
    val childId: String,
) : java.io.Serializable
