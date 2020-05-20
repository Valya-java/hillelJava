package animals;

public class WildAnimals extends Animals{
    private boolean isPredator;

    public WildAnimals(boolean isPredator) {
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void canEatYou(boolean isPredator){
        if(isPredator)
            System.out.println("I can eat you.");
        else System.out.println("I don't eat meat.");
    }

    @Override
    public void getVoice(){
        super.getVoice();
        System.out.println(" I'm wild animal.");
        canEatYou(isPredator);
    }

}
