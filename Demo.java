import javax.swing.*;
import java.awt.*;
class AddStudentForm  extends JFrame{
	private JTextField txtDisplay;
	private JButton btCancel;
	private JButton btAdd;
	AddStudentForm(){
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel titleLabel=new JLabel("Add Student Form");
		titleLabel.setFont(new Font("",1,27));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North",titleLabel);
		
		JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btAdd=new JButton("Add Student");
		btCancel=new JButton("Cancel");
		btAdd.setFont(new Font("",1,20));
		btCancel.setFont(new Font("",1,20));
		
		southPanel.add(btAdd);
		southPanel.add(btCancel);
		add("South",southPanel);
	}
}
class Demo{
	public static void main(String args[]){
		new AddStudentForm().setVisible(true);
	}
}







