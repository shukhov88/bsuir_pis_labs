package by.civilization.territory

import groovy.transform.ToString

@ToString
abstract class Territory {

    int quantity
    double area

    Territory(int quantity, double area) {
        this.quantity = quantity
        this.area = area
    }

    void enlarge(int quantity, double area) {
        this.quantity += quantity
        this.area += area
    }

}
