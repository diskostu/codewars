package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveReverseTest {

    private final RecursiveReverse sut = new RecursiveReverse();


    @Test
    public void test() {
        assertEquals("ateb", sut.reverse("beta"));
        assertEquals("ollah", sut.reverse("hallo"));
        assertEquals("sebastian", sut.reverse("naitsabes"));
    }
}