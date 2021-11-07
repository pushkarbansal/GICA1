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

			//The Button for Bubble Sort

		JButton button = new JButton("Bubble Sort");
		button.setBounds(70, 260, 100, 75);
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

		//The Button for Tim Sort

		JButton button2 = new JButton("Tim Sort");
		button2.setBounds(200, 260, 100, 75);
		button2.setFocusable(true);
		button2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						/** Code for opening a new window */ 
						if(e.getSource()==button2){
							String arr=input1.getText();
							String[] array = arr.split(",");
							int[] arra = new  int[array.length];
							for (int i=0; i<array.length; i++){
								arra[i]= Integer.parseInt(array[i].trim());
							}
							new Timwin(arra);

						}
					}  
				});

				//This button is for Stooge Sort

		JButton button3 = new JButton("Stooge" + '\n' + " Sort");
		button3.setBounds(330, 260, 110, 75);
		button3.setFocusable(true);
		button3.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						/** Code for opening a new window */ 
						if(e.getSource()==button3){
							String arr=input1.getText();
							String[] array = arr.split(",");
							int[] arra = new  int[array.length];
							for (int i=0; i<array.length; i++){
								arra[i]= Integer.parseInt(array[i].trim());
							}
							new Stoogewin(arra);

						}
					}  
				});

		JButton button4 = new JButton("Merge" + '\n' + " Sort");
		button4.setBounds(470, 260, 110, 75);
		button4.setFocusable(true);
		button4.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						/** Code for opening a new window */ 
						if(e.getSource()==button4){
							String arr=input1.getText();
							String[] array = arr.split(",");
							int[] arra = new  int[array.length];
							for (int i=0; i<array.length; i++){
								arra[i]= Integer.parseInt(array[i].trim());
							}
							new Mergewin(arra);

						}
					}  
				});

				//This is the button for Hybrid Sort

		JButton button5 = new JButton("Hybrid" + '\n' + " Sort");
		button5.setBounds(610, 260, 110, 75);
		button5.setFocusable(true);
		button5.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						/** Code for opening a new window */ 
						if(e.getSource()==button5){
							String arr=input1.getText();
							String[] array = arr.split(",");
							int[] arra = new  int[array.length];
							for (int i=0; i<array.length; i++){
								arra[i]= Integer.parseInt(array[i].trim());
							}
							new Hybridwin(arra);

						}
					}  
				});


		JButton button6 = new JButton("Heap" + '\n' + " Sort");
		button6.setBounds(250, 350, 100, 75);
		button6.setFocusable(true);
		button6.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						/** Code for opening a new window */ 
						if(e.getSource()==button6){
							String arr=input1.getText();
							String[] array = arr.split(",");
							int[] arra = new  int[array.length];
							for (int i=0; i<array.length; i++){
								arra[i]= Integer.parseInt(array[i].trim());
							}
							new Heapwin(arra);

						}
					}  
				});

		JButton button7 = new JButton("undefined" + '\n' + " Sort");
		button7.setBounds(380, 350, 100, 75);
		button7.setFocusable(true);
		button7.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						/** Code for opening a new window */ 
						if(e.getSource()==button7){
							String arr=input1.getText();
							String[] array = arr.split(",");
							int[] arra = new  int[array.length];
							for (int i=0; i<array.length; i++){
								arra[i]= Integer.parseInt(array[i].trim());
							}
							new Heapwin(arra);

						}
					}  
				});


		JButton button8 = new JButton("Comparison");
		button8.setBounds(150, 450, 400, 75);
		button8.setFocusable(true);
		button8.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						/** Code for opening a new window */ 
						if(e.getSource()==button8){
							String arr=input1.getText();
							String[] array = arr.split(",");
							int[] arra = new  int[array.length];
							for (int i=0; i<array.length; i++){
								arra[i]= Integer.parseInt(array[i].trim());
							}
							new Compwin(arra);

						}
					}  
				});
		this.add(button);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(input1);
		this.add(label);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args)
	{
		frame f=new frame("test");
	}
	
}





