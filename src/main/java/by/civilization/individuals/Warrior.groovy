package by.civilization.individuals

import groovy.transform.ToString

@ToString(includeSuper = true)
class Warrior extends Individual {

    Warrior(String firstName, String lastName, int age) {
        super(firstName, lastName, age)
    }

}
