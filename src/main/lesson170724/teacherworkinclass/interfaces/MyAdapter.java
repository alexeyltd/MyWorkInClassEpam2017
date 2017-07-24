package main.lesson170724.teacherworkinclass.interfaces;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyAdapter extends MouseAdapter {

	@Override
	public void mousePressed(final MouseEvent e) {
		System.out.println(e);
	}

}
