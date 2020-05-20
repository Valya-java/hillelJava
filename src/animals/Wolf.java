package animals;

public class Wolf extends WildAnimals {
    public Wolf(boolean isPredator) {
        super(isPredator);
    }

    @Override
    public void getVoice(){
        super.getVoice();
        System.out.println("I'm Wolf.");
    }

}
