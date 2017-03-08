import java.util.InputMismatchException;

/**
 * 
 * @author Bihter
 *
 */

public class Test {

	public static void main(String[] args) {

		// try-catch for any errors
		try {
			Matrix matrix = new Matrix(Integer.valueOf(args[0]), Integer.valueOf(args[1]));

			matrix.random();
			matrix.calAverage();

			// for printing that randomly created matrix
			System.out.println("Matrix");
			System.out.println(matrix + "\n");

			// if i, increasing sort
			if (args[2].equals("i")) {
				matrix.increasingSort();
				// if d, decreasing sort
			} else if (args[2].equals("d")) {
				matrix.decreasingSort();
			} else {
				System.out.println("false input! Please write 'i' or 'd' ");
			}

			// for printing matrix after sort
			System.out.println("Sorting Matrix");
			System.out.println(matrix);

		} catch (InputMismatchException errors) {
			System.out.println("Please write carefully!");
		}
	}

}
