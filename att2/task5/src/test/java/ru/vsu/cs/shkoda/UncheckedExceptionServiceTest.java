package ru.vsu.cs.shkoda;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.shkoda.exceptions.UncheckedException;
import ru.vsu.cs.shkoda.services.UncheckedExceptionService;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UncheckedExceptionServiceTest {

    private final UncheckedExceptionService service = new UncheckedExceptionService();

    @Test
    public void testThrowUncheckedException() {
        assertThrows(UncheckedException.class, service::throwUncheckedException);
    }
}
