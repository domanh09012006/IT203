package SESSION09.b1;

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
