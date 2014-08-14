/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pawandubey.junked;

import java.util.Calendar;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class Bunk {
    
    private Calendar date;
    
    
    public Bunk(){
        date = Calendar.getInstance();
        date.set(Calendar.HOUR_OF_DAY, 0);
    }

    public Calendar getDate() {
        return date;
        
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
    
}
