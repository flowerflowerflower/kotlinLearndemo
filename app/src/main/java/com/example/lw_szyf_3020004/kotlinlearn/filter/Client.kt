package com.example.lw_szyf_3020004.kotlinlearn.filter

data class Person(val name: String, val gender: String, val maritalStatus: String)

/**
 * 过滤器模型
 */
public interface Criterria {

    fun meetCriteria(persons: List<Person>): List<Person>
}


public class CriteriaMale : Criterria {
    override fun meetCriteria(persons: List<Person>): MutableList<Person> {
        var malePersons: MutableList<Person> = ArrayList()
        for (person in persons) {
            if (person.gender.equals("MALE", true)) {
                malePersons.add(person)
            }
        }
        return malePersons
    }


}


