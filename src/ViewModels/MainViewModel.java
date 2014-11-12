package ViewModels;

import Views.MainView;
import de.yadrone.base.ARDrone;
import de.yadrone.base.video.ImageListener;
import de.yadrone.base.video.VideoManager;

import java.awt.image.BufferedImage;

/**
 * Created by Thomas on 12/11/2014.
 */
public class MainViewModel {

    private MainView mainView;
    private ARDrone arDrone;

    public MainViewModel(){
        this.arDrone = new ARDrone();
        this.arDrone.setSpeed(1);
    }

    public void setMainView(MainView mainView){
        this.mainView = mainView;
    }

    public boolean start(){
        try {
            this.arDrone.start();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean stop(){
        try{
            this.arDrone.stop();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void sendVideo(){
        this.arDrone.getVideoManager().addImageListener(this.mainView::setImage);
    }

    public void forward(){
        this.arDrone.forward();
    }

    public void backward(){
        this.arDrone.backward();
    }

    public void right(){
        this.arDrone.goRight();
    }

    public void left() {
        this.arDrone.goLeft();
    }

    public void takeOff(){
        this.arDrone.takeOff();
    }

    public void land(){
        this.arDrone.landing();
    }

    public void switchCamera(){
        this.arDrone.toggleCamera();
    }

}
