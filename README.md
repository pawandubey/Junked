Junked
======

A Java Tool To Track Your Bunks!

* Comes with a simple API to add Subjects, manage subject wise bunks and never have shortage of attendance again ;)

[![Build Status](https://travis-ci.org/pawandubey/Junked.svg)](https://travis-ci.org/pawandubey/Junked)

Usage:
------
    //Create a new configuration
    Junked junked = new JunkedFactory.getInstance();
    
    //Set configuration name(as person name)
    junked.setName("TestPerson");
    
    //Create and Add a subject to the person's list
    Subject english = new Subject("English");
    junked.addSubject(english);
    
    //Add a bunk to the subject
    Bunk englishBunk = new Bunk();
    junked.getSubject(english).addBunk(englishBunk);
    
    //Save the configuration
    junked.save();
    
    //Retrieve a saved configuration
    Junked newJunked = new JunkedFactory.retrieve();
    
Licensed under <a href="http://www.apache.org/licenses/LICENSE-2.0">Apache License Version 2</a>.
