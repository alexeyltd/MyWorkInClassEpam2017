package main.Solitare;

import java.applet.Applet;
import java.awt.*;

public class Solitaire extends Applet {

	private static final int ALL_PILES_SIZE = 13;
	private static final int SUIT_PILE_SIZE = 4;
	private static final int TABLEAU_SIZE = 7;
	private static final int RANK_SIZE = 12;

	private static CardPile allPiles[];

	static DeckPile deckPile;
	static DiscardPile discardPile;
	static TablePile tableau[];
	static SuitPile suitPile[];


	@Override
	public void init() {
		// first allocate the arrays
		allPiles = new CardPile[ALL_PILES_SIZE];
		suitPile = new SuitPile[SUIT_PILE_SIZE];
		tableau = new TablePile[TABLEAU_SIZE];
		// then fill them in
		allPiles[0] = deckPile = new DeckPile(335, 5);
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < SUIT_PILE_SIZE; i++) {
			allPiles[2 + i] = suitPile[i] =
					new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < TABLEAU_SIZE; i++) {
			allPiles[6 + i] = tableau[i] =
					new TablePile(5 + 55 * i, 80, i + 1);
		}
	}

	@Override
	public void paint(Graphics g) {
		for (int i = 0; i <= RANK_SIZE; i++) {
			allPiles[i].display(g);
		}
	}

	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		for (int i = 0; i < ALL_PILES_SIZE; i++) {
			if (allPiles[i].includes(x, y)) {
				allPiles[i].select(x, y);
				repaint();
				return true;
			}
		}
		return true;
	}
}
