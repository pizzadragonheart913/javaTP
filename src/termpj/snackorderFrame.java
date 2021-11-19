package termpj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Canvas;

public class snackorderFrame extends JFrame {
	private String EApopcorn;
	private String EAhotdog;
	private String EAsquid;
	private String EAnacho;
	private String EAcoke;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					snackorderFrame frame = new snackorderFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public snackorderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox popcorn = new JComboBox();
		popcorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EApopcorn = (String) popcorn.getSelectedItem();
			}
		});
		popcorn.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		popcorn.setBounds(60, 172, 104, 23);
		contentPane.add(popcorn);
		

		
		JLabel popcorntag = new JLabel("popcorn");
		popcorntag.setBounds(84, 128, 57, 15);
		contentPane.add(popcorntag);
		
		JLabel squidtag = new JLabel("squid");
		squidtag.setBounds(296, 128, 57, 15);
		contentPane.add(squidtag);
		
		JComboBox squid = new JComboBox();
		squid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAsquid = (String) squid.getSelectedItem();
			}
		});
		squid.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		squid.setBounds(272, 172, 104, 23);
		contentPane.add(squid);
		
		JLabel hotdogtag = new JLabel("hotdog");
		hotdogtag.setBounds(518, 128, 57, 15);
		contentPane.add(hotdogtag);
		
		JComboBox hotdog = new JComboBox();
		hotdog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAhotdog = (String) hotdog.getSelectedItem();
			}
		});
		hotdog.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		hotdog.setBounds(494, 172, 104, 23);
		contentPane.add(hotdog);
		
		JLabel nachotag = new JLabel("nacho");
		nachotag.setBounds(94, 405, 57, 15);
		contentPane.add(nachotag);
		
		JComboBox nacho = new JComboBox();
		nacho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAnacho = (String) nacho.getSelectedItem();
			}
		});
		nacho.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		nacho.setBounds(70, 449, 104, 23);
		contentPane.add(nacho);
		
		JLabel coketag = new JLabel("coke");
		coketag.setBounds(311, 405, 57, 15);
		contentPane.add(coketag);
		
		JComboBox coke = new JComboBox();
		coke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAcoke = (String) coke.getSelectedItem();
			}
		});
		coke.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		coke.setBounds(287, 449, 104, 23);
		contentPane.add(coke);
		
		Canvas popcorncanvas = new Canvas();
		//temppopcornimage = new Image("E:\\TP\\termpj\\image\\popcorn.jpg");
		popcorncanvas.setBounds(50, 22, 124, 100);
		contentPane.add(popcorncanvas);
		
		Canvas squidcanvas = new Canvas();
		squidcanvas.setBounds(262, 22, 124, 100);
		contentPane.add(squidcanvas);
		
		Canvas hotdogcanvas = new Canvas();
		hotdogcanvas.setBounds(484, 22, 124, 100);
		contentPane.add(hotdogcanvas);
		
		Canvas nachocanvas = new Canvas();
		nachocanvas.setBounds(60, 299, 124, 100);
		contentPane.add(nachocanvas);
		
		Canvas cokecanvas = new Canvas();
		cokecanvas.setBounds(277, 299, 124, 100);
		contentPane.add(cokecanvas);
	}
}
