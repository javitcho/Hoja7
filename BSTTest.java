/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javi-
 */
public class BSTTest {
    BinarySearchTree bst;
    public BSTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        bst = new BinarySearchTree();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void Testadd(){
        ComparableAssociation c = new ComparableAssociation();
            c.setkey("Cosa");
            c.setValue("Cosa");
            bst.add(c);
            assertEquals(bst.count, 1);
    }
    
    @Test
    public void Testget(){
        ComparableAssociation c = new ComparableAssociation();
            c.setkey("Cosa");
            c.setValue(1);
            bst.add(c);
            assertEquals((int)c.getValue(), (int) ((ComparableAssociation) bst.get(c)).getValue());
    }
}
