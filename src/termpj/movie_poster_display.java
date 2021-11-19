package termpj;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class movie_poster_display extends JFrame{
	JPanel contentPane;
	JLabel imageLabel = new JLabel();
	public movie_poster_display(){
		setTitle("movie poster display"); // ������ �̸�
		setResizable(false); // ũ�� ������ ���
		setLocationRelativeTo(null); //â�� �����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x������ â ����
		
		contentPane = (JPanel) getContentPane();
		contentPane.setLayout(null);	
		imageLabel.setIcon(new ImageIcon("E:\\TP\\termpj\\movieposter.gif"));
		getContentPane().add(imageLabel);
		imageLabel.setBounds(0, 0, 344, 500);
		contentPane.add(imageLabel);
		
		//Container c = getContentPane();
		// �̹����� �������� ���÷��� �ǰ� �ϴ°� ���Ŀ� awt.graphics �� �߰��� ����

		setSize(350,615);//����� 500 * 700
		JButton end_button = new JButton("����");
		JButton next_button = new JButton("����");
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
