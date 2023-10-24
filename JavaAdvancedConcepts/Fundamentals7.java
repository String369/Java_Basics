package JavaAdvancedConcepts;

public class Fundamentals7 {
    public static void main(String[] args) 
    {

        int nums25[] = {3,7,2,4};
        nums25[2] = 6;

        //Fixed Size : We cannot change size of an array
        //One Dimantional Array :
        int nums26[] = new int[4];
        nums26[0] = 4;
        nums26[1] = 5;
        nums26[2] = 6;
        nums26[3] = 7;


        //We have to mention index value to fetch the value
        System.out.println(nums25[2]);
        System.out.println(nums26[3]);

        //To avoid the statement to repeat multiple times use LOOOPS
        for(int i = 0; i < 4; i++ ){
            System.out.println(nums26[i]);
        }

        //Multi Dimentional Array
        int nums27[][] = new int[3][4];
        

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {

                nums27[i][j] = (int)(Math.random() * 100);
                System.out.print(nums27[i][j] + " ");
            }
            System.out.println();
        }

        //Enhanced for loop
        //Here "n[]" is a Single dimentional array

        for(int n[] : nums27)
        {
            for(int m : n)
            {

                System.out.print(m + " ");

            }
            System.out.println();
        }

        // Jagged Array : Internal array we can specify size of it
        int nums28[][] = new int[3][];
        
        nums28[0] = new int[3];
        nums28[1] = new int[4];
        nums28[2] = new int[2];



        for(int i = 0; i < nums28.length; i++)
        {
            for(int j = 0; j < nums28[i].length; j++)
            {

                nums28[i][j] = (int)(Math.random() * 100);
                System.out.print(nums28[i][j] + " ");
            }
            System.out.println();
        }



        for(int[] n : nums28)
        {
            for(int m : n)
            {
                
                System.out.print(m + " ");

            }
            System.out.println();
        }


        //Three Dimentional Array

        int nums29[][][] = new int[3][4][5];


        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                for(int k = 0; k < 5; k++)
                {

                    nums29[i][j][k] = (int)(Math.random() * 100);
                    System.out.print(nums29[i][j][k] + " ");

                }
                System.out.println();
            }
            System.out.println();
        }

        //Length of an array to avoid 
        int nums30[] = new int[4];
        nums30[0] = 4;
        nums30[1] = 5;
        nums30[2] = 6;
        nums30[3] = 7;

        for(int i = 0; i < nums30.length; i++ )
        {
            System.out.print(nums30[i] + " ");
        }
        System.out.println();

        //for each loop

        for(int n : nums30)
        {
            System.out.print(n);
        }
        System.out.println();


        // String Array
        //Manually create an object and assign to an array

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Bindu";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Sindu";
        s2.marks = 89;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Indu";
        s3.marks = 79;

        System.out.println(s1.name + ":" + s1.marks);

        //It is an array not an object
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i < students.length; i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        //Enhanced for loop
        for(Student stud : students)
        {
            System.out.println(stud.name + " " + stud.marks);
        }


        //Drawbacks
        // You cant expand the array size once defined
        // Collections are solution for this







     }
    
}

class Student
{

    int rollno;
    String name;
    int marks;

}
