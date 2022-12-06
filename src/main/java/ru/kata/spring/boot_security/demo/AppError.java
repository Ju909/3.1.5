package ru.kata.spring.boot_security.demo;

import org.springframework.stereotype.Component;

@Component
public class AppError {
    private String info;

    public AppError() {
    }

    public AppError(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
