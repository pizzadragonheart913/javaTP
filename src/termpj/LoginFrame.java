package termpj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import termpj.movie_poster_display;
import termpj.moviechoiceFrame;

import java.util.Random;

public class LoginFrame extends JFrame{
	Font f;
	public LoginFrame() {
		
		f = new Font("����",Font.PLAIN,15);
		
		setTitle("�α���");
		setResizable(false); // ũ�� ������ ���
		setLocationRelativeTo(null); //â�� �����
		setLayout(null);
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
		
		JLabel lb3=new JLabel("��й�ȣ:");    
		lb3.setBounds(20,100, 80,30);
		lb3.setFont(f);
		
		JPasswordField pw1 = new JPasswordField();   
		pw1.setBounds(100,100,100,30);
		pw1.setFont(f);
		
		JButton Login_bt = new JButton("�α���");    
		Login_bt.setBounds(100,150, 80,30);    
		Login_bt.setFont(f);
		
		add(lb1);add(pw1);
		add(lb2);add(tf1);
		add(lb3);add(Login_bt);
		
		setSize(320,320);
		setVisible(true);
		
		Login_bt.addActionListener(new ActionListener() {     //�α��� ��ư �������� ������ �Ʒ��� ID�� ��й�ȣ ����ϰ� ���
			public void actionPerformed(ActionEvent e) {       // ���� �������� �Ⱥ��̰� �� �� ����.
				/*String data = "Username " + tf1.getText();  	// ������ ���� ������� �ѱ�� Ʋ���� �ٽ��϶�� ��� �߰� ����
				data += ", Password: "  						 
						+ new String(pw1.getPassword());   
				lb1.setText(data);          
             */
				String id = tf1.getText().trim();
				String secret_word= pw1.getText().trim();
				//System.out.print(tf1.getText());
				//System.out.print(new String(secret_word));
				if(id.length()==0 || secret_word.length()==0) {
					lb1.setText("���̵� �н����带 �Է����� �ʾҽ��ϴ�.");
				}
				if(id.equals("park") && secret_word.equals("123")) {
					new termpj.moviechoiceFrame();
					setVisible(false);
						}
						
					}
             }  
          ); 
	}
}