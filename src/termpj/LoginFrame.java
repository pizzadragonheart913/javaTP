package termpj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import dao.DataBase;
import dao.ManagementDAO;


public class LoginFrame extends JFrame{
	Font f;
	public LoginFrame() {
		
		f = new Font("바탕",Font.PLAIN,15);
		
		setTitle("로그인");
		setResizable(false); // 크기 재조정 허용
		setLocationRelativeTo(null); //창이 가운데로
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 창 종료
		
		JLabel lb1 = new JLabel();        //레이블 만들기    
		lb1.setBounds(20,200, 300,50);  // 레이블 영역 조정 (a,b,c,d) a,b는 시작할곳의 좌상단, c는 x축거리, d는 y축 거리 
		lb1.setFont(f);   		// 레이블 폰트 설정하기  이하 같음
   
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
		
		
		Login_bt.addActionListener(new ActionListener() {     //로그인 버튼 눌렀을때 윈도우 아래에 ID와 비밀번호 출력하게 기능
			public void actionPerformed(ActionEvent e) {       // 추후 수정으로 안보이게 할 수 있음.
				String data = "Username " + tf1.getText();  	// 맞으면 다음 윈도우로 넘기고 틀리면 다시하라는 기능 추가 예정
				data += ", Password: "  						 
						+ new String(pw1.getPassword());   
				lb1.setText(data);          
             
				String id = tf1.getText().trim();
				@SuppressWarnings("deprecation")
				String secret_word = pw1.getText().trim();
				ManagementDAO mdao = ManagementDAO.getInstance();
				int result = mdao.idPassword(id, secret_word);
				
				if(id.length()==0 || secret_word.length()==0) {
					lb1.setText("아이디나 패스워드를 입력하지 않았습니다.");
				}
				else if(id.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*")) {
					lb1.setText("아이디 및 비밀번호는 영문자와 숫자로 구성됩니다");
				}
				else if(result == 1) {
					new termpj.moviechoiceFrame();
					setVisible(false);
				}
				else if(result != 1){
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
				else {}
			}
        }); 
		DataBase.createTable();
		setSize(320,320);
		setVisible(true);
	}
}