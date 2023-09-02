package unit04;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTable;
public class P15_Jtable_GUI {

	public static void main(String[] args) {
		Jtable_GUI obj= new Jtable_GUI();

	}
}
class Jtable_GUI extends JFrame
{
	JTable jt;
	Jtable_GUI(){
		String data[][]= {{"101","kajal","67002"},{"101","kajal","67002"},{"101","kajal","67002"},{"101","kajal","67002"}};
		String column[]= {"ID","name","salary"};
		jt = new JTable(data, column);
		add(jt);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
