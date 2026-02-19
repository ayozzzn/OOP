package kz.lab1.problem5;

import java.util.ArrayList;
import java.util.List;

public class DragonLaunch {
	
    private List<Person> prisoners;
    
    public DragonLaunch() {
        prisoners = new ArrayList<>();
    }
	
    public void kidnap(Person p) {
        prisoners.add(p);
    }
    
    public boolean willDragonEatOrNot() {
        int boys = 0;
        
        for (Person p : prisoners) {
            if (p.getGender() == Gender.BOY) {
                boys++;
            } 
            else {
                if (boys > 0) {
                    boys--; 
                }
            }
        }
        
        return boys > 0;
    }
    
    public void printPrisoners() {
        System.out.println("Prisoners: " + prisoners);
    }
    
}