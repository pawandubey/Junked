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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Subject implements Comparable<Subject> {

    @XmlElement
    private String name;

    @XmlElement
    private int allowedBunks;

    @XmlElementWrapper
    @XmlElement(name = "bunk")
    private final ArrayList<Bunk> bunks;

    @XmlElement
    private int totalBunks;

    public Subject(String Subject) {
        name = Subject;
        allowedBunks = 0;
        totalBunks = 0;
        bunks = new ArrayList<>();
    }

    public void setAllowedBunks(int i) {
        if (i >= 0) {
            this.allowedBunks = i;
        }
    }

    public void setTotalBunks(int i) {
        if (i >= 0) {
            this.totalBunks = i;
        }
    }

    public void setName(String name) {
        if (!(name == null)) {
            this.name = name;
        }
    }

    public int getAllowedBunks() {
        return this.allowedBunks;
    }

    public int getTotalBunks() {
        return this.totalBunks;
    }

    public String getName() {
        return this.name;
    }

    public void addBunk(Bunk bunk) {
        this.bunks.add(bunk);
        this.totalBunks++;

    }

    @Override
    public int compareTo(Subject subject) {
        return this.getName().compareToIgnoreCase(subject.getName());
    }

    public boolean equals(Subject subject) {
        return this.getName().equalsIgnoreCase(subject.getName());
    }
}
