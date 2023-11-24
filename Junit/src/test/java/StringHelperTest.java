import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringHelperTest {

    StringHelper helper ;
    @Before
    public void before(){
        helper = new StringHelper();
    }


    @Test
    public void truncateAInFirst2PositionsFirstInput(){
        assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));

    }

    @Test
    public void truncateAInFirst2PositionsSecondInput(){
        assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));

    }


    @Test
    public void areFirstAndLastTwoCharactersTheSameFirstInput(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("AACD"));

    }

    @Test
    public void areFirstAndLastTwoCharactersTheSameSecondInput(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));

    }
}
