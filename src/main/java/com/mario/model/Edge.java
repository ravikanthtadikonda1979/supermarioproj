package com.mario.model;

public class Edge {

    private char edgeValue;
    private Edge nextEdge;

    public Edge() {
    }

    public Edge(char edgeValue) {
        this.edgeValue = edgeValue;
    }

    public char getEdgeValue() {
        return edgeValue;
    }

    public void setEdgeValue(char edgeValue) {
        this.edgeValue = edgeValue;
    }

    public Edge getNextEdge() {
        return nextEdge;
    }

    public void setNextEdge(Edge nextEdge) {
        this.nextEdge = nextEdge;
    }
}
