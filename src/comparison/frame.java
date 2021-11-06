package comparison;

import javax.swing.JFrame;

public class frame extends JFrame {

	frame(String title)
	{
		super(title);
		//this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setSize(700,700);
		this.setLocationRelativeTo(null); //To center the code
		this.setResizable(false);
	}
	
	
	public static void main(String[] args)
	{
		frame f=new frame("test");
	}
	
	
}





