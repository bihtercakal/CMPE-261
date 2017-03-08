import java.util.Random;
/**
 * 
 * @author Bihter
 *
 */
class Matrix {
	
	private double[][] arr;
	private Average[] average; 

	/**
	 * 
	 * @param row
	 * @param column
	 */
	public Matrix (int row, int column) {
		arr = new double[row][column];
		average = new Average[arr.length];
	}

	//This method generate random double numbers
	public void random() {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextDouble() * 1000000;
			}
		}
	}

	
	//for calculating averages of each row
	public void calAverage() {
		for (int i = 0; i < average.length; i++) {
			double avr = 0.0;
			for (int j = 0; j < arr[i].length; j++) {
				avr = avr + arr[i][j];
			}
			average[i] = new Average(avr / arr[i].length, i);
		}
	}

    //to sort increasingly matrix according to averages of each rows
	public void increasingSort() {
		int j;
		Average temp;
		for (int i = 1; i < average.length; i++) {
			temp = average[i];
			j = i - 1;
			while (j >= 0 && average[j].getAverage() > temp.getAverage()) {
				average[j + 1] = average[j];
				j--;
			}
			average[j + 1] = temp;
		}
	}
     
	//to sort decreasingly matrix according to averages of each rows
	public void decreasingSort() {
		int j;
		Average temp;
		for (int i = 1; i < average.length; i++) {
			temp = average[i];
			j = i - 1;
			while (j >= 0 && average[j].getAverage() < temp.getAverage()) {
				average[j + 1] = average[j];
				j--;
			}
			average[j + 1] = temp;
		}
	}

	//this method to get formatted output
		public String toString() {
			String result = "";
			for (int i = 0; i < arr.length; i++) {
				result = result + "|";
				for (int j = 0; j < arr[i].length - 1; j++) {
					result = result + String.format("%.2f",arr[average[i].getIndex()][j]) + "\t";
				}
				result = result + String.format("%.2f",arr[average[i].getIndex()][arr[i].length - 1]);
				result = result + "| Average =" + String.format("%.2f",average[i].getAverage()) + "\n";
			}
			return result;
		}
	
	
	
}