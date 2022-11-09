import user.User;

import java.util.ArrayList;
import java.util.List;

public interface ProfileOperations {

    List<User> usersList = new ArrayList<>();

    void showList();
    void removeProfile();
    void editProfile();
    void addProfile();
    User createProfile();
    void searchProfile();


}
