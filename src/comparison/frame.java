package comparison;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class frame extends JFrame {

	frame(String title)
	{
		super(title);
		//this.setLocationRelativeTo(null);
		
		this.setSize(1013,800);
		this.setLocationRelativeTo(null); //To center the code
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(233, 242, 234));
		
		
		
		JTextField input1 = new JTextField();
		input1.setHorizontalAlignment(SwingConstants.LEFT);
		input1.setBounds(70, 129, 832, 182);

			//The Button for Bubble Sort

		JButton button = new JButton("Bubble Sort");
		button.setForeground(new Color(153, 0, 51));
		button.setBackground(new Color(204, 204, 204));
		button.setFont(new Font("Bodoni MT", Font.BOLD, 22));
		button.setBounds(54, 336, 149, 88);
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
		button2.setForeground(new Color(153, 0, 51));
		button2.setBackground(new Color(204, 204, 204));
		button2.setFont(new Font("Bodoni MT", Font.BOLD, 22));
		button2.setBounds(224, 337, 159, 86);
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
		button3.setBackground(new Color(204, 204, 204));
		button3.setForeground(new Color(153, 0, 51));
		button3.setFont(new Font("Bodoni MT", Font.BOLD, 22));
		button3.setBounds(404, 340, 178, 86);
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
		button4.setFont(new Font("Bodoni MT", Font.BOLD, 22));
		button4.setBackground(new Color(204, 204, 204));
		button4.setForeground(new Color(153, 0, 51));
		button4.setBounds(602, 340, 166, 86);
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
		button5.setBackground(new Color(204, 204, 204));
		button5.setForeground(new Color(153, 0, 51));
		button5.setFont(new Font("Bodoni MT", Font.BOLD, 22));
		button5.setBounds(789, 340, 149, 86);
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
		button6.setForeground(new Color(153, 0, 51));
		button6.setBackground(new Color(204, 204, 204));
		button6.setFont(new Font("Bodoni MT", Font.BOLD, 22));
		button6.setBounds(297, 461, 166, 88);
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
		button7.setFont(new Font("Bodoni MT", Font.BOLD, 22));
		button7.setBackground(new Color(204, 204, 204));
		button7.setForeground(new Color(153, 0, 51));
		button7.setBounds(509, 461, 149, 88);
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


		JButton button8 = new JButton("Compare");
		button8.setFont(new Font("Bodoni MT", Font.PLAIN, 36));
		button8.setBackground(new Color(204, 204, 204));
		button8.setForeground(new Color(153, 0, 51));
		button8.setBounds(171, 586, 649, 139);
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
		getContentPane().setLayout(null);
		getContentPane().add(button);
		getContentPane().add(button2);
		getContentPane().add(button3);
		getContentPane().add(button4);
		getContentPane().add(button5);
		getContentPane().add(button6);
		getContentPane().add(button7);
		getContentPane().add(button8);
		getContentPane().add(input1);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 10, 892, 109);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Comparative Analysis of Sorting Algorithms");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 31));
		lblNewLabel.setBounds(155, 10, 709, 94);
		panel.add(lblNewLabel);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args)
	{
		frame f=new frame("test");
	}
}





