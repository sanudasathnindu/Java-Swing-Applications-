import javax.swing.*;
import java.awt.*;

class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("BorderLayout");	
		JFrame f2=new JFrame("FlowLayout");	
		f1.setSize(300,300);
		f2.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f2.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		f1.setLayout(new BorderLayout());//->Default BorderLayout
		f2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JTextField txtBorderLayout=new JTextField(5);
		JTextField txtFlowLayout=new JTextField(5);
		
		txtBorderLayout.setFont(new Font("",1,30));
		txtFlowLayout.setFont(new Font("",1,30));
		
		f1.add("North",txtBorderLayout);
		f1.add("South",new JButton("Test"));
		
		f2.add(txtFlowLayout);
		
		f1.setVisible(true);
		f2.setVisible(true);
	}
}
