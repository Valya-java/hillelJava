package animals;

public class Giraffe extends WildAnimals{
    public Giraffe(boolean isPredator) {
        super(isPredator);
    }

    @Override
    public void getVoice(){
        super.getVoice();
        System.out.println("I'm Giraffe.");
    }
}
