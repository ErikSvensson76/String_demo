package se.lexicon;


public class App 
{
    public static void main( String[] args )
    {
        /*
        Summary:    Never EVER use == when comparing Strings or any other object.
                    Instead use the equals() method
         */

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello world";
        String s4 = s3.substring(0, s3.indexOf(" "));
        String s5 = s1 + " world";

        System.out.println(s3 == s5);


        System.out.println(s1.equals(s2)); //We can rely on equals
        System.out.println(s1 == s2); //We can't rely on ==
        System.out.println(s4.equals(s1));
        System.out.println(s4 == s1);
    }
}
