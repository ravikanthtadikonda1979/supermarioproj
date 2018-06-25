package com.mario.navigation;

import com.mario.model.Edge;
import com.mario.model.MarioEdges;

import java.util.ArrayList;
import java.util.List;

public class MarioNavigation {

    public static String navigationPath(MarioEdges marioEdges) {
        List<ArrayList<Edge>> listOfAllEdges = marioEdges.getListOfAllEdges();
        StringBuilder navigateString = new StringBuilder("Path:");
        for (int altitude = 0, position = 0; position < listOfAllEdges.get(altitude).size(); position++) {
            if (listOfAllEdges.get(altitude).get(position).getNextEdge() != null) {
                if (listOfAllEdges.get(altitude).get(position).getNextEdge().getEdgeValue() == 'B') {
                    altitude++;
                    navigateString.append("(J,F),");
                    continue;
                }
                if (listOfAllEdges.get(altitude).get(position).getNextEdge().getEdgeValue() == 'E') {
                    navigateString.append("F,");
                    if (altitude > 0) {
                        while (listOfAllEdges.get(altitude - 1).get(position).getNextEdge().getEdgeValue() == 'E') {
                            if (altitude > 0) altitude--;
                            if (altitude <= 0) break;
                        }
                    }
                    continue;
                }
            }
        }

        return navigateString.substring(0, navigateString.length() - 1);
    }

}
