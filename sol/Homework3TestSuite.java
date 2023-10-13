package sol;

import org.junit.Assert;
import src.IDictionary;
import src.KeyAlreadyExistsException;
import src.KeyNotFoundException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertNotEquals;


/**
 * Test suite for hash tables
 */
public class Homework3TestSuite {

    /**
     * An example test with an assertion
     */
    @Test
    public void testExample() {
        Assert.assertEquals(2, 1 + 1);
    }

    /**
     *This example is here to show you how to input the filenames for your Grep
     * tests
     */
    @Test
    public void testGrepExample() {
        Grep grep = new Grep("grep-test-files/ozymandias.txt");
        Set<Integer> result = grep.lookup("traveller");

        // TODO:  This test is missing an assertion
        // if you want to keep this test, you should add one!
    }

}
