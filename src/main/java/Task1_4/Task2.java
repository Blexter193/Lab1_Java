package Task1_4;

import java.util.Arrays;
import java.util.Comparator;

public class Task2 {

    public static void main(String[] args) {
        final String[] strings = {"THRee", "FOUR", "TWo", "One"};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int count1 = countUpperCaseLetters(s1);
                int count2 = countUpperCaseLetters(s2);

                return Integer.compare(count1, count2);
            }
        });

        for (String str : strings) {
            System.out.println(str);
        }
    }

    private static int countUpperCaseLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;

    }
}