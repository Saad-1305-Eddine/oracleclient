package org.dador.paddingOracleClient;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dame on 18/10/2016.
 */
public class PaddingOracleQueryTest {
    static final String ENCRYPTED_MESSAGE = "5ca00ff4c878d61e1edbf1700618fb287c21578c0580965dad57f70636ea402fa0017c4acc82717730565174e2e3f713d3921bab07cba15f3197b87976525ce4";


    @Test
    public void should_return_true_for_correct_query() throws Exception {
        PaddingOracleQuery opc = new PaddingOracleQuery();
        boolean response = opc.query(ENCRYPTED_MESSAGE);
        Boolean expected = true;
        Assert.assertEquals(expected, response);
    }


    @Test
    public void should_return_false_for_invalid_query() throws Exception {
        PaddingOracleQuery opc = new PaddingOracleQuery();
        boolean response = opc.query(new String("AAAAAAAA"));
        Boolean expected = true;
        Assert.assertEquals(expected, response);
    }
}