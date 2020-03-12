import static java.lang.Character.*;

public class ROT13 {

    private Integer minus;

    ROT13(Character cs, Character cf) {
        this.minus = cf - cs;
    }

    ROT13() {
    }

    public String crypt(String text) throws UnsupportedOperationException {

        String result = "";
        char t;
        for (int i = 0; i < text.length(); i++) {
            if (isAlphabetic(text.charAt(i))) {
                t = text.toLowerCase().charAt(i);
                t = (char) ((t + minus - (int) 'a') % 26 + (int) 'a');
            } else {
                t = text.charAt(i);
            }
            result += t;
        }
        result = result.toUpperCase().substring(0, 1) + result.substring(1);
        return result;
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        String result = "";
        char t;
        for (int i = 0; i < text.length(); i++) {
            if (isAlphabetic(text.charAt(i))) {
                t = text.toLowerCase().charAt(i);
                t = (char) ((t - minus - (int) 'a' + 26) % 26 + (int) 'a');
            } else {
                t = text.charAt(i);
            }
            result += t;
        }
        result = result.toUpperCase().substring(0, 1) + result.substring(1);
        return result;
    }

    public static String rotate(String s, Character c) {
        int i = ((int) c - (int) 'A') % s.length();
        return s.substring(i) + s.substring(0, i);
    }
}
//    public static void main(String[] args) {
//        System.out.println((int)'a');
//    }
//}





