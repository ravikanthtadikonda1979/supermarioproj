package com.mario.navigation;

import com.mario.model.MarioPath;
import com.mario.repositories.MarioNavigationRepository;
import com.mario.service.impl.FileServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarioNavigationPathTest {

    MarioNavigationPath marioNavigationPath;
    MarioNavigationRepository marioNavigationRepository;

    @BeforeEach
    void setUp() {
        marioNavigationPath = new MarioNavigationPath();
        marioNavigationRepository = new MarioNavigationRepository();
    }

    @Test
    void navigationPath() {
        FileServiceImpl fileServiceImpl = new FileServiceImpl("input.txt");

        List<MarioPath> marioPaths = marioNavigationRepository.getPath(fileServiceImpl.getFileData());
        assertEquals(marioNavigationPath.navigationPath(marioPaths), "Path:F,F,F,(J,F),(J,F),(J,F),(J,F),F,F,(J,F),(J,F),F,(J,F),F");
    }

    @Test
    void navigationPathWithEmptyData() {
        FileServiceImpl fileServiceImpl = new FileServiceImpl("");

        List<MarioPath> marioPaths = marioNavigationRepository.getPath(fileServiceImpl.getFileData());
        assertEquals(marioNavigationPath.navigationPath(marioPaths), "Path:");

    }

}