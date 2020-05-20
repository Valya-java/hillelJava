package animals;

public class GuideDog extends Dog{
    private boolean isTrained;

    public GuideDog(String name, boolean isTrained) {
        super(name);
        this.isTrained = isTrained;
    }

    public void getHome(boolean isTrained){
        if(isTrained)
            System.out.println("I can take you home.");

    }
    @Override
    public void getVoice(){
        super.getVoice();
        getHome(isTrained);
    }
}
