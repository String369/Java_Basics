package JavaBasicConcepts.JavaAdvancedConcepts;

public class Fundamentals11 {
    public static void main(String args[]) 
    throws ClassNotFoundException 
    {

        // Every time class loads and objects are instantiated
        
        MobileCons obj1 = new MobileCons();
        obj1.brand = "Apple";
        obj1.price = 1500;
        MobileCons.name = "Smart Phone";

        MobileCons obj2 = new MobileCons();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        MobileCons.name = "Smart Phone";

        // To load class without creating an object we use 
        // Class.forName("MobileCons");

    }
    
}

class MobileCons 
{
    String brand;
    int price;
    static String name;

    //Constructor : To instatiate the instant variables.
    //Constructor name same as class name.

    public MobileCons()
    {
        brand = "";
        price = 200;
        System.out.println("In Constructor");

    }

    //static block : To initialize the static variable, It will call this block only once 
    static
    {
        name = "Phone";
        System.out.println("In static block");
    }

    public void show()
    {
        System.out.println(brand+ " : " + price + " : " + name);
    }
}

