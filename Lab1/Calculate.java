// 2.2.5 Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
import javax.swing.JOptionPane;
public class Calculate {
    public static void main(String[] args){
        String strNum1, strNum2; // Khai báo 2 biến để nhập liệu
        double num1, num2; // Khai báo 2 biến lưu giá trị của 2 số nhập vào
        double sum, difference, product, quotient; // Khai báo các biến dùng để lưu kết quả
        
        // Hiển thị thông báo yêu cầu người dùng nhập dữ liệu và đọc dữ liệu cho vào 2 biến tạm.
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "In put the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "In put the second number", JOptionPane.INFORMATION_MESSAGE);
        
        // Chuyển đổi kiểu dữ liệu ( chuyển từ String sang double)
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        // Thực hiện tổng, hiệu, tích, thương
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;

        // Thông báo kết quả
        String strNotification = "Sum: "+ sum + ", difference: "+ difference + ", product: "+ product + ", quotient: "+ quotient;
        JOptionPane.showMessageDialog(null, strNotification, "Result", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0); // Kết thúc chương trình
    }
}