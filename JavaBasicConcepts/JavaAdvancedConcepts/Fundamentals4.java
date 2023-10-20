package JavaBasicConcepts.JavaAdvancedConcepts;

public class Fundamentals4 {
    public static void main(String[] args) 
    {
        
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMePen(5);
        System.out.println(str);
    }
    
}

class Computer {

    // void : Which will avoid return statement

    public void playMusic()
    {
        System.out.println("Music is palying");
    }

    // If you mention return type : Must have to write return statement

    public String getMePen(int cost)
    {
        if(cost>=10)
        return "Pen";
        else
        return "Nothing";
    }
}
