package com.matskm.chorebotlib;

/**
 * Created by matskm on 04/11/16.
 */

public class ChoreRepository {

    private static ChoreRepository instance = null;

    protected ChoreRepository(){
        // exists only to defeat instantiation
    }

    public static ChoreRepository getInstance(){
        if(instance == null){
            instance = new ChoreRepository();
        }
        return instance;

    }
    
}
