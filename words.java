import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        System.out.println();
        System.out.println("Word one in uppercase: " + word1.toUpperCase());
        System.out.println("Word two in lowercase: " + word2.toLowerCase());
        System.out.println("First two characters of word three: " + word3.substring(0, 2));

        input.close();
    }
}
