package HomeWork9;

public class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.voice();
        t.eat("grass");

        Rabbit r = new Rabbit();
        r.voice();
        r.eat("meat");

        Dog d = Dog.createDog();
        d.voice();
        d.eat("meat");
    }
}