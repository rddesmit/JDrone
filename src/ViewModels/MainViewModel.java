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

    public ARDrone getArDrone(){
        return this.arDrone;
    }

    public void sendVideo(){
        this.arDrone.getVideoManager().addImageListener(new ImageListener() {
            @Override
            public void imageUpdated(BufferedImage bufferedImage) {

            }
        });
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
