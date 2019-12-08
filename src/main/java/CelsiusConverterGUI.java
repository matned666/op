import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CelsiusConverterGUI extends javax.swing.JFrame {

    private JLabel celsiusLabel;
    private JButton convertButton;
    private JButton convertButton2;
    private JLabel fahrenheitLabel;
    private JTextField tempTextField;


    public CelsiusConverterGUI() {
        initComponents();
    }


    private void initComponents() {
        this.tempTextField = new JTextField();
        this.celsiusLabel = new JLabel();
        this.convertButton = new JButton();
        this.convertButton2 = new JButton();
        this.fahrenheitLabel = new JLabel();
//==========================================================================
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konwenter stopni");

        this.celsiusLabel.setText("Ilość stopni");

        this.convertButton2.setText("Celcjusza");
        this.convertButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                convertButton2ActionPerformed(actionEvent);

            }
        });
        this.convertButton.setText("Fahrenheita");
        this.convertButton.addActionListener(new ActionListener() {


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
                                                .addComponent(celsiusLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(convertButton)
                                                .addComponent(convertButton2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fahrenheitLabel)))
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(SwingConstants.HORIZONTAL, new Component[]{convertButton, tempTextField});

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(tempTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(celsiusLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(convertButton)
                                        .addComponent(convertButton2)
                                        .addComponent(fahrenheitLabel))
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
