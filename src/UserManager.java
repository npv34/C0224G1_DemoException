package src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public List<User> listUser;

    public UserManager() {
        this.listUser = new ArrayList<User>();
    }

    public void addUser(User user) {
        this.listUser.add(user);
    }

    public User getUser(int index) throws IOException {
        if (index > this.listUser.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return this.listUser.get(index);
    }
}
