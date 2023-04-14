package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramTest {
    @Test
    public void exampleTests() {
        final Anagram sut = new Anagram();

        assertThat(sut.isAnagram("foefet", "toffee")).isTrue();
        assertThat(sut.isAnagram("Buckethead", "DeathCubeK")).isTrue();
        assertThat(sut.isAnagram("Twoo", "Woot")).isTrue();
        assertThat(sut.isAnagram("apple", "pale")).isFalse();
    }
}