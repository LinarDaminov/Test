package com.example.test.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    User user1 = new User("Cat", "cat@mail.ru");
    User expected = new User("Cat", "cat@mail.ru");
    User user2 = new User();
    User expected2 = new User();
    boolean email = false;
    boolean expectedEmail = true;


    @Test
    public void checkUserWithTwoParameters() {
        assertEquals(expected, user1);
    }

    @Test
    public void checkUserWithoutParameters() {
        assertEquals(expected2, user2);
    }

    @Test
    public void checkEqualsLoginAndEmail() {
        assertEquals(user1.getLogin(), user1.getEmail());
    }

    @Test
    public void checkEmail() {
        if (user1.getEmail().contains(".") || user2.getEmail().contains("@")) {
            email = true;
        }
        assertEquals(email, expectedEmail);

    }
}

