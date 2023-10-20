package JavaBasicConcepts.JavaAdvancedConcepts;

public class Fundamentals6 {
    public static void main(String[] args) 
    {
        // Local Variable
        // int data = 10;

        // Here obj is not an object it is a reference variable

        Calculator2 obj = new Calculator2();
        Calculator2 obj1 = new Calculator2();
        int result10 = obj.add1(20, 30);
        System.out.println(result10);
        

        // We can call instance variable directly with object reference
        obj.num24 = 40;

        System.out.println("Calling INstance variable: " + obj.num24);
        System.out.println("Calling INstance variable: " + obj1.num24);

    }
    
}

class Calculator2
{
    //Instance Variable : 
    //Heap Memory : Instance variables store in heap and it will create adress for every instance variable.

    int num24 = 30;
   
    // Local Variables :Here num22 and num23 are local variables
    // Stack Memory : Local variables will store in particular stack memory

    public int add1(int num22, int num23)
    {
        return num22+num23;
    }
}


