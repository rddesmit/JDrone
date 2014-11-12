package Views;

import ViewModels.MainViewModel;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Rudie (rddesmit@hotmail.com) on 12-11-2014.
 */
public class MainView extends JFrame{

    private MainViewModel mainViewModel;
    private BufferedImage image;

    public MainView() {
        super("JDrone");
        this.setSize(640, 360);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.initLayout();
    }

    public void setMainViewModel(MainViewModel mainViewModel){
        this.mainViewModel = mainViewModel;
    }

    public void setImage(BufferedImage image){
        this.image = image;
        this.repaint();
    }

    private void initLayout(){
        JButton startButton = new JButton("start");
        startButton.addActionListener(e -> this.mainViewModel.start());

        JButton stopButton = new JButton("stop");
        stopButton.addActionListener(e -> this.mainViewModel.stop());

        JButton takeoffButton = new JButton("takeoff");
        takeoffButton.addActionListener(e -> this.mainViewModel.takeOff());

        JButton landButton = new JButton("land");
        landButton.addActionListener(e -> this.mainViewModel.land());

        JPanel panel = new JPanel();
        panel.add(startButton);
        panel.add(stopButton);
        panel.add(takeoffButton);
        panel.add(landButton);

        this.getContentPane().add(panel, BorderLayout.SOUTH);
        this.repaint();
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);

        if(graphics != null && image != null){
            graphics.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
        }
    }
}
