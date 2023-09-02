package unit04;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P15_AddTwoNumber_GUI {
      public static void main(String [] args)
      {
    	  AddNumbers ad=new AddNumbers();
      }
}
class AddNumbers extends JFrame{
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JLabel l;
	JButton b;
	public AddNumbers()
	{
		t1=new JTextField(20);
		//(size of textfield)
		t2=new JTextField(20);
		t3=new JTextField(20);
		JLabel l1=new JLabel("enter number 1");
		JLabel l2=new JLabel("enter number 2");
		l=new JLabel("SUM");
		b=new JButton("ADD");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l);
		add(t3);
		//source
		add(b);
		//add(l);
		
		//listener-to provide functionality to the button(unit-5->event handling)
		ActionListener al= new ActionListener()
		{	@Override
			//handler function
			public void actionPerformed(ActionEvent e)
			{
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				Integer sum=num1+num2;
				t3.setText(sum.toString());
			}
		};
		b.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // this line will automatically stop the program no need of manual stoppage
		
	}
}