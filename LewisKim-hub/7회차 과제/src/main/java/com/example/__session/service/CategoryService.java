package com.example.__session.service;

import com.example.__session.dto.CategoryDto;
import com.example.__session.entity.Category;
import com.example.__session.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional
    public CategoryDto.Response createCategory(CategoryDto.Request request) {
        Category category = new Category(request.getName());
        Category saved = categoryRepository.save(category);
        return CategoryDto.Response.from(saved);
    }

    // 카테고리로 묶어서 조회 -> 카테고리 하나를 조회하면 그 안에 속한 Item들이 같이 나옴
    @Transactional(readOnly = true)
    public CategoryDto.Response getCategoryWithItems(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 카테고리입니다. id=" + categoryId));
        return CategoryDto.Response.from(category);
    }
}