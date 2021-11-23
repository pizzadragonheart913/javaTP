package termpj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;



public class selectseatFrame extends JFrame {

	private JPanel contentPane;
	public ArrayList<String> seatlist = new ArrayList<String>();
	private JTable table;
	private JButton clearseatbtn;
	public String str = "";
	public String seatdata;
	public moviechoiceFrame mcf;
	public int clickflag = 0;
	private JButton tosnackorder;
	public int reservedpeople;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectseatFrame frame = new selectseatFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public selectseatFrame() {
		reservedpeople = moviechoiceFrame.tosspeople();
		System.out.println(reservedpeople);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel selectedseat = new JLabel();
		selectedseat.setBackground(Color.DARK_GRAY);
		selectedseat.setBounds(22, 397, 209, 50);
		contentPane.add(selectedseat);
		
		JLabel lblNewLabel = new JLabel("\uD654\uBA74");
		lblNewLabel.setBounds(191, 28, 57, 15);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow(); // �� ����
				int col = table.getSelectedColumn() + 1; // ������ +1 ����� �� ����
				char alphabet = 65; //int �������� ���ĺ����� �ٲٱ� ���� 
				char temprow = (char) (alphabet + row);
				String rowseat = String.valueOf(temprow);
				String colseat = String.valueOf(col);
				seatdata = rowseat + colseat; // ��Ʈ�� ������ ��Ʈ�����ʹ� �ΰ��� ��Ʈ���� ���� ����

				if(seatlist.contains(seatdata)) {
					selectedseat.setText("");
					selectedseat.setText(str);
				}
				else {
					seatlist.add(seatdata); // ��̸���Ʈ�� ����
					str += seatdata + ", ";
					selectedseat.setText("");
					selectedseat.setText(str);
				}
				
				
			}
		});
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
				new String[][] {
					{"A1", "A2", "A3", "A4", "A5", "A6", "A7"},
					{"B1", "B2", "B3", "B4", "B5", "B6", "B7"},
					{"C1", "C2", "C3", "C4", "C5", "C6", "C7"},
					{"D1", "D2", "D3", "D4", "D5", "D6" ,"D7"},
					{"E1", "E2", "E3", "E4", "E5", "E6", "E7"},
					{"F1", "F2", "F3", "F4", "F5", "F6", "F7"},
					{"G1", "G2", "G3", "G4", "G5", "G6", "G7"},
					{"H1", "H2", "H3", "H4", "H5", "H6", "H7"},
					{"I1", "I2", "I3", "I4", "I5", "I6", "I7"},
					{"J1", "J2", "J3", "J4", "J5", "J6", "J7"},
				},
			new String[] {
				"", "", "", "", "", "", ""
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(32);
		table.getColumnModel().getColumn(1).setPreferredWidth(32);
		table.getColumnModel().getColumn(2).setPreferredWidth(32);
		table.getColumnModel().getColumn(3).setPreferredWidth(32);
		table.getColumnModel().getColumn(4).setPreferredWidth(32);
		table.getColumnModel().getColumn(5).setPreferredWidth(32);
		table.getColumnModel().getColumn(6).setPreferredWidth(32);
		table.setRowHeight(30);
		table.setBounds(22, 70, 396, 300);
		contentPane.add(table);
		
		clearseatbtn = new JButton("���� �ʱ�ȭ");
		clearseatbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatlist.clear();
				str = "";
				selectedseat.setText(str);
			}
		});
		clearseatbtn.setBounds(430, 70, 137, 136);
		contentPane.add(clearseatbtn);
		
		tosnackorder = new JButton("\uAC04\uC2DD\uC0AC\uB7EC\uAC00\uAE30");
		tosnackorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seatlist.size() > reservedpeople) {
					seatlist.clear();
					selectedseat.setText("�ο����� ���� �¼�����, �ʱ�ȭ �� �ٽ� �������ּ���");
				}
				else if(seatlist.size() == reservedpeople) {
					new termpj.snackorderFrame();
					setVisible(false);
				}
				else {
					
				}
			}
		});
		tosnackorder.setBounds(430, 227, 137, 143);
		contentPane.add(tosnackorder);
		setVisible(true);

	}

}
