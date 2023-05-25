package contracts;

import screen.MainProgramScreen;

import java.util.Scanner;

public interface IMainProgramScreen extends IMainScreen {

    Character PromptUserInput(Scanner sc);
    MainProgramScreen.ApplicationSystem ACTIONS = MainProgramScreen.ApplicationSystem.LIBRARYSYSTEM;
}
