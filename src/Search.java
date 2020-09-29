import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Search extends JFrame implements ActionListener  {
  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private static JButton Food,Drink,Seafood;
   private static JButton Member2;
   private static JButton Location;
   private JButton Soft;
   private JButton History;
   private static JButton Back,hide;
   JLabel imageLabel;
   public JLabel img;
   
 //New3
   private static String SHOW_ACTION = "show";
   private static String HIDE_ACTION = "hide";
   private static String NEXT_ACTION = "next";
   private static String NEXT3_ACTION = "Drink1";
   private static String NEXT4_ACTION = "Drink2";
   
   
   private Image image = null;
   private boolean showImage = false;
  
   public Search(String filename){
	   
	   getContentPane().setLayout(null);
	  //New3
       ImageIcon image = new ImageIcon("C:/Users/User/Desktop/Lab/img/Cookfood2.png");
       JLabel imageLabel = new JLabel(image); 
       imageLabel.setBounds(290, 31, 1425, 170);
       imageLabel.setVisible(true);
       getContentPane().add(imageLabel);	   
	   
	   Food = new JButton("Food");
	   Food.setFont(new Font("Tohama", Font.BOLD, 22));
	   Food.addActionListener(this);
       Food.setActionCommand(SHOW_ACTION);
	   Food.setBounds(120, 19, 95, 30);
	   Food.setSize(170,80);
		getContentPane().add(Food);
			
		Seafood = new JButton("Seafood");
		Seafood.setFont(new Font("Tohama", Font.BOLD, 22));
		Seafood.addActionListener(this);
        Seafood.setActionCommand(NEXT_ACTION);	
	    Seafood.setBounds(120, 99, 95, 30);
	    Seafood.setSize(170,80);
		getContentPane().add(Seafood);
				
		Drink = new JButton("HealthyDrink");
		Drink.setFont(new Font("Tohama", Font.BOLD, 22));
		Drink.addActionListener(this);
        Drink.setActionCommand(NEXT3_ACTION);	
		Drink.setBounds(120, 179, 95, 30);
	    Drink.setSize(170,80);
		getContentPane().add(Drink);
		
		Soft = new JButton("SoftDrink");
		Soft.setFont(new Font("Tohama", Font.BOLD, 22));
		Soft.addActionListener(this);
        Soft.setActionCommand(NEXT4_ACTION);	
		Soft.setBounds(120, 259, 95, 30);
	    Soft.setSize(170,80);
		getContentPane().add(Soft);
		
		
		hide = new JButton("Hide");
		hide.setFont(new Font("Tohama", Font.BOLD, 22));
		hide.addActionListener(this);
        hide.setActionCommand(HIDE_ACTION);
		hide.setBounds(120, 339, 95, 30);
        hide.setSize(170,80);
		getContentPane().add(hide);

		Member2 = new JButton("Member");
		Member2.setFont(new Font("Tohama", Font.BOLD, 22));
		Member2.setBounds(120, 419, 95, 30);
	    Member2.setSize(170,80);
		getContentPane().add(Member2);
		
		
	  Seafood.addActionListener(new ButtonListener());
	  Member2.addActionListener(new ButtonListener());
	  Soft.addActionListener(new ButtonListener());
	  hide.addActionListener(new ButtonListener());
	 
   }
		
 
public void paint(Graphics g){
     super.paint(g);
     g.setColor(Color.blue);
     g.drawRect(120, 48, 1600, 933); 
     g.setColor(Color.red);
     g.drawRect(300, 57, 1410, 915); 

     //New3
     if (showImage) {
         g.drawImage(image, 305, 230, image.getWidth(null), image.getHeight(null), null);
     }
     
   }

public void actionPerformed(ActionEvent event) {
    String actionCommand = event.getActionCommand();
    
    
   if (SHOW_ACTION.equals(actionCommand)) {
    	 this.image = new ImageIcon("C:/Users/User/Desktop/Lab/img/FoodKookSoul3.png").getImage();
        showImage = true;
    }
   
   if (NEXT_ACTION.equals(actionCommand)) {
	  	 this.image = new ImageIcon("C:/Users/User/Desktop/Lab/img/Menu3.png").getImage();
	      showImage = true;
	  }
   
    if (NEXT3_ACTION.equals(actionCommand)) {
	  	 this.image = new ImageIcon("C:/Users/User/Desktop/Lab/img/HealthyD23.png").getImage();
	      showImage = true;
	  }

    if (NEXT4_ACTION.equals(actionCommand)) {
	  	 this.image = new ImageIcon("C:/Users/User/Desktop/Lab/img/SDK2.png").getImage();
	      showImage = true;
	  }
    
    else if (HIDE_ACTION.equals(actionCommand)) {
    	 showImage = false;
    }
   
    repaint();
}
//New3


   public static void main(String[] args){
	  
		  
	   Search window = new Search("Search");
	   window.setTitle("FoodKookSoul");
	   window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   window.setSize(1920,1000);
	   window.setVisible(true);
	   window.setLocationRelativeTo(null);
	   window.setResizable(false);
	           
   }

	
   public static class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == Member2)
			{
				register f = new register();
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setSize(1406,787);
				f.setVisible(true);
				f.setResizable(false);
				f.setLocation(302, 200);
			    	 
			}	
			
			
		}

		
   }
   
	   }
   
   

