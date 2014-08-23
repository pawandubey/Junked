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

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class PersonTest {
    
    public PersonTest() {
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        Person instance = new Person("TestPerson");
        String expResult = "TestPerson";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        String name = "TestPerson";
        Person instance = new Person();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getSubjects method, of class Person.
     */
    @Test
    public void testGetSubjects() {
        Person instance = new Person();
        ArrayList<Subject> expResult = new ArrayList<>();
        expResult.add(new Subject("English"));
        expResult.add(new Subject("Maths"));
        instance.addSubject(new Subject("English"));
        instance.addSubject(new Subject("Maths"));
        ArrayList<Subject> result = instance.getSubjects();
        assertEquals(false,expResult.equals(result));
    }

    /**
     * Test of getSubjectAt method, of class Person.
     */
    @Test
    public void testGetSubjectAt() {
        int index = 1;
        Person instance = new Person();
        ArrayList<Subject> expResult = new ArrayList<>();
        expResult.add(new Subject("English"));
        expResult.add(new Subject("Maths"));
        instance.addSubject(new Subject("English"));
        instance.addSubject(new Subject("Maths"));
        Subject result = instance.getSubjectAt(index);
        assertEquals(0,expResult.get(index).compareTo(result));
    }

    /**
     * Test of addSubject method, of class Person.
     */
    @Test
    public void testAddSubject() {
        Subject subject = new Subject("English");
        Person instance = new Person();
        instance.addSubject(subject);
        assertEquals(true, instance.hasSubject(subject));
    }

    /**
     * Test of removeSubject method, of class Person.
     */
    @Test
    public void testRemoveSubject() {
        Subject subject = new Subject("English");
        Person instance = new Person();
        instance.addSubject(subject);
        instance.removeSubject(subject);
        assertEquals(false, instance.hasSubject(subject));
    }

    /**
     * Test of removeAllSubjects method, of class Person.
     */
    @Test
    public void testRemoveAllSubjects() {
        Person instance = new Person();
        instance.addSubject(new Subject("English"));
        instance.addSubject(new Subject("Maths"));
        instance.removeAllSubjects();
        assertEquals(false, instance.hasSubject(new Subject("English")));
    }
    
}
