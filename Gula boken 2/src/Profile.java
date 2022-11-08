import builder.UserBuilder;
import user.User;

import java.util.Scanner;

public class Profile implements ProfileOperations{

    @Override
    public User createProfile() {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter first name");
        String firsName = scanner.next();
        System.out.println("Enter last name");
        String lastName = scanner.next();
        System.out.println("Enter age");
        String age = scanner.next();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.next();
        System.out.println("Enter city name");
        String city = scanner.next();
        System.out.println("Enter postal code");
        String postalCode = scanner.next();
        System.out.println("Enter street name");
        String streetName = scanner.next();
        System.out.println("Enter port number");
        String portNumber = scanner.next();

        User user = new UserBuilder()
                .firstName(firsName)
                .lastName(lastName)
                .age(age)
                .phoneNumber(phoneNumber)
                .city(city)
                .postalCode(postalCode)
                .streetName(streetName)
                .portNumber(portNumber)
                .build();


        return user;
    }

    @Override
    public void addProfile() {


        User user = createProfile();

        usersList.add(user);


    }
    @Override
    public void editProfile() {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Which profile do you want to edit?");
        System.out.println("Enter the index number of the profile you wish to edit:");
        System.out.println("currently "+ usersList.size() +" profiles in the list");

        int profileIndex = scanner.nextInt();


        String completeProfile =
                "Firstname: "+usersList.get(profileIndex).getFirstName()+
                        "\nLastname: "+usersList.get(profileIndex).getLastName()+
                        "\nAge: "+usersList.get(profileIndex).getAge()+
                        "\nPhone number: "+usersList.get(profileIndex).getPhoneNumber()+
                        "\nCity: " +usersList.get(profileIndex).getCity()+
                        "\nPostal code: "+usersList.get(profileIndex).getPostalCode()+
                        "\nStreet name: "+usersList.get(profileIndex).getStreetName()+
                        "\nPort Number: "+usersList.get(profileIndex).getPortNumber();
        System.out.println();
        System.out.println(completeProfile);
        System.out.println();

        System.out.println("Is this the profile you want to edit?");
        System.out.println("Y/N");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Y")) {

            System.out.println("Enter new input to edit or press ENTER to not edit");
            System.out.println("Enter new firstname");
            scanner.nextLine();
            String newFirstName = scanner.nextLine();
            if (!newFirstName.equals("")) {
                usersList.get(profileIndex).setFirstName(newFirstName);
            }
            System.out.println("Enter new lastname");
            String newLastName = scanner.nextLine();
            if (!newLastName.equals("")) {
                usersList.get(profileIndex).setLastName(newLastName);
            }
            System.out.println("enter new age");
            String newAge = scanner.nextLine();
            if (!newAge.equals("")) {
                usersList.get(profileIndex).setAge(newAge);
            }
            System.out.println("enter new phone number");
            String newPhoneNumber = scanner.nextLine();
            if (!newPhoneNumber.equals("")) {
                usersList.get(profileIndex).setPhoneNumber(newPhoneNumber);
            }
            System.out.println("enter new city");
            String newCity = scanner.nextLine();
            if (!newCity.equals("")) {
                usersList.get(profileIndex).setCity(newCity);
            }
            System.out.println("enter new postal code");
            String newPostalCode = scanner.nextLine();
            if (!newPostalCode.equals("")) {
                usersList.get(profileIndex).setPostalCode(newPostalCode);
            }
            System.out.println("enter new street name");
            String newStreetName = scanner.nextLine();
            if (!newStreetName.equals("")) {
                usersList.get(profileIndex).setStreetName(newStreetName);
            }
            System.out.println("enter new port number");
            String newPortNumber = scanner.nextLine();
            if (!newPortNumber.equals("")) {
                usersList.get(profileIndex).setPortNumber(newPortNumber);
            }
        }

    }

    @Override
    public int removeProfile() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select profile index");
        System.out.println("available index numbers");
        for (int i = 0; i < usersList.size() ; i++) {
            System.out.println(i);
        }

        int profileIndex = scanner.nextInt();

        if (profileIndex < usersList.size() && profileIndex >= 0) {
            usersList.remove(profileIndex);
            System.out.println("profile "+profileIndex+" has been deleted");
        } else {
            System.out.println("Invalid index number");
            System.out.println("Returning to menu");
        }

        return profileIndex;
    }

    @Override
    public void showList() {

        System.out.println("Showing list of profiles:");

        if (usersList.size() == 0) {
            System.out.println(" --List of profiles is currently empty--");
        } else {

            int index = 0;


            for (User profile : usersList) {
                String firstName = profile.getFirstName();
                String lastName = profile.getLastName();
                String age = profile.getAge();
                String phoneNumber = profile.getPhoneNumber();
                String city = profile.getCity();
                String postalCode = profile.getPostalCode();
                String streetName = profile.getStreetName();
                String portNumber = profile.getPortNumber();


                System.out.println();
                System.out.println("------------------------------");
                System.out.println("Profile index: " + index);
                System.out.println(firstName + " " + lastName);
                System.out.println("Age: " + age);
                System.out.println("Phone number: " + phoneNumber);
                System.out.println("Address: ");
                System.out.println("City "+city);
                System.out.println("postal code: "+postalCode);
                System.out.println("Street name: "+streetName);
                System.out.println("Port number: "+portNumber);
                System.out.println("------------------------------");
                index++;


            }
        }
    }



    @Override
    public void searchProfile() {

        Scanner scanner = new Scanner(System.in);
        boolean whileBoolean = true;



        while (whileBoolean) {

            System.out.println("Select search option");
            System.out.println("1- Search for firstname");
            System.out.println("2- Search for lastname");
            System.out.println("3- Search for address");
            System.out.println("4- free search");

            String selectOption = scanner.next();

            switch (selectOption) {

                case "1" -> {
                    System.out.println("Enter keyword for search");
                    String keyword = scanner.next();
                    for (User u: usersList) {

                        if (u.getFirstName().contains(keyword)) {
                            completeProfile(u);
                        } else {
                            System.out.println("Found no profiles that matches your search in the system");
                        }
                    }
                    whileBoolean = false;
                }
                case "2" -> {
                    System.out.println("Enter keyword for search");
                    String keyword = scanner.next();
                    for (User u: usersList) {

                        if (u.getLastName().contains(keyword)) {
                            completeProfile(u);
                        } else {
                            System.out.println("Found no profiles that matches your search in the system");
                        }
                    }
                    whileBoolean = false;
                }
                case "3" -> {
                    System.out.println("Enter keyword for search");
                    String keyword = scanner.next();
                    for (User u: usersList) {

                        if (u.getStreetName().contains(keyword)) {
                            completeProfile(u);
                        } else {
                            System.out.println("Found no profiles that matches your search in the system");
                        }
                    }
                    whileBoolean = false;
                }
                case "4" -> {
                    System.out.println("Enter keyword for search");
                    String keyword = scanner.next();
                    for (User u: usersList) {


                        if (u.getFirstName().contains(keyword)) {
                            completeProfile(u);
                        } else if (u.getLastName().contains(keyword)) {
                            completeProfile(u);
                        } else if (u.getStreetName().contains(keyword)) {
                            completeProfile(u);
                        } else if (u.getPhoneNumber().contains(keyword)) {
                            completeProfile(u);
                        } else if (u.getCity().contains(keyword)) {
                            completeProfile(u);
                        } else if (u.getAge().contains(keyword)) {
                            completeProfile(u);
                        } else if (u.getPostalCode().contains(keyword)) {
                            completeProfile(u);
                        } else if (u.getPortNumber().contains(keyword)) {
                            completeProfile(u);
                        } else {
                            System.out.println("Found no profiles that matches your search in the system");
                        }
                    }
                    whileBoolean = false;
                }
            }
        }
    }

    private void completeProfile(User u) {
        System.out.println("profile found");
        String completeProfile =
                        "Firstname: "+u.getFirstName()+
                        "\nLastname: "+u.getLastName()+
                        "\nAge: "+u.getAge()+
                        "\nPhone number: "+u.getPhoneNumber()+
                        "\nCity: " +u.getCity()+
                        "\nPostal code: "+u.getPostalCode()+
                        "\nStreet name: "+u.getStreetName()+
                        "\nPort Number: "+u.getPortNumber();
        System.out.println(completeProfile);
        System.out.println();
    }
}
