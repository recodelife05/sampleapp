package contracts;

import screen.InventoryMainScreen;

import java.util.Scanner;

public interface  IInventoryMainScreen extends IMainScreen {

    void DisplayToContinue();
    void DisplayExitingProgram() throws InterruptedException;
    Integer PromptUserInput(Scanner scanner);
    String PromptUserInputString(Scanner scanner);
    void DisplayPleaseEnterTheInventoryId();
    InventoryMainScreen.InventoryActions ACTIONS = InventoryMainScreen.InventoryActions.INCREASEDINVENTORY;
}
