package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel mainpnl;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    public static void main(String[] args){
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(new FoodOrderGUI().mainpnl);
        app.setVisible(true);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
