
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


public class register extends JFrame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final Container f = null;
	public static final int WINDOW_CLOSING = 0;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirmPassword;
	private JTextField txtN , txtL , txtC;
	private JTextField txtM;
	private JTextField txtEmail ;
	private JButton Cnl,btnDelete,gtof;
	MaskFormatter mask = null;
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				register f = new register();
				f.setSize(1400,787);
				f.setLocation(310, 150);
				f.setVisible(true);
				f.setResizable(false);
				f.setUndecorated(true);
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public register() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 100, 454, 343);
		setTitle("Register FoodKookSuol");
        
		
		ImageIcon image = new ImageIcon("C:/Users/User/Desktop/Lab/img/Iconfood2.png");
	       JLabel imageLabel = new JLabel(image); 
	       imageLabel.setBounds(570, 340, 790, 340);
	       imageLabel.setVisible(true);
	       getContentPane().add(imageLabel);
	       
		JTable table = new JTable(); 

		Object[] columns = {"First Name","Last Name","Username","Email","Password","Confirm Password","Mobile Phone","Country or Religion"};
		        DefaultTableModel model = new DefaultTableModel();
		        model.setColumnIdentifiers(columns);

		table.setModel(model);

		// Header Title
		JLabel hRs = new JLabel("Register ");
		hRs.setFont(new Font("Tahoma", Font.BOLD, 32));
		hRs.setHorizontalAlignment(SwingConstants.CENTER);
		hRs.setBounds(70, 25, 132, 20);
	    hRs.setSize(500,60);
		getContentPane().add(hRs);

		// *** Header ***//
		JLabel hN = new JLabel("First Name ");
		hN.setFont(new Font("Tahoma", Font.BOLD, 25));
		hN.setBounds(160, 35, 89, 14);
		hN.setSize(500,160);	
		getContentPane().add(hN);
		
		JLabel hL = new JLabel("Last Name  ");
		hL.setFont(new Font("Tahoma", Font.BOLD, 25));
		hL.setBounds(164, 85, 89, 14);
		hL.setSize(500,160);	
		getContentPane().add(hL);
				
		JLabel hUn = new JLabel("Username  ");
		hUn.setFont(new Font("Tahoma", Font.BOLD, 25));
		hUn.setBounds(170, 135, 89, 14);
		hUn.setSize(500,160);	
		getContentPane().add(hUn);
		
		JLabel hPs = new JLabel("Password  ");
		hPs.setFont(new Font("Tahoma", Font.BOLD, 25));
		hPs.setBounds(176, 185, 89, 14);
		hPs.setSize(500,160);	
		getContentPane().add(hPs);
		
		JLabel hCP = new JLabel("Confirm Password ");
		hCP.setFont(new Font("Tahoma", Font.BOLD, 25));
		hCP.setBounds(68, 235, 89, 14);
		hCP.setSize(500,160);	
		getContentPane().add(hCP);

		JLabel hE = new JLabel("Email  ");
		hE.setFont(new Font("Tahoma", Font.BOLD, 25));
		hE.setBounds(225, 285, 89, 14);
		hE.setSize(500,160);	
		getContentPane().add(hE);

		JLabel hP = new JLabel("Mobile Phone  ");
		hP.setFont(new Font("Tahoma", Font.BOLD, 25));
		hP.setBounds(125, 335, 89, 14);
		hP.setSize(500,160);	
		getContentPane().add(hP);
		
		JLabel hCt = new JLabel("Country or Religion  ");
		hCt.setFont(new Font("Tahoma", Font.BOLD, 25));
		hCt.setBounds(52, 385, 89, 14);
		hCt.setSize(500,160);	
		getContentPane().add(hCt);
		
		// First Name
		txtN = new JTextField("");
		txtN.setBounds(318, 105, 89, 14);
		txtN.setSize(180,32);
		getContentPane().add(txtN);

		// Last Name
	    txtL = new JTextField("");
		txtL.setBounds(318, 155, 89, 14);
		txtL.setSize(180,32);
		getContentPane().add(txtL);
				
		// CustomerID
		txtUsername = new JTextField("");
		txtUsername.setBounds(318, 205, 89, 14);
		txtUsername.setSize(180,32);
		getContentPane().add(txtUsername);
		
		// Password
		txtPassword = new JPasswordField();
		txtPassword.setBounds(318, 255, 89, 14);
		txtPassword.setSize(180,32);
		getContentPane().add(txtPassword);
		
		// Confirm Password
		txtConfirmPassword = new JPasswordField();
		txtConfirmPassword.setBounds(318, 305, 89, 14);
		txtConfirmPassword.setSize(180,32);
		getContentPane().add(txtConfirmPassword);

		// Email
		txtEmail = new JTextField("");
		txtEmail.setBounds(318, 355, 89, 14);
		txtEmail.setSize(180,32);
		getContentPane().add(txtEmail);
		
		
		// Mobile Phone
		txtM = new JTextField("");
		txtM.setBounds(318, 405, 89, 14);
		txtM.setSize(180,32);
		getContentPane().add(txtM);
		
		// Country and Religion
		txtC = new JTextField("");
		txtC.setBounds(318, 455, 89, 14);
		txtC.setSize(180,32);
		getContentPane().add(txtC);

		
		// Confirm Button
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Tohama", Font.BOLD, 20) );
		btnConfirm.setBounds(220, 530, 89, 14);
		btnConfirm.setSize(130,50);
		getContentPane().add(btnConfirm);
		
		table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("Tohama", Font.BOLD, 15);
        table.setFont(font);
        table.setRowHeight(40);
        
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(565, 27, 800, 275);

        getContentPane().add(pane);
        Object[] row = new Object[7];
		 

		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(RegisterData()) {
					JOptionPane.showMessageDialog(null,
							"Register Data Successfully");
					 row[0] = txtN.getText();
                     row[1] = txtL.getText();
                     row[2] = txtUsername.getText();
                     row[3] = txtEmail.getText();
                     row[4] = txtPassword.getPassword();		          
                     row[5] = txtM.getText();
                     row[6] = txtC.getText();
                     
                     // add row to the model
                     model.addRow(row);
                     
				}

			}
		});
		
		
		       // get selected row data From table to textfields 
		               table.addMouseListener(new MouseAdapter(){
		               
		               @Override
		               public void mouseClicked(MouseEvent e){
		                   
		                   // i = the index of the selected row
		                   int i = table.getSelectedRow();
		                   
		                   txtN.setText(model.getValueAt(i, 0).toString());
		                   txtL.setText(model.getValueAt(i, 1).toString());
		                   txtUsername.setText(model.getValueAt(i, 2).toString());
		                   txtEmail.setText(model.getValueAt(i, 3).toString());
		                   txtPassword.setText(model.getValueAt(i,4).toString());
		                   //txtConfirmPassword.setText(model.getValueAt(i,5).toString());
		                   txtM.setText(model.getValueAt(i, 6).toString());
		                   txtC.setText(model.getValueAt(i, 7).toString());
		               }
		               });
		       			               
		               
		Cnl = new JButton("Back");
		Cnl.setFont(new Font("Tohama", Font.BOLD, 20));
		Cnl.setBounds(378, 530, 89, 14);
	    Cnl.setSize(130,50);
		getContentPane().add(Cnl);
		Cnl.addActionListener(new ButtonListener());
				
		btnDelete = new JButton("Remove");
		btnDelete.setBounds(60, 530, 89, 14);
		btnDelete.setFont(new Font("Tohama", Font.BOLD, 20));
	    btnDelete.setSize(130,50);
		getContentPane().add(btnDelete);

		 btnDelete.addActionListener(new ActionListener(){

		            @Override
		            public void actionPerformed(ActionEvent e) {
		            
		                // i = the index of the selected row
		                int i = table.getSelectedRow();
		                if(i >= 0){
		                    // remove a row from jtable
		                    model.removeRow(i);
		                }
		                else{
		                    System.out.println("Delete Error");
		                }
		 }
		        });

		 JButton btnUpdate = new JButton("Update");   
		 btnUpdate.setBounds(220, 605, 89, 14);
		 btnUpdate.setFont(new Font("Tohama", Font.BOLD, 20));
		 btnUpdate.setSize(130,50);
		 getContentPane().add(btnUpdate);
		 
		 // button update row
	        btnUpdate.addActionListener(new ActionListener(){

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             
	                // i = the index of the selected row
	                int i = table.getSelectedRow();
	                
	                if(i >= 0) 
	                {
	                	row[0] = txtN.getText();
	                     row[1] = txtL.getText();
	                     row[2] = txtUsername.getText();
	                     row[3] = txtEmail.getText();
	                     row[4] = txtPassword.getPassword();		          
	                     row[5] = txtM.getText();
	                     row[6] = txtC.getText();
	                     
	                     // add row to the model
	                     model.addRow(row);
	                }
	                else{
	                    System.out.println("Update Error");
	                }
	            }
	        });
		 
		// order food
			gtof = new JButton("Go To Order Food");
			gtof.setFont(new Font("Tohama", Font.BOLD, 35));
			gtof.setBounds(788, 462, 89, 14);
			gtof.setSize(355,113);
			getContentPane().add(gtof);
			
			gtof.addActionListener(new ButtonListener());
			gtof.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(RegisterData()) {
						JOptionPane.showMessageDialog(null,
								"Register Data Successfully");
						
					}
				
				}
			});
	
			
	}

		
	private Boolean RegisterData()
	{	
		String strN = txtN.getText();
		int len2 = strN.length();
		String strL = txtL.getText();
		String strUsername = txtUsername.getText();
		String strPassword = new String(txtPassword.getPassword());
		int fn = strPassword.length();
		String strConfirmPassword = new String(txtConfirmPassword.getPassword());
		int fn2 = strConfirmPassword.length();
		String strEmail = txtEmail.getText();
		String strM = txtM.getText();
		int len = strM.length();
		
		String strC = txtC.getText();
		
		
		if(len2 <= 4) // First Name
		{
			JOptionPane.showMessageDialog(null,
					"Please Input (First Name)\n First Name must more than four number.");
			txtN.requestFocus(); 
			return false;
		}	
		
		if(strL.equals("")) // Last Name
		{
			JOptionPane.showMessageDialog(null,
					"Please Input (Last Name)");
			txtL.requestFocusInWindow(); 
			return false;
		}	
		
		if(strUsername.equals("")) // Username
		{
			JOptionPane.showMessageDialog(null,
					"Please Input (Username)");
			txtUsername.requestFocusInWindow(); 
			return false;
		}
		if(fn <= 4) // Password
		{
			JOptionPane.showMessageDialog(null,
					"Please Input Password \n Password must more than four number.");
			txtPassword.requestFocusInWindow(); 
			return false;
		}
		
		if(fn2 <= 4) // Confirm Password
		{
			JOptionPane.showMessageDialog(null,
					"Please Input (Confirm Password)\n Confirmpassword must equal to password.");
			txtConfirmPassword.requestFocusInWindow(); 
			return false;
		}
		if(!strPassword.equals(strConfirmPassword)) // Password math
		{
			JOptionPane.showMessageDialog(null,
					"Please Input (Password Not Match!)");
			txtPassword.requestFocusInWindow(); 
			return false;
		}		
		
		if(strEmail.equals("")) // Email
		{
			JOptionPane.showMessageDialog(null,
					"Please Input (Email)");
			txtEmail.requestFocusInWindow(); 
			return false;
		}	
		
		
		 if (len != 10) {
             JOptionPane.showMessageDialog(null, "Please You must put in only ten number.");
             txtM.requestFocusInWindow(); 
 			return false;
         }
		
		if(strC.equals("")) // Country and religion
		{
			JOptionPane.showMessageDialog(null,
					"Please Input (Country and Religion)");
			txtC.requestFocusInWindow(); 
			return false;
		}	
		
		
		return rootPaneCheckingEnabled;
	}
	
	
	
	public void paint(Graphics g){
	     super.paint(g);
	     g.setColor(Color.blue);
	     g.drawRect(45, 55, 500, 660); 
	     g.setColor(Color.black);
	     g.drawRect(50, 60, 490, 650); 
	     g.setColor(Color.red);
	     g.drawRect(565, 55, 805, 280); 
	     g.setColor(Color.red);
	     g.drawRect(565, 365, 805, 350); 
	     g.setColor(Color.black);
	     g.drawRect(570, 370, 795, 340); 
	    
	     
	}
	
	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if (e.getSource() == gtof == RegisterData())
			{
				ScrollPane2 S = new ScrollPane2();
				S.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				S.setSize(1406,787);
				S.setVisible(true);	
				S.setLocation(302,200);
				S.setResizable(false);
			
				
			}
	
			else if (e.getSource() == gtof != RegisterData())
			{
				ScrollPane2 S = new ScrollPane2();
				S.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				S.setSize(1406,740);
				S.setVisible(false);	
				S.setLocation(302,245);
				
			}
	}
}

	}
