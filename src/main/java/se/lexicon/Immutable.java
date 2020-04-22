package se.lexicon;

import java.util.Arrays;

public class Immutable {
    public static void main(String[] args) {
        String firstName = "Erik";
        String lastName = " Svensson";
        Person person = new Person();
        person.firstName = firstName;
        person.lastName = lastName;
        System.out.println(person.firstName);
        System.out.println(person.lastName);

        changePerson(person);
        System.out.println(person.firstName);
        System.out.println(person.lastName);

        /*
        char[] charArray = {'j','a','v'};
        System.out.println(Arrays.toString(charArray));
        changeArray(charArray);
        System.out.println(Arrays.toString(charArray));
        */

        // 1. concat "Erik" + " Svensson" will return "Erik Svensson"
        // 2. Get passed in to println and printed to console
        // 3. gets thrown away
        //System.out.println(firstName.concat(lastName));

        //System.out.println(firstName);

        //changeString(firstName);
        //System.out.println(firstName);
    }

    public static void changePerson(Person person){
        person.firstName = "Billy";
        person.lastName = "Bob";
    }

    public static void changeArray(char[] chars){
        chars = Arrays.copyOf(chars, chars.length+1);
        chars[chars.length-1] = 'a';
    }

    public static void changeString(String s1){
        s1 = s1 + " added this"; //You can NEVER change a String
        System.out.println(s1);
    }
}
