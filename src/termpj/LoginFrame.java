package termpj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import dao.DataBase;
import dao.ManagementDAO;


public class LoginFrame extends JFrame{
	Font f;
	public LoginFrame() {
		
		f = new Font("¹ÙÅÁ",Font.PLAIN,15);
		
		setTitle("·Î±×ÀÎ");
		setResizable(false); // Å©±â ÀçÁ¶Á¤ Çã¿ë
		setLocationRelativeTo(null); //Ã¢ÀÌ °¡¿îµ¥·Î
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x´©¸£¸é Ã¢ Á¾·á
		
		JLabel lb1 = new JLabel();        //·¹ÀÌºí ¸¸µé±â    
		lb1.setBounds(20,200, 300,50);  // ·¹ÀÌºí ¿µ¿ª Á¶Á¤ (a,b,c,d) a,b´Â ½ÃÀÛÇÒ°÷ÀÇ ÁÂ»ó´Ü, c´Â xÃà°Å¸®, d´Â yÃà °Å¸® 
		lb1.setFont(f);   		// ·¹ÀÌºí ÆùÆ® ¼³Á¤ÇÏ±â  ÀÌÇÏ °°À½
   
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
		
		
		Login_bt.addActionListener(new ActionListener() {     //·Î±×ÀÎ ¹öÆ° ´­·¶À»¶§ À©µµ¿ì ¾Æ·¡¿¡ ID¿Í ºñ¹Ð¹øÈ£ Ãâ·ÂÇÏ°Ô ±â´É
			public void actionPerformed(ActionEvent e) {       // ÃßÈÄ ¼öÁ¤À¸·Î ¾Èº¸ÀÌ°Ô ÇÒ ¼ö ÀÖÀ½.
				String data = "Username " + tf1.getText();  	// ¸ÂÀ¸¸é ´ÙÀ½ À©µµ¿ì·Î ³Ñ±â°í Æ²¸®¸é ´Ù½ÃÇÏ¶ó´Â ±â´É Ãß°¡ ¿¹Á¤
				data += ", Password: "  						 
						+ new String(pw1.getPassword());   
				lb1.setText(data);          
             
				String id = tf1.getText().trim();
				@SuppressWarnings("deprecation")
				String secret_word = pw1.getText().trim();
				ManagementDAO mdao = ManagementDAO.getInstance();
				int result = mdao.idPassword(id, secret_word);
				
				if(id.length()==0 || secret_word.length()==0) {
					lb1.setText("¾ÆÀÌµð³ª ÆÐ½º¿öµå¸¦ ÀÔ·ÂÇÏÁö ¾Ê¾Ò½À´Ï´Ù.");
				}
				else if(id.matches(".*[¤¡-¤¾¤¿-¤Ó°¡-ÆR]+.*")) {
					lb1.setText("¾ÆÀÌµð ¹× ºñ¹Ð¹øÈ£´Â ¿µ¹®ÀÚ¿Í ¼ýÀÚ·Î ±¸¼ºµË´Ï´Ù");
				}
				else if(result == 1) {
					new termpj.moviechoiceFrame();
					setVisible(false);
				}
				else if(result != 1){
					JOptionPane.showMessageDialog(null, "·Î±×ÀÎ ½ÇÆÐ");
				}
				else {}
			}
        }); 
		DataBase.createTable();
		setSize(320,320);
		setVisible(true);
	}
}