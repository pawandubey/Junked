/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pawandubey.junked.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.pawandubey.junked.Subject;
/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class SubjectTest {
    
    public SubjectTest() {
    }
    
    private Subject subject;
    
    @Before
    public void beforeTest(){
        subject = new Subject("TestSub");
    }

    @Test
    public void noNegativeBunks(){
        
        subject.setAllowedBunks(12);
        subject.setTotalBunks(12);
        int bunksRemaining = subject.getAllowedBunks()-subject.getTotalBunks();
        assertEquals(0, bunksRemaining);
    }
    
    @Test
    public void noSubjectWithoutName(){
        String name = subject.getName();
        assertEquals("TestSub",name);
    }
}
