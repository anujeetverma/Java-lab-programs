import java.util.Scanner;

public class fiveSentence {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);  

        int num = 5; // Define the number of sentences to input
        
        for (int i = 0; i < num; i++) {
            System.out.println("Enter sentence number " + (i + 1) + ":");
            String s = scanner.nextLine().trim().toLowerCase();
            String[] words = s.split("\\W+");
            int count =0;
            // Print words for verification
            System.out.println("Words in sentence " + (i + 1) + ":");
            for (String word : words) {
                //System.out.println(word);
                if (!word.isEmpty() && "aeiou".indexOf(word.charAt(0)) != -1) {
                    count++;
                }
                if (!word.isEmpty() && "aeiou".indexOf(word.charAt(0)) != -1) {
                    System.out.print(word + " ");
                }

                if (!word.isEmpty() && "1234567890".indexOf(word.charAt(0)) != -1) {
                    System.out.println(word + "is The numbers in sentence " + (i+1) );
                }
            }
            System.out.println(" : are the words in sentence " + (i+1) +" starting with vovel = " + count);
        }

        scanner.close(); // Close scanner to prevent resource leaks
    }
}