package animals;

public class Crocodile extends WildAnimals{

    public Crocodile(boolean isPredator) {
        super(isPredator);
    }

    @Override
    public void getVoice(){
        super.getVoice();
        System.out.println("I'm Crocodile.");
    }
}



