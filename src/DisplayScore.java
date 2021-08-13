import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DisplayScore extends JFrame implements ActionListener {

  JButton btn;

  DisplayScore(int score, String date, String course) {

    this.setTitle("Round Summary");

    this.setLayout(new GridLayout(14,1));

    this.setSize(800,800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.getContentPane().setBackground( new Color(0xFFFFFF));

    JPanel panel = new JPanel();
    panel.setLayout( new GridLayout(3,1));

    String message = "Round Played: ";

    message = message.concat(course);

    message = message.concat(" ");



    JLabel label_message = new JLabel(message.concat(date));



    String score_message = "Total Gross: ";

    JLabel score_label = new JLabel(score_message.concat(String.valueOf(score)));


    btn = new JButton("Go back to Homepage");
    btn.addActionListener(this);

    panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);


    panel.add(label_message);
    panel.add(score_label);
    panel.add(btn);



    this.add(panel);




    this.setVisible(true);

  }

  public void actionPerformed(ActionEvent e) {

    if(e.getSource() == btn) {
      this.dispose();
      new MainFrame();
    }

  }
}
