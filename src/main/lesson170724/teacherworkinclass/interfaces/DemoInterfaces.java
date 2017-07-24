package main.lesson170724.teacherworkinclass.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DemoInterfaces {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Demo");

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		panel.addMouseListener(new MyMouseListener());

		panel.addMouseListener(new MyAdapter());

		panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(final MouseEvent e) {

			}

			@Override
			public void mousePressed(final MouseEvent e) {

			}

			@Override
			public void mouseReleased(final MouseEvent e) {

			}

			@Override
			public void mouseEntered(final MouseEvent e) {

			}

			@Override
			public void mouseExited(final MouseEvent e) {

			}

		});

		panel.addMouseListener(new MouseAdapter() {
		});

		panel.setPreferredSize(new Dimension(400, 400));

		frame.add(panel);

		frame.pack();

		frame.setVisible(true);

	}

}

