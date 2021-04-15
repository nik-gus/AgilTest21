package com.prestashop.pages.clothes;

public enum Size {

    SMALL("1"), MEDIUM("2"), LARGE("3"), EXTRA_LARGE("4");

    private String value;

    Size(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
