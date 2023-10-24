package JavaAdvancedConcepts;

public class Fundamentals3 {
    public static void main(String args[])
    {

        // Object oriented programming : Object : Properties and Behaviours
        // Calling a method using object
        

        int num17 = 4;
        int num18 = 5;

        Calculator calc = new Calculator();

        int result7 = calc.add(num17, num18); // --> It needs a object

        // int result7 = num17+num18;

        System.out.println(result7); 


    }
    
}

class Calculator
{
    int num19;

    public int add(int num17, int num18)
    {
        System.out.println("in add");
        int r = num17+num18;
        return r;
    }
}
