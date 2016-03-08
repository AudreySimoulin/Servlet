/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.ArrayList;
import java.util.List;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieServiceMockImpl {
    
    public List<Serie> listerTous(){
        
        List<Serie> series = new ArrayList<>();
        Serie s1 = new Serie(1L, "Chicago Fire", "Hello", 2012L, null);
        Serie s2 = new Serie(2L, "Chicago Med", "Hoho", 2016L, null);
        
        series.add(s1);
        series.add(s2);
        
        return series;
    }
    
    public Serie findById(Long id){
        
        if(id==1){
            return new Serie(1L, "Chicago Fire", "Hello", 2012L, null);
        }
        if(id==2){
            return new Serie(2L, "Chicago Med", "Hoho", 2016L, null);
        }
        return new Serie();
    }
    
}
