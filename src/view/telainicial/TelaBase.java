package view.telainicial;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.util.Locale;

public class TelaBase extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel frame;

	public TelaBase(String text) {
		setResizable(false);
		setLocale(new Locale("pt", "BR"));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		setTitle(text);
		setLocationRelativeTo(null);
		frame = new JPanel();
		frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setLayout(new BorderLayout(0, 0));
		setContentPane(frame);
	}
}