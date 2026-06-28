import javax.swing.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	 //String->Title
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		//f1.setDefaultCloseOperation();
		f1.setVisible(true);
		try{Thread.sleep(3000);}catch(Exception ex){}
		f1.setVisible(true);
	}
}
