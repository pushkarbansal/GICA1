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
        System.out.println("Time taken by Bubble sort in miliSeconds: " + t1);
        Heapsort c2 = new Heapsort(a);
        float t2 = c2.val();
        System.out.println("Time taken by Heap sort in miliSeconds: " + t2); 
        Hybridsort c3 =  new Hybridsort(a);
        float t3 = c3.val();
        System.out.println("Time taken by Hybrid sort in miliSeconds: " + t3);
        Mergesort c4 = new Mergesort(a);
        float t4 = c4.val();
        System.out.println("Time taken by Merge sort in miliSeconds: " + t4);
        Stoogesort c5 = new Stoogesort(a);
        float t5 = c5.val();
        System.out.println("Time taken by Stooge sort in miliSeconds: " + t5);
        Timsort c6 = new Timsort(a);
        float t6 = c6.val();
        System.out.println("Time taken by Tim sort in miliSeconds: " + t6);


        DefaultCategoryDataset dcd=new DefaultCategoryDataset();
		dcd.setValue(20, "input", "time");
		JFreeChart jchart=ChartFactory.createLineChart("pushkar","number of inputs", "time needed", dcd);




        


    }
}
