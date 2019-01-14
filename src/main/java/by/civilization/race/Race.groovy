package by.civilization.race

import by.civilization.finances.Finances
import by.civilization.individuals.Individual
import by.civilization.territory.Territory

class Race {

    Finances finances
    Territory fields
    Territory forests
    Territory houses
    Territory factories
    List<Individual> workers
    List<Individual> warriors
    List<Individual> aristocrats

    Race() { }

}
