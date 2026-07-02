package com.example.__session.controller;

import com.example.__session.dto.ItemDto;
import com.example.__session.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    // POST /items  body: { "name": "아메리카노", "price": 4500, "categoryId": 1 }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ItemDto.Response createItem(@RequestBody ItemDto.Request request) {
        return itemService.createItem(request);
    }
}