import javax.swing.*;
import java.awt.*;

public class Frame {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Creates a frame
        frame.setVisible(true); // Set the frame to visible
        frame.setSize(300, 400); // Dimension of the frame (width, height)
        frame.setTitle("Frame"); // Title of the frame (Displays at the top)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits frame if close is clicked
        frame.setResizable(false); // Prevents the frame from being resized

        ImageIcon image = new ImageIcon("pradita_institute_logo.jpg"); // Creates Image Source
        frame.setIconImage(image.getImage()); // Set the Icon to your image
        frame.getContentPane().setBackground(new Color(0, 255, 0)); // Change color of Background

    }
}

/*

In order, to import an image, you must first download or have a PNG or JPG on your computer,
then you must Copy (CTRL + C) and paste it directly into your project directory on your IDE.

 */
