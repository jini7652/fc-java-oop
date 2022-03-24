package com.fc.javaoop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        // Given
        String[] args = {"3", "1", "2"};

        // When & then
        Main.main(args);
    }

}