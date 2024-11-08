package ru.vsu.cs.shkoda.task5.services.services;
import ru.vsu.cs.shkoda.task5.exceptions.UncheckedException;
public class UncheckedExceptionService {
    public void throwUncheckedException() {
        throw new UncheckedException("This is an unchecked exception.");
    }
}