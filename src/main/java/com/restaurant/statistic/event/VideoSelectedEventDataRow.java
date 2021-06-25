package com.restaurant.statistic.event;

import com.restaurant.ad.Advertisement;

import java.util.Date;
import java.util.List;

/**
 * @author Pavel Zeger
 * @implNote restaurant
 * @since 25/06/2021
 */
public class VideoSelectedEventDataRow implements EventDataRow {
    private long amount;
    private List<Advertisement> optimalVideoSet;
    private int totalDuration;
    private Date currentDate;

    public VideoSelectedEventDataRow(List<Advertisement> optimalVideoSet, long amount, int totalDuration) {
        this.amount = amount;
        this.optimalVideoSet = optimalVideoSet;
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }

    @Override
    public EventType getType() {
        return EventType.SELECTED_VIDEOS;
    }

    @Override
    public Date getDate() {
        return currentDate;
    }

    @Override
    public int getTime() {
        return totalDuration;
    }

    public long getAmount() {
        return amount;
    }
}
