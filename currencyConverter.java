//here is where we import the Java utilities that we are going to use in our
//program.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Here is where we declare the class used within our program.
public class currencyConverter{
	JLabel label;
		JTextField jf;
//Here is where we create our frame, buttons and text field.
//Also the width of the text field.
public currencyConverter(){
	JFrame frame = new JFrame("Currency Converter");
	JButton first = new JButton("UK Sterling");
	JButton second = new JButton("US Dollar");
	JButton third = new JButton("Japanese Yen");
	jf = new JTextField(15);
//Here is where we create our panels.
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
//Here is where we add our buttons and text field to our panels.
	panel.add(first);
	panel.add(second);
	panel.add(third);
	panel1.add(jf);
//Here is where we add an action listeners to our buttons.
	first.addActionListener(new MyAction());
	second.addActionListener(new MyAction1());
	third.addActionListener(new MyAction2());
//Here we define our label and the text included.
	label = new JLabel("Enter amount in Euros");
		panel2.add(label);
//Here define the position within the frame of our panels.
	frame.add(panel, BorderLayout.NORTH);
	frame.add(panel2, BorderLayout.WEST);
	frame.add(panel1, BorderLayout.CENTER);
//Here we set the size of the Jframe, the function that enables the frame to appear
//on screen and the action once once the program is closed.
frame.setSize(340, 110);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
//Here our action listener is implemented along with the action once the UK
//Sterling button is pressed.
public class MyAction implements ActionListener{
	public void actionPerformed(ActionEvent e){
//Here is where we perform the calculation that converts our Euro into UK Sterling.
//This is the rate of exchange from the 25th of November 2014.
	String a1 = jf.getText();
	Double a2 = Double.parseDouble(a1);
	Double a3 = a2*0.794120;
	String a4 = Double.toString(a3);
//Here is where the result is returned in a dialog box.
		JOptionPane.showMessageDialog(null,"The UK Sterling value is: " + (a4));
	}
}
//Here our action listener is implemented along with the action once the US Dollar
//button is pressed.
public class MyAction1 implements ActionListener{
	public void actionPerformed(ActionEvent e){
//Here is where we perform the calculation that converts our Euro into US Dollar.
//This is the rate of exchange from the 25th of November 2014.
	String b1 = jf.getText();
	Double b2 = Double.parseDouble(b1);