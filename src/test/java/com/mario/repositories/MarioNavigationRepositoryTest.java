package com.mario.repositories;

import com.mario.model.MarioPath;
import com.mario.service.impl.FileServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MarioNavigationRepositoryTest {

    MarioNavigationRepository marioNavigationRepository;

    @BeforeEach
    public void setUp() {
        marioNavigationRepository = new MarioNavigationRepository();
    }

    @Test
    void getPath() {
        FileServiceImpl fileServiceImpl = new FileServiceImpl("input.txt");
        List<MarioPath> paths = marioNavigationRepository.getPath(fileServiceImpl.getFileData());
        assertEquals(paths.get(0).getMarioPositions().size(), 15);
        assertEquals(paths.size(), 5);
        assertEquals(paths.get(0).getMarioPositions().get(10).getValue(), 'B');
        assertEquals(paths.get(1).getMarioPositions().get(9).getValue(), 'B');
        assertEquals(paths.get(2).getMarioPositions().get(8).getValue(), 'B');
        assertEquals(paths.get(3).getMarioPositions().get(7).getValue(), 'B');
        assertEquals(paths.get(4).getMarioPositions().get(6).getValue(), 'E');

    }

    @Test
    void getPathWithNull() {
        assertNull(marioNavigationRepository.getPath(null));
    }

    @Test
    void getPathWithEmptyFile() throws IOException {
        BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
        Mockito.when(bufferedReader.readLine()).thenThrow(new IOException());

        List<MarioPath> paths = marioNavigationRepository.getPath(bufferedReader);
        assertEquals(paths.size(), 0);
    }
}