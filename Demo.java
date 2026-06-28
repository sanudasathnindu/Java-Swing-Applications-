import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame{
	Calculator(String title){
		
	}
} 
class Demo{
	public static void main(String args[]){
		Calculator c1=new Calculator("Calculator");
		c1.setSize(300,300);
		c1.setLocationRelativeTo(null);
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btNorth=new JButton("North");
		btNorth.setFont(new Font("",1,25));
		c1.add("North",btNorth);
		c1.setVisible(true);
	}
}
