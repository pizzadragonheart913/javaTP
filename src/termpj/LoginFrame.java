package termpj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import dao.DataBase;
import dao.ManagementDAO;


public class LoginFrame extends JFrame{
	Font f;
	public LoginFrame() {
		
		f = new Font("����",Font.PLAIN,15);
		
		setTitle("�α���");
		setResizable(false); // ũ�� ������ ���
		setLocationRelativeTo(null); //â�� �����
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x������ â ����
		
		JLabel lb1 = new JLabel();        //���̺� �����    
		lb1.setBounds(20,200, 300,50);  // ���̺� ���� ���� (a,b,c,d) a,b�� �����Ұ��� �»��, c�� x��Ÿ�, d�� y�� �Ÿ� 
		lb1.setFont(f);   		// ���̺� ��Ʈ �����ϱ�  ���� ����
   
		JLabel lb2=new JLabel("ID:");    
		lb2.setBounds(20,50, 80,30);
		lb2.setFont(f);
		
		JTextField tf1 = new JTextField();  
		tf1.setBounds(100,50, 100,30);
		tf1.setFont(f);
		
		JLabel lb3=new JLabel("password");    
		lb3.setBounds(20,100, 80,30);
		lb3.setFont(f);
		
		JPasswordField pw1 = new JPasswordField();   
		pw1.setBounds(100,100,100,30);
		pw1.setFont(f);
		
		JButton Login_bt = new JButton("sign in");    
		Login_bt.setBounds(170,149, 80,30);    
		Login_bt.setFont(f);
		
		getContentPane().add(lb1);
		getContentPane().add(pw1);
		getContentPane().add(lb2);
		getContentPane().add(tf1);
		getContentPane().add(lb3);
		getContentPane().add(Login_bt);
		JButton signupbutton = new JButton("sign up");
		signupbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new termpj.signupFrame();
				setVisible(false);
				}
			});
		signupbutton.setBounds(45, 149, 80, 30);
		getContentPane().add(signupbutton);
		
		
		Login_bt.addActionListener(new ActionListener() {     //�α��� ��ư �������� ������ �Ʒ��� ID�� ��й�ȣ ����ϰ� ���
			public void actionPerformed(ActionEvent e) {       // ���� �������� �Ⱥ��̰� �� �� ����.
				String data = "Username " + tf1.getText();  	// ������ ���� ������� �ѱ�� Ʋ���� �ٽ��϶�� ��� �߰� ����
				data += ", Password: "  						 
						+ new String(pw1.getPassword());   
				lb1.setText(data);          
             
				String id = tf1.getText().trim();
				@SuppressWarnings("deprecation")
				String secret_word = pw1.getText().trim();
				ManagementDAO mdao = ManagementDAO.getInstance();
				int result = mdao.idPassword(id, secret_word);
				
				if(id.length()==0 || secret_word.length()==0) {
					lb1.setText("���̵� �н����带 �Է����� �ʾҽ��ϴ�.");
				}
				else if(id.matches(".*[��-����-�Ӱ�-�R]+.*")) {
					lb1.setText("���̵� �� ��й�ȣ�� �����ڿ� ���ڷ� �����˴ϴ�");
				}
				else if(result == 1) {
					new termpj.moviechoiceFrame();
					setVisible(false);
				}
				else if(result != 1){
					JOptionPane.showMessageDialog(null, "�α��� ����");
				}
				else {}
			}
        }); 
		DataBase.createTable();
		setSize(320,320);
		setVisible(true);
	}
}