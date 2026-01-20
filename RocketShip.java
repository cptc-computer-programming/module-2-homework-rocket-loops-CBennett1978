public class RocketShip {

    public static final int ROCKET_SIZE = 3;

    // Main
    public static void main(String[] args) {
        // 3 Part Method
		printNoseCone();
        //printBody();
        printNozzle();
    }

    // Reuse the nose cone for the nozzle
    public static void printNozzle() {
        printNoseCone();
    }

    // Method 1 and 3: Prints the top/bottom cone
    public static void printNoseCone() {
        for (int i = 1; i <= 5; i++) {

            // leading spaces
            for (int s = 1; s <= 6 - i; s++) {
                System.out.print(" ");
            }

            // forward slashes
            for (int f = 1; f <= i; f++) {
                System.out.print("/");
            }

            // middle **
            System.out.print("**");

            // back slashes
            for (int b = 1; b <= i; b++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }
}