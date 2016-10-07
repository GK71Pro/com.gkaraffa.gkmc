/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkaraffa.gkmc.foundation;

/**
 *
 * @author gkaraffa
 */
public class MixolydianFlat6thScale extends HarmonizableScale{
    public MixolydianFlat6thScale(){
        super();
    }

    public MixolydianFlat6thScale(DorianScale pScale) throws MusicException{
        super(pScale);
    }

    public MixolydianFlat6thScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));
		
        setDefined(true);
        setName(N_tonic.getName() + " Mixolydian Flat 6th");
        setTonality(Tonality.MAJOR);
        setScaleName(Scale.MIXOLYDIAN_FLAT_6TH);
    }

    public MixolydianFlat6thScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));
		
        setDefined(true);
        setName(N_tonic.getName() + " Mixolydian Flat 6th");
        setTonality(Tonality.MAJOR);
        setScaleName(Scale.MIXOLYDIAN_FLAT_6TH);
    }	
}
