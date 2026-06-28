import javax.swing.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	 //String->Title
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		try{Thread.sleep(3000);}catch(Exception ex){}
		f1.setVisible(true);
	}
}
//JFrame.DO_NOTHTNG_ON_CLOSE (Static Variables)->0
//JFrame.HIDE_ON_CLOSE (Static Variables) ->1
//JFrame.DISPOSE_ON_CLOSE (Static Variables)->2
//JFrame.EXIT_ON_CLOSE (Static Variables) ->3
