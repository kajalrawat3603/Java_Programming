package unit04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;

public class P15_JList_GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListGUI objGui=new ListGUI();

	}

}

class ListGUI extends JFrame{
	JList list;
	JButton b;
	JLabel label1;
	
	ListGUI(){
		//string array to store weekdays
		String week[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		list = new JList(week);
		b = new JButton("Submit");
		label1 = new JLabel("Choose a day from the list");
		
		add(list);
		add(label1);
		add(b);
		
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "";
				if(list.getSelectedIndex()!=-1) {
					data = "Day selected: "+list.getSelectedValue();
					label1.setText(data);
				}
			}
		};
		
		b.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
