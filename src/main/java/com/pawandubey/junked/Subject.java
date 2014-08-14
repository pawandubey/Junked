/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pawandubey.junked;

import java.util.ArrayList;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class Subject {
    private String name;
    private int allowedBunks;
    private final ArrayList<Bunk> bunks;
    private int totalBunks;
    
    public Subject(String Subject) {
        name = Subject;
        allowedBunks = 0;
        totalBunks = 0;
        bunks = new ArrayList<>();
    }
    

    public void setAllowedBunks(int i) {
        this.allowedBunks = i;
    }

    public void setTotalBunks(int i) {
        this.totalBunks = i;
    }

    public void setName(String name){
        this. name = name;
    }
    public int getAllowedBunks() {
        return this.allowedBunks;
    }

    public int getTotalBunks() {
        return this.totalBunks;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addBunk(Bunk bunk){
        this.bunks.add(bunk);
        this.totalBunks++;
        
    }
}
