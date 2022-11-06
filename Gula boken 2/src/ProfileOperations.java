import user.User;

import java.util.ArrayList;
import java.util.List;

public interface ProfileOperations {

    List<User> usersList = new ArrayList<>();

    void showList();
    int removeProfile();
    void editProfile();
    void addProfile();
    User createProfile();
}
