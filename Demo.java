import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JTextField txtDisplay=new JTextField();
		txtDisplay.setFont(new Font("",1,25));	
		f1.add("North",txtDisplay);
		
		JPanel buttonPanel=new JPanel(); 
		buttonPanel.setLayout(new GridLayout(4,4,3,3));
		JButton[] btArray=new JButton[16];
		String[] buttonText={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		for (int i = 0; i < 16; i++){
			btArray[i]=new JButton(buttonText[i]);
			btArray[i].setFont(new Font("",1,25));
			buttonPanel.add(buttonText[i],btArray[i]);
		}
		f1.add("Center",buttonPanel);
		f1.setVisible(true);
	}
}
