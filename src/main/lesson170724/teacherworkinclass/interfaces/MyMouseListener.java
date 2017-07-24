package main.lesson170724.teacherworkinclass.interfaces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(final MouseEvent e) {
		System.out.println(e);
	}

	@Override
	public void mousePressed(final MouseEvent e) {
		System.out.println(e);
	}

	@Override
	public void mouseReleased(final MouseEvent e) {
		System.out.println(e);
	}

	@Override
	public void mouseEntered(final MouseEvent e) {
		System.out.println(e);
	}

	@Override
	public void mouseExited(final MouseEvent e) {
		System.out.println(e);
	}

}
