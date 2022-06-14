package AssignmentsAndClassWorks;

import java.util.Scanner;

public class NokiaCall2 {
    private static int voice;
    private static String menu;

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        mainMenu();


    }

    public static void mainMenu() {
        menu = """
                NOKIA MENU
                Enter 1 for Phone book
                Enter 2 for Messages
                Enter 3 for Chats
                Enter 4 for Call register
                Enter 5 for Tones
                Enter 6 for Settings
                Enter 7 for Call divert
                Enter 8 for Games
                Enter 9 for Calculation
                Enter 10 for Reminders
                Enter 11 for Clock
                Enter 12 for Profiles
                Enter 13 for Sim services
                """;

        System.out.println(menu);

        voice = input.nextInt();
        switch (voice) {
            case 1 -> phoneBook();
            case 2 -> message();
            case 3 -> chat();
            case 4 -> callSetting();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> callDivert();
            case 8 -> games();
            case 9 -> calculator();
            case 10 -> reminders();
            case 11 -> clock();
            case 12 -> profiles();
            case 13 -> simServices();

        }
    }
    public static void phoneBook() {
        menu = """
                Phonebook
                Press 1 for Search
                Press 2 for Service Nos.
                Press 3 for Add name
                Press 4 for Erase
                Press 5 for Edit
                Press 6 for Assign tone
                Press 7 for Send b'card
                Press 8 for Options
                Press 9 for Speed dials
                Press 10 for Voice tags
                Press 0 for Back     
                """;
        System.out.println(menu);
        voice = input.nextInt();

        switch (voice) {
            case 1 -> search();
            case 2 -> serviceNos();
            case 3 -> addName();
            case 4 -> erase();
            case 5 -> edit();
            case 6 -> assignTone();
            case 7 -> sendBcard();
            case 8 -> options();

            case 9 -> speedDials();
            case 10 -> voiceTags();
            case 0 -> mainMenu();
        }
    }

     // MENU NO 1
    public static void search() {
        menu = "Search";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void serviceNos() {
        menu = "Service Nos.";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void addName() {
        menu = "Add name";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void erase() {
        menu = "Erase";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void edit() {
        menu = "Edit";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void assignTone() {
        menu = "Assign tone";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void sendBcard() {
        menu = "Send Bcard";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }

    public static void options() {
        menu = """
                Press 1 for Type of view
                Press 2 for Memory status
                Press 0 for Back
                """;
        System.out.println(menu);

        voice = input.nextInt();
        switch (voice) {
            case 0:
                phoneBook();

        }

        switch (voice) {
            case 1:
                System.out.println("Type of view");
                System.out.println("Press 0 for Back");
                voice = input.nextInt();
            case 0:
                options();

        switch (voice) {
            case 2:
                System.out.println("Memory status");
                System.out.println("Press 0 for Back");
                voice = input.nextInt();
            case 0:
                options();
        }

        }
    }

    public static void speedDials() {
        menu = "Speed dials";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void voiceTags() {
        menu = "Voice tags";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }

    // MENU NO 2
    @SuppressWarnings("SwitchStatementWithoutDefaultBranch")
    public static void message() {
        menu = """
                Phonebook
                Press 1 for Write messages
                Press 2 for Inbox
                Press 3 for Outbox
                Press 4 for Picture messages
                Press 5 for Templates
                Press 6 for Smileys
                Press 7 for Message settings
                Press 8 for Info services
                Press 9 for Voice mailbox number
                Press 10 for Service command editor
                Press 0 for Back 
                    
                """;
        System.out.println(menu);
        voice = input.nextInt();

        switch (voice) {
            case 1 -> writeMessages();
            case 2 -> inbox();
            case 3 -> outbox();
            case 4 -> pictureMessages();
            case 5 -> templates();
            case 6 -> smileys();

            case 7 -> messageSettings();

            case 8 -> infoServices();
            case 9 -> voiceMailboxNumber();
            case 10 -> serviceCommandEditor();
            case 0 -> mainMenu();
        }

    }
    public static void writeMessages() {
        menu = "Write messages";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void inbox() {
        menu = "Inbox";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void outbox() {
        menu = "Outbox";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void pictureMessages() {
        menu = "Picture messages";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void templates() {
        menu = "Templates";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void smileys() {
        menu = "Smileys";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }

    public static void messageSettings() {
        menu = """
                Press 1 for Set 1
                Press 2 for Common
                Press 0 for Back
                """;
        System.out.println(menu);
        voice = input.nextInt();

        switch (voice) {
            case 1:
                System.out.println("Set 1");
                System.out.println("Press 0 for Back");
                voice = input.nextInt();
            case 2:
                System.out.println("Common");
                System.out.println("Press 0 for Back");
                voice = input.nextInt();
            case 0:
                message();
        }
    }

    public static void set1() {
        menu = """
                 Press 1 for Message center number
                 Press 2 for Message sent as
                 Press 3 for Message validity
                 Press 0 for Back
                """;
        System.out.println(menu);
        voice = input.nextInt();

        switch (voice) {
            case 1:
                System.out.println("Message center number");
                System.out.println("Press 0 for Back");
                voice = input.nextInt();
            case 2:
                System.out.println("Message sent as");
                System.out.println("Press 0 for Back");
                voice = input.nextInt();
            case 3:
                System.out.println("Message vality");
                System.out.println("Press 0 for Back");
                voice = input.nextInt();

            case 0:
                set1();
        }
    }


    public static void common () {
    menu = """
            Press 1 for Delivery report
            Press 2 for Reply via same center
            Press 3 for Character support
            Press 0 for Back
            """;
    System.out.println(menu);
    voice = input.nextInt();

    switch (voice) {
        case 1:
            System.out.println("Delivery report");
            System.out.println("Press 0 for Back");
            voice = input.nextInt();
        case 2:
            System.out.println("Reply via same center");
            System.out.println("Press 0 for Back");
            voice = input.nextInt();
        case 3:
            System.out.println("Character support");
            System.out.println("Press 0 for Back");
            voice = input.nextInt();

        case 0:
            common();
    }

    }

    public static void infoServices() {
        menu = "Info services";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void voiceMailboxNumber() {
        menu = "Voice mailbox Number";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }
    public static void serviceCommandEditor() {
        menu = "Service command editor";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice){
            case 0:
                phoneBook();

        }
    }

    // MAIN MENU NO 3
    public static void chat() {
        menu = "Chat";
        System.out.println(menu);

        System.out.println("Press 0 for Back");
        voice = input.nextInt();

        switch (voice) {
            case 0:
                mainMenu();
        }
    }

    public static void callSetting() {
        menu = """
                Call Register
                Press 1 for Missed calls
                Press 2 for Received calls
                Press 3 for Dialled number
                Press 4 for Erase recent call lists
                Press 5 for Show call duration
                Press 6 for Show call costs
                Press 7 for Call cost settings
                Press 8 for Prepaid credit
                Press 0 for Back 
                """;
        System.out.println(menu);
        voice = input.nextInt();

        switch (voice) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled number");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;

            case 5:
                System.out.println("Press 1 for Last call duration");
                System.out.println("Press 2 for All calls' duration");
                System.out.println("Press 3 for Received calls' duration");
                System.out.println("Press 4 for Dialled calls' duration");
                System.out.println("Press 5 for Clear timers");
                voice = input.nextInt();

                switch (voice) {
                    case 1:
                        System.out.println("Last call duration");

                        break;
                    case 2:
                        System.out.println("All calls' duration");
                        break;
                    case 3:
                        System.out.println("Received calls' duration");
                        break;
                    case 4:
                        System.out.println("Dialled calls' duration");
                        break;
                    case 5:
                        System.out.println("Clear timers");
                        break;
                }
                break;

            case 6:
                System.out.println("Press 1 for Last call cost");
                System.out.println("Press 2 for All calls' cost");
                System.out.println("Press 3 for Clear counters");
                voice = input.nextInt();

                switch (voice) {
                    case 1:
                        System.out.println("Last call cost");
                        break;
                    case 2:
                        System.out.println("All calls' cost");
                        break;
                    case 3:
                        System.out.println("Clear counters");
                        break;
                }
                break;

            case 7:
                System.out.println("Press 1 for Call cost limit");
                System.out.println("Press 2 for Show cost in");
                voice = input.nextInt();

                switch (voice) {
                    case 1:
                        System.out.println("Call cost limit");
                        break;
                    case 2:
                        System.out.println("Show cost in");
                        break;
                }
                break;

            case 8:
                System.out.println("Prepaid credit");
                break;
            case 0:
                mainMenu();
        }
    }

    public static void tones() {
        menu = """
                Tones
                Press 1 for Ringing tone
                Press 2 for Ringing volume
                Press 3 for Incoming call alert
                Press 4 for Composer
                Press 5 for Message alert tones
                Press 6 for Keypad tones
                Press 7 for Warning and game tones
                Press 8 for Vibrating alert
                Press 9 for Screen saver
                """;
        System.out.println(menu);
        voice = input.nextInt();

        switch (voice) {
            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("Incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tones");
                break;
            case 6:
                System.out.println("Keypad tones");
                break;
            case 7:
                System.out.println("Warning and game tones");
                break;
            case 8:
                System.out.println("Vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");
                break;
            case 0:
                mainMenu();
        }
    }

    public static void settings() {
        menu = """
                Settings
                Press 1 for Call settings
                Press 2 for Phone setting
                Press 3 for Security settings
                Press 4 for Restore factory settings
                Press 0 for Back
                """;
        System.out.println(menu);
        voice = input.nextInt();

        switch (voice) {
            case 1:
                System.out.println("Press 1 for Automatic redial");
                System.out.println("Press 2 for Speed dialling");
                System.out.println("Press 3 for Call waiting options");
                System.out.println("Press 4 for Own number sending");
                System.out.println("Press 5 for Phone line in use");
                System.out.println("Press 6 for Automatic answer");
                voice = input.nextInt();

                switch (voice) {
                    case 1:
                        System.out.println("Automatic redial");
                        break;
                    case 2:
                        System.out.println("Speed dialling");
                        break;
                    case 3:
                        System.out.println("Call waiting options");
                        break;
                    case 4:
                        System.out.println("Own number sending");
                        break;
                    case 5:
                        System.out.println("Phone line in use");
                        break;
                    case 6:
                        System.out.println("Automatic answer");
                        break;
                }
                break;

            case 2:
                System.out.println("Press 1 for Language");
                System.out.println("Press 2 for Cell info display");
                System.out.println("Press 3 for Welcome note");
                System.out.println("Press 4 for Network selection");
                System.out.println("Press 5 for Lights");
                System.out.println("Press 6 for Confirm SIM service actions");
                voice = input.nextInt();

                switch (voice) {
                    case 1:
                        System.out.println("Language");
                        break;
                    case 2:
                        System.out.println("Cell info display");
                        break;
                    case 3:
                        System.out.println("Welcome note");
                        break;
                    case 4:
                        System.out.println("Network selection");
                        break;
                    case 5:
                        System.out.println("Lights");
                        break;
                    case 6:
                        System.out.println("Confirm SIM service actions");
                        break;
                }
                break;
            case 3:
                System.out.println("Press 1 for PIN code request");
                System.out.println("Press 2 for Call barring services");
                System.out.println("Press 3 for Fixed dialling");
                System.out.println("Press 4 for Closed user group");
                System.out.println("Press 5 for Phone security");
                System.out.println("Press 6 for Change access codes");
                voice = input.nextInt();

                switch (voice) {
                    case 1:
                        System.out.println("PIN code request");
                        break;
                    case 2:
                        System.out.println("Call barring services");
                        break;
                    case 3:
                        System.out.println("Fixed dialling");
                        break;
                    case 4:
                        System.out.println("Closed user group");
                        break;
                    case 5:
                        System.out.println("Phone security");
                        break;
                    case 6:
                        System.out.println("Change access codes");
                        break;
                }
                break;

            case 4:
                System.out.println("Restore factory settings");
                break;

        }
    }

    public static void callDivert() {
        menu = "Call divert";

        System.out.println(menu);
        System.out.println("Press 0 for Back");
        voice = input.nextInt();
        switch (voice) {
            case 0:
                mainMenu();
        }
    }
    public static void games() {
        menu = "Games";

        System.out.println(menu);
        System.out.println("Press 0 for Back");
        voice = input.nextInt();
        switch (voice) {
            case 0:
                mainMenu();
        }

    }
    public static void calculator() {
        menu = "Calculator";

        System.out.println(menu);
        System.out.println("Press 0 for Back");
        voice = input.nextInt();
        switch (voice) {
            case 0:
                mainMenu();
        }
    }
    public static void reminders() {
        menu = "Reminders";

        System.out.println(menu);
        System.out.println("Press 0 for Back");
        voice = input.nextInt();
        switch (voice) {
            case 0:
                mainMenu();
        }
    }
    public static void clock() {
        menu = """
                Clock
                Press 1 for Alarm clock
                Press 2 for Clock settings
                Press 3 for Date setting
                Press 4 for Stopwatch
                Press 5 for Countdown timer
                Press 6 for Auto update of date and time
                """;
        System.out.println(menu);
        voice = input.nextInt();

        switch (voice) {
            case 1:
                System.out.println("Alarm clock");
                break;
            case 2:
                System.out.println("Clock settings");
                break;
            case 3:
                System.out.println("Date settings");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
            case 0:
                mainMenu();
        }
    }
    public static void profiles() {
        menu = "Profiles";

        System.out.println(menu);
        System.out.println("Press 0 for Back");
        voice = input.nextInt();
        switch (voice) {
            case 0:
                mainMenu();
        }
    }
    public static void simServices() {
        menu = "Sim services";

        System.out.println(menu);
        System.out.println("Press 0 for Back");
        voice = input.nextInt();
        switch (voice) {
            case 0:
                mainMenu();
        }
    }



}









