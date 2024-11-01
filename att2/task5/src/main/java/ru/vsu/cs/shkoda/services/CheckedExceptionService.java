package ru.vsu.cs.shkoda.services;

import ru.vsu.cs.shkoda.exceptions.CheckedException;

public class CheckedExceptionService {
    public void throwCheckedException() throws CheckedException {
        throw new CheckedException("This is a checked exception.");
    }

    public void catchCheckedException() {
        try {
            throwCheckedException();
        } catch (CheckedException e) {
            System.out.println("Caught CheckedException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
