package animals;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);

    }

    @Override
    public void getVoice(){
        super.getVoice();
        System.out.println("Meow");
    }
}
