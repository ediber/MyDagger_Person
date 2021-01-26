package com.e.mydagger_person

import javax.inject.Inject

class Person @Inject constructor(val computer: Computer, /*val tv: Tv,*/ val phone:MyPhone): IPerson {
    override fun useComputer(): String {
        return computer.toString()
    }

    override fun usePhone(): String {
        return phone.toString()
    }

}