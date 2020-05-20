package animals;

public class Fish extends Pet {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void getVoice(){
        System.out.println("........");
    }

}
