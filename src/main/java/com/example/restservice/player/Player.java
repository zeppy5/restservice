package com.example.restservice.player;

import java.util.ArrayList;
import java.util.List;

public record Player(String uuid, boolean auth, List<String> roles) {

    private static final List<String> authList = new ArrayList<>();

    public static void setAuthList(String uuid) {
        authList.add(uuid);
    }

    public static boolean checkAuth(String uuid) {
        return authList.contains(uuid);
    }

}
