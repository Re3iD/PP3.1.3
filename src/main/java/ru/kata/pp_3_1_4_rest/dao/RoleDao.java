package ru.kata.pp_3_1_4_rest.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.kata.pp_3_1_4_rest.model.Role;

import java.util.HashSet;
import java.util.List;
@Repository
public interface RoleDao {
    public List<Role> getAllRoles();

    public Role getRoleByName(String name);

    public HashSet<Role> getSetOfRoles(String[] roleNames);

    public void add(Role role);

    public void edit(Role role);

    public Role getById(int id);
}