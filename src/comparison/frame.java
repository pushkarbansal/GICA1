package comparison;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame extends JFrame {

	frame(String title)
	{
		super(title);
		//this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setSize(800,800);
		this.setLocationRelativeTo(null); //To center the code
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(233, 242, 234));
		JLabel label = new JLabel();
		label.setText("Comparative Analysis of Sorting Algorithm");		
		label.setFont(new Font("MV Boli", Font.PLAIN,30));
		//label.setHorizontalAlignment(JLabel.CENTER);
		//label.setVerticalAlignment(JLabel.TOP);
		label.setBounds(40, 40, 700, 80);
		label.setBackground(new Color(233, 242, 234));
		
		label.setOpaque(true);
		
		
		
		JTextField input1 = new JTextField();
		input1.setBounds(40, 160, 700, 75);
		
		
		
		this.add(input1);
		this.add(label);
		label.setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		frame f=new frame("test");
	}
	
}





