package comparison;

import java.awt.Color;

import javax.swing.JFrame;

public class Timwin {
    public Timwin(int a[]){
        JFrame f1 = new JFrame();
        f1.setSize(800,800);
		f1.setLocationRelativeTo(null); //To center the code
		f1.setResizable(false);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.getContentPane().setBackground(new Color(233, 242, 234));

       Timsort print = new Timsort(a);
        print.printArray();
    }
}
