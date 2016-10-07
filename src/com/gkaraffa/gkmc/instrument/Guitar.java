package com.gkaraffa.gkmc.instrument;

import java.util.*;

import com.gkaraffa.gkmc.foundation.*;

public class Guitar{
    private ArrayList<ArrayList<Note>> guitarStrings = new ArrayList<ArrayList<Note>>();
    private int numberFrets;

    public Guitar() throws MusicException{
        numberFrets = 24;

        /*
        guitarStrings.add(createStringNotes(new Note(Note.E)));
        guitarStrings.add(createStringNotes(new Note(Note.A)));
        guitarStrings.add(createStringNotes(new Note(Note.D)));
        guitarStrings.add(createStringNotes(new Note(Note.G)));
        guitarStrings.add(createStringNotes(new Note(Note.B)));
        guitarStrings.add(createStringNotes(new Note(Note.E)));
         * 
         */
        
        guitarStrings.add(createStringNotes(new Note(Tone.E)));
        guitarStrings.add(createStringNotes(new Note(Tone.A)));
        guitarStrings.add(createStringNotes(new Note(Tone.D)));
        guitarStrings.add(createStringNotes(new Note(Tone.G)));
        guitarStrings.add(createStringNotes(new Note(Tone.B)));
        guitarStrings.add(createStringNotes(new Note(Tone.E)));
    }

    public Guitar(int frets) throws MusicException{
        numberFrets = frets;

        /*
        guitarStrings.add(createStringNotes(new Note(Note.E)));
        guitarStrings.add(createStringNotes(new Note(Note.A)));
        guitarStrings.add(createStringNotes(new Note(Note.D)));
        guitarStrings.add(createStringNotes(new Note(Note.G)));
        guitarStrings.add(createStringNotes(new Note(Note.B)));
        guitarStrings.add(createStringNotes(new Note(Note.E)));
         * 
         */
        
        guitarStrings.add(createStringNotes(new Note(Tone.E)));
        guitarStrings.add(createStringNotes(new Note(Tone.A)));
        guitarStrings.add(createStringNotes(new Note(Tone.D)));
        guitarStrings.add(createStringNotes(new Note(Tone.G)));
        guitarStrings.add(createStringNotes(new Note(Tone.B)));
        guitarStrings.add(createStringNotes(new Note(Tone.E)));

    }

    public Guitar(String tuningString) throws MusicException{
        numberFrets = 24;
        StringTokenizer st = new StringTokenizer(tuningString, ",");

        while (st.hasMoreTokens()){
            guitarStrings.add(createStringNotes(new Note(st.nextToken())));
        }
    }

    public Guitar(ArrayList<MusicComponent> openTuning) throws MusicException{
        int numberOfStrings = openTuning.size();

        numberFrets = 24;

        for (int index = 0; index < numberOfStrings; index++){
            Object tempObject = openTuning.get(index);

            if (tempObject instanceof String){
                guitarStrings.add(createStringNotes(new Note((String) tempObject)));
            }
            else if (tempObject instanceof Note){
                guitarStrings.add(createStringNotes((Note) tempObject));
            }
        }
    }

    public Guitar(ArrayList<MusicComponent> openTuning, int frets) throws MusicException{
        int numberOfStrings = openTuning.size();

        numberFrets = frets;

        for (int index = 0; index < numberOfStrings; index++){
            Object tempObject = openTuning.get(index);

            if (tempObject instanceof String){
                //string algorithm
                guitarStrings.add(createStringNotes(new Note((String) tempObject)));
            }
            else if (tempObject instanceof Note){
                //note algorithm
                guitarStrings.add(createStringNotes((Note) tempObject));
            }
        }
    }

    private ArrayList<Note> createStringNotes(Note openValue) throws MusicException{
        ArrayList<Note> stringNotes = new ArrayList<Note>();
        Note currentValue = openValue;

        stringNotes.add(currentValue);
        for (int index = 1; index <= numberFrets; index++){
            currentValue = Keyboard.traverseHalfStep(currentValue);
            stringNotes.add(currentValue);
        }
        return (stringNotes);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        int numStrings = guitarStrings.size();

        for (int index = 0; index <= numberFrets; index++){
            sb.append(index);
            sb.append("\t");
            for (int subindex = 0; subindex < numStrings; subindex++){
                ArrayList<Note> currentString = (ArrayList<Note>) guitarStrings.get(subindex);
                Note currentNote = (Note) currentString.get(index);
                sb.append(currentNote.toString());
                sb.append("\t");
            }
            sb.append("\n");
        }

        return (sb.toString());
    }

    public Note getNote(int numString, int numFret){
   	 return ((Note) guitarStrings.get(numString).get(numFret));
    }

    public ArrayList<Note> getGuitarList(NoteSeries subjectSeries){
        ArrayList<Note> al = new ArrayList<Note>();
        int numStrings = guitarStrings.size();

        for (int index = 0; index <= numberFrets; index++){
            for (int subindex = 0; subindex < numStrings; subindex++){
                Note currentNote = getNote(subindex, index);
                if (subjectSeries.containsNote(currentNote)){
                    al.add(currentNote);
                }
                else{
                    al.add(null);
                }
            }
        }
        return (al);
    }

    public String displayNoteSeries(NoteSeries subjectSeries){
        StringBuilder sb = new StringBuilder();
        int numStrings = guitarStrings.size();

        for (int index = 0; index <= numberFrets; index++){
            for (int subindex = 0; subindex < numStrings; subindex++){
                Note currentNote = getNote(subindex, index);
                if (subjectSeries.containsNote(currentNote)){
                    sb.append(currentNote.toString());
                }
                else{
                    sb.append(" ");
                }
                sb.append(",");
            }
            sb.append("\n");
        }
        return (sb.toString());
    }
}
