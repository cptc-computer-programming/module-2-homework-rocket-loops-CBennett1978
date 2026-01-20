public class RocketShip {

    public static final int ROCKET_SIZE = 3;

/*
Desired Output:

     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
+=*=*=*=*=*=*+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+=*=*=*=*=*=*+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
 
*/
    // Main
    public static void main(String[] args) {
        // 3 Part Method
		printNoseCone();
        printBody();
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

// Method 2: RocketBody (Entire Middle Section)
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();
        printEdge();
        printDiamondBottom();
        printDiamondTop();
        printEdge();
    }

    // Print Edge(s) (+=*=*=*=*=*=*+)
    public static void printEdge() {
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }

    /* Fully loop‑based version of:
									 |../\..../\..|
									 |./\/\../\/\.|
									 |/\/\/\/\/\/\|
	*/
    // TopDiamond
	public static void printDiamondTop() {
        int rows = ROCKET_SIZE;
		// Loop Rows
        for (int r = 1; r <= rows; r++) {
            System.out.print("|");

            int dots = rows - r;
            int pairs = r;
            int middleDots = 2 * dots;

            // LeadingDots
            for (int i = 0; i < dots; i++) System.out.print(".");

            // First /\ 
            for (int i = 0; i < pairs; i++) System.out.print("/\\");

            // MiddleDots
            for (int i = 0; i < middleDots; i++) System.out.print(".");

            // Second  /\ 
            for (int i = 0; i < pairs; i++) System.out.print("/\\");

            // TrailingDots
            for (int i = 0; i < dots; i++) System.out.print(".");

            System.out.println("|");
        }
    }
    /*  Fully loop‑based version of:
									 |\/\/\/\/\/\/|
									 |.\/\/..\/\/.|
									 |..\/....\/..|
	*/
	// BottomDiamond
    public static void printDiamondBottom() {
        int rows = ROCKET_SIZE;
		// Loop Rows
        for (int r = rows; r >= 1; r--) {
            System.out.print("|");

            int dots = rows - r;
            int pairs = r;
            int middleDots = 2 * dots;

            // LeadingDots
            for (int i = 0; i < dots; i++) System.out.print(".");

            // First \/ 
            for (int i = 0; i < pairs; i++) System.out.print("\\/");

            // MiddleDots
            for (int i = 0; i < middleDots; i++) System.out.print(".");

            // Second \/ 
            for (int i = 0; i < pairs; i++) System.out.print("\\/");

            // TrailingDots
            for (int i = 0; i < dots; i++) System.out.print(".");

            System.out.println("|");
        }
    }
}
