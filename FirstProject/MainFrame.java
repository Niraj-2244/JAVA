package FirstProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame{
    final private Font maiFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;


    public void initialize() {
        /*********Form Panel*********** */
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(maiFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(maiFont);

        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setFont(maiFont);

        tfLastName = new JTextField();
        tfLastName.setFont(maiFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5,5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lblLastName);
        formPanel.add(tfLastName);

        /*********Welcome*********** */
        lbWelcome = new JLabel();
        lbWelcome.setFont(maiFont);

        /**********Button Panel******** */
        JButton btnOK = new JButton("OK");
        btnOK.setFont(maiFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String FirstName = tfFirstName.getText();
                String LastName = tfLastName.getText();
                lbWelcome.setText("Hello " + FirstName + " " + LastName);
                
            }
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(maiFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
            
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);



        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);


        add(mainPanel);



        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }

}
