/*
 * Copyright 2014 Pawan Dubey <pawandubey@outlook.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pawandubey.junked;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
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
        assertNotNull(name);
    }
}
