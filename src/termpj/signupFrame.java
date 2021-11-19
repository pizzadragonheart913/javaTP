package termpj;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;

public class signupFrame extends JFrame {

	private JPanel contentPane;
	private JTextField signupidtext;
	private JTextField signupnametext;
	private JTextField signupbirthtext;
	private JTextField signuppwtext;
	private JTextField signupphonetext;
	private JTextField signupemailtext;
	private JLabel signupmessagelabel;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signupFrame frame = new signupFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public signupFrame() {
		
		setSize(1000,700);
		setTitle("ȸ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x������ â ����
		setLocationRelativeTo(null);
	
		

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel signupldlabel = new JLabel("\uC0AC\uC6A9\uD560 ID");
		signupldlabel.setBounds(22, 40, 57, 15);
		contentPane.add(signupldlabel);
		
		JLabel signupnamelabel = new JLabel("\uC131\uBA85");
		signupnamelabel.setBounds(22, 106, 57, 15);
		contentPane.add(signupnamelabel);
		
		JLabel signupbirthlable = new JLabel("\uC0DD\uB144\uC6D4\uC77C(8\uAE00\uC790)");
		signupbirthlable.setBounds(22, 167, 88, 15);
		contentPane.add(signupbirthlable);
		
		JLabel signupphonelable = new JLabel("\uD734\uB300\uD3F0 \uBC88\uD638 (-\uC81C\uC678)");
		signupphonelable.setBounds(297, 109, 116, 15);
		contentPane.add(signupphonelable);
		
		signupidtext = new JTextField();
		signupidtext.setBounds(138, 37, 116, 21);
		contentPane.add(signupidtext);
		signupidtext.setColumns(10);
		
		signupnametext = new JTextField();
		signupnametext.setColumns(10);
		signupnametext.setBounds(138, 103, 116, 21);
		contentPane.add(signupnametext);
		
		signupbirthtext = new JTextField();
		signupbirthtext.setColumns(10);
		signupbirthtext.setBounds(138, 164, 116, 21);
		contentPane.add(signupbirthtext);
		
		JLabel signuppwlable = new JLabel("\uC0AC\uC6A9\uD560 \uBE44\uBC00\uBC88\uD638");
		signuppwlable.setBounds(297, 40, 93, 15);
		contentPane.add(signuppwlable);
		
		JLabel signupemaillable = new JLabel("e-mail\uC8FC\uC18C");
		signupemaillable.setBounds(297, 167, 93, 15);
		contentPane.add(signupemaillable);
		
		signuppwtext = new JTextField();
		signuppwtext.setColumns(10);
		signuppwtext.setBounds(413, 37, 116, 21);
		contentPane.add(signuppwtext);
		
		signupphonetext = new JTextField();
		signupphonetext.setColumns(10);
		signupphonetext.setBounds(413, 103, 116, 21);
		contentPane.add(signupphonetext);
		
		signupemailtext = new JTextField();
		signupemailtext.setColumns(10);
		signupemailtext.setBounds(413, 164, 116, 21);
		contentPane.add(signupemailtext);
		
		signupmessagelabel = new JLabel();
		signupmessagelabel.setBounds(95, 230, 285, 34);
		contentPane.add(signupmessagelabel);

		
		JButton siguup_apply = new JButton("ȸ�������ϱ� ");
		siguup_apply.setBounds(420, 226, 109, 23);
		contentPane.add(siguup_apply);
		siguup_apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signupmessagelabel.setText("");
				String signupid = signupidtext.getText().trim();
				String signupphonenum = signupphonetext.getText().trim();
				String email = signupemailtext.getText().trim();
				String birthday = signupbirthtext.getText().trim();
				String signuppw = signuppwtext.getText().trim();
				String signupname = signupnametext.getText().trim();
				if(signupid.length() == 0 || signupphonenum.length() == 0 || email.length() == 0 ||
				   birthday.length() == 0 || signuppw.length() == 0 || signupname.length() == 0) {
					signupmessagelabel.setText("��ĭ�� �ֽ��ϴ�");
					}
				else if(signupid.matches(".*[��-����-�Ӱ�-�R]+.*")) {
					signupmessagelabel.setText("���̵� �� �н������ �����ڿ� ���ڷ� �����˴ϴ�.");
					}
				else if(email.matches(".*[��-����-�Ӱ�-�R]+.*")){
					signupmessagelabel.setText("�̸��� ������ ���� �ʽ��ϴ�.");
				}
				else if(birthday.matches(".*[��-����-�Ӱ�-�R a-z]+.*")){
					signupmessagelabel.setText("���� ������ ���� �ʽ��ϴ�.");
				}
				else if(signupphonenum.matches(".*[��-����-�Ӱ�-�Ra-z]+.*")){
					signupmessagelabel.setText("�޴�����ȣ ������ ���� �ʽ��ϴ�.");
				}
				
				else {
					new termpj.LoginFrame();
					setVisible(false);
				}
				
			}
		});
		
		setVisible(true);
		
		
		
	}
}
