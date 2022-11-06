import java.util.Scanner;

public class Menu {

    void addMenu() {


        System.out.println("Please select user role");
        System.out.println("1. User");
        System.out.println("2.Admin");
        Scanner scanner = new Scanner(System.in);
        String userRole =scanner.nextLine();
        boolean options = true;
        Profile p = new Profile();

        while (options) {

            switch (userRole) {
                case "1" -> {
                    while (options) {
                        System.out.println();
                        System.out.println("Select one of the following options:");
                        System.out.println("1- Show list of profiles");
                        System.out.println("2- Search a profile ");
                        System.out.println("3- Add a new profile  ");
                        System.out.println("4- Exit");

                        switch (scanner.next()) {
                            case "1" -> {
                                //showing a list of all profiles
                                p.showList();
                            }

                            case "2" -> {
                                System.out.println("Searching for profile");
                            }

                            case "3" -> {
                                //adding a new profile
                                p.addProfile();
                            }

                            case "4" -> {
                                System.out.println("Exiting program");
                                options = false;
                            }
                        }
                    }
                }

                case "2" -> {

                    System.out.println("Enter admin password");
                    String adminPassword = scanner.next();

                    if (adminPassword.equals("password")) {

                        System.out.println("Successfully logged in as admin");

                        while (options) {

                            System.out.println();
                            System.out.println("Select one of the following options:");
                            System.out.println("1- Show list of profiles");
                            System.out.println("2- Search a profile ");
                            System.out.println("3- Add a new profile  ");
                            System.out.println("4- Edit a profile ");
                            System.out.println("5- Remove a profile ");
                            System.out.println("6- Exit");

                            switch (scanner.next()) {
                                case "1" -> {
                                    //showing list of all profiles
                                    p.showList();
                                }

                                case "2" -> {
                                    System.out.println("Searching for profile");
                                }

                                case "3" -> {
                                    //add new profile
                                    p.addProfile();
                                }

                                case "4" -> {
                                    //edit profile
                                    p.editProfile();

                                }

                                case "5" -> {
                                    //remove a profile
                                    p.removeProfile();
                                }

                                case "6" -> {
                                    System.out.println("Exiting program");
                                    options = false;
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Wrong password");
                        System.out.println("Access denied");
                    }
                }
            }
        }
    }

}
