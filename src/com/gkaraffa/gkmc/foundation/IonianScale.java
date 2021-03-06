package com.gkaraffa.gkmc.foundation;

public class IonianScale extends DiatonicScale{
    public IonianScale(){
        super();
    }

    public IonianScale(IonianScale pScale) throws MusicException{
        super(pScale);
    }
    
	/*
    public IonianScale(String S_name) throws MusicException{
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
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Ionian");
        setTonality(Tonality.MAJOR);
        setRelativeDiatonicMajorKey(N_tonic);
        setScaleName(Scale.IONIAN);
    }
	* 
	*/ 

    public IonianScale(String S_name) throws MusicException{
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
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Ionian");
        setTonality(Tonality.MAJOR);
        setRelativeDiatonicMajorKey(N_tonic);
        setScaleName(Scale.IONIAN);
    }	
	
    public IonianScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Ionian");
        setTonality(Tonality.MAJOR);
        setRelativeDiatonicMajorKey(N_tonic);
        setScaleName(Scale.IONIAN);
    }
	
	/*
	public IonianScale(Note N_tonic) throws MusicException{
		super();
		if (!N_tonic.getDefined()){
            return;
        }
		
		Step[] sArray = {Step.WHOLESTEP, 
						Step.WHOLESTEP,
						Step.HALFSTEP,
						Step.WHOLESTEP,
						Step.WHOLESTEP,
						Step.WHOLESTEP,
						Step.HALFSTEP};
		
		
		StepPattern sp = new StepPattern(sArray);
		
		buildFromStepPattern(N_tonic, sp);
        setDefined(true);
        setName(N_tonic.getName() + " Ionian");
        setTonality(Tonality.MAJOR);
        setRelativeDiatonicMajorKey(N_tonic);
        setScaleName(Scale.IONIAN);
	}
	* 
	*/
	
}
