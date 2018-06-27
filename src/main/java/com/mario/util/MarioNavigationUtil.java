package com.mario.util;

import com.mario.navigation.MarioNavigationPath;
import com.mario.repositories.MarioNavigationRepository;
import com.mario.service.impl.FileServiceImpl;

public class MarioNavigationUtil {

    public static String getMarioNavigationPath(String fileName) {
        FileServiceImpl fileServiceImpl = new FileServiceImpl(fileName);
        MarioNavigationRepository marioNavigationRepository = new MarioNavigationRepository();
        MarioNavigationPath marioNavigationPath = new MarioNavigationPath();
        return marioNavigationPath.navigationPath(marioNavigationRepository.getPath(fileServiceImpl.getFileData()));
    }

}
