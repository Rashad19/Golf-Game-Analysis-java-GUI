import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DisplayScore extends JFrame implements ActionListener {

  JButton btn;

  DisplayScore(int score, int front, int back, double percentage_fw_hit, double percentage_fw_miss_right, double percentage_fw_miss_left, double percentage_gir_hit, double percentage_gir_miss_left, double percentage_gir_miss_right, double percentage_gir_miss_long, double percentage_gir_miss_short, int putts, String date, String course) {

    this.setTitle("Round Summary");

    this.setLayout(new GridLayout(14,1));

    this.setSize(800,800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.getContentPane().setBackground( new Color(0xFFFFFF));

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();
    JPanel panel11 = new JPanel();
    JPanel panel12 = new JPanel();
    JPanel panel13 = new JPanel();
    JPanel panel14 = new JPanel();
//    panel.setLayout( new GridLayout(4,1));

    String message = "Round Played: ";

    message = message.concat(course);

    message = message.concat(" ");



    JLabel label_message = new JLabel(message.concat(date));



    String score_message = "Total Gross: ";

    String front_score_message = "Front Nine: ";

    String back_score_message = "Back Nine: ";

    String putts_message = "Total Putts: ";

    String percent_fw_hit = "FWs hit: ";


    String percent_fw_miss_right = "FWs missed right: ";


    String percent_fw_miss_left = "FWs missed left: ";

    String percent_gir_hit = "Greens hit: ";


    String percent_gir_miss_right = "Greens missed right: ";

    String percent_gir_miss_left = "Greens missed left: ";

    String percent_gir_miss_long = "Greens missed long: ";

    String percent_gir_miss_short = "Greens missed short: ";

    JLabel score_label = new JLabel(score_message.concat(String.valueOf(score)));

    JLabel front_score_label = new JLabel(front_score_message.concat(String.valueOf(front)));

    JLabel back_score_label = new JLabel(back_score_message.concat(String.valueOf(back)));

    JLabel fw_hit_label = new JLabel(percent_fw_hit.concat(String.valueOf(Math.round(percentage_fw_hit)).concat("%")));

    JLabel fw_miss_right_label = new JLabel(percent_fw_miss_right.concat(String.valueOf(Math.round(percentage_fw_miss_right)).concat("%")));

    JLabel fw_miss_left_label = new JLabel(percent_fw_miss_left.concat(String.valueOf(Math.round(percentage_fw_miss_left)).concat("%")));


    JLabel gir_hit_label = new JLabel(percent_gir_hit.concat(String.valueOf(Math.round(percentage_gir_hit)).concat("%")));

    JLabel gir_miss_right_label = new JLabel(percent_gir_miss_right.concat(String.valueOf(Math.round(percentage_gir_miss_right)).concat("%")));

    JLabel gir_miss_left_label = new JLabel(percent_gir_miss_left.concat(String.valueOf(Math.round(percentage_gir_miss_left)).concat("%")));

    JLabel gir_miss_long_label = new JLabel(percent_gir_miss_long.concat(String.valueOf(Math.round(percentage_gir_miss_long)).concat("%")));

    JLabel gir_miss_short_label = new JLabel(percent_gir_miss_short.concat(String.valueOf(Math.round(percentage_gir_miss_short)).concat("%")));


    JLabel putts_label = new JLabel(putts_message.concat(String.valueOf(putts)));




    btn = new JButton("Go back to Homepage");
    btn.addActionListener(this);



    panel1.add(label_message);
    panel2.add(score_label);
    panel5.add(front_score_label);
    panel6.add(back_score_label);
    panel7.add(fw_hit_label);
    panel8.add(fw_miss_left_label);
    panel9.add(fw_miss_right_label);
    panel10.add(gir_hit_label);
    panel11.add(gir_miss_right_label);
    panel12.add(gir_miss_left_label);
    panel13.add(gir_miss_long_label);
    panel14.add(gir_miss_short_label);
    panel3.add(putts_label);
    panel4.add(btn);




    this.add(panel1);
    this.add(panel2);
    this.add(panel5);
    this.add(panel6);
    this.add(panel7);
    this.add(panel8);
    this.add(panel9);
    this.add(panel10);
    this.add(panel11);
    this.add(panel12);
    this.add(panel13);
    this.add(panel14);
    this.add(panel3);
    this.add(panel4);




    this.setVisible(true);

  }

  public void actionPerformed(ActionEvent e) {

    if(e.getSource() == btn) {
      this.dispose();
      new MainFrame();
    }

  }
}
