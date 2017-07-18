package main.Solitare;

class SuitPile extends CardPile {

	public static final int RANK_OF_ACE = 0;

	SuitPile(final int x, final int y) {
		super(x, y);
	}

	@Override
	public boolean canTake(final Card aCard) {
		if (empty()) {
			return aCard.getRank() == RANK_OF_ACE;
		}
		Card topCard = top();
		return (aCard.getSuit() == topCard.getSuit()) &&
				(aCard.getRank() == 1 + topCard.getRank());
	}

}
