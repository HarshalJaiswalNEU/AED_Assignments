/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurents = new ArrayList<>();
    
    public RestaurantDirectory(){
        
    }

    public void addRestaurant(Restaurant r) {
        restaurents.add(r);
    }

    public ArrayList<Restaurant> getRestaurents() {
        return restaurents;
    }

    public void setRestaurents(ArrayList<Restaurant> restaurents) {
        this.restaurents = restaurents;
    }
    
}
