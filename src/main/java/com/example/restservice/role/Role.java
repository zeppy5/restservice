package com.example.restservice.role;

import java.util.ArrayList;
import java.util.List;

public record Role(String name, String prefix, List<String> permissions, String priority) {

    private static final List<Role> roleList = new ArrayList<>();

    public static void addRoleList(Role role) {
        roleList.add(role);
    }

    public static List<Role> getRoleList() {
        return roleList;
    }
}
