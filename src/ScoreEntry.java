import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
This Class should dynamically create the Score Entry Boxes of the golf club
including stats to record such as Fairways hit and if missed which direction
Distance of Approach to the green, the proximity to the Hole with the Putts,
whether or not I scrambled, etc...
 */

public class ScoreEntry extends JFrame implements ActionListener {

  JButton btn;

  JButton goBack;

  JSpinner spinner1;
  JSpinner spinner2;
  JSpinner spinner3;
  JSpinner spinner4;
  JSpinner spinner5;
  JSpinner spinner6;
  JSpinner spinner7;
  JSpinner spinner8;
  JSpinner spinner9;
  JSpinner spinner10;
  JSpinner spinner11;
  JSpinner spinner12;
  JSpinner spinner13;
  JSpinner spinner14;
  JSpinner spinner15;
  JSpinner spinner16;
  JSpinner spinner17;
  JSpinner spinner18;


  JSpinner number_putts1;
  JSpinner number_putts2;
  JSpinner number_putts3;
  JSpinner number_putts4;
  JSpinner number_putts5;
  JSpinner number_putts6;
  JSpinner number_putts7;
  JSpinner number_putts8;
  JSpinner number_putts9;
  JSpinner number_putts10;
  JSpinner number_putts11;
  JSpinner number_putts12;
  JSpinner number_putts13;
  JSpinner number_putts14;
  JSpinner number_putts15;
  JSpinner number_putts16;
  JSpinner number_putts17;
  JSpinner number_putts18;

  JComboBox fw_box1;
  JComboBox fw_box2;
  JComboBox fw_box3;
  JComboBox fw_box4;
  JComboBox fw_box5;
  JComboBox fw_box6;
  JComboBox fw_box7;
  JComboBox fw_box8;
  JComboBox fw_box9;
  JComboBox fw_box10;
  JComboBox fw_box11;
  JComboBox fw_box12;
  JComboBox fw_box13;
  JComboBox fw_box14;
  JComboBox fw_box15;
  JComboBox fw_box16;
  JComboBox fw_box17;
  JComboBox fw_box18;

  JComboBox gir_box1;
  JComboBox gir_box2;
  JComboBox gir_box3;
  JComboBox gir_box4;
  JComboBox gir_box5;
  JComboBox gir_box6;
  JComboBox gir_box7;
  JComboBox gir_box8;
  JComboBox gir_box9;
  JComboBox gir_box10;
  JComboBox gir_box11;
  JComboBox gir_box12;
  JComboBox gir_box13;
  JComboBox gir_box14;
  JComboBox gir_box15;
  JComboBox gir_box16;
  JComboBox gir_box17;
  JComboBox gir_box18;










  int totalScore = 0;
  String date;

  String course;

  ScoreEntry(String course, String date){



    int par1 = 0;
    int par2 = 0;
    int par3 = 0;
    int par4 = 0;
    int par5 = 0;
    int par6 = 0;
    int par7 = 0;
    int par8 = 0;
    int par9 = 0;
    int par10 = 0;
    int par11 = 0;
    int par12 = 0;
    int par13 = 0;
    int par14 = 0;
    int par15 = 0;
    int par16 = 0;
    int par17 = 0;
    int par18 = 0;


    this.date = date;

    this.course = course;








    this.setTitle("Score & Stats Entry");

    this.setLayout(new GridLayout(14,1));

    this.setSize(800,800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.getContentPane().setBackground( new Color(0xFFFFFF));

    JLabel fw_label = new JLabel("FW:", SwingConstants.CENTER);

    JLabel gir_label = new JLabel("GIR:", SwingConstants.CENTER);

    JLabel fw_label1 = new JLabel("FW:", SwingConstants.CENTER);

    JLabel gir_label1 = new JLabel("GIR:", SwingConstants.CENTER);

    JPanel panel_fw_hit = new JPanel();

    panel_fw_hit.setLayout( new GridLayout(1,10));

    panel_fw_hit.add(fw_label);

    JPanel panel_fw_hit1 = new JPanel();

    panel_fw_hit1.setLayout( new GridLayout(1,10));

    panel_fw_hit1.add(fw_label1);

    JPanel panel_gir_hit = new JPanel();

    panel_gir_hit.setLayout( new GridLayout(1,10));

    panel_gir_hit.add(gir_label);

    JPanel panel_gir_hit1 = new JPanel();

    panel_gir_hit1.setLayout( new GridLayout(1,10));

    panel_gir_hit1.add(gir_label1);


    JPanel panel_date_declar = new JPanel();

    String label = "Enter your Score for: ";

    label = label.concat(course);

    label = label.concat(" ");

    JLabel label_date = new JLabel(label.concat(date));

    panel_date_declar.add(label_date);

    btn = new JButton("Submit");
    JPanel button_panel = new JPanel();
    button_panel.add(btn);

    btn.addActionListener(this);

    goBack = new JButton("Go back to Homepage");
    button_panel.add(goBack);

    goBack.addActionListener(this);



    JPanel panel_hole_num1 = new JPanel();
    panel_hole_num1.setLayout( new GridLayout(1,10));

    JPanel panel_hole = new JPanel();
    panel_hole.setLayout( new GridLayout(1,10));

    JPanel panel_score_entry = new JPanel();
    panel_score_entry.setLayout(new GridLayout(1,10));

    JPanel panel_score_entry1 = new JPanel();
    panel_score_entry1.setLayout(new GridLayout(1,10));


    JLabel label_hole = new JLabel("Front Nine:", SwingConstants.CENTER);
    JLabel label_score = new JLabel("Score:",SwingConstants.CENTER);

    JLabel label1 = new JLabel("1",SwingConstants.CENTER);



    JLabel label2 = new JLabel("2", SwingConstants.CENTER);


    JLabel label3 = new JLabel("3",SwingConstants.CENTER);



    JLabel label4 = new JLabel("4",SwingConstants.CENTER);



    JLabel label5 = new JLabel("5",SwingConstants.CENTER);



    JLabel label6 = new JLabel("6",SwingConstants.CENTER);



    JLabel label7 = new JLabel("7",SwingConstants.CENTER);



    JLabel label8 = new JLabel("8",SwingConstants.CENTER);



    JLabel label9 = new JLabel("9",SwingConstants.CENTER);


    JLabel label_hole1 = new JLabel("Back Nine:", SwingConstants.CENTER);
    JLabel label10 = new JLabel("10", SwingConstants.CENTER);
    JLabel label11 = new JLabel("11", SwingConstants.CENTER);
    JLabel label12 = new JLabel("12", SwingConstants.CENTER);
    JLabel label13 = new JLabel("13", SwingConstants.CENTER);
    JLabel label14 = new JLabel("14", SwingConstants.CENTER);
    JLabel label15 = new JLabel("15", SwingConstants.CENTER);
    JLabel label16 = new JLabel("16", SwingConstants.CENTER);
    JLabel label17 = new JLabel("17", SwingConstants.CENTER);
    JLabel label18 = new JLabel("18", SwingConstants.CENTER);



    panel_hole_num1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    panel_hole_num1.add(label_hole);
    panel_hole_num1.add(label1);
    panel_hole_num1.add(label2);
    panel_hole_num1.add(label3);
    panel_hole_num1.add(label4);
    panel_hole_num1.add(label5);
    panel_hole_num1.add(label6);
    panel_hole_num1.add(label7);
    panel_hole_num1.add(label8);
    panel_hole_num1.add(label9);





    if(course.equals("Ras Al Hamra")){

      par1 = 5;

      par2 = 3;

      par3 = 4;

      par4 = 3;


      par5 = 4;

      par6 = 5;

      par7 = 3;

      par8 = 4;

      par9 = 4;


      par10 = 5;


      par11 = 3;


      par12 = 4;


      par13 = 3;


      par14 = 4;


      par15 = 5;

      par16 = 3;

      par17 = 4;

      par18 = 5;

    }
    else if(course.equals("Ghala Golf Club")){

      par1 = 4;

      par2 = 3;

      par3 = 5;

      par4 = 5;

      par5 = 3;

      par6 = 4;


      par7 = 4;

      par8 = 4;


      par9 = 4;


      par10 = 4;


      par11 = 4;


      par12 = 3;


      par13 = 5;


      par14 = 4;


      par15 = 3;


      par16 = 5;


      par17 = 4;


      par18 = 4;

    }
    else{

      par1 = 4;


      par2 = 4;


      par3 = 5;


      par4 = 4;


      par5 = 3;


      par6 = 4;


      par7 = 5;


      par8 = 3;


      par9 = 4;


      par10 = 4;


      par11 = 3;

      par12 = 5;

      par13 = 3;

      par14 = 4;


      par15 = 4;


      par16 = 5;

      par17 = 4;

      par18 = 4;

    }









    JLabel label_score1 = new JLabel("Score:", SwingConstants.CENTER);
    SpinnerModel model1 = new SpinnerNumberModel(par1,1,14,1);
    spinner1 = new JSpinner(model1);

    SpinnerModel model2 = new SpinnerNumberModel(par2,1,14,1);
    spinner2 = new JSpinner(model2);

    SpinnerModel model3 = new SpinnerNumberModel(par3,1,14,1);
    spinner3 = new JSpinner(model3);

    SpinnerModel model4 = new SpinnerNumberModel(par4,1,14,1);
    spinner4 = new JSpinner(model4);

    SpinnerModel model5 = new SpinnerNumberModel(par5,1,14,1);
    spinner5 = new JSpinner(model5);

    SpinnerModel model6 = new SpinnerNumberModel(par6,1,14,1);
    spinner6 = new JSpinner(model6);

    SpinnerModel model7 = new SpinnerNumberModel(par7,1,14,1);
    spinner7 = new JSpinner(model7);

    SpinnerModel model8 = new SpinnerNumberModel(par8,1,14,1);
    spinner8 = new JSpinner(model8);

    SpinnerModel model9 = new SpinnerNumberModel(par9,1,14,1);
    spinner9 = new JSpinner(model9);

    SpinnerModel model10 = new SpinnerNumberModel(par10,1,14,1);
    spinner10 = new JSpinner(model10);

    SpinnerModel model11 = new SpinnerNumberModel(par11,1,14,1);
    spinner11 = new JSpinner(model11);

    SpinnerModel model12 = new SpinnerNumberModel(par12,1,14,1);
    spinner12 = new JSpinner(model12);

    SpinnerModel model13 = new SpinnerNumberModel(par13,1,14,1);
    spinner13 = new JSpinner(model13);

    SpinnerModel model14 = new SpinnerNumberModel(par14,1,14,1);
    spinner14 = new JSpinner(model14);

    SpinnerModel model15 = new SpinnerNumberModel(par15,1,14,1);
    spinner15 = new JSpinner(model15);

    SpinnerModel model16 = new SpinnerNumberModel(par16,1,14,1);
    spinner16 = new JSpinner(model16);

    SpinnerModel model17 = new SpinnerNumberModel(par17,1,14,1);
    spinner17 = new JSpinner(model17);

    SpinnerModel model18 = new SpinnerNumberModel(par18,1,14,1);
    spinner18 = new JSpinner(model18);


    panel_fw_hit.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    String[] fw_options_array = {"hit","miss right","miss left"};

    String[] fw_par3 = {"-"};



    if(par1 >= 4) {

      fw_box1 = new JComboBox<String>(fw_options_array);

      panel_fw_hit.add(fw_box1);

    }
    else{

      fw_box1 = new JComboBox<String>(fw_par3);

      panel_fw_hit.add(fw_box1);

    }

    if(par2 >= 4){

      fw_box2 = new JComboBox<String>(fw_options_array);

      panel_fw_hit.add(fw_box2);

    }
    else{

      fw_box2 = new JComboBox<String>(fw_par3);

      panel_fw_hit.add(fw_box2);

    }

    if(par3 >= 4){

      fw_box3 = new JComboBox<String>(fw_options_array);

      panel_fw_hit.add(fw_box3);

    }
    else{

      fw_box3 = new JComboBox<String>(fw_par3);

      panel_fw_hit.add(fw_box3);

    }

    if(par4 >= 4){

      fw_box4 = new JComboBox<String>(fw_options_array);

      panel_fw_hit.add(fw_box4);

    }
    else{

      fw_box4 = new JComboBox<String>(fw_par3);

      panel_fw_hit.add(fw_box4);

    }

    if(par5 >= 4){

      fw_box5 = new JComboBox<String>(fw_options_array);

      panel_fw_hit.add(fw_box5);

    }
    else{

      fw_box5 = new JComboBox<String>(fw_par3);

      panel_fw_hit.add(fw_box5);

    }

    if(par6 >= 4){

      fw_box6 = new JComboBox<String>(fw_options_array);

      panel_fw_hit.add(fw_box6);

    }
    else{

      fw_box6 = new JComboBox<String>(fw_par3);

      panel_fw_hit.add(fw_box6);

    }

    if(par7 >= 4){

      fw_box7 = new JComboBox<String>(fw_options_array);

      panel_fw_hit.add(fw_box7);

    }
    else{

      fw_box7 = new JComboBox<String>(fw_par3);

      panel_fw_hit.add(fw_box7);

    }

    if(par8 >= 4){

      fw_box8 = new JComboBox<String>(fw_options_array);

      panel_fw_hit.add(fw_box8);

    }
    else{

      fw_box8 = new JComboBox<String>(fw_par3);

      panel_fw_hit.add(fw_box8);

    }

    if(par9 >= 4){

      fw_box9 = new JComboBox<String>(fw_options_array);

      panel_fw_hit.add(fw_box9);

    }
    else{

      fw_box9 = new JComboBox<String>(fw_par3);

      panel_fw_hit.add(fw_box9);

    }

    if(par10 >= 4){

      fw_box10 = new JComboBox<String>(fw_options_array);

      panel_fw_hit1.add(fw_box10);

    }
    else{

      fw_box10 = new JComboBox<String>(fw_par3);

      panel_fw_hit1.add(fw_box10);

    }

    if(par11 >= 4){

      fw_box11 = new JComboBox<String>(fw_options_array);

      panel_fw_hit1.add(fw_box11);

    }
    else{

      fw_box11 = new JComboBox<String>(fw_par3);

      panel_fw_hit1.add(fw_box11);

    }

    if(par12 >= 4){

      fw_box12 = new JComboBox<String>(fw_options_array);

      panel_fw_hit1.add(fw_box12);

    }
    else{

      fw_box12 = new JComboBox<String>(fw_par3);

      panel_fw_hit1.add(fw_box12);

    }

    if(par13 >= 4){

      fw_box13 = new JComboBox<String>(fw_options_array);

      panel_fw_hit1.add(fw_box13);

    }
    else{

      fw_box13 = new JComboBox<String>(fw_par3);

      panel_fw_hit1.add(fw_box13);

    }

    if(par14 >= 4){

      fw_box14 = new JComboBox<String>(fw_options_array);

      panel_fw_hit1.add(fw_box14);

    }
    else{

      fw_box14 = new JComboBox<String>(fw_par3);

      panel_fw_hit1.add(fw_box14);

    }

    if(par15 >= 4){

      fw_box15 = new JComboBox<String>(fw_options_array);

      panel_fw_hit1.add(fw_box15);

    }
    else{

      fw_box15 = new JComboBox<String>(fw_par3);

      panel_fw_hit1.add(fw_box15);

    }

    if(par16 >= 4){

      fw_box16 = new JComboBox<String>(fw_options_array);

      panel_fw_hit1.add(fw_box16);

    }
    else{

      fw_box16 = new JComboBox<String>(fw_par3);

      panel_fw_hit1.add(fw_box16);

    }

    if(par17 >= 4){

      fw_box17 = new JComboBox<String>(fw_options_array);

      panel_fw_hit1.add(fw_box17);

    }
    else{

      fw_box17 = new JComboBox<String>(fw_par3);

      panel_fw_hit1.add(fw_box17);

    }

    if(par18 >= 4){

      fw_box18 = new JComboBox<String>(fw_options_array);

      panel_fw_hit1.add(fw_box18);

    }
    else{

      fw_box18 = new JComboBox<String>(fw_par3);

      panel_fw_hit1.add(fw_box18);

    }





    panel_score_entry.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    panel_score_entry.add(label_score);
    panel_score_entry.add(spinner1);
    panel_score_entry.add(spinner2);
    panel_score_entry.add(spinner3);
    panel_score_entry.add(spinner4);
    panel_score_entry.add(spinner5);
    panel_score_entry.add(spinner6);
    panel_score_entry.add(spinner7);
    panel_score_entry.add(spinner8);
    panel_score_entry.add(spinner9);


    panel_hole.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    panel_hole.add(label_hole1);
    panel_hole.add(label10);
    panel_hole.add(label11);
    panel_hole.add(label12);
    panel_hole.add(label13);
    panel_hole.add(label14);
    panel_hole.add(label15);
    panel_hole.add(label16);
    panel_hole.add(label17);
    panel_hole.add(label18);




    panel_score_entry1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    panel_score_entry1.add(label_score1);
    panel_score_entry1.add(spinner10);
    panel_score_entry1.add(spinner11);
    panel_score_entry1.add(spinner12);
    panel_score_entry1.add(spinner13);
    panel_score_entry1.add(spinner14);
    panel_score_entry1.add(spinner15);
    panel_score_entry1.add(spinner16);
    panel_score_entry1.add(spinner17);
    panel_score_entry1.add(spinner18);



















    this.add(label_date);
    this.add(panel_hole_num1);
    this.add(panel_score_entry);
    this.add(panel_fw_hit);
    this.add(panel_gir_hit);
    this.add(panel_hole);
    this.add(panel_score_entry1);
    this.add(panel_fw_hit1);
    this.add(panel_gir_hit1);
    this.add(button_panel);




    






    this.setVisible(true);

  }

  public void actionPerformed(ActionEvent e) {

    if(e.getSource() == btn){

     int score_1 = (Integer) spinner1.getValue();
     int score_2 = (Integer) spinner2.getValue();
     int score_3 = (Integer) spinner3.getValue();
     int score_4 = (Integer) spinner4.getValue();
     int score_5 = (Integer) spinner5.getValue();
     int score_6 = (Integer) spinner6.getValue();
     int score_7 = (Integer) spinner7.getValue();
     int score_8 = (Integer) spinner8.getValue();
     int score_9 = (Integer) spinner9.getValue();
     int score_10 = (Integer) spinner10.getValue();
     int score_11 = (Integer) spinner11.getValue();
     int score_12 = (Integer) spinner12.getValue();
     int score_13 = (Integer) spinner13.getValue();
     int score_14 = (Integer) spinner14.getValue();
     int score_15 = (Integer) spinner15.getValue();
     int score_16 = (Integer) spinner16.getValue();
     int score_17 = (Integer) spinner17.getValue();
     int score_18 = (Integer) spinner18.getValue();


     int total_score = Integer.sum(score_1,score_2) + Integer.sum(score_3,score_4) + Integer.sum(score_5,score_6) + Integer.sum(score_7,score_8) + Integer.sum(score_9,score_10) + Integer.sum(score_11,score_12) + Integer.sum(score_13,score_14) + Integer.sum(score_15,score_16) + Integer.sum(score_17,score_18) ;



    this.dispose();

    new DisplayScore(total_score, date, course);





    }

    if(e.getSource() == goBack){
      this.dispose();
      new MainFrame();
    }



  }
}
