package com.mario.service;

import com.mario.model.MarioPath;
import com.mario.model.MarioPosition;

import java.util.List;

public interface PathService {
    MarioPath getPath(List<MarioPosition> positions);

    List<MarioPosition> getPosition(String inputLine);
}
