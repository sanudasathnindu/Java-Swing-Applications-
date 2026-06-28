//Adding controllers  (JButton, JTextField, JLabel….)
//============================================
//JButton
//======
import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton b1=new JButton();
		b1.setText("Hello");
		b1.setFont(new Font("",1,30));
		f1.add(b1);
		f1.setVisible(true);
	}
}
