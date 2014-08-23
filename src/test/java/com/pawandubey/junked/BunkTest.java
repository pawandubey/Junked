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

import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class BunkTest {
    
    public BunkTest() {
    }

    /**
     * Test of getDate method, of class Bunk.
     */
    @Test
    public void testGetDate() {
        Bunk instance = new Bunk();
        Calendar expResult = Calendar.getInstance();
        expResult.set(Calendar.HOUR_OF_DAY, 0);
        Calendar result = instance.getDate();
        assertEquals(expResult.DAY_OF_YEAR, result.DAY_OF_YEAR);
    }

    /**
     * Test of setDate method, of class Bunk.
     */
    @Test
    public void testSetDate() {
        Calendar date = Calendar.getInstance();
        Bunk instance = new Bunk();
        instance.setDate(date);
        assertEquals(instance.getDate(),date);
    }
    
}
