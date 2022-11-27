//Example 3: HelloNameDialog.java
import javax.swing.JOptionPane;
public class HelloNameDialog{
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog(" Cao Thanh Tung 0569 - Please enter your name");
		JOptionPane.showMessageDialog(null,"Toi la Cao Thanh Tung 0569. Hi "+ result + "!");
		System.exit(0);
	}
}