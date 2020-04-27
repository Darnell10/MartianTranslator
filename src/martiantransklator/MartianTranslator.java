package martiantransklator;

public class MartianTranslator {

    public static void main(String[] args) {

        String words = " Is there life on Mars? ";


        System.out.println(martianTranslator(words));


    }

    public static String martianTranslator(String words) {

        String upperCaseMartian = " Boinga ";
        String lowerCaseMartian = " boinga ";

        String[] wordArray = words.split(" ");

        String result = " ";

        for (String word : wordArray) {
            if (word.length() > 3 && Character.isUpperCase(word.charAt(0))) {
                result += upperCaseMartian;
            } else if (word.length() > 3 && Character.isLowerCase(word.charAt(0))) {
                result += lowerCaseMartian ;
            } else {
                result += " " + word;
            }
        }

        return result;
    }
}
