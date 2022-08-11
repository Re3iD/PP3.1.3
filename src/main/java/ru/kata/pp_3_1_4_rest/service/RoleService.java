package ru.kata.pp_3_1_4_rest.service;

import ru.kata.pp_3_1_4_rest.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    Role getRoleByName(String name);

    HashSet<Role> getSetOfRoles(String[] roleNames);

    void add(Role role);

    void edit(Role role);

    Role getById(int id);
}