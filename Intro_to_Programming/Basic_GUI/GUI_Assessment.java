//Semester 2 Assessment GUI **Brian Ryan K00202212**
//first you open shopping cart and then start shopping

//import statements
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.*;

//sports shop class`
class SportsShop extends JFrame
{
	//variables
   private JButton button;
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   private JButton button5;
   private JButton button6;
   private JButton button7;

   private JLabel label;
   private JLabel label1;
   private JLabel label2;
   private JLabel label3;
   private JLabel label4;
   private JLabel label5;
   private JLabel label6;
   private JLabel cartLabel;
   private JLabel cartLabel1;
   private JLabel cartLabel2;
   private JLabel cartLabel3;
   private JLabel cartLabel4;
   private JLabel cartLabel5;
   private JLabel cartLabel6;
   private JLabel cartLabel7;

   private JLabel labelPic;
   private JLabel labelPic1;
   private JLabel labelPic2;
   private JLabel labelPic3;
   private JLabel labelPic4;
   private JLabel labelPic5;

   //stock items
   private int num1 = 10;
   private int num2 = 10;
   private int num3 = 10;
   private int num4 = 10;
   private int num5 = 10;
   private int num6 = 10;

	//declaring Frame for cart
	JFrame J1 = new Cart();
	JPanel cartPanel = new JPanel();

   //sum of all goods
   private int total = 0;

   //no of items sold, counters
   private int click1 = 0;
   private int click2 = 0;
   private int click3 = 0;
   private int click4 = 0;
   private int click5 = 0;
   private int click6 = 0;

   //frame size
   private static final int FRAME_WIDTH = 800;
   private static final int FRAME_HEIGHT = 650;

	//constructor
   public SportsShop()
   {
      createComponents();
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }

	//create components in GUI
   private void createComponents()
   {
		//creating J panels
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();

		//creating buttons
		button = new JButton("Click here to View CART");
		button1 = new JButton("Add to CART for $80");
		button2 = new JButton("Add to CART for $80");
		button3 = new JButton("Add to CART for $40");
		button4 = new JButton("Add to CART for $40");
		button5 = new JButton("Add to CART for $65");
		button6 = new JButton("Add to CART for $65");
		button7 = new JButton("Click here to EXIT");

		//creating image icons
		ImageIcon myPic = new ImageIcon("redaddidas.jpg");
		ImageIcon myPic1 = new ImageIcon("greyaddidas.jpg");
		ImageIcon myPic2 = new ImageIcon("pinkshorts.jpg");
		ImageIcon myPic3 = new ImageIcon("blueshorts2.jpg");
		ImageIcon myPic4 = new ImageIcon("wtrain.jpg");
		ImageIcon myPic5 = new ImageIcon("black.jpg");

		//creating labels and assigning pic values to them
		labelPic = new JLabel(myPic);
		labelPic1 = new JLabel(myPic1);
		labelPic2 = new JLabel(myPic2);
		labelPic3 = new JLabel(myPic3);
		labelPic4 = new JLabel(myPic4);
		labelPic5 = new JLabel(myPic5);

		//creating JLabels
		label = new JLabel("Hello and Welcome to SportsStore.Com");
		label1 = new JLabel("Stock:" + num1);
		label2 = new JLabel("Stock:" + num2);
		label3 = new JLabel("Stock:" + num3);
		label4 = new JLabel("Stock:" + num4);
		label5 = new JLabel("Stock:" + num5);
		label6 = new JLabel("Stock:" + num6);

		//creating action listener
		ActionListener listener = new ClickListener();
		ActionListener listener1 = new ClickListener1();
		ActionListener listener2 = new ClickListener2();
		ActionListener listener3 = new ClickListener3();
		ActionListener listener4 = new ClickListener4();
		ActionListener listener5 = new ClickListener5();
		ActionListener listener6 = new ClickListener6();
		ActionListener listener7 = new ClickListener7();

		//adding panels and setting elements in panels
		panel.add(label);
		panel.setBackground(Color.YELLOW);
		add(panel,BorderLayout.NORTH);

		panel1.add(button);
		panel1.add(button7);
		button.addActionListener(listener);//adding listener to view cart button
		button7.addActionListener(listener1);//adding listener to EXIT button
		panel1.setBackground(Color.YELLOW);
		add(panel1,BorderLayout.SOUTH);
		add(panel2,BorderLayout.CENTER);

		panel2.setLayout(new GridLayout());
		panel3.setLayout(new GridLayout(2,1));
		panel4.setLayout(new GridLayout(2,1));
		panel5.setLayout(new GridLayout(2,1));

		panel7.setBackground(Color.BLUE);
		panel7.add(labelPic);
		panel7.add(button1);
		button1.addActionListener(listener2);
		panel7.add(label1);

		panel8.setBackground(Color.YELLOW);
		panel8.add(labelPic1);
		panel8.add(button2);
		button2.addActionListener(listener3);
		panel8.add(label2);

		panel9.setBackground(Color.YELLOW);
		panel9.add(labelPic2);
		panel9.add(button3);
		button3.addActionListener(listener4);
		panel9.add(label3);

		panel10.setBackground(Color.BLUE);
		panel10.add(labelPic3);
		panel10.add(button4);
		button4.addActionListener(listener5);
		panel10.add(label4);

		panel11.setBackground(Color.BLUE);
		panel11.add(labelPic4);
		panel11.add(button5);
		button5.addActionListener(listener6);
		panel11.add(label5);

		panel12.setBackground(Color.YELLOW);
		panel12.add(labelPic5);
		panel12.add(button6);
		button6.addActionListener(listener7);
		panel12.add(label6);

		panel2.add(panel3);
		panel2.add(panel4);
		panel2.add(panel5);

		panel3.add(panel7);
		panel3.add(panel8);

		panel4.add(panel9);
		panel4.add(panel10);

		panel5.add(panel11);
		panel5.add(panel12);

   }//end create components

	//listener that exits system
	class ClickListener1 implements ActionListener
	{
	   public void actionPerformed(ActionEvent event)
	   {
		   System.exit(0);
	   }
	}//end clicklistener1

	//listener for buy button
	class ClickListener2 implements ActionListener
	{
	   public void actionPerformed(ActionEvent event)
	   {
		num1 = num1-1;
		label1.setText("Stock:" + num1);
		click1 ++;
		cartLabel2.setText("Items bought" + click1);
		if (num1>=1)
		{
			total=total+80;
        }
        else if(num1==0)
        {
			label1.setText("Out of Stock");
		}
        else
        {
			label1.setText("Out of Stock");
		}
		cartLabel1.setText("Your total is $" + total);
		if (click1<10)
		{
			cartLabel2.setText(" Adidas Ladys Tracksuit x " + click1);
		}
		else
		{
			cartLabel2.setText(" Adidas Ladys Tracksuit x 10 ");
		}

	  }//close public void
	}//end clicklistener2

	//listener for buy button
	class ClickListener3 implements ActionListener
	{
	   public void actionPerformed(ActionEvent event)
	   {
		num2=num2-1;
		label2.setText("Stock:" + num2);
		click2 ++;
		cartLabel3.setText("Items bought" + click2);
		if (num2>=1)
		{
			total=total+80;
        }
        else if(num2==0)
        {
			label2.setText("Out of Stock");
		}
        else
        {
			label2.setText("Out of Stock");
		}
		cartLabel1.setText("Your total is $" + total);
		if (click2<10)
		{
			cartLabel3.setText(" Adidas Mens Tracksuit x " + click2);
		}
		else
		{
			cartLabel3.setText(" Adidas Mens Tracksuit x 10 ");
		}
	   }
	}//end clicklistener3

	//listener for buy button
	class ClickListener4 implements ActionListener
	{
	   public void actionPerformed(ActionEvent event)
	   {
		num3=num3-1;
		label3.setText("Stock:" + num3);
		click3 ++;
		cartLabel4.setText("Items bought" + click3);
		if (num3>=1)
		{
			total=total+40;
        }
        else if(num3==0)
        {
			label3.setText("Out of Stock");
		}
        else
        {
			label3.setText("Out of Stock");
		}
		cartLabel1.setText("Your total is $" + total);
		if (click3<10)
		{
			cartLabel4.setText(" Adidas Ladys Shorts x " + click3);
		}
		else
		{
			cartLabel4.setText(" Adidas Ladys Shorts x 10 ");
		}
	   }
	}//end clicklistener4

	//listener for buy button
	class ClickListener5 implements ActionListener
	{
	   public void actionPerformed(ActionEvent event)
	   {
		num4=num4-1;
		label4.setText("Stock:" + num4);
		click4 ++;
		cartLabel5.setText("Items bought" + click4);
		if (num4>=1)
		{
			total=total+40;
        }
        else if(num4==0)
        {
			label4.setText("Out of Stock");
		}
        else
        {
			label4.setText("Out of Stock");
		}
		cartLabel1.setText("Your total is $" + total);
		if (click4<10)
		{
			cartLabel5.setText(" Adidas Mens Shorts x " + click4);
		}
		else
		{
			cartLabel5.setText(" Adidas Mens Shorts x 10 ");
		}
	   }
	}//end clicklistener5

	//listener for buy button
	class ClickListener6 implements ActionListener
	{
	   public void actionPerformed(ActionEvent event)
	   {
		num5=num5-1;
		label5.setText("Stock:" + num5);
		click5 ++;
		cartLabel6.setText("Items bought" + click5);
		if (num5>=1)
		{
			total=total+65;
        }
        else if(num5==0)
        {
			label5.setText("Out of Stock");
		}
        else
        {
			label5.setText("Out of Stock");
		}
		cartLabel1.setText("Your total is $" + total);
		if (click5<10)
		{
			cartLabel6.setText(" Adidas Ladies Trainers x " + click5);
		}
		else
		{
			cartLabel6.setText(" Adidas Ladies Trainers x 10 ");
		}
	   }
	}//end clicklistener6

	//listener for buy button
	class ClickListener7 implements ActionListener
	{
	   public void actionPerformed(ActionEvent event)
	   {
		num6=num6-1;
		label6.setText("Stock:" + num6);
		click6 ++;
		cartLabel7.setText("Items bought" + click6);
		if (num6>=1)
		{
			total=total+65;
        }
       	else if(num4==0)
        {
			label6.setText("Out of Stock");
		}
        else
        {
			label6.setText("Out of Stock");
		}
		cartLabel1.setText("Your total is $" + total);
		if (click6<10)
		{
			cartLabel7.setText(" Adidas Mens Trainers x " + click6);
		}
		else
		{
			cartLabel7.setText(" Adidas Mens Trainers x 10 ");
		}
	   }
	}//end clicklistener7

	//create shopping cart frame
	class Cart extends JFrame
	{
		//variables for cart class
	   private static final int FRAME_WIDTH = 350;
	   private static final int FRAME_HEIGHT = 350;

		//constructor for cart class
		public Cart()
			{
			  createComponentsJ1();
			  setSize(FRAME_WIDTH, FRAME_HEIGHT);
			}

			private void createComponentsJ1()
			{
				cartPanel = new JPanel();
				cartLabel = new JLabel("Thanks for Shopping at SportsStore.Com");
				cartLabel1 = new JLabel();
				cartLabel2 = new JLabel();
				cartLabel3 = new JLabel();
				cartLabel4 = new JLabel();
				cartLabel5 = new JLabel();
				cartLabel6 = new JLabel();
				cartLabel7 = new JLabel();
			}
	}//end of Cart class

			//button to create cart window
		   class ClickListener implements ActionListener
		   {
		      public void actionPerformed(ActionEvent event)
		      {
				  J1 = new Cart();
				  J1.add(cartPanel);
				  cartPanel.add(cartLabel);
				  cartPanel.add(cartLabel1);
				  cartPanel.add(cartLabel2);
				  cartPanel.add(cartLabel3);
				  cartPanel.add(cartLabel4);
				  cartPanel.add(cartLabel5);
				  cartPanel.add(cartLabel6);
				  cartPanel.add(cartLabel7);
				  cartPanel.setBackground(Color.YELLOW);
				  J1.setResizable(false);
				  J1.setTitle("SportsStore.Com");
				  J1.setVisible(true);
		      }
	      }//end clicklistener
}//end of sport shop class

	//class to create and run sports shop jframe
   	public class Assesment
	{
  	 public static void main(String[] args)
  		{
	 		JFrame frame = new SportsShop();
	 		frame.setTitle("SportsStore.Com");
	 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		frame.setResizable(false);//Disable the Resize Button
			//frame.pack();
			frame.setVisible(true);

  		}//end of main method
	}//end of assesment class
