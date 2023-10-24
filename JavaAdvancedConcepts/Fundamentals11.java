package JavaAdvancedConcepts;

public class Fundamentals11 {
    public static void main(String args[]) throws ClassNotFoundException {

        // Every time class loads and objects are instantiated
        
       CellPhone obj1 = new CellPhone();
       obj1.brand = "Apple";
       obj1.price = 1500;
       CellPhone.name = "Smart Phone";

       CellPhone obj2 = new CellPhone();
       obj2.brand = "Samsung";
       obj2.price = 1200;
       CellPhone.name = "Smart Phone";

        // To load class without creating an object we use

          Class.forName("JavaAdvancedConcepts.CellPhone");

          // We can call static method directly in main method
          CellPhone.show1(obj2);
    }
}

class CellPhone
{
     String brand;
     int price;
     static String name;

    //Constructor : To instantiate the instant variables.
    //Constructor name same as class name.

    public CellPhone()
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

    
     // We cannot use non static variables inside the static method
    public static void show1(CellPhone obj)
    {
        System.out.println("in static method");
        System.out.println(obj.brand+ " : " + obj.price + " : " + name);
    }
}

