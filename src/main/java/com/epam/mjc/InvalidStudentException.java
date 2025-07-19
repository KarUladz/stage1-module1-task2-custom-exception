package com.epam.mjc;

public class InvalidStudentException extends IllegalArgumentException {
    public InvalidStudentException(String message) {
        super("Could not find student with ID " + message);
    }
}
