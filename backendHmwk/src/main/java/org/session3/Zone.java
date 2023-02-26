package org.session3;

import java.util.ArrayList;

public class Zone {
    private ArrayList<Animal> habitats;

    public Zone(){
        this.habitats = new ArrayList<>();
    }
    public void add(Animal animal){
        if(this.habitats.isEmpty()) this.habitats.add(animal);
       else if(animal.getType().equals(this.habitats.get(0).getType())) this.habitats.add(animal);
    }
    public String toString(){
        String answer = "";
        for(int i = 0; i < this.habitats.size();i++){
            answer += this.habitats.get(i).getName();
            answer += " ";
        }
        return answer;
    }
}
