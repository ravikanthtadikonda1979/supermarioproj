package com.mario.app;

import com.mario.util.MarioNavigationUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarioNavigationPathUtilTest {

    @Test
    void getMarioNavigationPath() {
        String navigationPath = MarioNavigationUtil.getMarioNavigationPath("input.txt");
        assertEquals(navigationPath,"Path:F,F,F,(J,F),(J,F),(J,F),(J,F),F,F,(J,F),(J,F),F,(J,F),F");
    }

    @Test
    void getMarioNavigationPathWithWrongFileName() {
        String navigationPath = MarioNavigationUtil.getMarioNavigationPath("wrong.txt");
        assertEquals(navigationPath,"Path:");
    }
    @Test
    void getMarioNavigationPathWithEmptyFileName() {
        String navigationPath = MarioNavigationUtil.getMarioNavigationPath("");
        assertEquals(navigationPath,"Path:");
    }

    @Test
    void getMarioNavigationPathWithNull() {
        String navigationPath = MarioNavigationUtil.getMarioNavigationPath(null);
        assertEquals(navigationPath,"Path:");
    }
}