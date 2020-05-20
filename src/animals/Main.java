package animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska");
        Dog dog = new Dog("Muhtar");
        GuideDog guideDog = new GuideDog("Spensor", true);
        Fish fish = new Fish("Nemo");
        Crocodile crocodile = new Crocodile(true);
        Lion lion = new Lion(true);
        Giraffe giraffe = new Giraffe(false);
        Hamster hamster = new Hamster("Hamster");
        Wolf wolf = new Wolf(true);
        Animals[] animals = new Animals[]{cat, dog, guideDog, fish, crocodile, lion, giraffe, hamster, wolf};
        for(Animals animal:animals)
           animal.getVoice();

    }
}
