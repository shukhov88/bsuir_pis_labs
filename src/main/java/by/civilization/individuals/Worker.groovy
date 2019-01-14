package by.civilization.individuals

import groovy.transform.ToString

@ToString(includeSuper = true)
class Worker extends Individual {

    Worker(String firstName, String lastName, int age) {
        super(firstName, lastName, age)
    }

}
