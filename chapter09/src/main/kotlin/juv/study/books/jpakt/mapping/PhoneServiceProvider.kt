package juv.study.books.jpakt.mapping

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity(name = "EmbeddedMappingPhoneServiceProvider")
@Table(name = "embedded_mapping_phone_service_providers")
class PhoneServiceProvider(
    @Id
    val name: String
) {

}
