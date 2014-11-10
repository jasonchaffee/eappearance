package model

import securesocial.core._


case class User(main: BasicProfile,
                identities: List[BasicProfile],
                address: Address,
                barId: String)

case class Address(street: String,
                   city: String,
                   state: String,
                   zipcode: Int)

