import javax.swing.*;

public class calcJOptionPane {
    public static void main(String[] args) {
        int num1, num2;
        String operator;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Введіть перше число:"));
        operator = JOptionPane.showInputDialog("Введіть дію (+,-,*,/): ");
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Введіть друге число:"));
        calc(num1,operator,num2);
    }
    public static void calc(int num1, String operator, int num2) {
        int res;
        switch (operator) {
            case "+":
                res = num1 + num2;
                JOptionPane.showMessageDialog(null, "Відповідь: " + res, "Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "-":
                res = num1 - num2;
                JOptionPane.showMessageDialog(null, "Відповідь: " + res, "Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "*":
                res = num1 * num2;
                JOptionPane.showMessageDialog(null, "Відповідь: " + res, "Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "/":
                if(num2 != 0) {
                    res = num1/2;
                    JOptionPane.showMessageDialog(null, "Відповідь: " + res, "Result", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            default:
                JOptionPane.showMessageDialog(null, "Error", "Result", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
