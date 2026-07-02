package com.example.__session.controller;

import com.example.__session.dto.CategoryDto;
import com.example.__session.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryDto.Response createCategory(@RequestBody CategoryDto.Request request) {
        return categoryService.createCategory(request);
    }

    // GET /categories/1  -> id=1 카테고리에 속한 상품들까지 함께 조회
    @GetMapping("/{categoryId}")
    public CategoryDto.Response getCategory(@PathVariable Long categoryId) {
        return categoryService.getCategoryWithItems(categoryId);
    }
}