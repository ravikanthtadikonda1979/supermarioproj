package com.mario.navigation;

import com.mario.model.MarioPath;

import java.util.List;

public class MarioNavigationPath {

    public String navigationPath(List<MarioPath> paths) {
        StringBuilder navigateString = new StringBuilder("Path:");

        if (paths == null || paths.size() == 0) return navigateString.toString();

        for (int altitude = 0, position = 0; position < paths.get(altitude).getMarioPositions().size() - 1; position++) {
            if (paths.get(altitude).getMarioPositions().get(position + 1) != null) {
                if (paths.get(altitude).getMarioPositions().get(position + 1).getValue() == 'B') {
                    altitude++;
                    navigateString.append("(J,F),");
                    continue;
                }
                if (paths.get(altitude).getMarioPositions().get(position + 1).getValue() == 'E') {
                    navigateString.append("F,");
                    if (altitude > 0) {
                        while (paths.get(--altitude).getMarioPositions().get(position + 1).getValue() == 'E')
                            if (altitude <= 0) break;
                    }
                }
            }
        }
        return navigateString.substring(0, navigateString.length() - 1);
    }


}
