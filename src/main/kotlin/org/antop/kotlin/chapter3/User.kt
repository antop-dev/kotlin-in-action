package org.antop.kotlin.chapter3

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    // 로컬 함수
    fun validate(value: String, fieldName: String) {
        if (value.isBlank()) {
            // 바깥 함수의 파라미터(user)에 직접 접근할 수 있다
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isBlank()) {
            // 바깥 함수의 파라미터(user)에 직접 접근할 수 있다
            throw IllegalArgumentException("Can't save user ${id}: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}
