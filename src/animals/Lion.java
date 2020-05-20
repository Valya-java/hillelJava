package animals;

public class Lion extends WildAnimals{
    public Lion(boolean isPredator) {
        super(isPredator);
    }

    @Override
    public void getVoice(){
        super.getVoice();
        System.out.println("I'm Lion.");
    }
}
