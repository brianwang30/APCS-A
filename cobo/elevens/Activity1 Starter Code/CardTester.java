/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card jack = new Card("J", "Spades", 11);
		Card queen = new Card("Q", "Spades", 12);
		Card king = new Card("K", "Spades", 13);
		System.out.println(jack);
		System.out.println(queen);
		System.out.println(king);
		System.out.println(jack.pointValue());
		System.out.println(jack.suit());
		System.out.println(jack.rank());
		System.out.println(queen.pointValue());
		System.out.println(queen.suit());
		System.out.println(queen.rank());
		System.out.println(king.pointValue());
		System.out.println(king.suit());
		System.out.println(king.rank());
		System.out.println(jack.matches(jack));
		System.out.println(jack.matches(king));
		}
}
