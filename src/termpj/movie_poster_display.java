package termpj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class movie_poster_display extends JFrame{
	public movie_poster_display() {
		setTitle("movie poster display"); // 윈도우 이름
		setResizable(false); // 크기 재조정 허용
		setLocationRelativeTo(null); //창이 가운데로
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 창 종료
		Container c = getContentPane();
		c.setLayout(null);
		// 이미지가 랜덤으로 디스플레이 되게 하는건 추후에 awt.graphics 로 추가할 예정
		ImageIcon poster_image = new ImageIcon("E:\\javaprograming\\term_project\\movieposter\\1.jpg");
		Image poster_temp = poster_image.getImage();
		ImageIcon poster_image2 = new ImageIcon(poster_temp);
		JLabel imageLabel = new JLabel(poster_image2);
		imageLabel.setLocation(0,0);
		imageLabel.setSize(349,500);
		c.add(imageLabel);
		setSize(350,615);//사이즈를 500 * 700
		JButton end_button = new JButton("종료");
		JButton next_button = new JButton("다음");
		end_button.setLocation(0,500);
		end_button.setSize(170,75);
		next_button.setLocation(170,500);
		next_button.setSize(170,75);
		c.add(end_button);
		c.add(next_button);
		setVisible(true);
		
		end_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg_exit) {
				setVisible(false);
			}
		});
		
		next_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg_next) {
				new termpj.LoginFrame();
				setVisible(false);
			}
		});
	}
		
	/*public class LoginFrame extends JFrame{
		Font f;
		public LoginFrame() {
			
			f = new Font("바탕",Font.PLAIN,15);
			
			setTitle("로그인");
			setResizable(false); // 크기 재조정 허용
			setLocationRelativeTo(null); //창이 가운데로
			setLayout(null);
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
			
			JLabel lb3=new JLabel("비밀번호:");    
			lb3.setBounds(20,100, 80,30);
			lb3.setFont(f);
			
			JPasswordField pw1 = new JPasswordField();   
			pw1.setBounds(100,100,100,30);
			pw1.setFont(f);
			
			JButton Login_bt = new JButton("로그인");    
			Login_bt.setBounds(100,150, 80,30);    
			Login_bt.setFont(f);
			
			add(lb1);add(pw1);
			add(lb2);add(tf1);
			add(lb3);add(Login_bt);
			
			setSize(320,320);
			setVisible(true);
			
			Login_bt.addActionListener(new ActionListener() {     //로그인 버튼 눌렀을때 윈도우 아래에 ID와 비밀번호 출력하게 기능
				public void actionPerformed(ActionEvent e) {       // 추후 수정으로 안보이게 할 수 있음.
					/*String data = "Username " + tf1.getText();  	// 맞으면 다음 윈도우로 넘기고 틀리면 다시하라는 기능 추가 예정
					data += ", Password: "  						 
							+ new String(pw1.getPassword());   
					lb1.setText(data);          
	             
					String id = tf1.getText().trim();
					String secret_word= pw1.getText().trim();
					//System.out.print(tf1.getText());
					//System.out.print(new String(secret_word));
					if(id.length()==0 || secret_word.length()==0) {
						lb1.setText("아이디나 패스워드를 입력하지 않았습니다.");
					}
					if(id.equals("park") && secret_word.equals("123")) {
						new moviechoiceFrame();
						setVisible(false);
							}
							
						}
	             }  
	          ); 
		}
	}
	int regionflag = 0;
	public class moviechoiceFrame extends JFrame {
		String []movie_list = {"영화1","영화2","영화3","영화4"};

		String []theater_ = {"서울_1","서울_2","서울_3","서울_4","서울_5"
								 };
	
		public moviechoiceFrame() {
			setSize(1000,700);
			setTitle("영화, 극장, 날짜 선택");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 창 종료
			setLocationRelativeTo(null);
			JPanel panel = new JPanel();
			panel.setLayout(null);
			JList<String> movieList = new JList<String>(movie_list);
			panel.add(movieList);
			movieList.setBounds(50,50, 150, 200);
			
			JList<String> theater = new JList<String>(theater_);
			panel.add(theater);
			theater.setBounds(220,50,150,200);
			
			this.add(panel);
			this.setVisible(true);
			
			
			
			
		
		}

	}*/

	
	public static void main(String[] args) {
		new movie_poster_display();

	}

}
