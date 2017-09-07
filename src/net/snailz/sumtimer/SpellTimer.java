/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.snailz.sumtimer;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class SpellTimer {
    
    private Timer timer;
    private Cooldowns cooldowns;

    private boolean Frun;
    private boolean Drun;
    
    private JLabel DTime;
    private JLabel FTime;
    
    private Spell D;
    private Spell F;
    
    private double cdr;
    public SpellTimer(JLabel DTime, JLabel FTime, Spell D, Spell F, double cdr){
        this.DTime = DTime;
        this.FTime = FTime;
        
        Frun = false;
        Drun = false;
        
        timer = new Timer();
        cooldowns = new Cooldowns();
        
        this.D = D;
        this.F = F;
        
        this.cdr = cdr;
    }
    public void setCDR(double cdr){
        this.cdr = cdr;
    }
    public void DTime() {
        if (Drun == true) {
            return;
        }
        Drun = true;
        TimerTask task = new TimerTask() {
            double time = cooldowns.getCooldown(D) * (100 - cdr) / 100;

            @Override
            public void run() {
                time--;
                DTime.setText(Double.toString(time));
                if (time == 0) {
                    this.cancel();
                    Drun = false;
                }
            }
        };
        timer.schedule(task, 1000L, 1000L);
    }

    public void FTime() {
        if (Frun == true) {
            return;
        }
        Frun = true;
        TimerTask task = new TimerTask() {
            double time = cooldowns.getCooldown(F) * (100 - cdr) / 100;

            @Override
            public void run() {
                time--;
                FTime.setText(Double.toString(time));
                if (time == 0) {
                    this.cancel();
                    Frun = false;
                }
            }
        };
        timer.schedule(task, 1000L, 1000L);
    }
}
