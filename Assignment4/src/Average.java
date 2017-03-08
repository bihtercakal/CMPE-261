/**
 * 
 * @author Bihter
 *
 */

class Average {
	//private variables are average and index
	private double average;
	private int index;

	/**
	 * 
	 * @param average
	 * @param index
	 */
	//constructor
	public Average(double average, int index) {
		this.average = average;
		this.index = index;
	}

	//getters and settters methods
	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
		
		
	}
}
