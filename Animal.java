/**
 * Latihan53
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Rabbit
 */
public class Animal {

    protected boolean vegetarian;
    protected String eats;
    protected int noOflegs;

    public Animal(boolean vegetarian, String eats, int noOflegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOflegs = noOflegs;
    }
    
    public boolean isVegetarian(){
     return vegetarian;   
    }

    public String getEats() {
        return eats;
    }

    public int getNoOflegs() {
        return noOflegs;
    }


}