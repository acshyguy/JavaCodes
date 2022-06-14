package AssignmentsAndClassWorks;

import java.util.Scanner;

public class NokiaCall {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("NOKIA MENU");
        System.out.println("Enter 1 for Phone book");
        System.out.println("Enter 2 for Messages");
        System.out.println("Enter 3 for Chats");
        System.out.println("Enter 4 for Call register");
        System.out.println("Enter 5 for Tones");
        System.out.println("Enter 6 for Settings");
        System.out.println("Enter 7 for Call divert");
        System.out.println("Enter 8 for Games");
        System.out.println("Enter 9 for Calculation");
        System.out.println("Enter 10 for Reminders");
        System.out.println("Enter 11 for Clock");
        System.out.println("Enter 12 for Profiles");
        System.out.println("Enter 13 for Sim services");

        int voice = input.nextInt();

        switch (voice) {
            case 1:
                System.out.println("Phonebook");
                System.out.println("Press 1 for Search");
                System.out.println("Press 2 for Service Nos.");
                System.out.println("Press 3 for Add name");
                System.out.println("Press 4 for Erase");
                System.out.println("Press 5 for Edit");
                System.out.println("Press 6 for Assign tone");
                System.out.println("Press 7 for Send b'card");
                System.out.println("Press 8 for Options");
                System.out.println("Press 9 for Speed dials");
                System.out.println("Press 10 for Voice tags");
                voice = input.nextInt();

                switch (voice) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos.");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("Press 1 for Type of view");
                        System.out.println("Press 2 for Memory status");
                         voice = input.nextInt();

                        switch (voice) {
                            case 1:
                                System.out.println("Type of view ");
                                break;
                            case 2:
                                System.out.println("Memory status ");
                                break;
                            default:
                                System.out.println("Wrong Number Code");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        break;
                }
                break;

            case 2:
                System.out.println("Message");
                System.out.println("Press 1 for Write messages");
                System.out.println("Press 2 for Inbox");
                System.out.println("Press 3  forOutbox");
                System.out.println("Press 4 for Picture messages");
                System.out.println("Press 5 for Templates");
                System.out.println("Press 6 for Smileys");
                System.out.println("Press 7 for Message settings");
                System.out.println("Press 8 for Info service");
                System.out.println("Press 9 for Voice mailbox number");
                System.out.println("Press 10 for Service command editor");
                voice = input.nextInt();

                switch (voice) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("forOutbox");
                        break;
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Press 1 for Set 1");
                        System.out.println("Press 2 for Common");
                        voice = input.nextInt();

                        switch (voice) {
                            case 1:
                                System.out.println("Press 1 for Message center number");
                                System.out.println("Press 2 for Message sent as");
                                System.out.println("Press 3 for Message validity");
                                voice = input.nextInt();

                                switch (voice) {
                                    case 1:
                                        System.out.println("Message center number");
                                        break;
                                    case 2:
                                        System.out.println("Message sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message validity");
                                        break;
                        }
                        break;

                            case 2:
                                System.out.println("Press 1 for Delivery report");
                                System.out.println("Press 2 for Reply via same center");
                                System.out.println("Press 3 for Character support");
                                voice = input.nextInt();

                                switch (voice) {
                                    case 1:
                                        System.out.println("Delivery report");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same center");
                                        break;
                                    case 3:
                                        System.out.println("Character support");
                                        break;
                                }
                                break;
                        }
                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;

                }
                break;

            case 3:
                System.out.println("Chat");
                break;

            case 4:
                System.out.println("Call Register");
                System.out.println("Press 1 for Missed calls");
                System.out.println("Press 2 for Received calls");
                System.out.println("Press 3 for Dialled number");
                System.out.println("Press 4 for Erase recent call lists");
                System.out.println("Press 5 for Show call duration");
                System.out.println("Press 6 for Show call costs");
                System.out.println("Press 7 for Call cost settings");
                System.out.println("Press 8 for Prepaid credit");
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
                }
                break;

            case 5:
                System.out.println("Tones");
                System.out.println("Press 1 for Ringing tone");
                System.out.println("Press 2 for Ringing volume");
                System.out.println("Press 3 for Incoming call alert");
                System.out.println("Press 4 for Composer");
                System.out.println("Press 5 for Message alert tones");
                System.out.println("Press 6 for Keypad tones");
                System.out.println("Press 7 for Warning and game tones");
                System.out.println("Press 8 for Vibrating alert");
                System.out.println("Press 9 for Screen saver");
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
                }
                break;

            case 6:
                System.out.println("Settings");
                System.out.println("Press 1 for Call settings");
                System.out.println("Press 2 for Phone settings");
                System.out.println("Press 3 for Security settings");
                System.out.println("Press 4 for Restore factory settings");
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
                break;

            case 7:
                System.out.println("Call divert");
                break;

            case 8:
                System.out.println("Games");
                break;

            case 9:
                System.out.println("Calculator");
                break;

            case 10:
                System.out.println("Reminders");
                break;

            case 11:
                System.out.println("Clock");
                System.out.println("Press 1 for Alarm clock");
                System.out.println("Press 2 for Clock settings");
                System.out.println("Press 3 for Date setting");
                System.out.println("Press 4 for Stopwatch");
                System.out.println("Press 5 for Countdown timer");
                System.out.println("Press 6 for Auto update of date and time");
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

                }
                break;
            case 12:
                System.out.println("Profile");
                break;

            case 13:
                System.out.println("SIM services");
                break;
            default:
                System.out.println("Oops, Enter Again!");



        }

    }
}



