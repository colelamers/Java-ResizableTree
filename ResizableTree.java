
public class ResizableTree {

	//Cole Lamers
	public static void main(String[] args) {
		printChristmasTree(10);

	}

	public static void printChristmasTree(int height) {
		int treeHeight = 0;
		while (treeHeight < height) {
			printSpaces(height - treeHeight - 1);
			printStars(treeHeight);
			treeHeight++;

			//			 This function of the tree prints the base. Not 100% sure how code below if statement works though.
			if (treeHeight == height) {
				printSpaces(height - 2);
				printBase();
				printSpaces(height - 2);
				printBase();
			}
		}
	}

	//	This prints out the spaces

	public static void printSpaces(int space) {
		int treeSpace = 0;
		while (treeSpace < space) {
			System.out.print(" ");
			treeSpace++;
		}

	}

	//	This prints out the stars
	public static void printStars(int stars) {

		int treeStars = 0;
		while (treeStars <= stars) {
			System.out.print("*");
			//			This if function starts off with printing only 1 star. Then it adds 2 stars (thus making it odd) 
			//			every time the condition is satisfied. This fixed the issue where it descends incrementally by 2.
			if (treeStars < 0) {
				return;
			}else if (treeStars > 0) {
				System.out.print("*");
			}
			treeStars++;

		}

		System.out.println();
	}

	//	I had to create this because the base is a separate portion of the code
	public static void printBase() {
		//		treeBase is 0 and when it is less than 1, it will only print out 2 lines of code
		int treeBase = 0;
		while (treeBase < 1) {
			System.out.println("***");
			treeBase++;
		}
	}
}
