import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create ArrayList for passenger bogies
        List<String> trainConsist = new ArrayList<>();

        // Add bogies
        System.out.println("Adding passenger bogies...");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Print after insertion
        System.out.println("Bogies after addition: " + trainConsist);

        // Remove one bogie (AC Chair)
        trainConsist.remove("AC Chair");
        System.out.println("After removing AC Chair: " + trainConsist);

        // Check if Sleeper exists
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie NOT found.");
        }

        // Final list
        System.out.println("Final Train Consist: " + trainConsist);

        System.out.println("\nProgram continues...");
    }
}