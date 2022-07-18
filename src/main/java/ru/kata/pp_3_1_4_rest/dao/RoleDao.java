import java.util.HashSet;
import java.util.List;

public interface RoleDao {
    public List<Role> getAllRoles();

    public Role getRoleByName(String name);

    public HashSet<Role> getSetOfRoles(String[] roleNames);

    public void add(Role role);

    public void edit(Role role);

    public Role getById(int id);
}