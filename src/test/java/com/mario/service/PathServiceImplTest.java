package com.mario.service;

import com.mario.model.MarioPath;
import com.mario.model.MarioPosition;
import com.mario.service.impl.PathServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathServiceImplTest {
    PathServiceImpl pathServiceImpl;

    @BeforeEach
    void setUp() {
        pathServiceImpl = new PathServiceImpl();
    }

    @Test
    void getPosition() {
        List<MarioPosition> listOfPositions = pathServiceImpl.getPosition("A0:E,E,E,E,B,B,B,E,E,E,B,B,E,B,E");
        assertEquals(listOfPositions.size(), 15);
        assertEquals(listOfPositions.get(4).getAltitude(), 0);
        assertEquals(listOfPositions.get(4).getValue(), 'B');
        assertEquals(listOfPositions.get(4).getIndex(), 4);

    }

    @Test
    void getPositionWithWrongData() {
        List<MarioPosition> listOfPositions = pathServiceImpl.getPosition("");
        assertEquals(listOfPositions.size(), 0);
    }

    @Test
    void getPositionWithNullData() {
        List<MarioPosition> listOfPositions = pathServiceImpl.getPosition(null);
        assertEquals(listOfPositions.size(), 0);
    }

    @Test
    void getPath() {
        MarioPosition marioPosition1 = new MarioPosition();
        marioPosition1.setAltitude(1);
        marioPosition1.setIndex(1);
        marioPosition1.setValue('B');

        MarioPosition marioPosition2 = new MarioPosition();
        marioPosition2.setAltitude(2);
        marioPosition2.setIndex(2);
        marioPosition2.setValue('E');

        List<MarioPosition> marioPositions = Arrays.asList(marioPosition1, marioPosition2);
        MarioPath path = pathServiceImpl.getPath(marioPositions);

        assertEquals(path.getMarioPositions(), marioPositions);

    }

    @Test
    void getPathWithEmpty() {

        MarioPath path = pathServiceImpl.getPath(new ArrayList<>());
        int size = path.getMarioPositions().size();
        assertEquals(size, 0);

    }

}