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
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class JunkedFactory {

    public static Junked getInstance() {
        return new JunkedImpl();
    }

    public static Junked getInstance(String name) {
        return new JunkedImpl(name);
    }

    public static Junked getInstance(Person person) {
        return new JunkedImpl(person);
    }

    public static Junked retrieve() throws JAXBException {
        //TODO : create dynamic file location
        File file = new File("D:\\file.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Person person = (Person) jaxbUnmarshaller.unmarshal(file);

        return new JunkedImpl(person);
    }
}
