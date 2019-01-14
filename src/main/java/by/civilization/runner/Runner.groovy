package by.civilization.runner

import by.civilization.finances.Finances
import by.civilization.individuals.Aristocrat
import by.civilization.individuals.Individual
import by.civilization.individuals.IndividualsFactory
import by.civilization.race.GoodRace
import by.civilization.race.Race
import by.civilization.territory.Factories
import by.civilization.territory.Fields
import by.civilization.territory.Forest
import by.civilization.territory.Houses

class Runner {

    static void main(String[] args) {

        Race goodRace = GoodRace.instance
                .withFinances(new Finances(1000))
                .withFields(new Fields(3, 100))
                .withForests(new Forest(3, 100))
                .withHouses(new Houses(3, 100))
                .withFactories(new Factories(3, 100))
                .withWorkers(generateIndividuals(10, IndividualsFactory.INDIVIDUALS.WORKER))
                .withWarriors(generateIndividuals(10, IndividualsFactory.INDIVIDUALS.WARRIOR))
                .withAristocrats(generateIndividuals(10, IndividualsFactory.INDIVIDUALS.ARISTOCRAT))

        goodRace.workers[0].doWork(goodRace.houses, 1, 10)
        goodRace.warriors[0].doWork(goodRace.fields, 1, 10)
        ((Aristocrat) goodRace.aristocrats[0]).doWork(goodRace.finances, 100)

    }

    private static List<Individual> generateIndividuals(int count, String type) {
        List individuals = []
        count.times {
            individuals << IndividualsFactory.getIndividual(type)
        }
        individuals
    }

}
