package JavaAdvancedConcepts;

public class Fundamentals9 {
    public static void main(String[] args) 
    {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        //Static variables will call directly with class name
        Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        Mobile.name = "Smart Phone";

        // As name is static variable it will change both the object names
        obj1.name = "Phone";

        obj1.show();
        obj2.show();

    }
    
}

class Mobile 
{
    //STATIC Keyword : Static variables will shared by different objects
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand+ " : " + price + " : " + name);
    }
}
