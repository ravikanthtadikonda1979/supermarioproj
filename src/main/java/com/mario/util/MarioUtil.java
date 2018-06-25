package com.mario.util;

import com.mario.model.Edge;
import com.mario.model.MarioEdges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MarioUtil {

    public static MarioEdges setMarioEdgesWithProperties(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        bufferedReader.readLine();
        ArrayList<ArrayList<Edge>> listOfAllEdges = new ArrayList<>();
        String str = "";
        ArrayList<String[]> tempString = new ArrayList<>();
        while ((str = bufferedReader.readLine()) != null) {
            String[] inputs = str.split(":")[1].split(",");
            tempString.add(inputs);
        }
        for (int i = tempString.size() - 1; i >= 0; i--) {
            String[] inputs = tempString.get(i);
            ArrayList<Edge> listOfSingleEdge = new ArrayList<>();
            for (int j = 0; j < inputs.length; j++)
                listOfSingleEdge.add(new Edge(inputs[j].charAt(0)));

            listOfAllEdges.add(listOfSingleEdge);
        }
        bufferedReader.close();

        for (int i = 0; i < listOfAllEdges.size(); i++) {
            for (int j = 0; j + 1 < listOfAllEdges.get(i).size(); j++)
                listOfAllEdges.get(i).get(j).setNextEdge(listOfAllEdges.get(i).get(j + 1));
        }
        return new MarioEdges(listOfAllEdges);
    }
}
