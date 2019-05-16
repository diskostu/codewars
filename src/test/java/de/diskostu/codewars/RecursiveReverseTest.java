package de.diskostu.codewars;

import org.junit.Assert;
import org.junit.Test;

public class RecursiveReverseTest {

    private RecursiveReverse sut = new RecursiveReverse();


    @Test
    public void test() {
        Assert.assertEquals("ateb", sut.reverse("beta"));
        Assert.assertEquals("ollah", sut.reverse("hallo"));
        Assert.assertEquals("sebastian", sut.reverse("naitsabes"));
    }
}