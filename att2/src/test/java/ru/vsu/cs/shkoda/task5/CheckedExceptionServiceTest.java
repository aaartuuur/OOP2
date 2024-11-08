package ru.vsu.cs.shkoda.task5;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.shkoda.task5.exceptions.CheckedException;
import ru.vsu.cs.shkoda.task5.services.services.CheckedExceptionService;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CheckedExceptionServiceTest {

    private final CheckedExceptionService service = new CheckedExceptionService();

    @Test
    public void testThrowCheckedException() {
        assertThrows(CheckedException.class, service::throwCheckedException);
    }

    @Test
    public void testCheckedException() {
        assertDoesNotThrow(service::catchCheckedException);
    }
}
