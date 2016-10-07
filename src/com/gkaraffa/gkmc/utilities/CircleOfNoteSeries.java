package com.gkaraffa.gkmc.utilities;

import java.util.*;

import com.gkaraffa.gkmc.foundation.*;

public class CircleOfNoteSeries{
    private boolean isEmpty;
    private ArrayList<NoteSeries> alCircle;
    private int currentSeries;

    public CircleOfNoteSeries(){
        isEmpty = true;
        alCircle = null;
    }

    public boolean isEmpty(){
        return (isEmpty);
    }

    public void addNoteSeries(NoteSeries subject){
        if (isEmpty){
            isEmpty = false;
            alCircle = new ArrayList<NoteSeries>();
            currentSeries = 0;
        }
        alCircle.add(subject);
    }

    public boolean deleteNoteSeries(NoteSeries subject){
        if (isEmpty){
            return (false);
        }

        for (int index = 0; index < alCircle.size(); index++){
            if (((NoteSeries) alCircle.get(index)).equals(subject)){
                //delete this one
                alCircle.remove(index);

                if (alCircle.isEmpty()){
                    isEmpty = true;
                }

                return (true);
            }
        }
        return (false);
    }

    public void resetCircleParser(){
        currentSeries = 0;
    }

    public NoteSeries getCurrent(){
        if (isEmpty){
            return (null);
        }

        return ((NoteSeries) alCircle.get(currentSeries));
    }

    public void advanceCurrent(){
        currentSeries++;

        if (currentSeries > alCircle.size() - 1){
            currentSeries = 0;
        }
    }
}
