package Lesson_12;

public class StringManipulator {
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String replaceSubstring(String str, String substr, String newSubstr) {
        String replaced = str.replace(substr, newSubstr);
        return replaced;
    }

    public static String removeWhitespace(String str) {
        String repl = str.replaceAll(" ","");
        return repl;
    }

    public static void main(String[] args) {
        String str = "Hello     world";

        String reversed =StringManipulator.reverse(str);
        System.out.println(reversed);

        String replaced = StringManipulator.replaceSubstring("hello", "o", "a");
        System.out.println(replaced);

        String repl = StringManipulator.removeWhitespace(str);
        System.out.println(repl);
    }
}



