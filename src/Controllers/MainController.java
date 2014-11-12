package Controllers;

import ViewModels.MainViewModel;
import Views.MainView;

/**
 * Created by Rudie (rddesmit@hotmail.com) on 12-11-2014.
 */
public class MainController {

    private MainView mainView;
    private MainViewModel mainViewModel;

    public MainController(){
        this.mainView = new MainView();
        this.mainViewModel = new MainViewModel();

        this.mainView.setMainViewModel(this.mainViewModel);
        this.mainViewModel.setMainView(this.mainView);
    }
}
