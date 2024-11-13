import javax.swing.JOptionPane;

public class TestApp {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("What's your age? "));
        JOptionPane.showMessageDialog(null, "Hello " + name + "! You are " + age + " years old!");
      
    }
}

/*

Line of Code 8 looks different than the 7th because the function showInputDialog only returns a String variable,
therefore we must convert the input into an Integer using "Integer.parseInt({the code}".

 */
