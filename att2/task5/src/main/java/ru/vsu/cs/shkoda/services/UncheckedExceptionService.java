package ru.vsu.cs.shkoda.services;
import ru.vsu.cs.shkoda.exceptions.UncheckedException;
public class UncheckedExceptionService {
    public void throwUncheckedException() {
        throw new UncheckedException("This is an unchecked exception.");
    }
}