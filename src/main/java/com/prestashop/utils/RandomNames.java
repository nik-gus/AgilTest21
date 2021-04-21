package com.prestashop.utils;

import com.github.javafaker.Faker;

public class RandomNames {

    private RandomNames() {}

    static Faker faker = new Faker();

    public static String generateFirstName() {
        return faker.name().firstName();
    }

    public static String generateLastName() {
        return faker.name().lastName();
    }

    public static String generateAddress() {
        return faker.address().streetAddress();
    }

    public static String generateCity() {
        return faker.address().city();
    }

}
