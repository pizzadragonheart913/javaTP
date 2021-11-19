package termpj;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import com.toedter.calendar.JCalendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.beans.PropertyChangeEvent;

public class moviechoiceFrame extends JFrame implements ListSelectionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField adults;
	private JTextField teenagers;
	private JList movieList;
	private JList timeList;
	private String[] movies = {"부산행", "돈", "감기", "고스트버스터즈"};
	public String movieName;
	public String theaterName;
	public String timeName;
	private String[] time = {"10:00~12:00", "12:00~14:00", "14:00~16:00", "16:00~18:00","18:00~20:00","20:00~22:00"};
	private String[] theater = {"대학로", "강남", "종로", "여의도"};
	private JList theaterList;
	private String Date;
	private String formatDate;
	private int totalfee;
	private String fee;
	public String teenagersnum;
	public String adultsnum;
	public int people;
	
	public int getpeople() {
		return people;
	}
	
	public moviechoiceFrame() {
		setSize(1000,700);
		setTitle("영화, 극장, 날짜 선택");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 창 종료
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		/////////////////////////////////
		movieList = new JList<String>(movies);
		theaterList = new JList<String>(theater);
		timeList = new JList<String>(time);
		////////////////////////////////////////
		
		movieList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		movieList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(movieList);
		movieList.setBounds(50,50, 150, 200);
		movieList.addListSelectionListener(this);
		
		getContentPane().add(panel);
		
		timeList.setBounds(500, 250, 150, 200);
		timeList.addListSelectionListener(this);
		timeList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		timeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(timeList);
		
		theaterList.setBounds(250, 50, 150, 200);
		theaterList.addListSelectionListener(this);
		theaterList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		theaterList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(theaterList);
				
		JLabel lblNewLabel = new JLabel("\uC778\uC6D0 \uC218");
		lblNewLabel.setBounds(50, 323, 150, 15);
		panel.add(lblNewLabel);
		
		adults = new JTextField();
		adults.setBounds(99, 368, 116, 21);
		panel.add(adults);
		adults.setColumns(10);
		String adult = adults.getText(); 
		
		
		JLabel lblNewLabel_1 = new JLabel("\uC131\uC778");
		lblNewLabel_1.setBounds(50, 371, 57, 15);
		panel.add(lblNewLabel_1);
		
		teenagers = new JTextField();
		teenagers.setColumns(10);
		teenagers.setBounds(99, 428, 116, 21);
		panel.add(teenagers);
		
		//int adultfee = 10000;
		//int teenfee = 8000;
		
		//totalfee = adultfee * Integer.parseInt(adult)+ teenfee * Integer.parseInt(teenager);
		//fee = String.valueOf(totalfee);
		JLabel lblNewLabel_1_1 = new JLabel("\uCCAD\uC18C\uB144");
		lblNewLabel_1_1.setBounds(50, 431, 57, 15);
		panel.add(lblNewLabel_1_1);
			
		JLabel check_label = new JLabel("");
		check_label.setBounds(50, 527, 529, 61);
		panel.add(check_label);
		
		JButton check_bt = new JButton("\uC608\uB9E4 \uD655\uC778");
		setVisible(true);
		check_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adultsnum = adults.getText();
				teenagersnum = teenagers.getText();
				people = Integer.parseInt(adultsnum + teenagersnum);
				
				check_label.setText("영화 : " + movieName + ", 극장 : " + theaterName
						+ ", 날짜 : " + Date
						+ ", 상영 시간 :" + timeName
						+" 성인 : " + adultsnum
						+ ", 청소년 : " + teenagersnum
						//reservation_data += ", 총 금액: " + fee
						);
			}
		});
		check_bt.setBounds(605, 454, 97, 23);
		panel.add(check_bt);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(642, 79, 191, 40);
		panel.add(dateChooser);
		String pattern = "dd-MM-yyyy";
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		dateChooser.addPropertyChangeListener(new PropertyChangeListener()
	    {
	      @Override
	      public void propertyChange(PropertyChangeEvent evt)
	      {
	        if (evt.getPropertyName().equals("date"))
	        {
	          Date= (dateFormat.format(dateChooser.getDate()));
	        }
	      }
	    });
		

		
		JLabel lblNewLabel_2 = new JLabel("\uB0A0\uC9DC\uC120\uD0DD");
		lblNewLabel_2.setBounds(454, 79, 101, 40);
		panel.add(lblNewLabel_2);
		
		
		JButton moviesubmitbutton = new JButton("좌석 선택하기");
		moviesubmitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new termpj.selectseatFrame();
				setVisible(false);
			}
		});
		moviesubmitbutton.setBounds(764, 454, 97, 23);
		panel.add(moviesubmitbutton);

	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		movieName = (String) movieList.getSelectedValue();
		theaterName = (String) theaterList.getSelectedValue();
		timeName = (String) timeList.getSelectedValue();
	}

}
