package com.matskm.chorebotlib;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by matskm on 08/11/16.
 */

public class ChoreRepositoryTests {

    //method_scenario_criteria

    private ChoreRepository _choreRepo;

    private Chore _theChore1;
    private Chore _theChore2;

    private void setupTests(){
        _choreRepo = ChoreRepository.getInstance();
        _choreRepo.cleardownRepository();
        _theChore1 = new Chore("BedroomTidy","Tidy up the bedroom","example.mp3");
        _theChore2 = new Chore("SchoolRoomTidy","Tidy up the school room","example2.mp3");
    }

    @Test
    public void AddChore_GivenEmptyRepoAndValidChore_ResultsPositionZeroReturned() {

        setupTests();
        Integer return_int = _choreRepo.AddChore(_theChore1);
        assertEquals((Integer)0, return_int);

    }

    @Test
    public void AddChore_GivenEmptyRepoAndTwoValidChores_ResultsPositionOneReturned() {

        setupTests();

        Integer return_int = _choreRepo.AddChore(_theChore1);
        return_int = _choreRepo.AddChore(_theChore2);
        assertEquals((Integer)1, return_int);

    }


//    @Test
//    public void GetChore_GivenEmptyRepo_ResultsInException() throws IndexOutOfBoundsException {
//
//        setupTests();
//        try{
//            Chore return_val = _choreRepo.GetChore(0);
//        }
//        catch(IndexOutOfBoundsException e){
//            throw e;
//        }
//    }


    @Test
    public void GetChore_GivenRepoWithOneElement_ResultsInSameElementReturned() {
        setupTests();

        Integer position = _choreRepo.AddChore(_theChore1);

        Chore rtn_chore = _choreRepo.GetChore(position);

        assertEquals(rtn_chore.Title(),_theChore1.Title());

    }


}
