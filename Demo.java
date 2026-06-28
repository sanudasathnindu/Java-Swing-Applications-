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
		
		JButton bt1=new JButton("1");
		JButton bt2=new JButton("2");
		JButton bt3=new JButton("3");
		JButton bt4=new JButton("4");
		
		bt1.setFont(new Font("",1,30));
		bt2.setFont(new Font("",1,30));
		bt3.setFont(new Font("",1,30));
		bt4.setFont(new Font("",1,30));
		
		JPanel centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(2,2));
		centerPanel.add(bt1);
		centerPanel.add(bt2);
		centerPanel.add(bt3);
		centerPanel.add(bt4);
		
		btNorth.setFont(new Font("",1,30));
		btSouth.setFont(new Font("",1,30));
		btEast.setFont(new Font("",1,30));
		btWest.setFont(new Font("",1,30));
				
		f1.add("South",btSouth);
		f1.add("North",btNorth);
		f1.add("East",btEast);
		f1.add("West",btWest);
		f1.add(centerPanel);
		f1.pack();
		f1.setVisible(true);
	}
}

