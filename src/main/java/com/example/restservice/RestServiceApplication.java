package com.example.restservice;

import com.example.restservice.player.Player;
import com.example.restservice.role.Role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestServiceApplication.class, args);

		Player.setAuthList("6179c1ec-2ce3-42ad-9816-0b1df7dc38bf");

		List<String> permList = new ArrayList<>();

		permList.add("minecraft.command.ban");
		permList.add("minecraft.command.kick");
		permList.add("api.info");

		Role.addRoleList(new Role("moderator", "&2[MOD]", permList, "010"));

		Role.addRoleList(new Role("developer", "&1[DEV]", permList, "008"));

		Role.addRoleList(new Role("administrator", "&4[ADMIN]", permList, "001"));


	}

}
