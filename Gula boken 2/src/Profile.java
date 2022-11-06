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
        int age = scanner.nextInt();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.next();
        System.out.println("Enter city name");
        String city = scanner.next();
        System.out.println("Enter postal code");
        int postalCode = scanner.nextInt();
        System.out.println("Enter street name");
        String streetName = scanner.next();
        System.out.println("Enter port number");
        int portNumber = scanner.nextInt();

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



        /*String completeProfile = "Firstname: "+firsName+"\nLastname: "+lastName+"\n"+"Age: "+age+"\n"+"Phone number: "+phoneNumber +
                "\nCity: " +city+"\nPostal code: "+postalCode+"\nStreet name: "+streetName+"\nPort Number: "+portNumber;
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
                int age = profile.getAge();
                String phoneNumber = profile.getPhoneNumber();
                String city = profile.getCity();
                int postalCode = profile.getPostalCode();
                String streetName = profile.getStreetName();
                int portNumber = profile.getPortNumber();

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
}
