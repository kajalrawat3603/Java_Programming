package unit04;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class userpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user obj=new user();
	}

}

class user extends JFrame{
	JTextField t1;
	JTextField t2;
	JButton b;
	JLabel l1,l2;
	public user() {
		t1=new JTextField(20);
		t2=new JTextField(20);
		l1=new JLabel("username");
		l2=new JLabel("passsword");
		b=new JButton("login");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(t1.getText().equals("Kajal") && t2.getText().equals("Kajal")){
					JOptionPane.showMessageDialog(null, "user Logged in");
				}
				else {
					JOptionPane.showMessageDialog(null, "user not Logged in");
				}
			}
		};
		b.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}
