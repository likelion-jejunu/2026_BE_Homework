package com.example.__session.dto;

import com.example.__session.entity.Category;
import com.example.__session.entity.Item;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryDto {

    // 카테고리 생성 요청 (들어올 땐 Request)
    @Getter
    public static class Request {
        private String name;
    }

    // 카테고리 조회 응답 (나갈 땐 Response) - 소속 상품 이름까지 함께 내려줌
    @Getter
    public static class Response {
        private Long id;
        private String name;
        private List<String> itemNames;

        public static Response from(Category category) {
            Response dto = new Response();
            dto.id = category.getId();
            dto.name = category.getName();
            dto.itemNames = category.getItems().stream()
                    .map(Item::getName)
                    .collect(Collectors.toList());
            return dto;
        }
    }
}