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

    private static final double pizza = 100;
    private static final double burger = 80;
    private static final double fries = 65;
    private static final double softdrinks = 55;
    private static final double tea = 50;
    private static final double sundae = 40;

    FoodOrderGUI(){
        ButtonGroup falco = new ButtonGroup();
        falco.add(rbNone);
        falco.add(rb15);
        falco.add(rb10);
        falco.add(rb5);

        btnOrder.addActionListener(e -> {

                double tamount = 0;
                if(cBurger.isSelected())
                    tamount += burger;
                if (cFries.isSelected())
                    tamount += fries;
                if (cPizza.isSelected())
                    tamount += pizza;
                if (cTea.isSelected())
                    tamount += tea;
                if(cSoftDrinks.isSelected())
                    tamount += softdrinks;
                if(cSundae.isSelected())
                    tamount += sundae;

                if(rb5.isSelected())
                    tamount -= tamount * 0.05;
                else if(rb10.isSelected())
                    tamount -= tamount * 0.10;
                else if(rb15.isSelected())
                    tamount -= tamount * 0.15;


        });
    }
    public static void main(String[] args){
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(new FoodOrderGUI().mainpnl);
        app.setVisible(true);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
