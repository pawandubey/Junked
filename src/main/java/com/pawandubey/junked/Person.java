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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

    @XmlAttribute
    private String name;

    @XmlElementWrapper
    @XmlElement(name = "subject")
    private final ArrayList<Subject> subjects;
    
    public Person(){
        subjects = new ArrayList<>();
    }
    
    public Person(String person){
        name = person;
        subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
    
    public Subject getSubjectAt(int index){
        return this.subjects.get(index);
    }
    
    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
    
    public void removeSubject(Subject subject){
        if(this.subjects.contains(subject)){
            this.subjects.remove(subject);
        }
    }
    
    public void removeAllSubjects(){
        this.subjects.clear();
    }
    
    public boolean hasSubject(Subject subject){
        return this.subjects.contains(subject);
    }
}
