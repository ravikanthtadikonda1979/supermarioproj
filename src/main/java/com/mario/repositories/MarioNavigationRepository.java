package com.mario.repositories;

import com.mario.model.MarioPath;
import com.mario.model.MarioPosition;
import com.mario.service.impl.PathServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarioNavigationRepository {

    public List<MarioPath> getPath(BufferedReader bufferedReader) {
        String inputLine;
        List<MarioPath> paths = new ArrayList<>();
        PathServiceImpl pathServiceImpl = new PathServiceImpl();
        if (bufferedReader == null) return null;
        try {
            bufferedReader.readLine();
            while ((inputLine = bufferedReader.readLine()) != null) {
                List<MarioPosition> positions = pathServiceImpl.getPosition(inputLine);
                paths.add(pathServiceImpl.getPath(positions));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Collections.reverse(paths);
        return paths;
    }
}
