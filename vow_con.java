import java.util.Scanner;

public class StringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.util);

        System.out.print("Enter your text: ");
        String input = scanner.nextLine();

        // Containers to store the characters found
        StringBuilder foundVowels = new StringBuilder();
        StringBuilder foundConsonants = new StringBuilder();
        
        int vCount = 0;
        int cCount = 0;

        // Process each character
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vCount++;
                    foundVowels.append(ch).append(" ");
                } else {
                    cCount++;
                    foundConsonants.append(ch).append(" ");
                }
            }
        }

        System.out.println("\n--- Detailed Results ---");
        System.out.println("Vowels Count: " + vCount + " (" + foundVowels.toString().trim() + ")");
        System.out.println("Consonants Count: " + cCount + " (" + foundConsonants.toString().trim() + ")");
        
        scanner.close();
    }
}
