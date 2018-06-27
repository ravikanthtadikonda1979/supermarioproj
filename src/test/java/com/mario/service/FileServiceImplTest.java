package com.mario.service;

import com.mario.service.impl.FileServiceImpl;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FileServiceImplTest {

    private FileServiceImpl fileServiceImpl;

    @Test
    void getFileData() throws IOException {
        fileServiceImpl = new FileServiceImpl("input.txt");
        BufferedReader fileData = fileServiceImpl.getFileData();
        assertEquals(fileData.readLine(), "Number of positions:15");
        assertEquals(fileData.readLine(), "A4:B,B,B,B,B,B,E,E,E,B,E,E,E,E,E");
        assertEquals(fileData.readLine(), "A3:E,E,E,E,E,E,E,B,E,E,E,B,E,E,E");
        assertEquals(fileData.readLine(), "A2:E,E,E,E,E,E,B,E,B,E,B,B,E,E,E");
        assertEquals(fileData.readLine(), "A1:E,E,E,E,E,B,E,B,B,B,B,B,E,E,E");
        assertEquals(fileData.readLine(), "A0:E,E,E,E,B,B,B,E,E,E,B,B,E,B,E");


    }
    @Test
    void getFileDataWithNull() {
        fileServiceImpl = new FileServiceImpl(null);
        BufferedReader fileData = fileServiceImpl.getFileData();
        assertNull(fileData);
    }

    @Test
    void getFileDataWithEmptyFileName() {
        fileServiceImpl = new FileServiceImpl("");
        BufferedReader fileData = fileServiceImpl.getFileData();
        assertNull(fileData);
    }

}