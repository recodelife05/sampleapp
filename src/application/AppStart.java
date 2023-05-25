package application;

import application.inventory.InventoryManagement;
import application.library.LibraryManagement;
import contracts.IInventoryMainScreen;
import contracts.ILibraryMainScreen;
import contracts.IMainScreen;
import infrastructure.DataProvider;
import models.AppConfiguration;
import screen.InventoryMainScreen;
import screen.LibraryMainScreen;
import screen.MainProgramScreen;

import java.io.IOException;
import java.util.Scanner;

public class AppStart {

    public static void Run(Scanner scanner, AppConfiguration configuration, DataProvider dataProvider, MainProgramScreen mainProgramScreen) throws IOException, InterruptedException {

        mainProgramScreen.DisplayMainScreen();
        var input = mainProgramScreen.PromptUserInput(scanner);

        var action = mainProgramScreen.ACTIONS;
        if(action.LIBRARYSYSTEM.getIdentifier() == input){
            IMainScreen mainScreen = new LibraryMainScreen();
            LibraryManagement system =  new LibraryManagement(scanner,configuration,dataProvider, (ILibraryMainScreen) mainScreen);
            system.RunProgram();
        }else if(action.INVENTORYSYSTEM.getIdentifier() == input){
            IMainScreen mainScreen = new InventoryMainScreen();
            InventoryManagement system =  new InventoryManagement(scanner,configuration,dataProvider, (IInventoryMainScreen) mainScreen);
            system.RunProgram();
        }
    }
}
