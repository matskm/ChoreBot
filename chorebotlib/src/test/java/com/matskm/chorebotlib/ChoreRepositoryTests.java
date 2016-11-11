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

    private void setupTestsWithoutAddingChores(){
        _choreRepo = ChoreRepository.getInstance();
        _choreRepo.cleardownRepository();
        _theChore1 = new Chore("BedroomTidy","Tidy up the bedroom","example.mp3");
        _theChore2 = new Chore("SchoolRoomTidy","Tidy up the school room","example2.mp3");
    }

    private void setupTests(){
        _choreRepo = ChoreRepository.getInstance();
        _choreRepo.cleardownRepository();
        _theChore1 = new Chore("BedroomTidy","Tidy up the bedroom","example.mp3");
        _theChore2 = new Chore("SchoolRoomTidy","Tidy up the school room","example2.mp3");
        _choreRepo.AddChore(_theChore1);
        _choreRepo.AddChore(_theChore2);
    }

    @Test
    public void AddChore_GivenEmptyRepoAndValidChore_ResultsPositionZeroReturned() {

        setupTestsWithoutAddingChores();
        int return_int = _choreRepo.AddChore(_theChore1);
        assertEquals(0, return_int);

    }

    @Test
    public void AddChore_GivenEmptyRepoAndTwoValidChores_ResultsPositionOneReturned() {

        setupTestsWithoutAddingChores();

        int return_int = _choreRepo.AddChore(_theChore1);
        return_int = _choreRepo.AddChore(_theChore2);
        assertEquals(1, return_int);

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

        int position = _choreRepo.AddChore(_theChore1);

        Chore rtn_chore = _choreRepo.GetChore(position);

        assertEquals(rtn_chore.Title(),_theChore1.Title());

    }

    @Test
    public void GetChore_GivenRepoWithTwoElementsSeekingSecond_ResultsInSecondElementReturned() {
        setupTests();

        int position = _choreRepo.AddChore(_theChore1);
        position = _choreRepo.AddChore(_theChore2);

        Chore rtn_chore = _choreRepo.GetChore(position);

        assertEquals(rtn_chore.Title(),_theChore2.Title());

    }


    @Test
    public void UpdateChore_GivenRepoWithOneElement_ResultsInVerifiedUpdatedChore() {
        setupTests();

        int pos = 0;

        String updated_title = "TidyAnotherRoom";
        Chore updated_chore = _choreRepo.GetChore(pos);
        updated_chore.SetTitle(updated_title);

        _choreRepo.UpdateChore(pos,updated_chore);

        Chore result_chore = _choreRepo.GetChore(pos);

        assertEquals(updated_title,result_chore.Title());


    }

    @Test
    public void RemoveChore_GivenRepoWithTwoChores_ResultsInRepoWithOneChore() {
        setupTests();

        assertEquals(2,_choreRepo.Size());
        _choreRepo.RemoveChore(1);
        int s = _choreRepo.Size();
        assertEquals(1,_choreRepo.Size());

    }

    @Test
    public void RemoveChore_GivenRepoWithTwoChoresAndTwoRemoves_ResultsInRepoWithNoChores() {
        setupTests();

        assertEquals(2,_choreRepo.Size());
        _choreRepo.RemoveChore(1);
        _choreRepo.RemoveChore(0);
        int s = _choreRepo.Size();
        assertEquals(0,_choreRepo.Size());

    }


}
