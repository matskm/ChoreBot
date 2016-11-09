package com.matskm.chorebotlib;

/**
 * Created by matskm on 04/11/16.
 */

public class Chore {

    public Chore(String Title, String Description, String AudioFile){
        _Title = Title;
        _Description = Description;
        _AudioFile = AudioFile;
    }

    private String _Title;
    private String _Description;
    private String _AudioFile;

    public String Title(){
        return _Title;
    }

    public void SetTitle(String title){
        _Title = title;
    }

}
