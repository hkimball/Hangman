import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DrawHangman{
   public static void main (String[] args) {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 500);
      frame.setTitle("Hangman body");
      frame.setLayout(new BorderLayout());

      
      //JPanel hangmanBody = new JPanel(new BorderLayout());
      
      HangmanHead circle = new HangmanHead();
      circle.setBackground(Color.WHITE);
      //hangmanBody.add(circle, BorderLayout.CENTER);
      
      HangmanTorso vertLine = new HangmanTorso();
      vertLine.setBackground(Color.WHITE);
      //hangmanBody.add(vertLine, BorderLayout.CENTER);
      
      //frame.add(hangmanBody, BorderLayout.CENTER);
      
      HangmanHead body = new HangmanHead();
      body.setBackground(Color.WHITE);
      frame.add(body, BorderLayout.CENTER);
      
      frame.add((new JButton("alpha")), BorderLayout.NORTH);
      
      JButton testButton = new JButton("test");
      frame.add(testButton, BorderLayout.WEST);
      String copy = testButton.getText();
      System.out.print(copy);
      JButton newTestButton = new JButton(copy);
      frame.add(newTestButton, BorderLayout.EAST);

      

      
      frame.setVisible(true);
      
   }
}      