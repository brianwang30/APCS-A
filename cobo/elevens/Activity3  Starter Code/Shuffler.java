/*
BURN (Ruiwen Tang, Brian Wang, Nora Miller)
APCS
L07 - But These Go Up To Eleven
2022-03-18
Time spent:
0.7 hours in class on Activity 1, 2
1.0 hours at home on Activity 2, 3
*/
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 8;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		int k = 0;
		for(int j = 0 ; j < (values.length + 1)/2 ; j++){
			shuffled[k] = values[j];
			k = k + 2;
		}
		k = 1;
		for(int j = (values.length + 1)/2 ; j < values.length ; j ++){
			shuffled[k] = values[j];
			k = k + 2;
		}
		for(int i = 0 ; i < values.length ; i++){
			values[i] = shuffled[i];
		}

	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		for(int k = values.length - 1 ; k > 0 ; k--){
			int r = (int)(Math.random() * (k + 1));
			int oldVal = values[r];
			values[r] = values[k];
			values[k] = oldVal;
		}
	}

	/*
	1.
	Simulates a flip of a weighted coin by returning either “heads" or “tails" each time it is called.
	The coin is twice as likely to turn up heads as tails.
	Thus, flip should return “heads" about twice as often as it returns “tails"
	*/
	public static String flip(){
		double weight = 2/3;
		if(Math.random() > weight){
			return "tails";
		}
		else{
			return "heads";
		}
	}

	/*
	2.
	Given two int arrays of the same length but with no duplicate elements, \
	returns true if one array is a permutation of the other \
	(i.e., the arrays differ only in how their contents are arranged).
	Otherwise, it should return false.
	*/
	public static boolean arePermutations(int[] a, int[] b){
		for(int i = 0 ; i < a.length ; i++){
			int target = a[i];
			boolean isThere = false;
			for(int j = 0 ; j < a.length ; j++){
				if(target == b[j]){
					isThere = true;
				}
			}
			if(isThere == false){
				return false;
			}
		}
		return true;
	}

}
