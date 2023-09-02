package unit04;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class P15_JComboBox {

	public static void main(String[] args) {
		JComboBoxClass obj= new JComboBoxClass();

	}

}
class JComboBoxClass extends JFrame
{
	JComboBox jBox;
	JButton b;
	JLabel label1;
	
	public JComboBoxClass()
	{
		String week[]= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		jBox = new JComboBox<>(week);
		b=new JButton("Submit");
		label1=new JLabel("Choose a day from the given list");
		add(jBox);
		add(b);
		add(label1);
		
		ActionListener al=new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String data="";
				if(jBox.getSelectedIndex()!=-1)
				{
					data="Day Selected: "+jBox.getSelectedItem();
					label1.setText(data);
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