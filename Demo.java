import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame{
	private JTextField txtDisplay;
	private JButton[] btArray;
	private String[] buttonText;
	
	Calculator(String title){
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		txtDisplay=new JTextField();
		txtDisplay.setFont(new Font("",1,25));	
		add("North",txtDisplay);
		JPanel buttonPanel=new JPanel(); 
		buttonPanel.setLayout(new GridLayout(4,4,3,3));
		btArray=new JButton[16];
		buttonText=new String[]{"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		for (int i = 0; i < 16; i++){
			btArray[i]=new JButton(buttonText[i]);
			btArray[i].setFont(new Font("",1,25));
			buttonPanel.add(buttonText[i],btArray[i]);
		}
		add("Center",buttonPanel);
	}
}
class Demo{
	public static void main(String args[]){
		Calculator c1=new Calculator("Calculator");
		c1.setVisible(true);
	}
}
