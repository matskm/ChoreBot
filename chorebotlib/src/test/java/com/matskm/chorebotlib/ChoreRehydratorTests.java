package com.matskm.chorebotlib;

/**
 * Created by matskm on 11/11/16.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChoreRehydratorTests {

    @Test
    public void rehydrate_GivenHardCodedRehydratorAndEmptyRepo_ResultsInCorrectRepo() {
        
        ChoreRepository choreRepo = ChoreRepository.getInstance();

        ChoreRehydratorHardCoded rh = new ChoreRehydratorHardCoded();
        int r_size = rh.rehyrdrate(choreRepo);

        assertEquals(r_size,4);

    }


}
