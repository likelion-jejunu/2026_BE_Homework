package com.example.session;

public class Todo {

    // TODO: private 필드 사용하기
    // TODO: title 필드 만들기
    // TODO: done 필드 만들기

    // TODO: 기본 생성자 만들기

    // TODO: 전체 필드 생성자 만들기

    // TODO: getter / setter 만들기

    private int id;
    private String title;
    private boolean done;

    public Todo() {
    }

    public Todo(int id, String title, boolean done){
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title; }
    public boolean getDone() { return this.done; }
    public void setDone(boolean done) { this.done = done; }
}