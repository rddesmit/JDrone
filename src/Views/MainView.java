package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Rudie (rddesmit@hotmail.com) on 12-11-2014.
 */
public class MainView extends JFrame{

    private BufferedImage image;

    public MainView() {
        super("JDrone");
        this.setSize(640, 360);
        this.initLayout();
    }

    public void setImage(BufferedImage image){
        this.image = image;
        this.repaint();
    }

    private void initLayout(){
        JButton startButton = new JButton("start");
        startButton.addActionListener(e -> System.out.println(e.toString()));

        JButton stopButton = new JButton("stop");
        stopButton.addActionListener(e -> System.out.println(e.toString()));

        JButton takeoffButton = new JButton("takeoff");
        takeoffButton.addActionListener(e -> System.out.println(e.toString()));

        JButton landButton = new JButton("land");
        landButton.addActionListener(e -> System.out.println(e.toString()));

        JPanel panel = new JPanel();
        panel.add(startButton);
        panel.add(stopButton);
        panel.add(takeoffButton);
        panel.add(landButton);

        this.getContentPane().add(panel, BorderLayout.SOUTH);
    }

    @Override
    public void paint(Graphics graphics){
        if(graphics != null){
            graphics.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
        }
    }
}
