import javax.swing.*;
import java.awt.*;

class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton btNorth=new JButton("North"); //setText(String)
		JButton btSouth=new JButton("South");
		JButton btEast=new JButton("East");
		JButton btWest=new JButton("West");
		JButton btCenter=new JButton("Center");
		btNorth.setFont(new Font("",1,30));
		btSouth.setFont(new Font("",1,30));
		btEast.setFont(new Font("",1,30));
		btWest.setFont(new Font("",1,30));
		btCenter.setFont(new Font("",1,30));
		
		f1.add("South",btSouth);
		f1.add("North",btNorth);
		f1.add("East",btEast);
		f1.add("West",btWest);
		f1.add("Center",btCenter);
		f1.pack();
		f1.setVisible(true);
	}
}






