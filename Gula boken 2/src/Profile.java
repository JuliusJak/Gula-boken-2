import builder.UserBuilder;
import user.User;

import java.util.List;
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


       /* String completeProfile =
                "Firstname: "+user.getFirstName()+
                        "\nLastname: "+user.getLastName()+
                        "\n"+"Age: "+user.getAge()+
                        "\n"+"Phone number: "+user.getPhoneNumber()+
                        "\nCity: " +user.getCity()+
                        "\nPostal code: "+user.getPostalCode()+
                        "\nStreet name: "+user.getStreetName()+
                        "\nPort Number: "+user.getPortNumber();
        System.out.println();
        System.out.println("Profile was added to list of profiles:");
        System.out.println(completeProfile);
        */



        usersList.add(user);

    }
    @Override
    public void editProfile() {

        System.out.println("Which profile do you want to remove?");
        System.out.println("Enter the index number of the profile you wish to remove:");
        System.out.println("currently "+ usersList.size()+" profiles in the list");


        int profileIndex = removeProfile();

        System.out.println("Profile " + profileIndex + " is ready for editing");

        User user = createProfile();

        usersList.add(profileIndex, user);


    }

    @Override
    public int removeProfile() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select profile index");
        int profileIndex = scanner.nextInt();
        usersList.remove(profileIndex);

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

        System.out.println("Enter keyword for search");
        String keyword = scanner.next();
        for (User u: usersList) {

            /*String completeProfile =
                    "Firstname: "+u.getFirstName()+
                            "\nLastname: "+u.getLastName()+
                            "\n"+"Age: "+u.getAge()+
                            "\n"+"Phone number: "+u.getPhoneNumber()+
                            "\nCity: " +u.getCity()+
                            "\nPostal code: "+u.getPostalCode()+
                            "\nStreet name: "+u.getStreetName()+
                            "\nPort Number: "+u.getPortNumber();

             */


            if (u.getFirstName().contains(keyword)) {
                completeProfile(u);
            }
            else if (u.getLastName().contains(keyword)) {
                completeProfile(u);
            }
            else if (u.getStreetName().contains(keyword)) {
                completeProfile(u);
            }
            else if (u.getPhoneNumber().contains(keyword)) {
                completeProfile(u);
            }
            else if (u.getCity().contains(keyword)) {
                completeProfile(u);
            }
            else if (u.getAge().contains(keyword)) {
                completeProfile(u);
            }
            else if (u.getPostalCode().contains(keyword)) {
                completeProfile(u);
            }
            else if (u.getPortNumber().contains(keyword)) {
                completeProfile(u);
            }
        }
    }

    private void completeProfile(User u) {
        System.out.println("profile found");
        String completeProfile =
                "Firstname: "+u.getFirstName()+
                        "\nLastname: "+u.getLastName()+
                        "\n"+"Age: "+u.getAge()+
                        "\n"+"Phone number: "+u.getPhoneNumber()+
                        "\nCity: " +u.getCity()+
                        "\nPostal code: "+u.getPostalCode()+
                        "\nStreet name: "+u.getStreetName()+
                        "\nPort Number: "+u.getPortNumber();
        System.out.println(completeProfile);
        System.out.println();
    }
}
