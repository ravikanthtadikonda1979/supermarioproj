package com.mario.service.impl;

import com.mario.model.MarioPath;
import com.mario.model.MarioPosition;
import com.mario.service.PathService;

import java.util.ArrayList;
import java.util.List;

public class PathServiceImpl implements PathService {

    @Override
    public MarioPath getPath(List<MarioPosition> positions) {
        MarioPath path = new MarioPath();
        path.setMarioPositions(positions);
        return path;
    }

    @Override
    public List<MarioPosition> getPosition(String inputLine) {
        List<MarioPosition> listOfPositions = new ArrayList<>();
        if(inputLine==null || inputLine.isEmpty()) return listOfPositions;

        String strIndex = getAltitude(inputLine);
        String[] inputValues = getPathDetails(inputLine);

        for (int index = 0; index < inputValues.length; index++) {
            MarioPosition position = new MarioPosition();
            position.setAltitude(Integer.parseInt(strIndex));
            position.setIndex(index);
            position.setValue(inputValues[index].charAt(0));
            listOfPositions.add(position);
        }
        return listOfPositions;
    }

    private String[] getPathDetails(String inputLine) {
        return inputLine.split(":")[1].split(",");
    }

    private String getAltitude(String inputLine) {
        String strIndex = inputLine.split(":")[0];
        strIndex = strIndex.substring(1, strIndex.length());
        return strIndex;
    }
}
