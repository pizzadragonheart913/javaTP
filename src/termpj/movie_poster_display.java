package termpj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class movie_poster_display extends JFrame{
	JPanel contentPane;
	JLabel imageLabel = new JLabel();
	public movie_poster_display(){
		setTitle("movie poster display"); // 윈도우 이름
		setResizable(false); // 크기 재조정 허용
		setLocationRelativeTo(null); //창이 가운데로
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 창 종료
		
		contentPane = (JPanel) getContentPane();
		contentPane.setLayout(null);	
		imageLabel.setIcon(new ImageIcon("E:\\TP\\termpj\\movieposter.gif"));
		getContentPane().add(imageLabel);
		imageLabel.setBounds(0, 0, 344, 500);
		contentPane.add(imageLabel);
		
		//Container c = getContentPane();
		// 이미지가 랜덤으로 디스플레이 되게 하는건 추후에 awt.graphics 로 추가할 예정

		setSize(350,615);//사이즈를 500 * 700
		JButton end_button = new JButton("종료");
		JButton next_button = new JButton("다음");
		end_button.setLocation(0,500);
		end_button.setSize(170,75);
		next_button.setLocation(170,500);
		next_button.setSize(170,75);
		contentPane.add(end_button);
		contentPane.add(next_button);
		
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
	
	public static void main(String[] args){
		new movie_poster_display();

	}
}
