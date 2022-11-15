import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class COCOMO {
	public COCOMO() {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.setPreferredSize(new Dimension(600, 400));
		frame.setResizable(false);
		frame.setLocation(300,200);
		frame.setTitle("COCOMO");
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		
		JLabel T=new JLabel("COCOMO");
		T.setForeground(Color.red);
		T.setBounds(180, 10, 350, 53);
		T.setFont(new Font("Arial", Font.PLAIN, 40));
	    T.setPreferredSize(new Dimension(250, 100));
		panel.add(T);
		
		
		JLabel KLOC=new JLabel("Size of Project (KLOC):");
		KLOC.setForeground(Color.red);
		KLOC.setBounds(18, 100, 350, 53);
		KLOC.setFont(new Font("Verdana", Font.PLAIN, 15));
	    KLOC.setPreferredSize(new Dimension(250, 100));
		panel.add(KLOC);
		
		
		JTextField t1=new JTextField("0");  
	    t1.setBounds(25, 150, 100,30);  
	    panel.add(t1);
	    
	    
	    
	    JLabel PM=new JLabel("Project Model:");
		PM.setForeground(Color.red);
		PM.setFont(new Font("Verdana", Font.PLAIN, 15));
	    PM.setPreferredSize(new Dimension(350, 200));
		PM.setBounds(250, 100, 350, 53);
		panel.add(PM);
	    
	    
	    
	    String country[]={"Organic", "Semi Detacthed", "Embedded"};        
	    JComboBox cb=new JComboBox(country);    
	    cb.setBounds(250, 150,100,30);
	    panel.add(cb);
	    
	    
	    
	    
	    JButton MUL=new JButton("Enter");
	    MUL.setFont(new Font("Arial", Font.PLAIN, 15));
	    MUL.setBounds(420, 150, 80, 30);
	    MUL.setForeground(Color.BLACK);
	    panel.add(MUL);
	    
	   
	    
	    
	    
	    
	    JLabel Result=new JLabel("Result");
			Result.setForeground(Color.red);
			Result.setFont(new Font("Verdana", Font.PLAIN, 25));
		    Result.setPreferredSize(new Dimension(250, 100));
			Result.setBounds(250, 200, 350, 53);
			panel.add(Result);
			
			
			
			JLabel ER=new JLabel("Efforts Person/Month:");
			ER.setForeground(Color.red);
			ER.setFont(new Font("Verdana", Font.PLAIN, 15));
		    ER.setPreferredSize(new Dimension(250, 100));
			ER.setBounds(25, 250, 350, 53);
			panel.add(ER);
			
			
			JTextField t2=new JTextField("");  
		    t2.setBounds(25, 300, 100,30); 
		    t2.setEditable(false);
		    panel.add(t2);
		    
		    
		    
		    JLabel DT=new JLabel("Develpoment Time:");
			DT.setForeground(Color.red);
			DT.setFont(new Font("Verdana", Font.PLAIN, 15));
		    DT.setPreferredSize(new Dimension(250, 100));
			DT.setBounds(215, 250, 350, 53);
			panel.add(DT);
		    
		    
		    JTextField t3=new JTextField("");  
		    t3.setBounds(215, 300, 100,30);  
		    t3.setEditable(false);
		    panel.add(t3);
		    JLabel M=new JLabel("Months");
			M.setForeground(Color.red);
			M.setFont(new Font("Verdana", Font.PLAIN, 15));
		    M.setPreferredSize(new Dimension(250, 100));
			M.setBounds(320, 290, 350, 53);
			panel.add(M);
		    
		    
		    
		    
		    JLabel SR=new JLabel("Staff Required:");
			SR.setForeground(Color.red);
			SR.setFont(new Font("Verdana", Font.PLAIN, 15));
		    SR.setPreferredSize(new Dimension(250, 100));
			SR.setBounds(395, 250, 350, 53);
			panel.add(SR);
		    
		    JTextField t4=new JTextField("");  
		    t4.setBounds(395, 300, 100,30);  
		    t4.setEditable(false);
		    panel.add(t4);
		    
		    JLabel P=new JLabel("Person");
			P.setForeground(Color.red);
			P.setFont(new Font("Verdana", Font.PLAIN, 15));
		    P.setPreferredSize(new Dimension(250, 100));
			P.setBounds(500, 290, 350, 53);
			panel.add(P);
			
			
			
			 MUL.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                //JOptionPane.showMessageDialog(panel,"Helo");
		            	
		            	int KILO= Integer.parseInt(t1.getText());
		            //	System.out.print(KILO);
		            	
		            	String text = (String)cb.getSelectedItem();
		            	//System.out.print(text);
		            	
		            	if(text.equalsIgnoreCase("Organic")) {
		            		int a=(int) (2.4*Math.pow(KILO,1.05));
		            		t2.setText(""+a);
		            		
		            		float b=(float) (2.5*Math.pow(a, 0.38));
		            		
		            		t3.setText(""+b);
		            		
		            		t4.setText(""+a/b);
		            		
		            		
		            		
		            	}else if(text.equalsIgnoreCase("Semi Detacthed")) {
		            		
		            		int a=(int) (3.0*Math.pow(KILO,1.12));
		            		t2.setText(""+a);
		            		
		            		float b=(float) (2.5*Math.pow(a, 0.35));
		            		
		            		t3.setText(""+b);
		            		
		            		t4.setText(""+a/b);
		            		
		            		
		            		
		            	}else if(text.equalsIgnoreCase("Embedded")) {
		            		int a=(int) (3.6*Math.pow(KILO,1.20));
		            		t2.setText(""+a);
		            		
		            		float b=(float) (2.5*Math.pow(a, 0.32));
		            		
		            		t3.setText(""+b);
		            		
		            		t4.setText(""+a/b);
		            		
		            		
		            	}
		            	
		            }

				
		        });
			   
			
			
	
	   
		
		
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		new COCOMO();
	}

}
