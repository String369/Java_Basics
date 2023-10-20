package JavaBasicConcepts;

public class Fundamentals{

    public static void main(String a[])

    {
        System.out.println("Hello World");
        System.out.println(3+5);
        
        //Variables 
        int num1 = 5;
        int num2 = 8;
        System.out.println(num1 + num2);
        int result = num1+num2;
        System.out.println(result);

        //Data Types : Primitive 
        byte by = 127;
        short sh = 558;
        int num3 = 9;
        long l = 5678l;

        float f = 6.55f;
        double d = 6.55;

        char c = 'k';

        boolean b = true; 

        System.out.println("Data Types are : " + by + sh + num3 + l + f + d + c + b);

        //Literals : Binary and Hexadecimal literals
        int num4 = 0b101;
        int num5 = 0x7E;
        int num6 = 10_00_00_00_00;
        double num7 = 12e10;
        
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

        char c1 = 'a';
        c1++;
        System.out.println(c1);

        //Type conversion and Casting
        byte b1 = 127;
        int num8 = b1; //Implicit conversion 
        System.out.println(num8);

        //You cannot assign integer to byte
        int num9 = 257;
        // byte b3 = num9; Incompatible type : where Typencasting involves
        byte b2 = (byte)num9;
        System.out.println(b2);

        float f1 = 5.6f;
        int num10 = (int)f1; //Explicit conversion : CASTING
        System.out.println(num10);

        //Type Promotions
        byte b3  = 10;
        byte b4 = 20;
        int result1 = b3*b4;
        System.out.println(result1);

        //Assigning Operators
        int num11 = 7;
        
        //Increment
        // num11 = num11+2;
        // num11 += 2;
        // num11++; //Post increment : First fetch the value and increment
        // ++num11; //Pre increment  : First increment the value and after it will fetch the value

        // int result2 = ++num11;
        int result2 = num11++;
        System.out.println("Post increment : " + result2);


        //Decrement
        num11 -= 2;
        num11--;

        int num12 = 5;

        // int result3 = num11+num12;
        // int result3 = num11-num12;
        // int result3 = num11*num12;
        int result3  = num11%num12;

        System.out.println(result3);

        //Comparators
        // boolean result4 = num11<num12; // 7<5
        // boolean result4 = num11>num12;
        // boolean result4 = num11<=num12;
        boolean result4 = num11>=num12;

        System.out.println(result4);
    }

}


