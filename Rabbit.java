/**
 * Latihan53
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Rabbit
 */
public class Rabbit extends Animal {
    private String color,name;


    public Rabbit(String color, String name, boolean veg, String eats, int noOflegs) {
        super(veg, eats, noOflegs);
        this.color = color;
        this.name = name;
        this.eats = eats;
        this.noOflegs = noOflegs;
        this.vegetarian = veg;
        
        System.out.println("Hello, his name is " +name);
        System.out.println(name+" is Vegetarian ? " +veg);
        System.out.println(name+ " eats " +eats);
        System.out.println(name+ "has " +noOflegs+ " legs ");
        System.out.println(name+ " color is " +color );
                
        
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
}
