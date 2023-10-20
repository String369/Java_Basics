package JavaBasicConcepts.JavaAdvancedConcepts;

public class Fundamentals5 
{
    public static void main(String[] args) 
    {
        
        Calculator1 calc1 = new Calculator1();
        int result8 = calc1.add(20, 30);
        int result9 = calc1.add(20, 30, 40);
        System.out.println(result8);
        System.out.println(result9);

    }
    
}

class Calculator1
{
    //Method Signature : Method name is same but have different parameters and different type of parameters
    //Return type doesnt matter only method name and parameters
    //Method Overloading
 
    public int add(int num19, int num20)
    {
        return num19+num20;
    }

    public int add(int num19, int num20, int num21)
    {
        return num19+num20+num21;
    }
}
