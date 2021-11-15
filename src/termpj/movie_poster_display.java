package termpj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class movie_poster_display extends JFrame{
	public movie_poster_display() {
		setTitle("movie poster display"); // ������ �̸�
		setResizable(false); // ũ�� ������ ���
		setLocationRelativeTo(null); //â�� �����
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x������ â ����
		Container c = getContentPane();
		c.setLayout(null);
		// �̹����� �������� ���÷��� �ǰ� �ϴ°� ���Ŀ� awt.graphics �� �߰��� ����
		ImageIcon poster_image = new ImageIcon("E:\\javaprograming\\term_project\\movieposter\\1.jpg");
		Image poster_temp = poster_image.getImage();
		ImageIcon poster_image2 = new ImageIcon(poster_temp);
		JLabel imageLabel = new JLabel(poster_image2);
		imageLabel.setLocation(0,0);
		imageLabel.setSize(349,500);
		c.add(imageLabel);
		setSize(350,615);//����� 500 * 700
		JButton end_button = new JButton("����");
		JButton next_button = new JButton("����");
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
	             
					String id = tf1.getText().trim();
					String secret_word= pw1.getText().trim();
					//System.out.print(tf1.getText());
					//System.out.print(new String(secret_word));
					if(id.length()==0 || secret_word.length()==0) {
						lb1.setText("���̵� �н����带 �Է����� �ʾҽ��ϴ�.");
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
		String []movie_list = {"��ȭ1","��ȭ2","��ȭ3","��ȭ4"};

		String []theater_ = {"����_1","����_2","����_3","����_4","����_5"
								 };
	
		public moviechoiceFrame() {
			setSize(1000,700);
			setTitle("��ȭ, ����, ��¥ ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x������ â ����
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
