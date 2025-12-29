public class Menu {

    TextUI ui = new TextUI();
    Calculator result = new Calculator();
    String choice;
    String month;
    int rides;


    public void welcomeMenu(){
        ui.messageToUser("Velkommen til Cykelpendlings Appen.\nBegynd registrering? (J/N)");
        choice = ui.userStringInput();
        while(true) {
            if (choice.toUpperCase().contains("J")) {
                ui.messageToUser("Logger ind via mitID...");
                ui.sleep(500);
                mainMenu();
                endProgram();
                return;
            } else if (choice.toUpperCase().contains("N")) {
                endProgram();
                return;
            } else {
                ui.messageToUser("Ugyldigt input, prøv igen.");
                choice = ui.userStringInput();
            }
        }
    }

    public void mainMenu(){

        while(true) {
            ui.messageToUser("Indtast den ønskede måned: ");
            month = ui.userStringInputMonth().toUpperCase();
            ui.messageToUser("Hvor mange ture cyklede du i " + month + "?");
            rides = ui.userIntInput();
            ui.messageToUser("Ok du cyklede " + rides + " ture i " + month + ".");
            Months.months.replace(month.toUpperCase(), rides);
            ui.sleep(300);
            ui.messageToUser("Vil du registrere mere? (J/N)");

            choice = ui.userStringInput();

            if (choice.toUpperCase().contains("J")) {
                ui.messageToUser("Ok. Fortsætter registrering...");
            } else if (choice.toUpperCase().contains("N")) {
                printTaxRefund();
                return;
            } else {
                ui.messageToUser("Ugyldigt input, prøv igen.");
                choice = ui.userStringInput();
            }
        }
    }

    public void endProgram(){
        ui.messageToUser("Lukker App...");
        ui.sleep(500);
        ui.messageToUser("God dag :D");
    }

    public void printTaxRefund(){
        //Kun til for at resultatet giver bedre mening
        String enEllerFlere = "null";
        if(result.treesSpared() < 2){
            enEllerFlere = "træs";
        } else if(result.treesSpared() >= 2){
            enEllerFlere = "træers";
        }
        ui.messageToUser(
                "Flot arbejde! Du har sparet klimaet for " + result.CO2Spared() +
                "kg CO₂ \nDet er svarende til " + result.treesSpared()+ " " + enEllerFlere + " årlige" + " absorption\n" +
                "Din klimarabat: " + result.ClimateTaxRefund() + "kr overføres til din NemKonto");
    }
}
