package by.civilization.individuals

class IndividualsFactory {

    Random random = new Random()

    static final INDIVIDUALS = [
            WORKER    : 'worker',
            WARRIOR   : 'warrior',
            ARISTOCRAT: 'aristocrat',
    ]

    static Individual getIndividual(String individualType){
        if(individualType == null){
            null
        }
        if(individualType.equalsIgnoreCase(INDIVIDUALS.WORKER)){
            new Worker('workerFirstName', 'workerLastName', 20)

        } else if(individualType.equalsIgnoreCase(INDIVIDUALS.WARRIOR)){
            new Warrior('workerFirstName', 'workerLastName', 30)

        } else if(individualType.equalsIgnoreCase(INDIVIDUALS.ARISTOCRAT)){
            new Aristocrat('workerFirstName', 'workerLastName', 50)
        }
        null
    }

}
