package SESSION09.b4;

public class Animal {
    public void sound() {
        System.out.println("keu");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("cho sua");
    }
    public void fetch() {
        System.out.println("ch");
    }
}


