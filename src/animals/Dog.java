package animals;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void getVoice(){
        super.getVoice();
        System.out.println("Woof");
    }
}
