/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.snailz.sumtimer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author user
 */
public class KeyPressedEvent implements KeyListener{

    private SpellTimer spelltimer;
    
    public KeyPressedEvent(SpellTimer spelltimer){
        this.spelltimer = spelltimer;
        System.out.println("KeyPressedEvent initaited");
    }
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("DEBUG: KEY TYPED: " + e.getKeyChar());
        if (e.getKeyChar() == 'x') {
            System.out.println("x PRESSED");
            spelltimer.DTime();
            
            return;
        }
        if (e.getKeyChar() == 'c') {
            System.out.println("c PRESSED");
            spelltimer.FTime();
            return;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
