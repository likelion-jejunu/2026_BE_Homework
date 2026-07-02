package com.example.__session.service;

import com.example.__session.dto.ItemDto;
import com.example.__session.entity.Category;
import com.example.__session.entity.Item;
import com.example.__session.repository.CategoryRepository;
import com.example.__session.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final CategoryRepository categoryRepository; // Category를 찾아오기 위해 필요

    @Transactional
    public ItemDto.Response createItem(ItemDto.Request request) {
        // categoryId로 실제 Category를 먼저 찾아온다 (없으면 예외)
        Category category = categoryRepository.findById(request.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException(
                        "존재하지 않는 카테고리입니다. id=" + request.getCategoryId()));

        // Item을 만들 때 category를 함께 넘겨서 연결한다
        Item item = new Item(request.getName(), request.getPrice(), category);

        Item saved = itemRepository.save(item);
        return ItemDto.Response.from(saved);
    }
}