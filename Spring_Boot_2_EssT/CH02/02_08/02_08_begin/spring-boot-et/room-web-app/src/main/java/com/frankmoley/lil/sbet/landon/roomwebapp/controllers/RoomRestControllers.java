package com.frankmoley.lil.sbet.landon.roomwebapp.controllers;

import com.frankmoley.lil.sbet.landon.roomwebapp.models.Room;
import com.frankmoley.lil.sbet.landon.roomwebapp.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestControllers {
    private final RoomService roomService;

    public RoomRestControllers(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
}
