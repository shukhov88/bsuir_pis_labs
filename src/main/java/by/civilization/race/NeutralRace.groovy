package by.civilization.race

import by.civilization.finances.Finances
import by.civilization.individuals.Individual
import by.civilization.territory.Territory

class NeutralRace extends Race {

    private static NeutralRace instance = new NeutralRace()

    private NeutralRace() {
        super()
    }

    static NeutralRace getInstance() { instance }

    static NeutralRace withFinances(Finances finances) {
        getInstance().finances = finances
        getInstance()
    }

    static NeutralRace withFields(Territory fields) {
        getInstance().fields = fields
        getInstance()
    }

    static NeutralRace withForests(Territory forests) {
        getInstance().forests = forests
        getInstance()
    }

    static NeutralRace withHouses(Territory houses) {
        getInstance().houses = houses
        getInstance()
    }

    static NeutralRace withFactories(Territory factories) {
        getInstance().factories = factories
        getInstance()
    }

    static NeutralRace withWorkers(List<Individual> workers) {
        getInstance().workers = workers
        getInstance()
    }

    static NeutralRace withWarriors(List<Individual> warriors) {
        getInstance().warriors = warriors
        getInstance()
    }

    static NeutralRace withAristocrats(List<Individual> aristocrats) {
        getInstance().aristocrats = aristocrats
        getInstance()
    }

}
