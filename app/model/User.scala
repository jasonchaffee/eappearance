package model


case class User(firstName: String,
                middleName: String,
                lastName: String,
                username: String,
                email: String,
                address: Address)

case class Address(street: String, city: String, state: String, zipcode: Int)

case class Attorney(barId: String)

case class Credentials(username: String, password: String)

