package com.example.__session.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // 연관관계의 "주인이 아닌 쪽" (FK를 들고 있지 않음, 조회만 가능)
    // mappedBy = "category" -> Item 엔티티에 있는 category 필드가 이 관계의 주인이라는 뜻
    @OneToMany(mappedBy = "category")
    private List<Item> items = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }
}