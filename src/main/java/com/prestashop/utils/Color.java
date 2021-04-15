package com.prestashop.utils;

public enum Color {

    WHITE("0"), BLACK("1");

    private String value;

    Color(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
