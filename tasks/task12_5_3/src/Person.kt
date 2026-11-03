import kotlinx.datetime.LocalDate


class Person(_name: String, val birth: LocalDate) {

    var isMarried = false

    var name = _name
        set(value) {
            require(value.isNotBlank()) { "Name cannot be blank" }
            field = value
        }
}