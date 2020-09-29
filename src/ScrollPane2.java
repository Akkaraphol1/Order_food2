
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScrollPane2 extends JFrame implements ActionListener{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private	JPanel	panel1;
	private	JPanel	panel2;
	private	JPanel	panel3;
	private	JPanel	panel4;
	private	JPanel	panel6;
	
	private JLabel A,A2,A3,A5,A6,A7,A8,A9,A10,A12,ARect,ARect2,ARect3,ARect4;
	private JTextField B,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19/*,m1*/,jTotal,Change,Pay3,Pay6,Total7;
	private JLabel C,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19;
	private JRadioButton C1;
	private JButton report;
	
	private JTextArea textArea ;

	double bt1,bt2,result;
	
	String[] choosecards = { "cash","KBank","MasterCard", "KrungThai", "Scb", "MBanking", "KrungSee","Choose" };
    private JComboBox<?> comboBox = new JComboBox<Object>(choosecards);
	
	double Tax3 = 0.07;
	double SB = 50.00 ; 
	double CN = 50.00 ; 
	double CB = 60.00 ; 
	double BE = 60.00 ; 
	double BPC = 60.00 ; 
	double FRH = 45.00 ; 
	double FRO = 60.00 ; 
	double Swfc = 45.00;
	double SFP = 60.00 ;
	double Rwsc = 55.00 ; 
	double RwRs = 60.00 ; 
	double RWB = 50.00 ; 
	double DR = 40.00 ; 
	double RPG = 55.00 ; 
	double Bpb = 50.00 ; 
	double Sfp = 55.00 ; 
	double Ccp = 60.00 ;
	double Sos = 60.00 ;
	double Ot = 65.00 ; 
	double m = 85.00 ;
	
	
	private JButton total,subtotal1;
	private static JButton Exit;
	private JButton Choose;
	
	double itotal , Tax_Rate , Cost ,iSubtotal, iTax, Pay2,Pay4,SelectC;
	
	double[] item = new double[59];
	double[] choice = new double[3];
	
	JTextField[] M = new JTextField[39];
	JLabel[] M2 = new JLabel[20];
	
	String Ans , Ans2 ,Ans3,Ans4,Ans5,Ans6;
	
	 JLabel imageLabel,imageLabel2;
	   public JLabel img,img2;
	   
	String operation;
	public ScrollPane2(){
		
		getContentPane().setLayout(null);
		// MainPanel2
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		getContentPane().add(mainPanel);
		
		itemTabPanel1();
		itemTabPanel2();
	
		
		JTabbedPane tabPane = new JTabbedPane();
		tabPane.addTab( "Total", panel1);
		tabPane.setFont(new Font("Tohama", Font.BOLD, 22));
		tabPane.addTab( "Report", panel2);
	
		mainPanel.add(tabPane);
		
		// ScrollPane
        JScrollPane pane = new JScrollPane(tabPane);
        pane.setBounds(920, 17, 450, 720);

        getContentPane().add(pane);
        
        //MainPanel2
        JPanel mainPanel2 = new JPanel();
		mainPanel2.setLayout(new BorderLayout());
		getContentPane().add(mainPanel2);
		
		itemTabPanel3();
		itemTabPanel4();
		itemTabPanel6();
		
		JTabbedPane tabPane2 = new JTabbedPane();
		tabPane2.setFont(new Font("Tohama", Font.BOLD, 22));
		tabPane2.addTab( "MainFoods", panel3);
		tabPane2.addTab( "SeaFood", panel4);
		tabPane2.addTab( "Drinks", panel6);
		mainPanel2.add(tabPane2);
		
		//ScrollPane2
        JScrollPane pane2 = new JScrollPane(tabPane2);
        pane2.setBounds(40,20,850,720);
        getContentPane().add(pane2);   		
        
	}
	

	public void itemTabPanel1()
	{
		panel1 = new JPanel();
		panel1.setLayout(null);
		
		A12 = new JLabel("Order Food");
		A12.setFont(new Font("Tohama", Font.BOLD, 30));
		A12.setBounds(140, 45, 180, 40);
		panel1.add(A12);
		
		// Combobox
 		String[] choosecards = { "cash 0 %","KBank 3 %","MasterCard 5 %", "KrungThai 7 %", "Scb 9 %", "MBanking 11 %", "KrungSee 13 %","Choose" };
 		JComboBox<?> jComboBox = new JComboBox<Object>(choosecards);
		comboBox = jComboBox;
 		comboBox.setEnabled(false);
 		comboBox.setFont(new Font("Tohama", Font.BOLD, 18));
 		comboBox.setSelectedIndex(7);
 		comboBox.setBounds(230, 220, 180, 30);
 		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				 Pay3.setEnabled(true);
			     Choose.setEnabled(true);
				
			     if (comboBox.getSelectedItem().equals("cash 0 %"))
					{
						    choice[0] = (itotal);
					        Ans6 = String.format(" %.2f ", choice[0]);
					        jTotal.setText(Ans6);
					      
					}
			     else if (comboBox.getSelectedItem().equals("KBank 3 %"))
					{
						    choice[0] = (itotal - (itotal * (0.03)));
					        Ans6 = String.format(" %.2f ", choice[0]);
					        jTotal.setText(Ans6);
					       
					}
			     else if (comboBox.getSelectedItem().equals("MasterCard 5 %"))
					{
						    choice[0] = (itotal - (itotal * (0.05)));
					        Ans6 = String.format(" %.2f ", choice[0]);
					        jTotal.setText(Ans6);
					        
					}
			     else if (comboBox.getSelectedItem().equals("KrungThai 7 %"))
					{
						    choice[0] = (itotal - (itotal * (0.07)));
					        Ans6 = String.format(" %.2f ", choice[0]);
					        jTotal.setText(Ans6);
					        
					}
			     else if (comboBox.getSelectedItem().equals("Scb 9 %"))
					{
						    choice[0] = (itotal - (itotal * (0.09)));
					        Ans6 = String.format(" %.2f ", choice[0]);
					        jTotal.setText(Ans6);
					       
					}
			     else if (comboBox.getSelectedItem().equals("MBanking 11 %"))
					{
						    choice[0] = (itotal - (itotal * (0.11)));
					        Ans6 = String.format(" %.2f ", choice[0]);
					        jTotal.setText(Ans6);
					        
					}
			     else if (comboBox.getSelectedItem().equals("KrungSee 13 %"))
					{
						    choice[0] = (itotal - (itotal * (0.13)));
					        Ans6 = String.format(" %.2f ", choice[0]);
					        jTotal.setText(Ans6);
					        
					}
			     else if (comboBox.getSelectedItem().equals("Choose"))
					{
			    	 Pay3.setEnabled(false);
			    	 Pay3.setText("");
			    	 Change.setText("");
				     Choose.setEnabled(false);
				     choice[1] = (itotal);
				        Ans6 = String.format(" %.2f ", choice[1]);
				        jTotal.setText(Ans6);
					}
			     if(itotal == 0){
			        	JOptionPane.showMessageDialog(null, "Please to come back select goods before pay");
			        	jTotal.setText("0.00");
			        	Pay3.setEnabled(false);
			        }
			      
			}
		});
 		panel1.add(comboBox);
		
 		//Text order
 		A9 = new JLabel("Change");
		A9.setFont(new Font("Tohama", Font.BOLD, 25));
		A9.setBounds(118,165,120,40);
		panel1.add(A9);
		
		JLabel P1 = new JLabel("Pay");
		P1.setFont(new Font("Tohama", Font.BOLD, 25));
		P1.setBounds(162,115,120,40);
		panel1.add(P1);
		
 		//TextField
		Change = new JTextField(null);
		Change.setEditable(false);
		Change.setFont(new Font("Tohama", Font.BOLD, 20));
		Change.setBounds(230,170,120,35);
		panel1.add(Change);
		
		ARect3 = new JLabel();
		ARect3.setBorder(BorderFactory.createLineBorder(Color.RED));
		ARect3.setFont(new Font("Tohama", Font.BOLD, 19));
		ARect3.setBounds(20,35,400,60);
		panel1.add(ARect3);
		
		Pay3 = new JTextField();
		Pay3.setEnabled(false);
		Pay3.setFont(new Font("Tohama", Font.BOLD, 20));
		Pay3.setBounds(230,120,120,35);
		panel1.add(Pay3);
		
		ARect4 = new JLabel();
		ARect4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ARect4.setFont(new Font("Tohama", Font.BOLD, 19));
		ARect4.setBounds(20,35,400,280);
		panel1.add(ARect4);
		
		// Button
		Choose = new JButton("Pay");
		Choose.setFont(new Font("Tohama", Font.BOLD, 18));
		Choose.setEnabled(false);
		Choose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
			    iSubtotal = (item[0] * SB)
						   +(item[1] * CN)+(item[2] * CB)+(item[3] * BE)
							+(item[4] * BPC)+(item[5] * FRH)+(item[6] * FRO)
							+(item[7] * Swfc)+(item[8] * SFP)+(item[9] * Rwsc)
							+(item[10] * RwRs)+(item[11] * RWB)+(item[12] * DR)
							+(item[13] * RPG)+(item[14] * Bpb)+(item[15] * Sfp)
							+(item[16] * Ccp)+(item[17] * Sos)+(item[18] * Ot)
							+(item[19] * 80)+(item[20] * 200)+(item[21] * 300)
							+(item[22] * 180)+(item[23] * 300)+(item[24] * 210)
							+(item[25] * 300)+(item[26] * 500)+(item[27] * 300)
							+(item[28] * 300)+(item[29] * 300)+(item[30] * 300)
							+(item[31] * 400)+(item[32] * 250)+(item[33] * 300)
							+(item[34] * 400)+(item[35] * 200)+(item[36] * 150);
				
			    iTax = (iSubtotal * Tax3);
			    
			    itotal = (iSubtotal + iTax);
			    
			    item[57] = Double.parseDouble(Pay3.getText());
		
			    
			    if (comboBox.getSelectedItem().equals("cash 0 %"))
				{  	
			        Pay2 = (-choice[0] + item[57]);
			        Ans4 = String.format("%.2f", Pay2);
			        if(Pay2 >= 0){
			        	 JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");
	        		Change.setText(Ans4);     
	        		int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure press yes ? If you pressed yes ,You couldn't edit a data. ");
					if(dialogResult == JOptionPane.YES_OPTION){
						total.setEnabled(false);
						subtotal1.setEnabled(false);
						Exit.setEnabled(false);
						Choose.setEnabled(false);
						comboBox.setEnabled(false);
						report.setEnabled(true);
						Pay3.setEnabled(false);
						
					}
			        }
			        else {
			        	JOptionPane.showMessageDialog(null, "Sorry, You don't have a lot of money.");
			        	Change.setText("");     	
			        }
				}
			    else if (comboBox.getSelectedItem().equals("KBank 3 %"))
				{		   
				        Pay2 = (-choice[0] + item[57]);
				        Ans4 = String.format("%.2f", Pay2);	
				        if(Pay2 >= 0){
				        	 JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");
		        		Change.setText(Ans4);     
		        		int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure press yes ? If you pressed yes ,You couldn't edit a data. ");
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here       
							total.setEnabled(false);
							subtotal1.setEnabled(false);
							Exit.setEnabled(false);
							Choose.setEnabled(false);
							comboBox.setEnabled(false);
							report.setEnabled(true);
							Pay3.setEnabled(false);
							
						}
				        }
				        else {
				        	JOptionPane.showMessageDialog(null, "Sorry, You don't have a lot of money.");
				        	Change.setText("");     	
				        }
				}
			    
			    else if (comboBox.getSelectedItem().equals("MasterCard 5 %"))
				{		   
				        Pay2 = (-choice[0] + item[57]);
				        Ans4 = String.format("%.2f", Pay2);
				        if(Pay2 >= 0){
				        	 JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");
		        		Change.setText(Ans4);     
		        		int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure press yes ? If you pressed yes ,You couldn't edit a data. ");
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here       
							total.setEnabled(false);
							subtotal1.setEnabled(false);
							Exit.setEnabled(false);
							Choose.setEnabled(false);
							comboBox.setEnabled(false);
							report.setEnabled(true);
							Pay3.setEnabled(false);
							
						}
				        }
				        else {
				        	JOptionPane.showMessageDialog(null, "Sorry, You don't have a lot of money.");
				        	Change.setText("");     	
				        }
				}	
			    else if (comboBox.getSelectedItem().equals("KrungThai 7 %"))
				{
				        Pay2 = (-choice[0] + item[57]);
				        Ans4 = String.format("%.2f", Pay2);
				        if(Pay2 >= 0){
				        	 JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");
		        		Change.setText(Ans4);    
		        		
		        		int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure press yes ? If you pressed yes ,You couldn't edit a data. ");
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here       
							total.setEnabled(false);
							subtotal1.setEnabled(false);
							Exit.setEnabled(false);
							Choose.setEnabled(false);
							comboBox.setEnabled(false);
							report.setEnabled(true);
							Pay3.setEnabled(false);
							 
						}
				        }
				        else {
				        	JOptionPane.showMessageDialog(null, "Sorry, You don't have a lot of money.");
				        	Change.setText("");     	
				        }
				}
		        else if (comboBox.getSelectedItem().equals("Scb 9 %"))
				{
				        Pay2 = (-choice[0] + item[57]);
				        Ans4 = String.format("%.2f", Pay2);			      
				        if(Pay2 >= 0){
				        	 JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");
		        		Change.setText(Ans4);     
		        		int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure press yes ? If you pressed yes ,You couldn't edit a data. ");
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here       
							total.setEnabled(false);
							subtotal1.setEnabled(false);
							Exit.setEnabled(false);
							Choose.setEnabled(false);
							comboBox.setEnabled(false);
							report.setEnabled(true);
							Pay3.setEnabled(false);
							
						}
				        }
				        else {
				        	JOptionPane.showMessageDialog(null, "Sorry, You don't have a lot of money.");
				        	Change.setText("");     	
				        }
				} 	
		       else if (comboBox.getSelectedItem().equals("MBanking 11 %"))
				{
				        Pay2 = (-choice[0] + item[57]);
				        Ans4 = String.format("%.2f", Pay2);				    				      
				        if(Pay2 >= 0){
				        	 JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");
		        		Change.setText(Ans4);     
		        		int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure press yes ? If you pressed yes ,You couldn't edit a data. ");
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here       
							total.setEnabled(false);
							subtotal1.setEnabled(false);
							Exit.setEnabled(false);
							Choose.setEnabled(false);
							comboBox.setEnabled(false);
							report.setEnabled(true);
							Pay3.setEnabled(false);
							
						}
				        }
				        else {
				        	JOptionPane.showMessageDialog(null, "Sorry, You don't have a lot of money.");
				        	Change.setText("");     	
				        }
				}
		       else if (comboBox.getSelectedItem().equals("KrungSee 13 %"))
				{
				        Pay2 = (-choice[0] + item[57]);
				        Ans4 = String.format("%.2f", Pay2);				      				       
				        if(Pay2 >= 0){
				        	 JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");
		        		Change.setText(Ans4);     
		        		int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure press yes ? If you pressed yes ,You couldn't edit a data. ");
						if(dialogResult == JOptionPane.YES_OPTION){
						  // Saving code here       
							total.setEnabled(false);
							subtotal1.setEnabled(false);
							Exit.setEnabled(false);
							Choose.setEnabled(false);
							comboBox.setEnabled(false);
							report.setEnabled(true);
							Pay3.setEnabled(false);
							
						}
				        }
				        else {
				        	JOptionPane.showMessageDialog(null, "Sorry, You don't have a lot of money.");
				        	Change.setText("");     	
				        }
				     
				}

			}	
		});
			
		Choose.setBounds(170, 265, 110, 40);
		panel1.add(Choose);	
		
 		
		//Button Buy food
		total = new JButton("Total");
		total.setEnabled(false);
		total.setFont(new Font("Tohama", Font.BOLD, 18));
		total.setBounds(40, 570, 100, 40);
		panel1.add(total);
		
		subtotal1 = new JButton("Reset");
		subtotal1.setEnabled(false);
		subtotal1.setFont(new Font("Tohama", Font.BOLD, 18));
		subtotal1.setBounds(170, 570, 100, 40);
		panel1.add(subtotal1);

		Exit = new JButton("Exit");
		Exit.setEnabled(false);
		Exit.setFont(new Font("Tohama", Font.BOLD, 18));
		Exit.setBounds(300, 570, 100, 40);
		panel1.add(Exit);
		
		report = new JButton("Report");
		report.setEnabled(false);
		report.setFont(new Font("Tohama", Font.BOLD, 18));
		report.setBounds(170, 620, 100, 40);
		panel1.add(report);

		//TextField Buy Food
		jTotal = new JTextField(null);
		jTotal.setEditable(false);
		jTotal.setFont(new Font("Tohama", Font.BOLD, 20));
		jTotal.setBounds(230,415,120,35);
		panel1.add(jTotal);
		
		JTextField jlTax = new JTextField("");
		jlTax.setEditable(false);
		jlTax.setFont(new Font("Tohama", Font.BOLD, 20));
		jlTax.setBounds(230,465,120,35);
		panel1.add(jlTax);
		
		JTextField jsubTotal = new JTextField("");
		jsubTotal.setEditable(false);
		jsubTotal.setFont(new Font("Tohama", Font.BOLD, 20));
		jsubTotal.setBounds(230,515,120,35);
		panel1.add(jsubTotal);
		
		// Label Text
		A6 = new JLabel("Total");
		A6.setFont(new Font("Tohama", Font.BOLD, 25));
		A6.setBounds(148,415,120,40);
		panel1.add(A6);
		
		A7 = new JLabel("Tax");
		A7.setFont(new Font("Tohama", Font.BOLD, 25));
		A7.setBounds(160,465,120,40);
		panel1.add(A7);	
		
		A8 = new JLabel("SubTotal");
		A8.setFont(new Font("Tohama", Font.BOLD, 25));
		A8.setBounds(100,515,120,40);
		panel1.add(A8);
		
		A10 = new JLabel("Buy Food");
		A10.setFont(new Font("Tohama", Font.BOLD, 30));
		A10.setBounds(160, 345, 160, 40);
		panel1.add(A10);
		
		ARect2 = new JLabel();
		ARect2.setBorder(BorderFactory.createLineBorder(Color.RED));
		ARect2.setFont(new Font("Tohama", Font.BOLD, 19));
		ARect2.setBounds(20,335,400,60);
		panel1.add(ARect2);
		
		ARect = new JLabel();
		ARect.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ARect.setFont(new Font("Tohama", Font.BOLD, 19));
		ARect.setBounds(20,335,400,335);
		panel1.add(ARect);
		
		
		
		subtotal1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
				B.setText("         0");
				B2.setText("         0");
				B3.setText("         0");
				B4.setText("         0");
				B5.setText("         0");
				B6.setText("         0");
				B7.setText("         0");
				B8.setText("         0");
				B9.setText("         0");
				B10.setText("         0");
				B11.setText("         0");
				B12.setText("         0");
				B13.setText("         0");
				B14.setText("         0");
				B15.setText("         0");
				B16.setText("         0");
				B17.setText("         0");
				B18.setText("         0");
				B19.setText("         0");
			    M[0].setText("         0");
			    M[1].setText("         0");
			    M[2].setText("         0");
			    M[3].setText("         0");
			    M[4].setText("         0");
			    M[5].setText("         0");
			    M[6].setText("         0");
			    M[7].setText("         0");
			    M[8].setText("         0");
			    M[9].setText("         0");
			    M[10].setText("         0");
			    M[11].setText("         0");
			    M[12].setText("         0");
			    M[13].setText("         0");
			    M[14].setText("         0");
			    M[15].setText("         0");
			    M[16].setText("         0");
			    M[17].setText("         0");
			    M[18].setText("         0");
			    M[19].setText("         0");
			    M[20].setText("         0");
			    M[21].setText("         0");
			    M[22].setText("         0");
			    M[23].setText("         0");
			    M[24].setText("         0");
			    M[25].setText("         0");
			    M[26].setText("         0");
			    M[27].setText("         0");
			    M[28].setText("         0");
			    M[29].setText("         0");
			    M[30].setText("         0");
			    M[31].setText("         0");
			    M[32].setText("         0");
			    M[33].setText("         0");
			    M[34].setText("         0");
			    M[35].setText("         0");
			    M[36].setText("         0");
			    M[37].setText("         0");
			    comboBox.setSelectedIndex(7);
			    
				jsubTotal.setText("         0");			
				jlTax.setText("         0");		
				jTotal.setText("         0");		
				Change.setText(" ");		
	            Pay3.setText("");
	            Pay3.setEnabled(false);
	            comboBox.setEnabled(false);
	            Choose.setEnabled(false);
	            
			}
			});
		
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
							
				item[0] = Double.parseDouble(B.getText());
			    item[1] = Double.parseDouble(B2.getText());
			    item[2] = Double.parseDouble(B3.getText());
			    item[3] = Double.parseDouble(B4.getText());
			    item[4] = Double.parseDouble(B5.getText());
			    item[5] = Double.parseDouble(B6.getText());
			    item[6] = Double.parseDouble(B7.getText());
			    item[7] = Double.parseDouble(B8.getText());
			    item[8] = Double.parseDouble(B9.getText());
			    item[9] = Double.parseDouble(B10.getText());
			    item[10] = Double.parseDouble(B11.getText());
			    item[11] = Double.parseDouble(B12.getText());
			    item[12] = Double.parseDouble(B13.getText());
			    item[13] = Double.parseDouble(B14.getText());
			    item[14] = Double.parseDouble(B15.getText());
			    item[15] = Double.parseDouble(B16.getText());
			    item[16] = Double.parseDouble(B17.getText());
			    item[17] = Double.parseDouble(B18.getText());
			    item[18] = Double.parseDouble(B19.getText());
			    item[19] = Double.parseDouble(M[0].getText());
			    item[20] = Double.parseDouble(M[1].getText());
			    item[21] = Double.parseDouble(M[2].getText());
			    item[22] = Double.parseDouble(M[3].getText());
			    item[23] = Double.parseDouble(M[4].getText());
			    item[24] = Double.parseDouble(M[5].getText());
			    item[25] = Double.parseDouble(M[6].getText());
			    item[26] = Double.parseDouble(M[7].getText());
			    item[27] = Double.parseDouble(M[8].getText());
			    item[28] = Double.parseDouble(M[9].getText());
			    item[29] = Double.parseDouble(M[10].getText());
			    item[30] = Double.parseDouble(M[11].getText());
			    item[31] = Double.parseDouble(M[12].getText());
			    item[32] = Double.parseDouble(M[13].getText());
			    item[33] = Double.parseDouble(M[14].getText());
			    item[34] = Double.parseDouble(M[15].getText());
			    item[35] = Double.parseDouble(M[16].getText());
			    item[36] = Double.parseDouble(M[17].getText());
			    item[37] = Double.parseDouble(M[18].getText());
			    item[38] = Double.parseDouble(M[19].getText());
			    item[39] = Double.parseDouble(M[20].getText());
			    item[40] = Double.parseDouble(M[21].getText());
			    item[41] = Double.parseDouble(M[22].getText());
			    item[42] = Double.parseDouble(M[23].getText());
			    item[43] = Double.parseDouble(M[24].getText());
			    item[44] = Double.parseDouble(M[25].getText());
			    item[45] = Double.parseDouble(M[26].getText());
			    item[46] = Double.parseDouble(M[27].getText());
			    item[47] = Double.parseDouble(M[28].getText());
			    item[48] = Double.parseDouble(M[29].getText());
			    item[49] = Double.parseDouble(M[30].getText());
			    item[50] = Double.parseDouble(M[31].getText());
			    item[51] = Double.parseDouble(M[32].getText());
			    item[52] = Double.parseDouble(M[33].getText());
			    item[53] = Double.parseDouble(M[34].getText());
			    item[54] = Double.parseDouble(M[35].getText());
			    item[55] = Double.parseDouble(M[36].getText());
			    item[56] = Double.parseDouble(M[37].getText());		
			    comboBox.setEnabled(true);
			    
			    
			iSubtotal = (item[0] * SB)
					   +(item[1] * CN)+(item[2] * CB)+(item[3] * BE)
						+(item[4] * BPC)+(item[5] * FRH)+(item[6] * FRO)
						+(item[7] * Swfc)+(item[8] * SFP)+(item[9] * Rwsc)
						+(item[10] * RwRs)+(item[11] * RWB)+(item[12] * DR)
						+(item[13] * RPG)+(item[14] * Bpb)+(item[15] * Sfp)
						+(item[16] * Ccp)+(item[17] * Sos)+(item[18] * Ot)
						+(item[19] * 80)+(item[20] * 200)+(item[21] * 300)
						+(item[22] * 180)+(item[23] * 300)+(item[24] * 210)
						+(item[25] * 300)+(item[26] * 500)+(item[27] * 300)
						+(item[28] * 300)+(item[29] * 300)+(item[30] * 400)
						+(item[31] * 250)+(item[32] * 300)+(item[33] * 400)
						+(item[34] * 400)+(item[35] * 200)+(item[36] * 150)
						+(item[37] * 50)+(item[38] * 50)+(item[39] * 50)
						+(item[40] * 50)+(item[41] * 50)+(item[42] * 40)
						+(item[43] * 50)+(item[44] * 50)+(item[45] * 50)
						+(item[46] * 50)+(item[47] * 25)+(item[48] * 50)
						+(item[49] * 15)+(item[50] * 30)+(item[51] * 20)
						+(item[52] * 20)+(item[53] * 20)+(item[54] * 20)
						+(item[55] * 25)+(item[56] * 30);
			
			Ans = String.format("%.2f", iSubtotal);	
			jsubTotal.setText(Ans);
			
			iTax = (iSubtotal * Tax3);
			Ans2 = String.format("%.2f", iTax);	
			jlTax.setText(Ans2);
					
			itotal = (iSubtotal + iTax);
			Ans3 = String.format("%.2f", itotal);
			jTotal.setText(Ans3);
			
			item[57] = Double.parseDouble(Pay3.getText());
			Pay2 = ((-item[57]) - itotal );
			Ans4 = String.format("%.2f", Pay2);
			Change.setText(Ans4);
			}
			
		});
		
		report.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ImageIcon image = new ImageIcon("C:/Users/User/Desktop/Lab/img/LogoFood.png");
			       JLabel imageLabel = new JLabel(image); 
			       imageLabel.setBounds(90,25,273,260);
			       imageLabel.setVisible(true);
			       panel2.add(imageLabel);	   
			       
			       Pay4 = Double.parseDouble(Pay3.getText());
			       Ans5 = String.format("%.2f",Pay4);
			       Pay3.setText(Ans5);
			       C1.setEnabled(false);
			       
			       String value = (String)comboBox.getSelectedItem();
			       Pay6.setText(value);
			       
			        textArea = new JTextArea();
					textArea.setEditable(false);
				    textArea.setFont(new Font("Tohama", Font.BOLD, 30));
			        textArea.append("\n\n\n\n\n\n\n   =================== \n"+"   Subtotal : "+Ans+"\n"
			        		+"   Tax : "+Ans2 + "\n"+"   Total : "+Ans6 +"\n"+"   Pay : "+Ans5 +"\n"+"   Change : "+Ans4+"\n   Pay with : "+value+"\n   ===================");
			        textArea.setVisible(true);
					JScrollPane pa = new JScrollPane(textArea);
			        pa.setBounds(10,10,420,600);
			        panel2.add(pa); 
			        
			        JButton Print = new JButton("Print");
			        Print.setFont(new Font("Tohama",Font.BOLD, 25));
			        Print.setBounds(170, 620, 100, 50);
			        panel2.add(Print); 
			}
			});
	}
	public void itemTabPanel2()
	{
		panel2 = new JPanel();
		panel2.setLayout(null);
				
		Pay6 = new JTextField();
		Pay6.setBounds(200,550,100,30);
		Pay6.setFont(new Font("Tohama", Font.BOLD, 30));
		Pay6.setVisible(false);
		Pay6.setEditable(false);
		panel2.add(Pay6);
		
		Total7 = new JTextField();
		Total7.setBounds(150,300,100,30);
		Total7.setFont(new Font("Tohama", Font.BOLD, 30));
		Total7.setVisible(false);
		Total7.setEditable(false);
		panel2.add(Total7);
	}
	public void itemTabPanel3()
	{
		panel3 = new JPanel();
		panel3.setLayout(null);
		
		 ImageIcon image = new ImageIcon("C:/Users/User/Desktop/Lab/img/FoodKookSoul36.png");
	       JLabel imageLabel = new JLabel(image); 
	       imageLabel.setBounds(20, 45,800,115);
	       imageLabel.setVisible(true);
	       panel3.add(imageLabel);	   
		
		C1 = new JRadioButton("On/Off");
		C1.setFont(new Font("Tohama", Font.BOLD, 17));
		C1.setBounds(10, 10, 100, 30);
		panel3.add(C1);
				
		//Box1
        B = new JTextField(50);
        B.setText(null);
    	B.setEnabled(false);
    	B.setFont(new Font("Tohama", Font.BOLD, 19));
    	B.setBounds(290,590,100,30);
    	   	
    	panel3.add(B);
    	
    	C = new JLabel("Sea Basil                        50 B");
    	C.setFont(new Font("Tohama", Font.BOLD, 19));
    	C.setBounds(20,590,280,30);
    	// Check Checkbox 1
    	panel3.add(C);
    	
    	//Box2
        B2 = new JTextField(50);
        B2.setText(null);
    	B2.setEnabled(false);
    	B2.setFont(new Font("Tohama", Font.BOLD, 19));
    	B2.setBounds(290,190,100,30);
    	panel3.add(B2);
    	
    	C2 = new JLabel("Crispy Noodles            50 B");
    	C2.setFont(new Font("Tohama", Font.BOLD, 19));
    	C2.setBounds(20,190,280,30);
    	panel3.add(C2);
    	
    	//Box3    	
    	B3 = new JTextField(50);
    	B3.setText(null);
    	B3.setEnabled(false);
    	B3.setFont(new Font("Tohama", Font.BOLD, 19));
    	B3.setBounds(290,230,100,30);
    	panel3.add(B3);
    	
    	C3 = new JLabel("Chicken Basil               60 B");
    	C3.setFont(new Font("Tohama", Font.BOLD, 19));
    	C3.setBounds(20,230,280,30);
    	panel3.add(C3);
        
    	//Box4		
		B4 = new JTextField(50);
		B4.setText(null);
		B4.setEnabled(false);
		B4.setFont(new Font("Tohama", Font.BOLD, 19));
		B4.setBounds(290,270,100,30);
		panel3.add(B4);
		
		C4 = new JLabel("Basil Eggs                     60 B");
		C4.setFont(new Font("Tohama", Font.BOLD, 19));
		C4.setBounds(20,270,280,30);
		panel3.add(C4);
		
		//Box5
		B5 = new JTextField(50);
		B5.setText(null);
		B5.setEnabled(false);
		B5.setFont(new Font("Tohama", Font.BOLD, 19));
		B5.setBounds(290,310,100,30);
		panel3.add(B5);
		
		C5 = new JLabel("Basil Pork Chops         60 B");
		C5.setFont(new Font("Tohama", Font.BOLD, 19));
		C5.setBounds(20,310,280,30);
		panel3.add(C5);
    	
		//Box6
		B6 = new JTextField(50);
		B6.setText(null);
		B6.setEnabled(false);
		B6.setFont(new Font("Tohama", Font.BOLD, 19));
		B6.setBounds(290,350,100,30);
		panel3.add(B6);
				
		C6 = new JLabel("Fried Rice Ham             45 B");
		C6.setFont(new Font("Tohama", Font.BOLD, 19));
		C6.setBounds(20,350,280,30);
		panel3.add(C6);
        
		//Box7	
		B7 = new JTextField(50);
		B7.setText(null);
		B7.setEnabled(false);
		B7.setFont(new Font("Tohama", Font.BOLD, 19));
		B7.setBounds(290,390,100,30);
		panel3.add(B7);
				 
		C7 = new JLabel("Fried Rice Omelet         60 B");
		C7.setFont(new Font("Tohama", Font.BOLD, 19));
		C7.setBounds(20,390,280,30);
		panel3.add(C7);
		
		//Box8
		B8 = new JTextField(50);
		B8.setText(null);
		B8.setEnabled(false);
		B8.setFont(new Font("Tohama", Font.BOLD, 19));
		B8.setBounds(290,430,100,30);
		panel3.add(B8);
				
		C8 = new JLabel("Stir fried wild curry      45 B");
		C8.setFont(new Font("Tohama", Font.BOLD, 19));
		C8.setBounds(20,430,280,30);
		panel3.add(C8);
		
		//Box9
		B9 = new JTextField(50);
		B9.setText(null);
		B9.setEnabled(false);
		B9.setFont(new Font("Tohama", Font.BOLD, 19));
		B9.setBounds(290,470,100,30);
		panel3.add(B9);
				
		C9 = new JLabel("Stir Fried Pork               60 B");
		C9.setFont(new Font("Tohama", Font.BOLD, 19));
		C9.setBounds(20,470,280,30);
		panel3.add(C9);
	
		//Box10
		B10 = new JTextField(50);
		B10.setText(null);
		B10.setEnabled(false);
		B10.setFont(new Font("Tohama", Font.BOLD, 19));
		B10.setBounds(720,590,100,30);
		panel3.add(B10);
				
		C10 = new JLabel("Rice with shrimp curry    55 B");
		C10.setFont(new Font("Tohama", Font.BOLD, 19));
		C10.setBounds(430,590,280,30);
		panel3.add(C10);
		
		//Box11
		A = new JLabel("Shrimp and Chilli");
		A.setFont(new Font("Tohama", Font.BOLD, 19));
		A.setBounds(430,220,240,30);
		panel3.add(A);
		
		B11 = new JTextField(50);
		B11.setText(null);
		B11.setEnabled(false);
		B11.setFont(new Font("Tohama", Font.BOLD, 19));
		B11.setBounds(720,190,100,30);
		panel3.add(B11);
						
		C11 = new JLabel("Rice with Roasted             60 B");
		C11.setFont(new Font("Tohama", Font.BOLD, 19));
		C11.setBounds(430,190,280,30);
		panel3.add(C11);
		
		//Box12
		B12 = new JTextField(50);
		B12.setText(null);
		B12.setEnabled(false);
		B12.setFont(new Font("Tohama", Font.BOLD, 19));
		B12.setBounds(720,260,100,30);
		panel3.add(B12);
						
		C12 = new JLabel("Rice with Baby Corn        50 B");
		C12.setFont(new Font("Tohama", Font.BOLD, 19));
		C12.setBounds(430,260,280,30);
		panel3.add(C12);
		
		//Box13
		B13 = new JTextField(50);
		B13.setText(null);
		B13.setEnabled(false);
		B13.setFont(new Font("Tohama", Font.BOLD, 19));
		B13.setBounds(720,300,100,30);
		panel3.add(B13);
								
		C13 = new JLabel("Duck Rice                           40 B");
		C13.setFont(new Font("Tohama", Font.BOLD, 19));
		C13.setBounds(430,300,280,30);
		panel3.add(C13);
		
		//Box14
		A2 = new JLabel("and Boiled Eggs");
		A2.setFont(new Font("Tohama", Font.BOLD, 19));
		A2.setBounds(430,370,200,30);
		panel3.add(A2);
			
	    B14 = new JTextField(50);
	    B14.setText(null);
		B14.setEnabled(false);
	    B14.setFont(new Font("Tohama", Font.BOLD, 19));
		B14.setBounds(720,340,100,30);
		panel3.add(B14);
										
		C14 = new JLabel("Rice, Pork, Garlic              55 B");
		C14.setFont(new Font("Tohama", Font.BOLD, 19));
		C14.setBounds(430,340,280,30);
		panel3.add(C14);
		
        //Box15
	    B15 = new JTextField(50);
	    B15.setText(null);
		B15.setEnabled(false);
	    B15.setFont(new Font("Tohama", Font.BOLD, 19));
		B15.setBounds(720,410,100,30);
		panel3.add(B15);
										
		C15 = new JLabel("Boiled pig blood               50 B");
		C15.setFont(new Font("Tohama", Font.BOLD, 19));
		C15.setBounds(430,410,280,30);
		panel3.add(C15);
		
		//Box16
		A3 = new JLabel("with soy sauce");
		A3.setFont(new Font("Tohama", Font.BOLD, 19));
		A3.setBounds(430,440,200,30);
		panel3.add(A3);
				
	    B16 = new JTextField(50);
	    B16.setText(null);
		B16.setEnabled(false);
	    B16.setFont(new Font("Tohama", Font.BOLD, 19));
		B16.setBounds(720,480,100,30);
		panel3.add(B16);
										
		C16 = new JLabel("Stir fried pork                    55 B");
		C16.setFont(new Font("Tohama", Font.BOLD, 19));
		C16.setBounds(430,480,280,30);
		panel3.add(C16);
		
		//Box17
		A3 = new JLabel("Paste with Chili");
		A3.setFont(new Font("Tohama", Font.BOLD, 19));
		A3.setBounds(430,550,280,30);
		panel3.add(A3);
		
		B17 = new JTextField(50);
		B17.setText(null);
		B17.setEnabled(false);
		B17.setFont(new Font("Tohama", Font.BOLD, 19));
		B17.setBounds(720,520,100,30);
		panel3.add(B17);
											
		C17 = new JLabel("Chicken Chili                     60 B");
		C17.setFont(new Font("Tohama", Font.BOLD, 19));
		C17.setBounds(430,520,280,30);
		panel3.add(C17);
		
		//Box18
		B18 = new JTextField(50);
		B18.setText(null);
		B18.setEnabled(false);
		B18.setFont(new Font("Tohama", Font.BOLD, 19));
		B18.setBounds(290,510,100,30);
		panel3.add(B18);
											
		C18 = new JLabel("Sea oyster sauce         60 B");
		C18.setFont(new Font("Tohama", Font.BOLD, 19));
		C18.setBounds(20,510,280,30);
		panel3.add(C18);
		
		//Box19
		B19 = new JTextField(50);
		B19.setText(null);
		B19.setEnabled(false);
		B19.setFont(new Font("Tohama", Font.BOLD, 19));
		B19.setBounds(290,550,100,30);
		panel3.add(B19);
													
		C19 = new JLabel("Omelette topped           65 B");
		C19.setFont(new Font("Tohama", Font.BOLD, 19));
		C19.setBounds(20,550,280,30);
		panel3.add(C19);
	
		A5 = new JLabel();
		A5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		A5.setFont(new Font("Tohama", Font.BOLD, 19));
		A5.setBounds(420,180,410,465);
		panel3.add(A5);
	
		A6 = new JLabel();
		A6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		A6.setFont(new Font("Tohama", Font.BOLD, 19));
		A6.setBounds(10,180,400,465);
		panel3.add(A6);
		
		A7 = new JLabel();
		A7.setBorder(BorderFactory.createLineBorder(Color.RED));
		A7.setFont(new Font("Tohama", Font.BOLD, 19));
		A7.setBounds(10,40,820,130);
		panel3.add(A7);
		
		
		//RadioButton Control on/off
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 if(C1.isSelected()){
					 
					 total.setEnabled(true);	
					subtotal1.setEnabled(true);
					Exit.setEnabled(true);
					//report.setEnabled(true);	
						B.setText("         0");
						B2.setText("         0");
						B3.setText("         0");
						B4.setText("         0");
						B5.setText("         0");
						B6.setText("         0");
						B7.setText("         0");
						B8.setText("         0");
						B9.setText("         0");
						B10.setText("         0");
						B11.setText("         0");
						B12.setText("         0");
						B13.setText("         0");
						B14.setText("         0");
						B15.setText("         0");
						B16.setText("         0");
						B17.setText("         0");
						B18.setText("         0");
						B19.setText("         0");
					    M[0].setText("         0");
					    M[1].setText("         0");
					    M[2].setText("         0");
					    M[3].setText("         0");
					    M[4].setText("         0");
					    M[5].setText("         0");
					    M[6].setText("         0");
					    M[7].setText("         0");
					    M[8].setText("         0");
					    M[9].setText("         0");
					    M[10].setText("         0");
					    M[11].setText("         0");
					    M[12].setText("         0");
					    M[13].setText("         0");
					    M[14].setText("         0");
					    M[15].setText("         0");
					    M[16].setText("         0");
					    M[17].setText("         0");
					    M[18].setText("         0");
					    M[19].setText("         0");
					    M[20].setText("         0");
					    M[21].setText("         0");
					    M[22].setText("         0");
					    M[23].setText("         0");
					    M[24].setText("         0");
					    M[25].setText("         0");
					    M[26].setText("         0");
					    M[27].setText("         0");
					    M[28].setText("         0");
					    M[29].setText("         0");
					    M[30].setText("         0");
					    M[31].setText("         0");
					    M[32].setText("         0");
					    M[33].setText("         0");
					    M[34].setText("         0");
					    M[35].setText("         0");
					    M[36].setText("         0");
					    M[37].setText("         0");
					    
					B.setEnabled(true);
					B2.setEnabled(true);
					B3.setEnabled(true);
					B4.setEnabled(true);
					B5.setEnabled(true);
					B6.setEnabled(true);
					B7.setEnabled(true);
					B8.setEnabled(true);
					B9.setEnabled(true);
					B10.setEnabled(true);
					B11.setEnabled(true);
					B12.setEnabled(true);
					B13.setEnabled(true);
					B14.setEnabled(true);
					B15.setEnabled(true);
					B16.setEnabled(true);
					B17.setEnabled(true);
					B18.setEnabled(true);
					B19.setEnabled(true);
					M[0].setEnabled(true);
					M[1].setEnabled(true);
					M[2].setEnabled(true);
					M[3].setEnabled(true);
					M[4].setEnabled(true);
					M[5].setEnabled(true);
					M[6].setEnabled(true);
					M[7].setEnabled(true);
					M[8].setEnabled(true);
					M[9].setEnabled(true);
					M[10].setEnabled(true);
					M[11].setEnabled(true);
					M[12].setEnabled(true);
					M[13].setEnabled(true);
					M[14].setEnabled(true);
					M[15].setEnabled(true);
					M[16].setEnabled(true);
					M[17].setEnabled(true);
					M[18].setEnabled(true);
					M[19].setEnabled(true);
					M[20].setEnabled(true);
					M[21].setEnabled(true);
					M[22].setEnabled(true);
					M[23].setEnabled(true);
					M[24].setEnabled(true);
					M[25].setEnabled(true);
					M[26].setEnabled(true);
					M[27].setEnabled(true);
					M[28].setEnabled(true);
					M[29].setEnabled(true);
					M[30].setEnabled(true);
					M[31].setEnabled(true);
					M[32].setEnabled(true);
					M[33].setEnabled(true);
					M[34].setEnabled(true);
					M[35].setEnabled(true);
					M[36].setEnabled(true);
					M[37].setEnabled(true);
				}
				else if(!C1.isSelected()){
					
					total.setEnabled(false);
					subtotal1.setEnabled(false);
					Exit.setEnabled(false);
					Choose.setEnabled(false);
					comboBox.setEnabled(false);
					//report.setEnabled(false);
					B.setEnabled(false);
					B2.setEnabled(false);
					B3.setEnabled(false);
					B4.setEnabled(false);
					B5.setEnabled(false);
					B6.setEnabled(false);
					B7.setEnabled(false);
					B8.setEnabled(false);
					B9.setEnabled(false);
					B10.setEnabled(false);
					B11.setEnabled(false);
					B12.setEnabled(false);
					B13.setEnabled(false);
					B14.setEnabled(false);
					B15.setEnabled(false);
					B16.setEnabled(false);
					B17.setEnabled(false);
					B18.setEnabled(false);
					B19.setEnabled(false);
					M[0].setEnabled(false);
					M[1].setEnabled(false);
					M[2].setEnabled(false);
					M[3].setEnabled(false);
					M[4].setEnabled(false);
					M[5].setEnabled(false);
					M[6].setEnabled(false);
					M[7].setEnabled(false);
					M[8].setEnabled(false);
					M[9].setEnabled(false);
					M[10].setEnabled(false);
					M[11].setEnabled(false);
					M[12].setEnabled(false);
					M[13].setEnabled(false);
					M[14].setEnabled(false);
					M[15].setEnabled(false);
					M[16].setEnabled(false);
					M[17].setEnabled(false);
					M[18].setEnabled(false);
					M[19].setEnabled(false);
					M[20].setEnabled(false);
					M[21].setEnabled(false);
					M[22].setEnabled(false);
					M[23].setEnabled(false);
					M[24].setEnabled(false);
					M[25].setEnabled(false);
					M[26].setEnabled(false);
					M[27].setEnabled(false);
					M[28].setEnabled(false);
					M[29].setEnabled(false);
					M[30].setEnabled(false);
					M[31].setEnabled(false);
					M[32].setEnabled(false);
					M[33].setEnabled(false);
					M[34].setEnabled(false);
					M[35].setEnabled(false);
					M[36].setEnabled(false);
					M[37].setEnabled(false);
				}
			}
	
		});
			
	}
	
	public void itemTabPanel4()
	{
		panel4 = new JPanel();
		panel4.setLayout(null);;
		
		 ImageIcon image2 = new ImageIcon("C:/Users/User/Desktop/Lab/img/Seafood2.png");
	       JLabel imageLabel2 = new JLabel(image2); 
	       imageLabel2.setBounds(10,20,820,140);
	       imageLabel2.setVisible(true);
	       panel4.add(imageLabel2);	   
		
		M[0] = new JTextField(50);
	    M[0].setText(null);
	    M[0].setEnabled(false);
	    M[0].setFont(new Font("Tohama", Font.BOLD, 19));
	    M[0].setBounds(300,180,100,30); 	
	    panel4.add(M[0]);
	    
	    M2[0] = new JLabel("Crab Fried Rice                80 B");
	    M2[0].setFont(new Font("Tohama", Font.BOLD, 19));
	    M2[0].setBounds(20,180,280,30);
	    panel4.add(M2[0]);
	    	  	
	    	//Box2
	        M[1] = new JTextField(50);
	        M[1].setText(null);
	    	M[1].setEnabled(false);
	    	M[1].setFont(new Font("Tohama", Font.BOLD, 19));
	    	M[1].setBounds(300,220,100,30);
	    	panel4.add(M[1]);
	    	
	    	M2[1] = new JLabel("Crab Shells                     200 B");
	    	M2[1].setFont(new Font("Tohama", Font.BOLD, 19));
	    	M2[1].setBounds(20,220,280,30);
	    	panel4.add(M2[1]);
	    	
	    	//Box3    	
	    	M[2] = new JTextField(50);
	    	M[2].setText(null);
	    	M[2].setEnabled(false);
	    	M[2].setFont(new Font("Tohama", Font.BOLD, 19));
	    	M[2].setBounds(300,260,100,30);
	    	panel4.add(M[2]);
	    	
	    	M2[2] = new JLabel("Fried Crab                       300 B");
	    	M2[2].setFont(new Font("Tohama", Font.BOLD, 19));
	    	M2[2].setBounds(20,260,280,30);
	    	panel4.add(M2[2]);
	        
	    	JLabel AS = new JLabel("with Black Pepper");
	    	AS.setFont(new Font("Tohama", Font.BOLD, 19));
	    	AS.setBounds(20,290,280,30);
	    	panel4.add(AS);
	    	//Box4		
			M[3] = new JTextField(50);
			M[3].setText(null);
			M[3].setEnabled(false);
			M[3].setFont(new Font("Tohama", Font.BOLD, 19));
			M[3].setBounds(300,320,100,30);
			panel4.add(M[3]);
			
			M2[3] = new JLabel("Stir-fried crab                 180 B");
			M2[3].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[3].setBounds(20,320,280,30);
			panel4.add(M2[3]);
			
			JLabel LB = new JLabel("meat with paprika");
	    	LB.setFont(new Font("Tohama", Font.BOLD, 19));
	    	LB.setBounds(20,350,280,30);
	    	panel4.add(LB);
	    	
			//Box5
			M[4] = new JTextField(50);
			M[4].setText(null);
			M[4].setEnabled(false);
			M[4].setFont(new Font("Tohama", Font.BOLD, 19));
			M[4].setBounds(300,380,100,30);
			panel4.add(M[4]);
			
			M2[4] = new JLabel("Stir Fried Crab               300 B");
			M2[4].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[4].setBounds(20,380,280,30);
			panel4.add(M2[4]);
	    	
			JLabel LB1 = new JLabel("with Curry Powder");
	    	LB1.setFont(new Font("Tohama", Font.BOLD, 19));
	    	LB1.setBounds(20,410,280,30);
	    	panel4.add(LB1);
			
			//Box6
			M[5] = new JTextField(50);
			M[5].setText(null);
			M[5].setEnabled(false);
			M[5].setFont(new Font("Tohama", Font.BOLD, 19));
			M[5].setBounds(300,440,100,30);
			panel4.add(M[5]);
					
			M2[5] = new JLabel("Crab Meat Salad            210 B");
			M2[5].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[5].setBounds(20,440,280,30);
			panel4.add(M2[5]);
	        
			//Box7	
			M[6] = new JTextField(50);
			M[6].setText(null);
			M[6].setEnabled(false);
			M[6].setFont(new Font("Tohama", Font.BOLD, 19));
			M[6].setBounds(300,480,100,30);
			panel4.add(M[6]);
					
			M2[6] = new JLabel("Steamed Crab Oars      300 B");
			M2[6].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[6].setBounds(20,480,280,30);
			panel4.add(M2[6]);
			
			//Box8
			M[7] = new JTextField(50);
			M[7].setText(null);
			M[7].setEnabled(false);
			M[7].setFont(new Font("Tohama", Font.BOLD, 19));
			M[7].setBounds(300,520,100,30);
			panel4.add(M[7]);
					
			M2[7] = new JLabel("Steamed blue crab        500 B");
			M2[7].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[7].setBounds(20,520,280,30);
			panel4.add(M2[7]);
			
			//Box9
			M[8] = new JTextField(50);
			M[8].setText(null);
			M[8].setEnabled(false);
			M[8].setFont(new Font("Tohama", Font.BOLD, 19));
			M[8].setBounds(720,180,100,30);
			panel4.add(M[8]);
					
			M2[8] = new JLabel("Crab Vermicelli Salad    300 B");
			M2[8].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[8].setBounds(430,180,280,30);
			panel4.add(M2[8]);
		
			//Box10
			M[9] = new JTextField(50);
			M[9].setText(null);
			M[9].setEnabled(false);
			M[9].setFont(new Font("Tohama", Font.BOLD, 19));
			M[9].setBounds(720,220,100,30);
			panel4.add(M[9]);
					
			M2[9] = new JLabel("Scallop Salad                  300 B");
			M2[9].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[9].setBounds(430,220,280,30);
			panel4.add(M2[9]);
			
			//Box11
		    M2[10] = new JLabel("Baked Shrimp                 300 B");
			M2[10].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[10].setBounds(430,260,280,30);
			panel4.add(M2[10]);
			
			M[10] = new JTextField(50);
			M[10].setText(null);
			M[10].setEnabled(false);
			M[10].setFont(new Font("Tohama", Font.BOLD, 19));
			M[10].setBounds(720,260,100,30);
			panel4.add(M[10]);
					
			JLabel LB2 = new JLabel("with Curry Powder");
	    	LB2.setFont(new Font("Tohama", Font.BOLD, 19));
	    	LB2.setBounds(430,290,280,30);
	    	panel4.add(LB2);
			
			//Box12
			M[11] = new JTextField(50);
			M[11].setText(null);
			M[11].setEnabled(false);
			M[11].setFont(new Font("Tohama", Font.BOLD, 19));
			M[11].setBounds(720,330,100,30);
			panel4.add(M[11]);
							
			M2[11] = new JLabel("Stir Fried Lobster           400 B");
			M2[11].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[11].setBounds(430,330,280,30);
			panel4.add(M2[11]);
			
			JLabel LB3 = new JLabel("with Tamarind Sauce");
	    	LB3.setFont(new Font("Tohama", Font.BOLD, 19));
	    	LB3.setBounds(430,360,280,30);
	    	panel4.add(LB3);
			
			//Box13
			M[12] = new JTextField(50);
			M[12].setText(null);
			M[12].setEnabled(false);
			M[12].setFont(new Font("Tohama", Font.BOLD, 19));
			M[12].setBounds(720,400,100,30);
			panel4.add(M[12]);
									
			M2[12] = new JLabel("Grilled River Prawn        250 B");
			M2[12].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[12].setBounds(430,400,280,30);
			panel4.add(M2[12]);
			
			//Box14
			M2[13] = new JLabel("Crispy Fried Mussels    300 B");
			M2[13].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[13].setBounds(430,440,280,30);
			panel4.add(M2[13]);
				
		    M[13] = new JTextField(50);
		    M[13].setText(null);
			M[13].setEnabled(false);
		    M[13].setFont(new Font("Tohama", Font.BOLD, 19));
			M[13].setBounds(720,440,100,30);
			panel4.add(M[13]);
									
			JLabel LB4 = new JLabel("with Tamarind Sauce");
	    	LB4.setFont(new Font("Tohama", Font.BOLD, 19));
	    	LB4.setBounds(430,470,280,30);
	    	panel4.add(LB4);
			
	        //Box15
		    M[14] = new JTextField(50);
		    M[14].setText(null);
			M[14].setEnabled(false);
		    M[14].setFont(new Font("Tohama", Font.BOLD, 19));
			M[14].setBounds(720,510,100,30);
			panel4.add(M[14]);
											
			M2[14] = new JLabel("Seafood Tom Yum         400 B");
			M2[14].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[14].setBounds(430,510,280,30);
			panel4.add(M2[14]);
			
			
            JLabel LB5 = new JLabel("Hot Pot");
            LB5.setFont(new Font("Tohama", Font.BOLD, 19));
            LB5.setBounds(430,540,280,30);
            panel4.add(LB5);
			
			//Box16
			M2[15] = new JLabel("Stir Fried Prawns           400 B");
			M2[15].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[15].setBounds(20,560,280,30);
			panel4.add(M2[15]);
			
			JLabel LB6 = new JLabel("with Chili Paste");
            LB6.setFont(new Font("Tohama", Font.BOLD, 19));
            LB6.setBounds(20,590,280,30);
            panel4.add(LB6);
					
            JLabel LB7 = new JLabel("and Salted Eggs");
            LB7.setFont(new Font("Tohama", Font.BOLD, 19));
            LB7.setBounds(20,620,280,30);
            panel4.add(LB7);
            
		    M[15] = new JTextField(50);
		    M[15].setText(null);
			M[15].setEnabled(false);
		    M[15].setFont(new Font("Tohama", Font.BOLD, 19));
			M[15].setBounds(300,560,100,30);
			panel4.add(M[15]);
											
			//Box17
			M2[16] = new JLabel("Spicy Shrimp                  200 B");
			M2[16].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[16].setBounds(430,570,280,30);
			panel4.add(M2[16]);
			
			M[16] = new JTextField(50);
			M[16].setText(null);
			M[16].setEnabled(false);
			M[16].setFont(new Font("Tohama", Font.BOLD, 19));
			M[16].setBounds(720,570,100,30);
			panel4.add(M[16]);
			
			//Box18
			M[17] = new JTextField(50);
			M[17].setText(null);
			M[17].setEnabled(false);
			M[17].setFont(new Font("Tohama", Font.BOLD, 19));
			M[17].setBounds(720,610,100,30);
			panel4.add(M[17]);
												
			M2[17] = new JLabel("Somkoong                       150 B");
			M2[17].setFont(new Font("Tohama", Font.BOLD, 19));
			M2[17].setBounds(430,610,280,30);
			panel4.add(M2[17]);
			
			A5 = new JLabel();
			A5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			A5.setFont(new Font("Tohama", Font.BOLD, 19));
			A5.setBounds(420,170,410,480);
			panel4.add(A5);
		
			A6 = new JLabel();
			A6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			A6.setFont(new Font("Tohama", Font.BOLD, 19));
			A6.setBounds(10,170,400,480);
			panel4.add(A6);
			
			A7 = new JLabel();
			A7.setBorder(BorderFactory.createLineBorder(Color.RED));
			A7.setFont(new Font("Tohama", Font.BOLD, 19));
			A7.setBounds(10,20,820,140);
			panel4.add(A7);
			
	}
	
private void itemTabPanel6() {
		
		panel6 = new JPanel();
		panel6.setLayout(null);
		
		ImageIcon image2 = new ImageIcon("C:/Users/User/Desktop/Lab/img/LoghHeathy2.png");
	       JLabel imageLabel2 = new JLabel(image2); 
	       imageLabel2.setBounds(15,10,810,105);
	       imageLabel2.setVisible(true);
	       panel6.add(imageLabel2);	   
	       	       
	       A7 = new JLabel();
			A7.setBorder(BorderFactory.createLineBorder(Color.RED));
			A7.setFont(new Font("Tohama", Font.BOLD, 19));
			A7.setBounds(10,8,820,110);
			panel6.add(A7);
			
			A10 = new JLabel();
			A10.setBorder(BorderFactory.createLineBorder(Color.RED));
			A10.setFont(new Font("Tohama", Font.BOLD, 19));
			A10.setBounds(10,360,820,112);
			panel6.add(A10);
			
			//Healthy Drink
	    	C2 = new JLabel("Orange Juice                     50 B");
	    	C2.setFont(new Font("Tohama", Font.BOLD, 19));
	    	C2.setBounds(20,130,280,30);
	    	panel6.add(C2);
	    
	    	C = new JLabel("Lemon Juice                      50 B");
	    	C.setFont(new Font("Tohama", Font.BOLD, 19));
	    	C.setBounds(20,170,280,30);
	    	// Check Checkbox 1
	    	panel6.add(C);
	    	
	    	C3 = new JLabel("Chrysanthemum               50 B");
	    	C3.setFont(new Font("Tohama", Font.BOLD, 19));
	    	C3.setBounds(20,210,280,30);
	    	panel6.add(C3);
	    	
			C4 = new JLabel("Roselle juice                       50 B");
			C4.setFont(new Font("Tohama", Font.BOLD, 19));
			C4.setBounds(20,250,280,30);
			panel6.add(C4);
			
			C5 = new JLabel("Centella asiatica juice      50 B");
			C5.setFont(new Font("Tohama", Font.BOLD, 19));
			C5.setBounds(20,290,320,30);
			panel6.add(C5);
	    	
			C6 = new JLabel("Ginger juice                  40 B");
			C6.setFont(new Font("Tohama", Font.BOLD, 19));
			C6.setBounds(450,130,280,30);
			panel6.add(C6);
	        			 
			C7 = new JLabel("Pandan juice                50 B");
			C7.setFont(new Font("Tohama", Font.BOLD, 19));
			C7.setBounds(450,170,280,30);
			panel6.add(C7);
							
			C8 = new JLabel("Bael Fruit                      50 B");
			C8.setFont(new Font("Tohama", Font.BOLD, 19));
			C8.setBounds(450,210,280,30);
			panel6.add(C8);
			
			C9 = new JLabel("in Bael Fruit");
			C9.setFont(new Font("Tohama", Font.BOLD, 19));
			C9.setBounds(450,235,280,30);
			panel6.add(C9);
		
			C10 = new JLabel("Aloe vera juice             50 B");
			C10.setFont(new Font("Tohama", Font.BOLD, 19));
			C10.setBounds(450,275,280,30);
			panel6.add(C10);
					
			A = new JLabel("lemon grass water      50 B");
			A.setFont(new Font("Tohama", Font.BOLD, 19));
			A.setBounds(450,315,280,30);
			panel6.add(A);
			
			//JTextField Healthydrink
			
			
			M[18] = new JTextField(50);
			M[18].setText(null);
			M[18].setEnabled(false);
			M[18].setFont(new Font("Tohama", Font.BOLD, 19));
			M[18].setBounds(310,130,100,30);
			panel6.add(M[18]);
			
			M[19] = new JTextField(50);
			M[19].setText(null);
			M[19].setEnabled(false);
			M[19].setFont(new Font("Tohama", Font.BOLD, 19));
			M[19].setBounds(310,170,100,30);
			panel6.add(M[19]);
			
			M[20] = new JTextField(50);
			M[20].setText(null);
			M[20].setEnabled(false);
			M[20].setFont(new Font("Tohama", Font.BOLD, 19));
			M[20].setBounds(310,210,100,30);
			panel6.add(M[20]);
			
			M[21] = new JTextField(50);
			M[21].setText(null);
			M[21].setEnabled(false);
			M[21].setFont(new Font("Tohama", Font.BOLD, 19));
			M[21].setBounds(310,250,100,30);
			panel6.add(M[21]);
			
			M[22] = new JTextField(50);
			M[22].setText(null);
			M[22].setEnabled(false);
			M[22].setFont(new Font("Tohama", Font.BOLD, 19));
			M[22].setBounds(310,290,100,30);
			panel6.add(M[22]);
			
			M[23] = new JTextField(50);
			M[23].setText(null);
			M[23].setEnabled(false);
			M[23].setFont(new Font("Tohama", Font.BOLD, 19));
			M[23].setBounds(720,130,100,30);
			panel6.add(M[23]);
			
			M[24] = new JTextField(50);
			M[24].setText(null);
			M[24].setEnabled(false);
			M[24].setFont(new Font("Tohama", Font.BOLD, 19));
			M[24].setBounds(720,170,100,30);
			panel6.add(M[24]);
			
			M[25] = new JTextField(50);
			M[25].setText(null);
			M[25].setEnabled(false);
			M[25].setFont(new Font("Tohama", Font.BOLD, 19));
			M[25].setBounds(720,210,100,30);
			panel6.add(M[25]);
			
			M[26] = new JTextField(50);
			M[26].setText(null);
			M[26].setEnabled(false);
			M[26].setFont(new Font("Tohama", Font.BOLD, 19));
			M[26].setBounds(720,275,100,30);
			panel6.add(M[26]);
			
			M[27] = new JTextField(50);
			M[27].setText(null);
			M[27].setEnabled(false);
			M[27].setFont(new Font("Tohama", Font.BOLD, 19));
			M[27].setBounds(720,315,100,30);
			panel6.add(M[27]);
			
			A5 = new JLabel();
			A5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			A5.setFont(new Font("Tohama", Font.BOLD, 19));
			A5.setBounds(440,123,390,230);
			panel6.add(A5);
		
			A6 = new JLabel();
			A6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			A6.setFont(new Font("Tohama", Font.BOLD, 19));
			A6.setBounds(10,123,410,230);
			panel6.add(A6);
			
			//JText 2
			JLabel A51 = new JLabel();
			A51.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			A51.setFont(new Font("Tohama", Font.BOLD, 19));
			A51.setBounds(430,476,400,198);
			panel6.add(A51);
		
			JLabel A61 = new JLabel();
			A61.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			A61.setFont(new Font("Tohama", Font.BOLD, 19));
			A61.setBounds(10,476,410,198);
			panel6.add(A61);
					
			//Soft drink
			ImageIcon image = new ImageIcon("C:/Users/User/Desktop/Lab/img/SoftG2.png");
		       JLabel imageLabel = new JLabel(image); 
		       imageLabel.setBounds(15,360,810,110);
		       imageLabel.setVisible(true);
		       panel6.add(imageLabel);	   
		       	       
			C11 = new JLabel("Pepsi                                   25 B");
			C11.setFont(new Font("Tohama", Font.BOLD, 19));
			C11.setBounds(20,480,280,30);
			panel6.add(C11);
			
			C12 = new JLabel("Mandarin orange juice    50 B");
			C12.setFont(new Font("Tohama", Font.BOLD, 19));
			C12.setBounds(20,520,280,30);
			panel6.add(C12);
			
			C13 = new JLabel("Lemon Soda                      15 B");
			C13.setFont(new Font("Tohama", Font.BOLD, 19));
			C13.setBounds(20,560,280,30);
			panel6.add(C13);
			
			A2 = new JLabel("Water Sprite                       30 B");
			A2.setFont(new Font("Tohama", Font.BOLD, 19));
			A2.setBounds(20,600,280,30);
			panel6.add(A2);
				
			C14 = new JLabel("Sakura Lipton                    20 B");
			C14.setFont(new Font("Tohama", Font.BOLD, 19));
			C14.setBounds(20,640,280,30);
			panel6.add(C14);
			
			
			C15 = new JLabel("Water Sponsor                  20 B");
			C15.setFont(new Font("Tohama", Font.BOLD, 19));
			C15.setBounds(440,480,280,30);
			panel6.add(C15);
			
			A3 = new JLabel("Grape Fanta                       20 B");
			A3.setFont(new Font("Tohama", Font.BOLD, 19));
			A3.setBounds(440,520,280,30);
			panel6.add(A3);
							
			C16 = new JLabel("Red Water Fanta                20 B");
			C16.setFont(new Font("Tohama", Font.BOLD, 19));
			C16.setBounds(440,560,280,30);
			panel6.add(C16);
			
			A3 = new JLabel("Lemon juice Mix grape    25 B");
			A3.setFont(new Font("Tohama", Font.BOLD, 19));
			A3.setBounds(440,600,280,30);
			panel6.add(A3);
						
			C17 = new JLabel("Sparkling water                 30 B");
			C17.setFont(new Font("Tohama", Font.BOLD, 19));
			C17.setBounds(440,640,280,30);
			panel6.add(C17);
					

								
			M[28] = new JTextField(50);
			M[28].setText(null);
			M[28].setEnabled(false);
			M[28].setFont(new Font("Tohama", Font.BOLD, 19));
			M[28].setBounds(310,480,100,30);
			panel6.add(M[28]);
			
			M[29] = new JTextField(50);
			M[29].setText(null);
			M[29].setEnabled(false);
			M[29].setFont(new Font("Tohama", Font.BOLD, 19));
			M[29].setBounds(310,520,100,30);
			panel6.add(M[29]);
			
			M[30] = new JTextField(50);
			M[30].setText(null);
			M[30].setEnabled(false);
			M[30].setFont(new Font("Tohama", Font.BOLD, 19));
			M[30].setBounds(310,560,100,30);
			panel6.add(M[30]);
			
			M[31] = new JTextField(50);
			M[31].setText(null);
			M[31].setEnabled(false);
			M[31].setFont(new Font("Tohama", Font.BOLD, 19));
			M[31].setBounds(310,600,100,30);
			panel6.add(M[31]);
			
			M[32] = new JTextField(50);
			M[32].setText(null);
			M[32].setEnabled(false);
			M[32].setFont(new Font("Tohama", Font.BOLD, 19));
			M[32].setBounds(310,640,100,30);
			panel6.add(M[32]);
			
			M[33] = new JTextField(50);
			M[33].setText(null);
			M[33].setEnabled(false);
			M[33].setFont(new Font("Tohama", Font.BOLD, 19));
			M[33].setBounds(720,480,100,30);
			panel6.add(M[33]);
			
			M[34] = new JTextField(50);
			M[34].setText(null);
			M[34].setEnabled(false);
			M[34].setFont(new Font("Tohama", Font.BOLD, 19));
			M[34].setBounds(720,520,100,30);
			panel6.add(M[34]);
			
			M[35] = new JTextField(50);
			M[35].setText(null);
			M[35].setEnabled(false);
			M[35].setFont(new Font("Tohama", Font.BOLD, 19));
			M[35].setBounds(720,560,100,30);
			panel6.add(M[35]);
			
			M[36] = new JTextField(50);
			M[36].setText(null);
			M[36].setEnabled(false);
			M[36].setFont(new Font("Tohama", Font.BOLD, 19));
			M[36].setBounds(720,600,100,30);
			panel6.add(M[36]);
			
			M[37] = new JTextField(50);
			M[37].setText(null);
			M[37].setEnabled(false);
			M[37].setFont(new Font("Tohama", Font.BOLD, 19));
			M[37].setBounds(720,640,100,30);
			panel6.add(M[37]);
			
	}
	
	public static void main(String[] args){
		ScrollPane2 S = new ScrollPane2();
		S.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		S.setSize(1406,787);
		S.setVisible(true);	
		S.setLocation(302,200);
		S.setResizable(false);
		
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 int result = JOptionPane.showConfirmDialog(S,
				            "Do you want to Exit ?", "Exit Confirmation : ",
				            JOptionPane.YES_NO_OPTION);
				        if (result == JOptionPane.YES_OPTION)
				          S.setVisible(false);
				        else if (result == JOptionPane.NO_OPTION)
				          S.setVisible(true);
				      }
			
		});
		}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.RED);
		g.drawRect(35,45,867,730);
		g.setColor(Color.BLACK);
		g.drawRect(915, 45, 465, 730);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
