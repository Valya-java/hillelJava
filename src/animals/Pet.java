package animals;

public class Pet extends Animals{
    private String name;
    private boolean isVaccinated;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getVoice(){
        super.getVoice();
        System.out.println(" I'm pet, my name is " + getName() + ".");

    }
}
