package com.gkaraffa.gkmc.foundation;

public class AddNineChord extends Chord{   
    public AddNineChord(){
        super(4);
    }
    
    public AddNineChord(String sName) throws MusicException{
        super(4);
        
        String sNote = this.getNoteBlock(sName);
        String sRemaining = this.getRemainingBlock(sName);
        String sNameText;
        Note nFirst;
        Note nThird = null;
        Note nFifth = null;
        Note nNinth = null;

        if (!(sNote.equals(null) || sRemaining.equals(null))){
            nFirst = new Note(sNote);

            if (sRemaining.equals(ChordName.MAJOR_ADD_9.getText())){
                nThird = Keyboard.traverseMajorThird(nFirst);
                nFifth = Keyboard.traversePerfectFifth(nFirst);
                nNinth = Keyboard.traverseMajorSecond(nFirst);
                setTonality(Tonality.MAJOR);
                sNameText = ChordName.MAJOR_ADD_9.getText();
            }
            else if (sRemaining.equals(ChordName.MINOR_ADD_9.getText())){
                nThird = Keyboard.traverseMinorThird(nFirst);
                nFifth = Keyboard.traversePerfectFifth(nFirst);
                nNinth = Keyboard.traverseMajorSecond(nFirst);                
                setTonality(Tonality.MINOR);
                sNameText = ChordName.MINOR_ADD_9.getText();
            }
            else if (sRemaining.equals(ChordName.DIMINISHED_ADD_9.getText())){
                nThird = Keyboard.traverseMinorThird(nFirst);
                nFifth = Keyboard.traverseDiminishedFifth(nFirst);
                nNinth = Keyboard.traverseMajorSecond(nFirst);                
                setTonality(Tonality.DIMINISHED);
                sNameText = ChordName.DIMINISHED_ADD_9.getText();
            }
            else if (sRemaining.equals(ChordName.AUGMENTED_ADD_9.getText())){
                nThird = Keyboard.traverseMajorThird(nFirst);
                nFifth = Keyboard.traverseAugmentedFifth(nFirst);
                nNinth = Keyboard.traverseMajorSecond(nFirst);                
                setTonality(Tonality.AUGMENTED);
                sNameText = ChordName.AUGMENTED_ADD_9.getText();
            }
            else{
                throw (new MusicException("String cannot be parsed into a valid triad."));
            }

            noteAdd(nFirst);
            noteAdd(nThird);
            noteAdd(nFifth);
            noteAdd(nNinth);
            setDefined(true);
            setName(nFirst.toString() + " " + sNameText);
        }        
    }
    
    
}
