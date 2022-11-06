package builder;

import user.User;

public class UserBuilder {
    private User user;

    public UserBuilder() {
        this.user = new User();
    }

    public UserBuilder firstName (String firsName) {
        user.setFirstName(firsName);
        return this;
    }

    public UserBuilder lastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    public UserBuilder age(int age) {
        user.setAge(age);
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        user.setPhoneNumber(phoneNumber);
        return this;
    }

    public UserBuilder city(String city) {
        user.setCity(city);
        return this;
    }

    public UserBuilder postalCode(int postalCode) {
        user.setPostalCode(postalCode);
        return this;
    }

    public UserBuilder streetName(String streetName) {
        user.setStreetName(streetName);
        return this;
    }

    public UserBuilder portNumber(int portNumber) {
        user.setPortNumber(portNumber);
        return this;
    }

    public User build() {
        return  this.user;
    }


}
