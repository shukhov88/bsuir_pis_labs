package by.civilization.individuals

import by.civilization.finances.Finances
import groovy.transform.ToString

@ToString(includeSuper = true)
class Aristocrat extends Individual {

    Aristocrat(String firstName, String lastName, int age) {
        super(firstName, lastName, age)
    }

    void doWork(Finances finances, double anount) {
        finances.enlargeFinances(anount)
    }

}
