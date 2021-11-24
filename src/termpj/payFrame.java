package termpj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class payFrame extends JFrame {
	public int reservedpeople;
	public int reservedadult;
	public int intcoke;
	public int intsquid;
	public int inthotdog;
	public int intpopcorn;
	public int intnacho;
	private JPanel contentPane;
	int teen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payFrame frame = new payFrame();
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
	public payFrame() {
		reservedpeople = moviechoiceFrame.tosspeople();
		reservedadult = moviechoiceFrame.tossadult();
		inthotdog = snackorderFrame.tosshotdog();
		intcoke = snackorderFrame.tosscoke(); 
		intpopcorn = snackorderFrame.tosspopcorn();
		intnacho = snackorderFrame.tossnacho();
		intsquid = snackorderFrame.tossquid();
		teen = reservedpeople - reservedadult;
		int adultprice, teenprice;
		int totalprice = 5000*intpopcorn + 3000*intsquid + 2500*inthotdog + 2500*intnacho + 2000*intcoke;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cardbtn = new JButton("\uCE74\uB4DC\uACB0\uC81C");
		cardbtn.setBounds(12, 236, 196, 180);
		contentPane.add(cardbtn);
		
		JButton cashbtn = new JButton("\uD604\uAE08\uACB0\uC81C");
		cashbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cashbtn.setBounds(220, 236, 196, 180);
		contentPane.add(cashbtn);
		adultprice = 10000*reservedadult;
		teenprice = 8000 * teen;
		JLabel ticketprice = new JLabel("");
		ticketprice.setBounds(50, 29, 325, 35);
		ticketprice.setText("¼ºÀÎ : " + adultprice +", Ã»¼Ò³â : " + teenprice);
		contentPane.add(ticketprice);
		
		int popcornprice = intpopcorn * 5000;
		int cokeprice = intcoke * 2000;
		int squidprice = intsquid * 3000;
		int hotdogprice = inthotdog * 2500;
		int nachoprice = intpopcorn * 2500;
		JLabel snackprice = new JLabel("");
		snackprice.setBounds(49, 75, 327, 35);
		snackprice.setText("ÆËÄÜ : "+ popcornprice + ", ÄÝ¶ó : " + cokeprice +", ³ªÃÊ : " + nachoprice + ", ¿ÀÂ¡¾î : " + squidprice); 
		contentPane.add(snackprice);
		int totalsnack = popcornprice + cokeprice + squidprice + hotdogprice + nachoprice;
		JLabel snackprice_2 = new JLabel("");
		snackprice_2.setBounds(49, 120, 327, 35);
		snackprice_2.setText("ÇÖµµ±× : "+ hotdogprice + ", ½º³¼ÃÑ¾× : "+totalprice);
		contentPane.add(snackprice_2);
		int total = adultprice + teenprice + totalsnack;
		
		JLabel totalprice_ = new JLabel("");
		totalprice_.setBounds(49, 165, 327, 35);
		contentPane.add(totalprice_);
		totalprice_.setText("ÃÑÇÕ : " + total + "¿øÀÔ´Ï´Ù.");
		setVisible(true);
	}
}
