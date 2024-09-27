import javax.swing.*;
import java.awt.*;


public class LayoutManagerExamples {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Swing Layout Manager");
       // frame.setDefaultCloseOpration(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);


        //Flow Layout
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        //Borderlayout example
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.NORTH);
        borderPanel.add(new JButton("East"), BorderLayout.NORTH);
        borderPanel.add(new JButton("West"));
        borderPanel.add(new JButton("Center"));

        //


    }
    
}
