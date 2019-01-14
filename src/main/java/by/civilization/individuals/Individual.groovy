package by.civilization.individuals

import by.civilization.territory.Territory
import groovy.transform.ToString

@ToString
abstract class Individual {

    String firstName
    String lastName
    int age

    Individual(String firstName, String lastName, int age) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

    void doWork(Territory territory, int quantity, double area) {
        territory.enlarge(quantity, area)
    }

}
