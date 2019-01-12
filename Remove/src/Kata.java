public class Kata {

    public static String remove(String s, int n) {
        String result = s;
        for (int i = 0; i < n; i++) {
            result = result.replaceFirst("!", "");
        }


        return result;

    }

}