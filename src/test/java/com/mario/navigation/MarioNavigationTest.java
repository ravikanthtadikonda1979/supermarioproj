package com.mario.navigation;

import com.mario.model.MarioEdges;
import com.mario.util.MarioUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarioNavigationTest {

    @Test
    void navigationPath() throws IOException {
        MarioEdges marioEdges = MarioUtil.setMarioEdgesWithProperties("input.properties");
        String navigationPath = MarioNavigation.navigationPath(marioEdges);
        System.out.println(navigationPath);
        assertEquals(navigationPath,"Path:F,F,F,(J,F),(J,F),(J,F),(J,F),F,F,(J,F),(J,F),F,(J,F),F");
    }
}