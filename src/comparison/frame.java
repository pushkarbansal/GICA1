package comparison;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame extends JFrame {

	frame(String title)
	{
		super(title);
		//this.setLocationRelativeTo(null);
		
		this.setSize(800,800);
		this.setLocationRelativeTo(null); //To center the code
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(233, 242, 234));
		JLabel label = new JLabel();
		label.setText("Comparative Analysis of Sorting Algorithm");		
		label.setFont(new Font("MV Boli", Font.PLAIN,30));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		label.setBounds(40, 40, 700, 80);
		label.setBackground(new Color(233, 242, 234));
		label.setVisible(true);
		label.setOpaque(true);
		
		
		
		JTextField input1 = new JTextField();
		input1.setBounds(40, 160, 700, 75);

		JButton button = new JButton("Sort");
		button.setBounds(70, 260, 500, 75);
		button.setFocusable(true);
		button.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						/** Code for opening a new window */ 
						if(e.getSource()==button){
							String arr=input1.getText();
							String[] array = arr.split(",");
							int[] arra = new  int[array.length];
							for (int i=0; i<array.length; i++){
								arra[i]= Integer.parseInt(array[i].trim());
							}
							new Win2(arra);

						}
					}  
				});
		
		
		this.add(button);
		this.add(input1);
		this.add(label);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args)
	{
		frame f=new frame("test");
	}
	
}





