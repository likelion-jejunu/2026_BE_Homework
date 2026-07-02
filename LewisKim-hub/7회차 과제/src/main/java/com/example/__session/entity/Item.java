package com.example.__session.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;

    // 연관관계의 주인 (FK를 들고 있는 쪽) -> items 테이블에 category_id 컬럼이 생김
    // 여러 Item -> 하나의 Category 이므로 ManyToOne
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // 기존에 category 없이 쓰던 생성자가 있다면 그건 그대로 두고, 아래처럼 오버로드해서 추가해도 됨
    public Item(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}