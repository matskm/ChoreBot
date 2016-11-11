package com.matskm.chorebotlib;

/**
 * Created by matskm on 11/11/16.
 */

public class ChoreRehydratorHardCoded implements IChoreRehyradtor {

    public int rehyrdrate(ChoreRepository repo){

        repo.AddChore( new Chore("BedroomTidy","Tidy up the bedroom","example.mp3") );
        repo.AddChore( new Chore("SchoolRoomTidy","Tidy up the school room","example.mp3") );
        repo.AddChore( new Chore("LaunchRocket","Launch a manned rocket into space","example.mp3") );
        repo.AddChore( new Chore("CalcPi","Calculate pi precisely","example.mp3") );

        return repo.Size();
    }

}
