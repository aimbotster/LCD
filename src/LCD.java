public class LCD {

    public static final int WIDTH = 87;
    public static void horizontalLine() {
        System.out.print("|");
        for (int i = 1; i <= WIDTH; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }

    public static void clearScreen() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void openMainMenu(){
        horizontalLine();
        System.out.println("|                          Welcome to Stamford LCD Library Demo                         |");
        System.out.println("|                                                                                       |");
        System.out.println("|                                 Select a Function (1-3)                               |");
        horizontalLine();
        System.out.println("|                                                                                       |");
        System.out.println("| 1. Login                                                                              |");
        System.out.println("| 2. Restart                                                                            |");
        System.out.println("| 3. Shutdown                                                                           |");
        horizontalLine();

    }

    public static void openLoginMenu(){
        clearScreen();
        horizontalLine();
        System.out.println("|                       Login Menu. Press F1 for more information.                      |");
        horizontalLine();
        System.out.println("|                                                                                       |");
        System.out.println("| Enter Username:                                                                       |");
        horizontalLine();
    }


    public static void openSystemMenu(){
        clearScreen();
        horizontalLine();
        System.out.println("|                                 Select a Function (1-4)                               |");
        horizontalLine();
        System.out.println("|                                                                                       |");
        System.out.println("| 1. Change AC Temperature set point                                                    |");
        System.out.println("| 2. Enable/Disable IP Camera                                                           |");
        System.out.println("| 3. Turn anti-theft system on/off.                                                     |");
        System.out.println("| 4. Exit                                                                               |");
        horizontalLine();
    }
    public static void openRestartConfirmation(){
        clearScreen();
        horizontalLine();
        System.out.println("|                                 Restart Confirmation                                  |");
        horizontalLine();
        System.out.println("|                                                                                       |");
        System.out.println("| Are you sure that you want to restart the system? (Y/N)                               |");
        horizontalLine();
    }
    public static void openShutdownConfirmation(){
        clearScreen();
        horizontalLine();
        System.out.println("|                                 Shutdown Confirmation                                 |");
        horizontalLine();
        System.out.println("|                                                                                       |");
        System.out.println("| Are you sure that you want to shutdown the system? (Y/N)                              |");
        horizontalLine();
    }
    public static void openRestarting(){
        clearScreen();
        horizontalLine();
        System.out.println("|                                    Restarting.....                                    |");
        horizontalLine();
        System.out.println("|                                                                                       |");
        System.out.println("| Please wait while the system is preparing for a restart.                              |");
        horizontalLine();
    }
    public static void openShuttingDown(){
        clearScreen();
        horizontalLine();
        System.out.println("|                                 Shutting Down.....                                    |");
        horizontalLine();
        System.out.println("|                                                                                       |");
        System.out.println("| Please wait while the system is preparing for a shutdown.                             |");
        horizontalLine();
    }
}
