package by.civilization.race

import by.civilization.finances.Finances
import by.civilization.individuals.Individual
import by.civilization.territory.Territory

class BadRace extends Race {

    private static BadRace instance = new BadRace()

    private BadRace() {
        super()
    }

    static BadRace getInstance() { instance }

    static BadRace withFinances(Finances finances) {
        getInstance().finances = finances
        getInstance()
    }

    static BadRace withFields(Territory fields) {
        getInstance().fields = fields
        getInstance()
    }

    static BadRace withForests(Territory forests) {
        getInstance().forests = forests
        getInstance()
    }

    static BadRace withHouses(Territory houses) {
        getInstance().houses = houses
        getInstance()
    }

    static BadRace withFactories(Territory factories) {
        getInstance().factories = factories
        getInstance()
    }

    static BadRace withWorkers(List<Individual> workers) {
        getInstance().workers = workers
        getInstance()
    }

    static BadRace withWarriors(List<Individual> warriors) {
        getInstance().warriors = warriors
        getInstance()
    }

    static BadRace withAristocrats(List<Individual> aristocrats) {
        getInstance().aristocrats = aristocrats
        getInstance()
    }

}
