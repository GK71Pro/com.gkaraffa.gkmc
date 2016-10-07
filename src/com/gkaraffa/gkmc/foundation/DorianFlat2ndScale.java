/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkaraffa.gkmc.foundation;

/**
 *
 * @author gkaraffa
 */
public class DorianFlat2ndScale extends HarmonizableScale{
    public DorianFlat2ndScale(){
        super();
    }

    public DorianFlat2ndScale(DorianScale pScale) throws MusicException{
        super(pScale);
    }

    public DorianFlat2ndScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Dorian Flat 2nd");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.DORIAN_FLAT_2ND);
    }

    public DorianFlat2ndScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Dorian Flat 2nd");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.DORIAN_FLAT_2ND);
    }	
}
