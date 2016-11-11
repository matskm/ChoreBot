package com.matskm.chorebotlib;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matskm on 04/11/16.
 */

public class ChoreRepository {

    private static ChoreRepository instance = null;

    private static List<Chore> _choreList;

    protected ChoreRepository(){
        _choreList = new ArrayList<Chore>();
    }

    public void cleardownRepository(){
        _choreList.clear();
    }

    public static ChoreRepository getInstance(){
        if(instance == null){
            instance = new ChoreRepository();
        }
        return instance;
    }

    public static Integer AddChore(Chore chore){
        _choreList.add(chore);
        return _choreList.size() - 1;
    }

    public static Chore GetChore(int pos){
        try{
            return _choreList.get(pos);
        }
        catch(IndexOutOfBoundsException e){
            throw e;
        }

    }

    public static void UpdateChore(int pos, Chore chore){
        _choreList.set(pos,chore);
    }

    public static void RemoveChore(int pos){
        _choreList.remove(pos);
    }

    public static int Size(){
        return _choreList.size();
    }

    public static void Print(String prefix) {
        System.out.println(prefix + _choreList);
    }



}
