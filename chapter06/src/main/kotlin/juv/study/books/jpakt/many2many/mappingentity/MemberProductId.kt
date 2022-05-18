package juv.study.books.jpakt.many2many.mappingentity

class MemberProductId(
    var member: Long? = null,
    var product: Long? = null
) : java.io.Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MemberProductId

        if (member != other.member) return false
        if (product != other.product) return false

        return true
    }

    override fun hashCode(): Int {
        var result = member?.hashCode() ?: 0
        result = 31 * result + (product?.hashCode() ?: 0)
        return result
    }


}