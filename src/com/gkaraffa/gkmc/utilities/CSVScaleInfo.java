package com.gkaraffa.gkmc.utilities;

import com.gkaraffa.gkmc.foundation.*;

/**
 *
 * @author gkaraffa
 */
public class CSVScaleInfo {
    String outputString = null;
    boolean isDefined = false;

    public CSVScaleInfo(){
    }

    public CSVScaleInfo(NoteSeries nsSeries) throws MusicException{

        outputString = buildCSV(nsSeries).toString();
        isDefined = true;
    }
    
    private StringBuilder buildCSV(NoteSeries nsSeries) throws MusicException{
        //String titleLine = nsSeries.getName();
        
        //first line - Scale and Key
        //second line - notes
        //third line - triads
        //fourth line - seventh chords
     
        /*
        Guitar gGuitar = new Guitar();
        ArrayList al = gGuitar.getGuitarList(nsSeries);
        StringBuilder printStream = formatBoard(al);
        return (printStream);
        **/
        
        String sFirst = this.firstLine(nsSeries);
        String sSecond = this.secondLine(nsSeries);
        String sThird = this.thirdLine(nsSeries);
        String sFourth = this.fourthLine(nsSeries);
        
        return (new StringBuilder(sFirst + sSecond + sThird + sFourth));
    }
     
    private String firstLine(NoteSeries nsSeries){
        return (nsSeries.getName());
    }
    
    private String secondLine(NoteSeries nsSeries) throws MusicException{
        StringBuilder sLine2 = new StringBuilder();
        int iLimit = nsSeries.seriesSize();
        
        for (int index = 0; ; index++){
            sLine2.append(nsSeries.getNote(index).toString());
            
            if (index == iLimit-1){
                break;
            }
            
            sLine2.append(", ");
        }    
        
        return (sLine2.toString());
    }
    
    private String thirdLine(NoteSeries nsSeries) throws MusicException{
        StringBuilder sLine3 = new StringBuilder();
        int iLimit = nsSeries.seriesSize();
        
        for (int index = 0; ; index++){
            Triad myTriad = new Triad(nsSeries.getNote(index), (HarmonizableScale)nsSeries);
            sLine3.append(myTriad.getTonality().toString());
            
            if (index == iLimit-1){
                break;
            }
            
            sLine3.append(", ");
        }
        
        return (sLine3.toString());
    }
     
    private String fourthLine(NoteSeries nsSeries) throws MusicException{
        StringBuilder sLine4 = new StringBuilder();
        int iLimit = nsSeries.seriesSize();
        
        for (int index = 0; ; index++){
            SeventhChord mySeventhChord = new SeventhChord(nsSeries.getNote(index), (HarmonizableScale)nsSeries);
            sLine4.append(mySeventhChord.getTonality().toString());
            
            if (index == iLimit-1){
                break;
            }
            
            sLine4.append(", ");
        }
        
        return (sLine4.toString());
    }

}
