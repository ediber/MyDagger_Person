package com.e.mydagger_person

import com.e.mydagger_person.dagger.Gmail
import com.e.mydagger_person.dagger.SimCard

class MyPhone(val simCard: SimCard, val gmail: Gmail, val internet: MyInternet) {

}
