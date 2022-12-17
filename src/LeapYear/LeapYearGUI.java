package LeapYear;

import SimpleCalc.SimpleCalcGUI;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel mainpnl;

    public LeapYearGUI(){
        btnCheckYear.addActionListener(e -> {
                int year = Integer.parseInt(tfYear.getText());

                if(year < 0)
                    throw new NumberFormatException();
                else if(year % 4 == 0){
                    if(year % 100 != 0)
                        JOptionPane.showMessageDialog(mainpnl, "Leap Year");
                    else if (year % 400 == 0 && year % 100 == 0)
                        JOptionPane.showMessageDialog(mainpnl, "Leap Year");
                    else
                        JOptionPane.showMessageDialog(mainpnl, "Not a Leap Year");
                } else
                    JOptionPane.showMessageDialog(mainpnl, "Not a Leap Year");
        });
    }

    public static void main(String[] args){
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
        app.setContentPane(app.mainpnl);
        app.setSize(500, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}

