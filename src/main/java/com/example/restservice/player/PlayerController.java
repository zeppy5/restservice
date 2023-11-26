package com.example.restservice.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {

    @GetMapping("/player")
    public Player player(@RequestParam(value = "uuid", defaultValue = "") String uuid) {
        List<String> roleList = new ArrayList<>();
        roleList.add("moderator");
        roleList.add("developer");
        return new Player(uuid, Player.checkAuth(uuid), roleList);
    }

}
