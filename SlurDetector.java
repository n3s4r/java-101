import java.util.*;

public class SlurDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List of slurs or banned words (example only)
        // You can add/remove words as needed
        String[] bannedWords = {
            "slur1",
            "slur2",
            "slur3"
        };

        System.out.println("Enter your message:");
        String input = scanner.nextLine().toLowerCase();

        boolean found = false;

        // Check if the input contains any of the banned words
        for (String word : bannedWords) {
            if (input.contains(word.toLowerCase())) {
                found = true;
                System.out.println("⚠️ Warning: Your input contains inappropriate language (" + word + ")");
            }
        }

        if (!found) {
            System.out.println("✅ Your message is clean!");
        }
        
        scanner.close();
    }
}
