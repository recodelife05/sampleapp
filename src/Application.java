import application.AppStart;
import contracts.IDataProvider;
import contracts.IMainProgramScreen;
import infrastructure.DataProvider;
import models.AppConfiguration;
import models.ApplicationDataSource;
import screen.MainProgramScreen;

import java.io.IOException;
import java.util.Scanner;

public  class Application {
    void Start() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        AppConfiguration configuration = new AppConfiguration();
        IDataProvider dataProvider = new DataProvider();
        configuration.IsPersist = false;
        configuration.Source = ApplicationDataSource.InMemory;
        IMainProgramScreen mainProgramScreen = new MainProgramScreen();
        AppStart.Run(scanner,configuration, (DataProvider) dataProvider,(MainProgramScreen) mainProgramScreen);
    }
}
