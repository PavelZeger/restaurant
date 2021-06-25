package com.restaurant.statistic.event;

import java.util.Date;

/**
 * @author Pavel Zeger
 * @implNote restaurant
 * @since 25/06/2021
 */
public interface EventDataRow {
    EventType getType();

    Date getDate();

    int getTime();
}
