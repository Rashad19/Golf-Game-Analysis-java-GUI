import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;


public class MainFrame extends JFrame implements ActionListener{

  JComboBox<String> comboBox1;
  JComboBox<String> comboBox2;
  JButton submit;


  String[] days = {"Monday ", "Tuesday ", "Wednesday ", "Thursday ", "Friday ", "Saturday ", "Sunday "};


  public MainFrame(){

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setTitle("Progression Golf Stats");
    this.setSize(600,600);
    this.setLayout( new FlowLayout());
    this.getContentPane().setBackground( new Color(0xFFFFFF));

    String[] courses = {"Ras Al Hamra", "Ghala Golf Club", "Al Mouj Golf Club"};

    //build string array of dates within from current date
    // formatted as Today day month year or Yesterday day month year or day month year

    String[] dates = new String[7];




    LocalDate now = LocalDate.now();
    LocalDate yesterday = now.minusDays(1);
    LocalDate yesterday2 = now.minusDays(2);
    LocalDate yesterday3 = now.minusDays(3);
    LocalDate yesterday4 = now.minusDays(4);
    LocalDate yesterday5 = now.minusDays(5);
    LocalDate yesterday6 = now.minusDays(6);


    DayOfWeek today = now.getDayOfWeek();
    int day_num = today.getValue();
    dates[0] = days[day_num-1].concat(now.toString());

    DayOfWeek before = yesterday.getDayOfWeek();
    int day_num1 = before.getValue();
    dates[1] = days[day_num1-1].concat(yesterday.toString());


    DayOfWeek before1 = yesterday2.getDayOfWeek();
    int day_num2 = before1.getValue();
    dates[2] = days[day_num2-1].concat(yesterday2.toString());


    DayOfWeek before2 = yesterday3.getDayOfWeek();
    int day_num3 = before2.getValue();
    dates[3] = days[day_num3-1].concat(yesterday3.toString());


    DayOfWeek before3 = yesterday4.getDayOfWeek();
    int day_num4 = before3.getValue();
    dates[4] = days[day_num4-1].concat(yesterday4.toString());


    DayOfWeek before4 = yesterday5.getDayOfWeek();
    int day_num5 = before4.getValue();
    dates[5] = days[day_num5-1].concat(yesterday5.toString());


    DayOfWeek before5 = yesterday6.getDayOfWeek();
    int day_num6 = before5.getValue();
    dates[6] = days[day_num6-1].concat(yesterday6.toString());



    comboBox1 = new JComboBox<String>(courses);
    comboBox2 = new JComboBox<String>(dates);


    JPanel panel = new JPanel();

    JLabel label1 = new JLabel("Golf Course:");
    JLabel label2 = new JLabel("Date of Round:");

    panel.add(label1);
    panel.add(comboBox1);

    panel.add(label2);
    panel.add(comboBox2);

    panel.setLayout(new FlowLayout());





    this.add(panel);


    comboBox1.addActionListener(this);
    comboBox1.setSelectedIndex(0);

    comboBox2.addActionListener(this);
    comboBox2.setSelectedIndex(0);

    submit = new JButton("Go");

    submit.addActionListener(this);

    this.add(submit);



    this.setVisible(true);




  }

  public void actionPerformed(ActionEvent e) {

    if(e.getSource() == submit){
        this.dispose();
        new ScoreEntry(comboBox1.getSelectedItem().toString(), comboBox2.getSelectedItem().toString());
    }

//    else if(e.getSource() == comboBox1){
//      System.out.println(comboBox1.getSelectedItem());
//    }
//    else {
//      System.out.println(comboBox2.getSelectedItem());
//    }


  }


}
