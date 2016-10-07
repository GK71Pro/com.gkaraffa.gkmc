package com.gkaraffa.gkmc.foundation;

import java.util.*;

public class NoteSeries extends MusicComponent{
    private ArrayList<Note> notesList = new ArrayList<Note>();
    //private String sTonality;
    private Tonality tTonality;

    public NoteSeries(){
        super();
    }

    public NoteSeries(NoteSeries pNoteSeries) throws MusicException{
        super(pNoteSeries);

        int pSeriesSize = pNoteSeries.seriesSize();
        for (int index = 0; index < pSeriesSize; index++){
            notesList.add(pNoteSeries.getNote(index));
        }

        tTonality = pNoteSeries.getTonality();
        //sTonality = tTonality.getName();
    }

    public Note getFirst() throws MusicException{
        if (!getDefined()){
            throw (new MusicException("NoteSeries in undefined."));
        }

        return (new Note(noteFind(0)));
    }

    public final String getSpellingString() throws MusicException{
        StringBuilder sB = new StringBuilder();

        for (int index = 0; index < this.seriesSize(); index++){
            sB.append((Note) this.getNote(index));
            sB.append(", ");
        }

        sB.delete(sB.length() - 2, sB.length());

        return (sB.toString());
    }

    public final boolean containsNote(Note searchNote){
        int seriesSize = notesList.size();

        for (int index = 0; index < seriesSize; index++){
            if (((Note) notesList.get(index)).equals(searchNote)){
                return (true);
            }
        }
        return (false);
    }

    public final NoteSeries getSpellingNoteSeries() throws MusicException{
        return (new NoteSeries(this));
    }

    public Tonality getTonality(){
        return (tTonality);
    }

    public void noteAdd(Note n_add){
        if (n_add.getDefined()){
            notesList.add(n_add);
        }
    }

    public Note noteFind(int i_loc) throws MusicException{
        Note nFound;

        try{
            nFound = (Note) notesList.get(i_loc);
            return nFound;
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw (new MusicException("ArrayIndexOutOfBoundsException in NoteSeries:noteFind()"));
        }
    }

    public int seriesSize(){
        return (notesList.size());
    }

    public void setTonality(Tonality pTonality){
        tTonality = pTonality;
    }

    public Note getNote(int i_position) throws MusicException{
        if (!getDefined()){
            return null;
        }

        if (i_position < 0){
            return null;
        }
        else if (i_position > (seriesSize() - 1)){
            return (new Note(noteFind(i_position - seriesSize())));

        }
        else{
            return (new Note(noteFind(i_position)));
        }
    }
	
	public final void buildFromStepPattern(Note nTonic, StepPattern spIn) throws MusicException{
		Iterator<Step> iSP = spIn.iterator();
		Note currentNote = nTonic;
		
		this.notesList.add(currentNote);
		while(iSP.hasNext()){
			Step currentStep = (Step)iSP.next();
			switch (currentStep){
				case WHOLESTEP:
					currentNote = Keyboard.traverseWholeStep(currentNote);
					break;
				case HALFSTEP:
					currentNote = Keyboard.traverseHalfStep(currentNote);
					break;
			}
			this.notesList.add(currentNote);
		}
}

    @Override
    public boolean equals(Object otherObject){
        try{
            //identity check
            if (this == otherObject){
                return true;
            }

            //null check
            if (otherObject == null){
                return false;
            }

            //type check
            if (getClass() != otherObject.getClass()){
                return false;
            }

            //procede with search
            NoteSeries nsOther = (NoteSeries) otherObject;

            if (this.seriesSize() != nsOther.seriesSize()){
                return false;
            }

            for (int outerIndex = 0; outerIndex < this.seriesSize(); outerIndex++){
                Note outerNote = this.noteFind(outerIndex);
                boolean found = false;

                for (int innerIndexA = 0; innerIndexA < nsOther.seriesSize(); innerIndexA++){
                    if (nsOther.noteFind(innerIndexA).equals(outerNote)){
                        found = true;
                        break;
                    }
                }

                if (!found){
                    return false;
                }
            }
            return true;
        }
        catch (MusicException mE){
            return false;
        }
    }

    @Override
    public int hashCode(){
        int hash = 3;
        hash = 23 * hash + (this.notesList != null ? this.notesList.hashCode() : 0);
        hash = 23 * hash + (this.tTonality != null ? this.tTonality.hashCode() : 0);
        return hash;
    }

    public boolean contains(NoteSeries nsSubject) throws MusicException{
        int myElementCount = this.seriesSize();
        int subjectElementCount = nsSubject.seriesSize();

        if (subjectElementCount > myElementCount){
            return false;
        }

        boolean found = false;
        for (int indexOuter = 0; indexOuter <= subjectElementCount; indexOuter++){
            found = false;
            Note subjectNote = nsSubject.getNote(indexOuter);
            for (int indexInnerA = 0; indexInnerA <= myElementCount; indexInnerA++){
                if (this.getNote(indexInnerA).equals(subjectNote)){
                    found = true;
                    break;
                }
            }
            if (!found){
                break;
            }
        }

        return (found);
    }

}
