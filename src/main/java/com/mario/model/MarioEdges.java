package com.mario.model;

import java.util.ArrayList;
import java.util.List;

public class MarioEdges {
    private List<ArrayList<Edge>> listOfAllEdges;

    public MarioEdges(List<ArrayList<Edge>> listOfAllEdges) {
        this.listOfAllEdges = listOfAllEdges;
    }

    public List<ArrayList<Edge>> getListOfAllEdges() {
        return listOfAllEdges;
    }

    public void setListOfAllEdges(List<ArrayList<Edge>> listOfAllEdges) {
        this.listOfAllEdges = listOfAllEdges;
    }
}
