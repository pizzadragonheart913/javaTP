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
import java.util.Locale;
import java.beans.PropertyChangeEvent;
import java.time.LocalDate;

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
	public int intadult;
	public int intteenager;
	public static int people;
	public static int ticketedadult;
	
	
	
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

		
		JLabel lblNewLabel_1 = new JLabel("\uC131\uC778");
		lblNewLabel_1.setBounds(50, 371, 57, 15);
		panel.add(lblNewLabel_1);
		
		teenagers = new JTextField();
		teenagers.setColumns(10);
		teenagers.setBounds(99, 428, 116, 21);
		panel.add(teenagers);

		
		//int adultfee = 10000;
		//int teenfee = 8000;
		
		
		//fee = String.valueOf(totalfee);
		JLabel lblNewLabel_1_1 = new JLabel("\uCCAD\uC18C\uB144");
		lblNewLabel_1_1.setBounds(50, 431, 57, 15);
		panel.add(lblNewLabel_1_1);
			
		JLabel check_label = new JLabel("");
		check_label.setBounds(50, 527, 505, 21);
		panel.add(check_label);
		
		JLabel check_label_1 = new JLabel("");
		check_label_1.setBounds(50, 558, 505, 21);
		panel.add(check_label_1);
		
		JButton check_bt = new JButton("\uC608\uB9E4 \uD655\uC778");
		setVisible(true);
		check_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adultsnum = adults.getText();
				teenagersnum = teenagers.getText();
				int intadult = Integer.parseInt(adultsnum);
				int intteenager = Integer.parseInt(teenagersnum);
				people = intteenager + intadult;
				ticketedadult = intadult;
				
				check_label.setText("영화 : " + movieName + ", 극장 : " + theaterName
						+ ", 날짜 : " + Date);
						//reservation_data += ", 총 금액: " + fee
				check_label_1.setText(", 상영 시간 :" + timeName
						+" 성인 : " + adultsnum
						+ ", 청소년 : " + teenagersnum);
					
			}
		});
		check_bt.setBounds(605, 454, 97, 23);
		panel.add(check_bt);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(642, 79, 191, 40);
		panel.add(dateChooser);
		String Today;
		String pattern = "yyyyMMdd";
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
				
				adultsnum = adults.getText();
				teenagersnum = teenagers.getText();
				int intadult = Integer.parseInt(adultsnum);
				int intteenager = Integer.parseInt(teenagersnum);
				people = intteenager + intadult;
				int reservedate = Integer.parseInt(Date);
				int today = Integer.parseInt(dateFormat.format(System.currentTimeMillis()));
				
				if(movieName.length() == 0 || theaterName.length() == 0 || Date.length() == 0 
					|| timeName.length() == 0 || adultsnum.length() == 0 || teenagersnum.length() == 0) {
					check_label.setText("빈칸이 있습니다");
				}
				else if(today > reservedate) {
					check_label.setText("날짜를 다시 확인하세요.");
				}
				else if(intteenager <= 0 && intadult <= 0) {
					check_label.setText("인원수를 다시 확인하세요.");
				}
				else{
					
					new termpj.selectseatFrame();
					setVisible(false);
				}
				
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
	
	public static int tosspeople() {
		// TODO Auto-generated method stub
		return people;
	}


	public static int tossadult() {
		// TODO Auto-generated method stub
		return ticketedadult;
	}

}
