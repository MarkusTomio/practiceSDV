package sdvP_assign2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// defining a test array to simulate input
		double[][] testArr = { { 1.0, Double.NaN, 3.0 }, { Double.NaN, Double.NaN, 2.0 }, { 4.0, 5.0, Double.NaN } };

		// print statements to make output prettier
		System.out.println("The input array:\n");
		printArr(testArr);
		System.out.println("The output array with estimated NaN-Values:\n");

		// run the idw-algorithm
		idw(testArr);
	}

	/*
	 * IDW-method defined as stated in assignment takes the input array of arrays
	 * and returns an array of arrays with calculated missing values
	 */
	static double[][] idw(double[][] data) {

		/*
		 * define result array as a deep copy of input result array will be used to
		 * store the estimated values input array will only be used to read from
		 */
		double[][] result = deepCopyArr(data);

		// we will need those later to temporarily store values during calculation
		// their explanation follows below, but their names should be self-explanatory
		double weight;
		double sumWeightVals;
		double sumWeights;

		// iterate over first dimension
		for (int i = 0; i < data.length; i++) {
			// iterate over second dimension
			for (int j = 0; j < data[i].length; j++) {
				/*
				 * check if current position is an unknown value. If not, than we don't do
				 * anything
				 */
				if (Double.isNaN(data[i][j])) {
					/*
					 * We have located a NaN value at this point. The next step is to iterate over
					 * the arrays again to determine the distances and weights to this specific
					 * node. We use the following two variables to store the sum of the weighted
					 * values and the sum of the weights for each located NaN. = 0 assures that we
					 * fill them newly for each located NaN.
					 */
					sumWeightVals = 0;
					sumWeights = 0;
					// iterate over first dimension
					for (int k = 0; k < data.length; k++) {
						// iterate over second dimension
						for (int l = 0; l < data[k].length; l++) {
							// we only want to use known values for the algorithm
							if (!Double.isNaN(data[k][l])) {
								// this line calculates the weight for one of the known nodes in each loop
								weight = 1 / Math.pow(Math.sqrt((Math.pow(i - k, 2)) + (Math.pow(j - l, 2))), 2);
								// then we just sum up the weights and the weighted values in each loop
								sumWeightVals += weight * data[k][l];
								sumWeights += weight;
							}
						}
					}
					/*
					 * after calculating the sums, we can divide them according to the instruction
					 * to get the estimated value for the position that was previously NaN
					 */
					result[i][j] = sumWeightVals / sumWeights;
				}
			}
		}
		printArr(result);
		return result;
	};

	/*
	 * helper method to deep copy input array - this is needed, so that we don't
	 * include already calculated NaN-Values for following calculations. Shallow
	 * copy is not enough, as then both arrays would update.
	 */
	static double[][] deepCopyArr(double[][] toCopyArr) {

		// define return array
		double[][] copiedArr = new double[toCopyArr.length][];

		// deep copy every inside array
		for (int i = 0; i < toCopyArr.length; i++) {
			copiedArr[i] = Arrays.copyOf(toCopyArr[i], toCopyArr[i].length);
		}

		return copiedArr;
	}

	// helper method to print contents of a double dim array
	static void printArr(double[][] toPrintArr) {
		System.out.println("[X] [Y] | Value\n--------|------");
		for (int i = 0; i < toPrintArr.length; i++) {
			for (int j = 0; j < toPrintArr[i].length; j++) {
				System.out.println("[" + i + "] [" + j + "] | " + toPrintArr[i][j]);
			}
		}
		System.out.println("\n");
	}
}
