import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao {

    public User getUserByEmail(String email);

    public void addUser(User user);

    public User getUserById(int id);

    public User updateUser(User user);

    public void removeUserById(int id);

    public List<User> listUsers();
}