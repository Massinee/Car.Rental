/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Carro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class CarrosDados {
    
    public static List<Carro> lstCarros= new ArrayList();
    
    public static Carro buscarCarroPelaPlacaExata(String placa, List<Carro> lstCarros){
        
        for (Carro car : lstCarros){
            if(car.getPlaca().equals(placa)){
                return car;
            }
        }
        return null;
    }
    
    public static List<Carro> buscarCarroPelaPlacaParcial(String placa, List<Carro> carros, boolean caseSensitive){
        List<Carro> carrosTemp = new ArrayList();

        for(Carro car : carros){
            
            if(caseSensitive){
                
                if(car.getPlaca().replace("-", "").contains(placa.replace("-", ""))){
                    carrosTemp.add(car);
                }
            } else{
                
                if(car.getPlaca().toLowerCase().replace("-", "").contains(placa.toLowerCase().replace("-", ""))){
                    carrosTemp.add(car); 
                }
            }
        }   
        return carrosTemp;
    }
}
