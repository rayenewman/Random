import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        System.out.println("Simple Java Word Count Program");

        String test1 = "Today is a massive holiday";

        int wordCount = 1;

        for (int i = 0; i < test1.length(); i++)
        {
            if (test1.charAt(i) == ' ')
            {
                wordCount++;
            }
        }
        System.out.println("Word count is " + wordCount);

    }

}
