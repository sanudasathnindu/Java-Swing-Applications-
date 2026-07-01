import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame{
	private JButton btExit;
	private JTextField txtTitle;
	
	Calculator(String title){
		setTitle(title);
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		btExit=new JButton("Exit");
		btExit.setFont(new Font("",1,25));
		btExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("Exited...");
				System.exit(0);	//dispose();
			}
		});
		add(btExit);
		
		txtTitle=new JTextField(12);
		txtTitle.setFont(new Font("",1,25));
		txtTitle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				String title=txtTitle.getText();
				setTitle(title);
			}
		});
		add(txtTitle);
	}
} 
class Demo{
	public static void main(String args[]){
		Calculator c1=new Calculator("Calculator");
		c1.setVisible(true);
	}
}
