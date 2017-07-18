package main.Solitare;

import java.awt.*;

class TablePile extends CardPile {

	private static final int SIZE_SHIFT_CARD_ON_COLUMN = 35;
	private static final int SUIT_SIZE = 4;
	private static final int RANK_OF_KING = 12;
	private static final int TABLEAU_SIZE = 7;

	TablePile(final int x, final int y, final int c) {
		// initialize the parent class
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			push(Solitaire.deckPile.pop());
		}
		// flip topmost card face up
		top().flip();
	}

	@Override
	public boolean canTake(final Card aCard) {
		if (empty()) {
			return aCard.getRank() == RANK_OF_KING;
		}
		Card topCard = top();
		return (aCard.getColor() != topCard.getColor()) &&
				(aCard.getRank() == topCard.getRank() - 1);
	}

	@Override
	public boolean includes(final int clickX, final int clickY) {
		// don't test bottom of card
		return x <= clickX && clickX <= x + Card.width && y <= clickY && clickY <= y + Card.height;
	}

	@Override
	public void select(final int tx, final int ty) {
		if (empty()) {
			return;
		}

		// if face down, then flip
		Card topCard = top();
		if (!topCard.isFaceUp()) {
			topCard.flip();
			return;
		}

		// else see if any getSuit pile can take card
		topCard = pop();
		for (int i = 0; i < SUIT_SIZE; i++) {
			if (Solitaire.suitPile[i].canTake(topCard)) {
				Solitaire.suitPile[i].push(topCard);
				return;
			}
		}
		// else see if any other table pile can take card
		for (int i = 0; i < TABLEAU_SIZE; i++) {
			if (Solitaire.tableau[i].canTake(topCard)) {
				Solitaire.tableau[i].push(topCard);
				return;
			}
		}
		// else put it back on our pile
		push(topCard);
	}

	private int stackDisplay(final Graphics g, final Card aCard) {
		int locale;
		if (aCard == null) {
			return y;
		}
		locale = stackDisplay(g, aCard.link);
		aCard.draw(g, x, locale);
		return locale + SIZE_SHIFT_CARD_ON_COLUMN;
	}

	@Override
	public void display(final Graphics g) {
		stackDisplay(g, top());
	}

}
