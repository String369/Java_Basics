package JavaAdvancedConcepts;

public class Fundamentals8 {
    public static void main(String[] args)
    {

        // String is class we can create object for it
        String name = new String("Bindu");

        System.out.println("hello" + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Chowdary"));// changing the address
        System.out.println(name.hashCode());

        //String constant pool, In string it will not create new object for same string, it will use existed address. It will save the memory
        String s1 = "Bindu";
        String s2 = "Bindu";

        System.out.println(s1 == s2);

        //String Buffer is thread safe
        StringBuffer sb = new StringBuffer("Bindu");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Chowdary1");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.insert(4, " Java");
        System.out.println(sb);

        String str1 = sb.substring(2, 5);
        System.out.println(str1);

        sb.setLength(30);
        System.out.println(sb);

        sb.ensureCapacity(100);
        System.out.println(sb);
        
    }
    
}
