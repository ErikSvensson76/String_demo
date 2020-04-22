package se.lexicon;

public class StringChaining {
    public static void main(String[] args) {
        String palindrom = "Ni talar bra latin";
        String name = "america";
        String name2 = "Amer";

        if(palindrom.replace(" ","").equalsIgnoreCase(new StringBuilder(palindrom.replace(" ", "")).reverse().toString())){
            System.out.println("It is a palindrome");
        }

        System.out.println(palindrom);
        System.out.println(palindrom.length());
        String talar_bra_latin = palindrom.substring(3).toUpperCase();
        System.out.println(talar_bra_latin);

        if(name2.toLowerCase().startsWith("am")){
            System.out.println(name2 + " starts with Am");
        }


        System.out.println(name.toLowerCase().contains(name2.toLowerCase()));
        System.out.println(name);
        System.out.println(name2);
    }
}
