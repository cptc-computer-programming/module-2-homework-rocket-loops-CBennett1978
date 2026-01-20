// Your header comment goes here.

public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    // Main Method 
    public static void main( String[] args ) {
        
        // Three Part Method
        printNoseCone();// Top of Rocket
        printBody();    // Body of Rocket (Middle)
        printNozzle();  // Bottom of Rocket (same as Nose Cone)
    }

    /*
     Print the nozzle at the bottom of the rocket.
     This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        printNoseCone();
    }
    
    /*
	Method 1
     Print the nose cone. 
     There is a pattern of ** down the middle of the cone, 
     with a widening pattern of //...\\ on either side.
     */
    
	public static void printNoseCone() {
    int totalRows = ROCKET_SIZE * 2;

    for (int i = 1; i <= totalRows; i++) {

        // 1. Leading spaces
        for (int s = 1; s <= totalRows - i; s++) {
            System.out.print(" ");
        }

        // 2. Left slashes
        for (int ls = 1; ls <= i; ls++) {
            System.out.print("/");
        }

        // 3. Middle stars
        System.out.print("**");

        // 4. Right slashes
        for (int rs = 1; rs <= i; rs++) {
            System.out.print("\\");
        }

        System.out.println();
    }
}
    
    /*
    Method 2
      Print body of rocket. 
	  This is a two-stage pattern with a 
	  diamond pattern in the top half 
	  and an
      hour glass on the bottom.
    */
	 
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();       
        printEdge();        
    }
    
    /*
     Print the top half of two diamonds between vertical lines.
    */
	 
    public static void printDiamondTop() {
       
    int rows = ROCKET_SIZE;
	// Loop Rows
    for (int i = 1; i <= rows; i++) {
        System.out.print("|");

        // 1. Leading dots
        for (int d = 1; d <= rows - i; d++) {
            System.out.print(".");
        }

        // 2. First diamond: i pairs of /\
        for (int p = 1; p <= i; p++) {
            System.out.print("/\\");
        }

        // 3. Middle dots between the two diamonds
        for (int d = 1; d <= 2 * (rows - i); d++) {
            System.out.print(".");
        }

        // 4. Second diamond: i pairs of /\
        for (int p = 1; p <= i; p++) {
            System.out.print("/\\");
        }

        // 5. Trailing dots
        for (int d = 1; d <= rows - i; d++) {
            System.out.print(".");
        }

        System.out.println("|");
    }
}
    
    /**
     Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        // your code goes here.
        System.out.println("A diamond bottom should be here.");
    }
    /**
      Print +=*=*=*...=+ to fit the width of the rocket.
     */
    public static void printEdge() {
        // your code goes here.
        System.out.println("An edge should be here.");
    }
}
