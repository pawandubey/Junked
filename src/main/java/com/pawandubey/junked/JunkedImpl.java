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

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
class JunkedImpl implements Junked {

    private Person person;

    JunkedImpl() {
        person = new Person();
        person.setName(null);
    }

    JunkedImpl(String name) {
        this();
        person.setName(name);
    }

    JunkedImpl(Person person) {
        this.person = person;
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public void setName(String name) {
        person.setName(name);
    }

    @Override
    public ArrayList<Subject> getSubjects() {
        return person.getSubjects();
    }

    @Override
    public Subject getSubjectAt(int index) {
        return person.getSubjectAt(index);
    }

    @Override
    public void addSubject(Subject subject) {
        person.addSubject(subject);
    }

    @Override
    public void removeSubject(Subject subject) {
        person.removeSubject(subject);
    }

    @Override
    public void removeAllSubjects() {
        person.removeAllSubjects();
    }

    @Override
    public boolean hasSubject(Subject subject) {
        return person.hasSubject(subject);
    }

    @Override
    public void save() {
        try {
            //TODO: create dynamic file binding
            File file = new File("D:\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this.person, file);

        } catch (JAXBException ex) {
            Logger.getLogger(JunkedImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
