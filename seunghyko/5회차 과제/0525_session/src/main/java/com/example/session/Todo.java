package com.example.session;

public class Todo {

    // TODO: private 필드 사용하기
    private Long id;
    // TODO: title 필드 만들기
    private String title;
    // TODO: done 필드 만들기
    private boolean done;
    // TODO: 기본 생성자 만들기
    public  Todo(){

    }
    // TODO: 전체 필드 생성자 만들기
    public Todo(Long id, String title, boolean done){
        this.id = id;
        this.title = title;
        this.done = done;
    }
    // TODO: getter / setter 만들기
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public boolean isDone(){
        return done;
    }
    public void setDone(boolean done){
        this.done = done;
    }
}