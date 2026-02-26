package SESSION11;

interface IMixable {
    void mix();
}
abstract class Drink {
    protected String id;
    protected String name;
    protected double price;
    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    abstract double calculatePrice();
    void displayInfo() {
        System.out.println("Ma: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Gia goc: " + price);
    }
}

class Coffee extends Drink {
    boolean hasMilk;
    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }
    @Override
    double calculatePrice() {
        if (hasMilk) {
            return price + 5000;
        } else {
            return price;
        }
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        if (hasMilk) {
            System.out.println("Co sua");
        } else {
            System.out.println("Den da");
        }
    }
}

class FruitJuice extends Drink implements IMixable {
    int discountPercent;
    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }
    @Override
    double calculatePrice() {
        return price - (price * discountPercent / 100);
    }
    @Override
    public void mix() {
        System.out.println("Dang ep trai cay tuoi...");
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Giam gia: " + discountPercent + "%");
    }
}

public class HN_PTIT_CNTT2_THUCHANHSS11 {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("C01", "Bac siu", 30000, true);
        drinks[1] = new FruitJuice("F01", "Nuoc cam", 40000, 10);
        drinks[2] = null;
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] != null) {
                drinks[i].displayInfo();
                System.out.println("Thanh tien: " + drinks[i].calculatePrice());
                if (drinks[i] instanceof IMixable) {
                    IMixable mixDrink = (IMixable) drinks[i];
                    mixDrink.mix();
                }
                System.out.println();
            }
        }
    }
}