package LeapYear;

import SimpleCalc.SimpleCalcGUI;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel mainpnl;


    public static void main(String[] args){
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
        app.setContentPane(app.mainpnl);
        app.setSize(500, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}

