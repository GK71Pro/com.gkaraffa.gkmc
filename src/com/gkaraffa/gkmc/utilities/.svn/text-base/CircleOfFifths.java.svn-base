package com.gkaraffa.gkmc.utilities;

import com.gkaraffa.gkmc.foundation.*;

public class CircleOfFifths extends CircleOfNoteSeries{
    public CircleOfFifths(){
        super();
    }

    public void populateCircle() throws MusicException{
        IonianScale startingPoint = new IonianScale("C");
        IonianScale nextScale = null;

        addNoteSeries(startingPoint);
        nextScale = new IonianScale(startingPoint.getNote(4));
        while (!nextScale.equals(startingPoint)){
            addNoteSeries(nextScale);
            nextScale = new IonianScale(nextScale.getNote(4));
        }
    }

    public Scale getCurrentScale(){
        Scale currentScale = null;

        currentScale = (Scale) super.getCurrent();
        return (currentScale);
    }

    public void advanceCurrentScale(){
        super.advanceCurrent();
    }
}
