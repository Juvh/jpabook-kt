package juv.study.books.jpakt.compositekey.identify.idclass

import NoArg

@NoArg
data class ChildId(
    val parent: String,
    val childId: String
) : java.io.Serializable {
}
