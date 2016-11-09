package com.matskm.chorebotlib;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by matskm on 08/11/16.
 */

public class ChoreRepositoryTests {

    //method_scenario_criteria

    private ChoreRepository _choreRepo;

    private void setupTests(){
        _choreRepo = ChoreRepository.getInstance();
        _choreRepo.cleardownRepository();
    }

    @Test
    public void AddChore_GivenValidChore_ResultsInValidIdReturned() {
        setupTests();
        Chore theChore = new Chore("BedroomTidy","Tidy up the bedroom","example.mp3");
        Integer return_int = _choreRepo.AddChore(theChore);
        assertEquals((Integer)0, return_int);
    }

}
