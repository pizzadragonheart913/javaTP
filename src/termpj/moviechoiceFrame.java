package termpj;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;

import javax.swing.*;

import java.util.Calendar;
import java.util.Random;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import com.toedter.calendar.JCalendar;

public class moviechoiceFrame extends JFrame {
	private JTextField adults;
	private JTextField teenagers;

	public moviechoiceFrame() {
		setSize(1000,700);
		setTitle("영화, 극장, 날짜 선택");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 창 종료
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JList<String> movieList = new JList<String>(new AbstractListModel() {
			String[] values = new String[] {"\uBD80\uC0B0\uD589 ", "\uB3C8", "\uAC10\uAE30", "\uACE0\uC2A4\uD2B8\uBC84\uC2A4\uD130\uC988"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		movieList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(movieList);
		movieList.setBounds(50,50, 150, 200);

		getContentPane().add(panel);
		
		JList theaterlist = new JList<String>(new AbstractListModel() {
			String[] values = new String[] {"\uB300\uD559\uB85C", "\uAC15\uB0A8", "\uC885\uB85C", "\uC5EC\uC758\uB3C4"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		theaterlist.setBounds(250, 50, 150, 200);
		panel.add(theaterlist);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(532, 50, 295, 200);
		panel.add(calendar);
		
		
		
		
		JLabel lblNewLabel = new JLabel("\uC778\uC6D0 \uC218 \uCCAD\uC18C\uB144 / \uC131\uC778 ");
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
		int adultfee = 10000 * Integer.parseInt("adults");
		int teenfee = 8000 * Integer.parseInt("teenagers");
		int totalfee = adultfee + teenfee;
		
		JLabel lblNewLabel_1_1 = new JLabel("\uCCAD\uC18C\uB144");
		lblNewLabel_1_1.setBounds(50, 431, 57, 15);
		panel.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("10:00~12:00");
		rdbtnNewRadioButton.setBounds(364, 367, 121, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("12:00~14:00");
		rdbtnNewRadioButton_1.setBounds(535, 367, 121, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("14:00~16:00");
		rdbtnNewRadioButton_2.setBounds(717, 367, 121, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("16:00~18:00");
		rdbtnNewRadioButton_3.setBounds(364, 427, 121, 23);
		panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("18:00~20:00");
		rdbtnNewRadioButton_4.setBounds(535, 427, 121, 23);
		panel.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("20:00~22:00");
		rdbtnNewRadioButton_5.setBounds(717, 427, 121, 23);
		panel.add(rdbtnNewRadioButton_5);
		
		/*JLabel totalpay = new JLabel();
		totalpay.setBounds(50, 506, 57, 15);
		panel.add(totalpay);
		totalpay.setText(String.valueOf(totalfee));
		this.setVisible(true);*/
		
		
		
		
	
	}
}
