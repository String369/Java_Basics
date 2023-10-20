package JavaBasicConcepts;

public class Fundamentals1 {
        public static void main(String a[])
    
    {
        int num13 = 7;
        int num14 = 5;
        int num15 = 5;
        int num16 = 9;

        //Logical Operators

        boolean result5 = num13>num14 && num15<num16;
        // boolean result5 = num13>num14 || num15<num16;
        System.out.println(result5);
        System.out.println(!result5);


        //Conditional Statements
        if(num16<10)
        System.out.println("Condition executed : " + "Hello");

        if(num16>10 && num16<=20)
        System.out.println("Condition executed1 : " + "Hello1");
        else
        System.out.println("Condition executed1 : " + "Bye1");

        if(num15>num16)
        System.out.println("Condition executed2 : " + "Hello2");
        else
        System.out.println("Condition executed2 : " + "Bye2");

        if(num14>num15 && num14>num16)
        System.out.println("Condition executed3 : " + "num14");
        else if(num15>num14 && num15>num16)
        System.out.println("Condition executed3 : " + "num15");
        else 
        System.out.println("Condition executed3 : " + "num16");

        //Terinary Operator
        int result6 = 0;

        // if(num16%3==0) 
        // result6 = 10;
        // else
        // result6 =20;

        result6 = num16%3 == 0? 10:20; 
        System.out.println("Condition executed4 : " + result6);

        //Switch Statement
        int n = 1;

        switch(n){
            case 1:
            System.out.println("Switch statement1 : " + "Monday");
            break;
            case 2:
            System.out.println("Switch statement2 : " + "Tuesday");
            break;
            case 3:
            System.out.println("Switch statement3 : " + "Wednesday");
            break;
            case 4:
            System.out.println("Switch statement4 : " + "Thursday");
            break;
            case 5:
            System.out.println("Switch statement5 : " + "Friday");
            break;
            case 6:
            System.out.println("Switch statement6 : " + "Saturday");
            break;
            case 7:
            System.out.println("Switch statement7 : " + "Sunday");
            break;
            default:
            System.out.println("Switch statement8 : " + "Invalid input");
        }

            //Loops : while, do-while, for

            //while loop : If you have to read infinite data use it
            //This is called nested while loop
            while(n<=4)
            {
                System.out.println("Loops : "+ "Hi " + n);  

                int n1 = 1;
                
                while (n1<=3){
                System.out.println("Loops : "+ "Hello " + n1);
                n1++;
                }
                n++;
            }

            System.out.println("Loops : "+ "Bye " + n);   

            //do-while loop : We want to execute the block even the condition is false to give a message

            int n3 =5;

            do
            {

            System.out.println("Loops1 : "+ "Hi " + n3); 
            n3++;

            }while(n3 <= 4);

            //for loop: We can initialize, give condition and increment in one line 
            //If you have finite number 100 -condition

            //Increment
            for(int n4 = 1; n4 <=4; n4++)
            {
                System.out.println("Loops2 : "+ "Hi " + n4); 
            }

            //Decrement 
            for(int n4 = 4; n4 >= 1; n4--)
            {
                System.out.println("Loops2 : "+ "Hi " + n4); 
            }

            //Nested for loop : Pattern days

            for(int n4 = 1; n4 <= 5; n4++)
            {
                System.out.println("DAYS : "+  n4); 

                for(int n5 = 1; n5 <= 9; n5++ ){
                    System.out.println("Hours : "+ (n5+8) +"-"+(n5+9)); 
                }
            }
    }
}
