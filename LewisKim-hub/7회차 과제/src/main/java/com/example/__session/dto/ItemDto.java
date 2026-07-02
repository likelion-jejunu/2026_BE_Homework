package com.example.__session.dto;

import com.example.__session.entity.Item;
import lombok.Getter;

public class ItemDto {

    // 상품 생성 요청 - categoryId로 "이 상품이 어느 카테고리에 속할지" 같이 받음
    @Getter
    public static class Request {
        private String name;
        private int price;
        private Long categoryId;
    }

    // 상품 조회 응답 - 카테고리 이름까지 함께 내려줌
    @Getter
    public static class Response {
        private Long id;
        private String name;
        private int price;
        private String categoryName;

        public static Response from(Item item) {
            Response dto = new Response();
            dto.id = item.getId();
            dto.name = item.getName();
            dto.price = item.getPrice();
            dto.categoryName = item.getCategory() != null ? item.getCategory().getName() : null;
            return dto;
        }
    }
}