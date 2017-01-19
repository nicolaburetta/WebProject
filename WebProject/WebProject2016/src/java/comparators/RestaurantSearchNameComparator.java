/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import beans.RestaurantSearchBean;
import java.util.Comparator;

/**
 *
 * @author MirkoPortatile
 */
public class RestaurantSearchNameComparator implements Comparator<RestaurantSearchBean> {

    public int compare(RestaurantSearchBean rest1, RestaurantSearchBean rest2) {
        return rest1.getName().compareTo(rest2.getName());
    }
}