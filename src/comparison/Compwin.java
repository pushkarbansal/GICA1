package comparison;

import java.awt.BasicStroke;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.GridBagLayout;

import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JTable;

public class Compwin {
    public Compwin(int a[]){
        JFrame f1 = new JFrame();
        f1.getContentPane().setBackground(Color.GRAY);
        f1.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(56, 79, 988, 521);
        f1.getContentPane().add(panel);
        
        
       
        
        JLabel txtrJbjbjj = new JLabel();
        txtrJbjbjj.setBackground(SystemColor.inactiveCaption);
        txtrJbjbjj.setFont(new Font("Dosis ExtraLight", Font.BOLD, 31));
        txtrJbjbjj.setText("Comparison Result");
        txtrJbjbjj.setBounds(449, 10, 246, 49);
        f1.getContentPane().add(txtrJbjbjj);
        f1.setSize(1107,800);
		f1.setLocationRelativeTo(null); //To center the code
		f1.setResizable(false);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        
        
        
        
        ArrayList<algo> finalarr=new ArrayList<>();
        finalarr.add(new algo(t1,"Bubblesort"));
        finalarr.add(new algo(t2,"Heapsort"));
        finalarr.add(new  algo(t3,"Hybridsort"));
        finalarr.add(new algo(t4,"Mergesort"));
        finalarr.add(new  algo(t5,"Stoogesort"));
        finalarr.add(new  algo(t6,"Timsort"));
        
        Collections.sort(finalarr);
        
        for(int i=0;i<6;i++)
        {
        	System.out.println(finalarr.get(i).name);
        }

        float n=a.length;

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(56, 622, 988, 131);
        f1.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(10, 46, 968, 75);
        panel_1.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("1) "+finalarr.get(0).name);
        lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        lblNewLabel.setBounds(10, 10, 112, 33);
        panel_2.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("2) "+finalarr.get(1).name);
        lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        lblNewLabel_1.setBounds(132, 10, 109, 33);
        panel_2.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("3) "+finalarr.get(2).name);
        lblNewLabel_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        lblNewLabel_2.setBounds(251, 10, 109, 33);
        panel_2.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("4) "+finalarr.get(3).name);
        lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        lblNewLabel_3.setBounds(370, 9, 109, 34);
        panel_2.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("5) "+finalarr.get(4).name);
        lblNewLabel_4.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        lblNewLabel_4.setBounds(489, 10, 111, 33);
        panel_2.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("6) "+finalarr.get(5).name);
        lblNewLabel_5.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        lblNewLabel_5.setBounds(610, 10, 109, 33);
        panel_2.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("waiting for more algo to be added.......");
        lblNewLabel_6.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        lblNewLabel_6.setBounds(729, 22, 239, 30);
        panel_2.add(lblNewLabel_6);
        
        JLabel lblNewLabel_8 = new JLabel("Time taken-> "+finalarr.get(0).time);
        lblNewLabel_8.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 9));
        lblNewLabel_8.setBounds(10, 30, 112, 26);
        panel_2.add(lblNewLabel_8);
        
        JLabel lblNewLabel_9 = new JLabel("Time taken-> "+finalarr.get(1).time);
        lblNewLabel_9.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 9));
        lblNewLabel_9.setBounds(132, 30, 112, 26);
        panel_2.add(lblNewLabel_9);
        
        JLabel lblNewLabel_10 = new JLabel("Time taken-> "+finalarr.get(2).time);
        lblNewLabel_10.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 9));
        lblNewLabel_10.setBounds(251, 30, 112, 26);
        panel_2.add(lblNewLabel_10);
        
        JLabel lblNewLabel_11 = new JLabel("Time taken-> "+finalarr.get(3).time);
        lblNewLabel_11.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 9));
        lblNewLabel_11.setBounds(370, 30, 112, 26);
        panel_2.add(lblNewLabel_11);
        
        JLabel lblNewLabel_12 = new JLabel("Time taken-> "+finalarr.get(4).time);
        lblNewLabel_12.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 9));
        lblNewLabel_12.setBounds(489, 30, 112, 26);
        panel_2.add(lblNewLabel_12);
        
        JLabel lblNewLabel_13 = new JLabel("Time taken-> "+finalarr.get(5).time);
        lblNewLabel_13.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 9));
        lblNewLabel_13.setBounds(610, 30, 112, 26);
        panel_2.add(lblNewLabel_13);
        
        JLabel lblNewLabel_7 = new JLabel("Comparison Result");
        lblNewLabel_7.setFont(new Font("Bodoni MT", Font.BOLD, 23));
        lblNewLabel_7.setBounds(416, 0, 208, 60);
        panel_1.add(lblNewLabel_7);
      

        //panel1.set[Preferred/Maximum/Minimum]Size()

        
    
        
      	
            final XYSeries Bubblesort = new XYSeries( "Bubblesort" );          
            Bubblesort.add( 0.0 , 0.0 );          
            Bubblesort.add( n , t1 );          
                     
            
            final XYSeries Heapsort = new XYSeries( "Heapsort" );          
            Heapsort.add( 0.0 , 0.0 );          
            Heapsort.add( n , t2 );          
                      
            
            final XYSeries Hybridsort = new XYSeries( "Hybridsort" );          
            Hybridsort.add( 0.0 , 0.0 );          
            Hybridsort.add( n , t3 );   
            
            final XYSeries Mergesort = new XYSeries( "Mergesort" );          
            Mergesort.add( 0.0 , 0.0  );          
            Mergesort.add( n , t4 );          
                     
            
            final XYSeries Stoogesort = new XYSeries( "Stoogesort" );          
            Stoogesort.add( 0.0 , 0.0 );          
            Stoogesort.add( n , t5 );          
                      
            
            final XYSeries Timsort = new XYSeries( "Timsort" );          
            Timsort.add( 0.0 , 0.0 );          
            Timsort.add( n , t6 );          
            
        
            
                  
            
            
            
            
            

            final XYSeriesCollection dataset = new XYSeriesCollection( );          
            dataset.addSeries( Bubblesort );          
            dataset.addSeries( Heapsort );          
            dataset.addSeries( Hybridsort );
            dataset.addSeries( Mergesort );          
            dataset.addSeries( Stoogesort );          
            dataset.addSeries( Timsort );
           
		JFreeChart xylineChart = ChartFactory.createXYLineChart(
		         "Comparitive Analysis" ,
		         "Number of Input --->" ,
		         "Time taken (Nano seconds)----->" ,
		         dataset ,
		         PlotOrientation.VERTICAL ,
		         true , true , false);
		ChartPanel chartPanel = new ChartPanel(xylineChart );
		chartPanel.setPreferredSize( new java.awt.Dimension( 988, 521 ) );
		
		
		XYPlot plot = xylineChart.getXYPlot();
		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
		
		
		 
		// sets paint color for each series
		renderer.setSeriesPaint(0, Color.RED);
		renderer.setSeriesPaint(1, Color.GREEN);
		renderer.setSeriesPaint(2, Color.YELLOW);
		renderer.setSeriesPaint(3, Color.white);
		renderer.setSeriesPaint(4, Color.pink);
		renderer.setSeriesPaint(5, Color.blue);
		 
		 
		// sets thickness for series (using strokes)
		renderer.setSeriesStroke(0, new BasicStroke(2.0f));
		renderer.setSeriesStroke(1, new BasicStroke(2.0f));
		renderer.setSeriesStroke(2, new BasicStroke(2.0f));
		renderer.setSeriesStroke(3, new BasicStroke(2.0f));
		renderer.setSeriesStroke(4, new BasicStroke(2.0f));
		renderer.setSeriesStroke(5, new BasicStroke(2.0f));
		 
		 
		plot.setRenderer(renderer);
		plot.setBackgroundPaint(Color.DARK_GRAY);
		plot.setRangeGridlinesVisible(true);
		plot.setRangeGridlinePaint(Color.BLACK);
		 
		plot.setDomainGridlinesVisible(true);
		plot.setDomainGridlinePaint(Color.BLACK);
		
		panel.add(chartPanel);
		
		
		
		




        


    }
}





class algo implements Comparable<algo>
{
	float time;
	String name;
	
	algo(float time, String name)
	{
		this.name=name;
		this.time=time;
	}
	@Override
	public int compareTo(algo g)
	{
		System.out.println("i am called");
		if((this.time-g.time)<0)
			return -1;
		else
			return +1;
	}


	
	
	
	
}
