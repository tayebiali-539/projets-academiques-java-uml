package com.exercice5_6;

public class MaString {
    public static String formatName(String fullName) {
        fullName = fullName.trim().replaceAll("\\s+", " ");
        String[] mots = fullName.split(" ");

        return mots[1]+", " + mots[0];
    }

    public static String reverse(String input) {
		//Solution classique
        /*String output = "";
		for(int i=input.length()-1;i>=0;i--) {
			output = output+input.charAt(i);
		}
		return output;
		*/
        //Solution optimale
        StringBuilder chaine = new StringBuilder(input);
        return chaine.reverse().toString();
    }

    public static int countWords(String input) {
        input = input.replaceAll("\\s+", " ");
        return input.split(" ").length;
    }

    public static String replaceVowels(String input, char symbol) {
        /**
         * Pour convertir un char to string
         * Solution 1 : String.valueOf(symbol)
         * Solution 2 : ""+symbol ==>(concaténation d'un caractère avec une chaine vide )
         */
        return  input.replaceAll("[AOIUEaoieu]",""+symbol);
    }

    public static void main(String[] args) {
        System.out.println(formatName("Hello    world"));
        System.out.println(reverse("Hello    world"));
        System.out.println(countWords("Hello    world"));
        System.out.println(replaceVowels("Hello    world", '*'));
    }
}
