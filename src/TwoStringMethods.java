public class TwoStringMethods {
    public static void main(String[] args) {
        boolean answer = abcTest("123.abc");
        System.out.println(answer);

        String ans = alternateStrings("Hi", "There");
        System.out.println(ans);
    }

    public static String alternateStrings(String text1, String text2) {
        String finalText = "";
            for (int i = 0; i < text1.length(); i++) {
                finalText += text1.substring(i, i + 1);
                int count = 0;
                for (int j = i; j < text2.length(); j++) {
                    if (count == 0) {
                        finalText += text2.substring(j, j + 1);
                        count = 1;
                    }
                }
            }
        if (text2.length() > text1.length()) {
            finalText += text2.substring(text1.length(), text2.length());
        }
        return finalText;
    }

    public static boolean abcTest(String text) {

        if (text.contains("abc")) {
            if (!text.contains(".abc")) {
                return true;
            }
        }
        return false;
    }
}