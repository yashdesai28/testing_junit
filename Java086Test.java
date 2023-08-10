/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java086;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hadoop
 */
public class Java086Test {
    
    public Java086Test() {
    }
    
    
    /**
     * Test of add method, of class Java086.
     */
    @Test
    public void testAdd() {
        
        Java086 obj=new Java086();
        
        //test data
        
        
        int actsum= obj.add(5, 4);
        int extoutput=9;
        
        
        assertEquals(extoutput, actsum);
        
        int actmul=obj.mul(2, 2, 2);
        int extmuloutput=8;
        assertEquals(extmuloutput, actmul);
        
        boolean match=obj.esc("yash", "yash");
        
        boolean extstringoutput=true;
        
        assertEquals(extstringoutput, match);
        
        int count=obj.count("hello yash");
        int ectcount=9;
        
        assertEquals(count, ectcount);
        
         String[] a1 = new String[]{"yash","anvi","yash"};
         String[] a2 = new String[]{"yash","romit","yash"};
         String conn=obj.con(a1, a2);
         
         System.out.print(conn);
       
        
    }
    
    

    /**
     * Test of main method, of class Java086.
     */
    @Test
    public void testMain() {
        
    }
    
}
