package by.civilization.race

import by.civilization.finances.Finances
import by.civilization.individuals.Individual
import by.civilization.territory.Territory

class GoodRace extends Race {

    private static GoodRace instance = new GoodRace()

    private GoodRace() {
        super()
    }

    static GoodRace getInstance() { instance }

    static GoodRace withFinances(Finances finances) {
        getInstance().finances = finances
        instance
    }

    static GoodRace withFields(Territory fields) {
        getInstance().fields = fields
        instance
    }

    static GoodRace withForests(Territory forests) {
        getInstance().forests = forests
        getInstance()
    }

    static GoodRace withHouses(Territory houses) {
        getInstance().houses = houses
        getInstance()
    }

    static GoodRace withFactories(Territory factories) {
        getInstance().factories = factories
        getInstance()
    }

    static GoodRace withWorkers(List<Individual> workers) {
        getInstance().workers = workers
        getInstance()
    }

    static GoodRace withWarriors(List<Individual> warriors) {
        getInstance().warriors = warriors
        getInstance()
    }

    static GoodRace withAristocrats(List<Individual> aristocrats) {
        getInstance().aristocrats = aristocrats
        getInstance()
    }

}
