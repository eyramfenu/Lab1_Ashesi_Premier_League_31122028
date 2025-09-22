import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("    Player Report    ");

        // Player Name
        System.out.print("Enter player name: ");
        String name = scanner.nextLine();

        // Player Age & Category
        System.out.print("Enter age (years): ");
        int age = scanner.nextInt();
        String category;
        if (age < 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }

        // Player Height (m to cm)
        System.out.print("Enter height (meters): ");
        double height = scanner.nextDouble();
        double heightCm = height * 100;

        // Player Weight (lbs to kg)
        System.out.print("Enter weight (pounds): ");
        double weight = scanner.nextDouble();
        double weightKg = weight * 0.45359237;

        // Jersey Number
        System.out.print("Enter jersey number: ");
        int jersey = scanner.nextInt();

        // Determine Position
        String position;
        switch (jersey) {
            case 1:  position = "Goalkeeper"; break;
            case 2:  position = "Defender"; break;
            case 5:  position = "Defender"; break;
            case 6:  position = "Midfielder"; break;
            case 7:  position = "Winger"; break;
            case 8:  position = "Midfielder"; break;
            case 9:  position = "Striker"; break;
            case 10: position = "Playmaker"; break;
            case 11: position = "Winger"; break;
            default: position = "Unknown"; break;
        }

        // Attacker check
        String attacker = (jersey == 7 || jersey == 9 || jersey == 11) ? "Yes" : "No";

        // Eligibility
        int roundedWeight = (int) weightKg;
        boolean eligible = (age >= 18 && age < 35) && (roundedWeight < 90);
        String eligibility = eligible ? "Eligible" : "Not Eligible";

        // Lineup Decision
        boolean primePlayer = (age >= 20 && age <= 30);
        String lineup;
        if (primePlayer) {
            if (roundedWeight < 80) {
                lineup = "Starting Lineup";
            } else {
                lineup = "Too Heavy to Start";
            }
        } else {
            lineup = "Not in Prime";
        }

        // Final Decision
        String finalDecision = eligible ? "Play" : "Rest";

        // PRINT REPORT
        System.out.println("   Player Report   ");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heightCm + " cm");
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Jersey: " + jersey);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + attacker);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + lineup);
        System.out.println("Final Decision: " + finalDecision);
    }
}