package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame {
    private JPanel mainpnl;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args){
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.mainpnl);
        app.setVisible(true);
        app.setSize(600,300);
        app.mainpnl.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        app.setTitle("Simple Calculator");
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}

