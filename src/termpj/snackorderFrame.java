package termpj;

import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class snackorderFrame extends JFrame {
	private String EApopcorn;
	private String EAhotdog;
	private String EAsquid;
	private String EAnacho;
	private String EAcoke;
	private JPanel contentPane;
	public static int intcoke;
	public static int intsquid;
	public static int inthotdog;
	public static int intpopcorn;
	public static int intnacho;
	
	
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
		setTitle("간식 선택");
		setResizable(false);
		setBounds(100, 100, 673, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox popcorn = new JComboBox();
		popcorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EApopcorn = (String) popcorn.getSelectedItem();
				intpopcorn = Integer.parseInt(EApopcorn);
			}
		});
		popcorn.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		popcorn.setBounds(60, 203, 104, 23);
		contentPane.add(popcorn);
		

		
		JLabel popcorntag = new JLabel("popcorn");
		popcorntag.setHorizontalAlignment(SwingConstants.CENTER);
		popcorntag.setBounds(84, 160, 57, 15);
		contentPane.add(popcorntag);
		
		JLabel squidtag = new JLabel("squid");
		squidtag.setHorizontalAlignment(SwingConstants.CENTER);
		squidtag.setBounds(296, 160, 57, 15);
		contentPane.add(squidtag);
		
		JComboBox squid = new JComboBox();
		squid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAsquid = (String) squid.getSelectedItem();
				intsquid = Integer.parseInt(EAsquid);
			}
		});
		squid.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		squid.setBounds(272, 203, 104, 23);
		contentPane.add(squid);
		
		JLabel hotdogtag = new JLabel("hotdog");
		hotdogtag.setHorizontalAlignment(SwingConstants.CENTER);
		hotdogtag.setBounds(518, 160, 57, 15);
		contentPane.add(hotdogtag);
		
		JComboBox hotdog = new JComboBox();
		hotdog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAhotdog = (String) hotdog.getSelectedItem();
				inthotdog = Integer.parseInt(EAhotdog);
			}
		});
		hotdog.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		hotdog.setBounds(494, 203, 104, 23);
		contentPane.add(hotdog);
		
		JLabel nachotag = new JLabel("nacho");
		nachotag.setHorizontalAlignment(SwingConstants.CENTER);
		nachotag.setBounds(84, 406, 57, 15);
		contentPane.add(nachotag);
		
		JComboBox nacho = new JComboBox();
		nacho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAnacho = (String) nacho.getSelectedItem();
				intnacho = Integer.parseInt(EAnacho);
			}
		});
		nacho.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		nacho.setBounds(60, 450, 104, 23);
		contentPane.add(nacho);
		
		JLabel coketag = new JLabel("coke");
		coketag.setHorizontalAlignment(SwingConstants.CENTER);
		coketag.setBounds(296, 406, 57, 15);
		contentPane.add(coketag);
		
		JComboBox coke = new JComboBox();
		coke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAcoke = (String) coke.getSelectedItem();
				intcoke = Integer.parseInt(EAcoke);
			}
		});
		coke.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		coke.setBounds(272, 450, 104, 23);
		contentPane.add(coke);
		
		JLabel popcorncanvas = new JLabel("");
		popcorncanvas.setHorizontalAlignment(SwingConstants.CENTER);
		Image popcorn_1 = new ImageIcon(this.getClass().getResource("/popcorn.jpg")).getImage();
		popcorncanvas.setIcon(new ImageIcon(popcorn_1));
		popcorncanvas.setBounds(36, 20, 145, 130);
		contentPane.add(popcorncanvas);
		
		JLabel squidcanvas = new JLabel("");
		squidcanvas.setHorizontalAlignment(SwingConstants.CENTER);
		Image squid_1 = new ImageIcon(this.getClass().getResource("/squid.jpg")).getImage();
		squidcanvas.setIcon(new ImageIcon(squid_1));
		squidcanvas.setBounds(255, 20, 145, 130);
		contentPane.add(squidcanvas);
		
		JLabel hotdogcanvas = new JLabel("");
		hotdogcanvas.setHorizontalAlignment(SwingConstants.CENTER);
		Image hotdog_1 = new ImageIcon(this.getClass().getResource("/hotdog.jpg")).getImage();
		hotdogcanvas.setIcon(new ImageIcon(hotdog_1));
		hotdogcanvas.setBounds(470, 20, 145, 130);
		contentPane.add(hotdogcanvas);
		
		JLabel nachocanvas = new JLabel("");
		nachocanvas.setHorizontalAlignment(SwingConstants.CENTER);
		Image nacho_1 = new ImageIcon(this.getClass().getResource("/nacho.png")).getImage();
		nachocanvas.setIcon(new ImageIcon(nacho_1));
		nachocanvas.setBounds(36, 266, 145, 130);
		contentPane.add(nachocanvas);
		
		JLabel cokecanvas = new JLabel("");
		cokecanvas.setHorizontalAlignment(SwingConstants.CENTER);
		Image coke_1 = new ImageIcon(this.getClass().getResource("/coke.jpg")).getImage();
		cokecanvas.setIcon(new ImageIcon(coke_1));
		cokecanvas.setBounds(255, 266, 145, 130);
		contentPane.add(cokecanvas);
		
		JLabel lblNewLabel = new JLabel("5000원");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(84, 185, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("3000원");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(296, 185, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2500원");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(518, 185, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2500원");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(84, 431, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2000원");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(296, 431, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new termpj.payFrame();    //미리 설정해둔 창 불러오기
				dispose();          //snackorderFrmae 창 종료
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 17));
		btnNewButton.setBounds(538, 434, 77, 39);
		contentPane.add(btnNewButton);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}

	public static int tosshotdog() {
		return inthotdog;
	}

	public static int tosscoke() {
		// TODO Auto-generated method stub
		return intcoke;
	}

	public static int tosspopcorn() {
		// TODO Auto-generated method stub
		return intpopcorn;
	}

	public static int tossnacho() {
		// TODO Auto-generated method stub
		return intnacho;
	}

	public static int tossquid() {
		// TODO Auto-generated method stub
		return intsquid;
	}
}