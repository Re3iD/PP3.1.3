package ru.kata.pp_3_1_4_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.pp_3_1_4_rest.dao.RoleDao;
import ru.kata.pp_3_1_4_rest.model.Role;

import java.util.HashSet;
import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
    private RoleDao roleDao;


    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Override

    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }

    @Override
    public HashSet<Role> getSetOfRoles(String[] roleNames) {
        return roleDao.getSetOfRoles(roleNames);
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public void edit(Role role) {
        roleDao.edit(role);
    }

    @Override
    public Role getById(int id) {
        return roleDao.getById(id);
    }
}
