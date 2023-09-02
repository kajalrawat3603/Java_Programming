package unit04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P15_Task01_Calculator_GUI {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
	}

}


class Calculator extends JFrame{
	JTextField t1;
	JTextField t2;
	JLabel l;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	public Calculator()
	{
		t1=new JTextField(20);
		t2=new JTextField(20);
		l=new JLabel("Result");
		b1=new JButton("SUM");
		b2=new JButton("SUB");
		b3=new JButton("DIV");
		b4=new JButton("MULTI");
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l);
		ActionListener a1= new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{ 
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				//Integer result;
				if(e.getSource()==b1) {
					Integer sum=num1+num2;
					l.setText(sum.toString());
				}
				if(e.getSource()==b2) {
					Integer sub=num1-num2;
					l.setText(sub.toString());
				}
				if(e.getSource()==b3) {
					Integer div=num1/num2;
					l.setText(div.toString());
				}
				if(e.getSource()==b4) {
					Integer multi=num1*num2;
					l.setText(multi.toString());
				}
				
			}
		};
		b1.addActionListener(a1);
		b2.addActionListener(a1);
		b3.addActionListener(a1);
		b4.addActionListener(a1);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // this line will automatically stop the program no need of manual stoppage
		
	}
}
