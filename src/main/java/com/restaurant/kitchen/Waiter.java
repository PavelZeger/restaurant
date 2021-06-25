package com.restaurant.kitchen;

import com.restaurant.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Pavel Zeger
 * @implNote restaurant
 * @since 19/06/2021
 */
public class Waiter implements Observer {
    @Override
    public void update(Observable cook, Object order) {
        ConsoleHelper.writeMessage(order + " was cooked by " + cook);
    }
}

