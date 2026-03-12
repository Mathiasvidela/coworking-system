package com.mycompany.coworking;

import com.mycompany.coworking.igu.Principal;
import com.formdev.flatlaf.FlatDarkLaf;

public class Coworking {

    public static void main(String[] args) {
        
        FlatDarkLaf.setup();

        javax.swing.UIManager.put("Button.arc", 20);
        javax.swing.UIManager.put("Component.arc", 20);
        javax.swing.UIManager.put("TextComponent.arc", 15);
        
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        
    }
    
}
