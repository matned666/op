import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CelsiusConverterGUI extends JFrame {

    private JLabel celsiusLabel;
    private JButton convertButton0;
    private JButton convertButton1;
    private JButton convertButton2;
    private JButton convertButton3;
    private JButton convertButton4;
    private JButton convertButton5;
    private JButton convertButton6;
    private JButton convertButton7;
    private JButton convertButton8;
    private JButton convertButton9;
    private JButton convertButtonPlus;
    private JButton convertButtonMinus;
    private JButton convertButtonTimes;
    private JButton convertButtonDivide;
    private JButton convertButtonEquals;
    private JLabel fahrenheitLabel;
    private JTextField tempTextField;
    private boolean exitOnClose;


    public CelsiusConverterGUI() {
        initComponents(true);
    }

    public CelsiusConverterGUI(boolean exitOnClose) {
        this.exitOnClose = exitOnClose;
        initComponents(this.exitOnClose);
    }


    private void initComponents(boolean exitOnClose) {
        this.tempTextField = new JTextField();
        this.celsiusLabel = new JLabel();
        this.convertButton0 = new JButton();
        this.convertButton1 = new JButton();
        this.convertButton2 = new JButton();
        this.convertButton3 = new JButton();
        this.convertButton4 = new JButton();
        this.convertButton5 = new JButton();
        this.convertButton6 = new JButton();
        this.convertButton7 = new JButton();
        this.convertButton8 = new JButton();
        this.convertButton9 = new JButton();
        this.convertButtonPlus = new JButton();
        this.convertButtonMinus = new JButton();
        this.convertButtonTimes = new JButton();
        this.convertButtonDivide = new JButton();
        this.convertButtonEquals = new JButton();
        this.fahrenheitLabel = new JLabel();
//==========================================================================

        if(this.exitOnClose) setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        else setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setTitle("Konwenter stopni");

        this.celsiusLabel.setText("Ilość stopni");
        this.convertButton0.setText("0");
        this.convertButton1.setText("1");
        this.convertButton2.setText("2");
        this.convertButton3.setText("3");
        this.convertButton4.setText("4");
        this.convertButton5.setText("5");
        this.convertButton6.setText("6");
        this.convertButton7.setText("7");
        this.convertButton8.setText("8");
        this.convertButton9.setText("9");
        this.convertButtonPlus.setText("+");
        this.convertButtonMinus.setText("-");
        this.convertButtonTimes.setText("x");
        this.convertButtonDivide.setText("/");
        this.convertButtonEquals.setText("=");

        this.convertButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                convertButton2ActionPerformed(actionEvent);

            }
        });
        this.convertButton0.addActionListener(new ActionListener() {


            @Override
         public void actionPerformed(ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        this.fahrenheitLabel.setText("");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(tempTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(celsiusLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)

                                                .addComponent(fahrenheitLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(convertButton7)
                                                .addComponent(convertButton8)
                                                .addComponent(convertButton9))
                                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(convertButton4)
                                                .addComponent(convertButton5)
                                                .addComponent(convertButton6)
                                                .addComponent(convertButtonPlus))
                                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(convertButton1)
                                                .addComponent(convertButton2)
                                                .addComponent(convertButton3)
                                                .addComponent(convertButtonMinus))
                                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(convertButtonEquals)
                                                .addComponent(convertButton0)
                                                .addComponent(convertButtonDivide)
                                                .addComponent(convertButtonTimes)
                                                ))
                                .addContainerGap(27, Short.MAX_VALUE)));

        layout.linkSize(SwingConstants.HORIZONTAL, new Component[]{convertButton0, tempTextField});

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tempTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(celsiusLabel)
                                        .addComponent(fahrenheitLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(convertButton7)
                                        .addComponent(convertButton8)
                                        .addComponent(convertButton9)
                                ).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(convertButton4)
                                        .addComponent(convertButton5)
                                        .addComponent(convertButton6)
                                        .addComponent(convertButtonPlus)
                                ).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(convertButton1)
                                        .addComponent(convertButton2)
                                        .addComponent(convertButton3)
                                        .addComponent(convertButtonMinus)
                                ).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(convertButtonEquals)
                                        .addComponent(convertButton0)
                                        .addComponent(convertButtonDivide)
                                        .addComponent(convertButtonTimes))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        pack();
    }

    private void convertButtonActionPerformed(ActionEvent evt) {
        int tempFahr = (int) ((Double.parseDouble(tempTextField.getText())) * 1.8 + 32);
        fahrenheitLabel.setText(tempFahr + " Fahrenheita");
    }

    private void convertButton2ActionPerformed(ActionEvent evt) {
        int tempCelc = (int)(((Double.parseDouble(tempTextField.getText())) -32)/1.8);
        fahrenheitLabel.setText(tempCelc + " Celsjusza");
    }



}


