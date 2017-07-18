package main.Solitare;

class DiscardPile extends CardPile {

	private static final int SUIT_SIZE = 4;
	private static final int TABLEAU_SIZE = 7;

	DiscardPile(int x, int y) {
		super(x, y);
	}

	@Override
	public void push(final Card aCard) {
		if (!aCard.isFaceUp()) {
			aCard.flip();
		}
		super.push(aCard);
	}

	@Override
	public void select(final int tx, final int ty) {
		if (empty()) {
			return;
		}
		Card topCard = pop();
		for (int i = 0; i < SUIT_SIZE; i++) {
			if (Solitaire.suitPile[i].canTake(topCard)) {
				Solitaire.suitPile[i].push(topCard);
				return;
			}
		}
		for (int i = 0; i < TABLEAU_SIZE; i++) {
			if (Solitaire.tableau[i].canTake(topCard)) {
				Solitaire.tableau[i].push(topCard);
				return;
			}
		}
		// nobody can use it, put it back on our list
		push(topCard);
	}
}
