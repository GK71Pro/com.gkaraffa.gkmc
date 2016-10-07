package com.gkaraffa.gkmc.utilities;

import java.util.*;

import com.gkaraffa.gkmc.foundation.*;
import com.gkaraffa.gkmc.instrument.*;

public class CSVFretBoard{
    String outputString = null;
    boolean isDefined = false;

    public CSVFretBoard(){
    }

    public CSVFretBoard(NoteSeries nsSeries) throws MusicException{
        outputString = buildBoard(nsSeries).toString();
        isDefined = true;
    }

    public void setBoard(NoteSeries nsSeries) throws MusicException{
        outputString = buildBoard(nsSeries).toString();
        isDefined = true;
    }

    public String getBoard(){
        if (!isDefined){
            return (null);
        }

        return (outputString);
    }

    private StringBuilder buildBoard(NoteSeries nsSeries) throws MusicException{
        Guitar gGuitar = new Guitar();
        ArrayList<Note> al = gGuitar.getGuitarList(nsSeries);
        StringBuilder printStream = formatBoard(al);
        return (printStream);
    }

    private StringBuilder formatBoard(ArrayList<Note> al){
        int stringCounter;
        int fretCounter;
        int index = 0;
        StringBuilder oString = new StringBuilder();

        oString.delete(0, oString.length());
        for (fretCounter = 0; fretCounter <= 24; fretCounter++){
            StringBuilder fretNumber = new StringBuilder(Integer.toString(fretCounter));

            oString.append(fretNumber.toString());
            oString.append(",");
            for (stringCounter = 1; stringCounter <= 6; stringCounter++){
                Object x = al.get(index);
                String subjectString;
                if (x instanceof Note){
                    subjectString = ((Note) x).toString();
                    oString.append(subjectString);
                }
                oString.append(",");
                index++;
            }
            oString.append("\n");
        }
        return (oString);
    }
}
