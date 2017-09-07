/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.snailz.sumtimer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Cooldowns {
    
    Properties prop;
    InputStream input;
    public Cooldowns(){
        prop = new Properties();
        input = Cooldowns.class.getResourceAsStream("resources/cooldowns.properties");
    }
    
    public int getCooldown(Spell spell){
        try {
            prop.load(input);
            
            return Integer.parseInt(prop.getProperty(spell.toString()));
        } catch (IOException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}

