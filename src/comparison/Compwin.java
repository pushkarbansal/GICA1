package comparison;

import java.awt.Color;

import javax.swing.JFrame;

public class Compwin {
    public Compwin(int a[]){
        JFrame f1 = new JFrame();
        f1.setSize(800,800);
		f1.setLocationRelativeTo(null); //To center the code
		f1.setResizable(false);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.getContentPane().setBackground(new Color(233, 242, 234));
        f1.setVisible(true);

        Bubblesort c1 = new Bubblesort(a);
        float t1 = c1.val();
        System.out.println("Time taken by Bubble sort in miliSeconds" + t1);
        Heapsort c2 = new Heapsort(a);
        float t2 = c2.val(); 
        new Hybridsort(a);
        new Stoogesort(a);
        new Mergesort(a);
        new Timsort(a);

    }
}
