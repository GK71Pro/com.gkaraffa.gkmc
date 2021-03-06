package com.gkaraffa.gkmc.foundation;

public class Keyboard{
    public static Note[] ebivs = new Note[12];

    static{
        try{
            ebivs[0] = new Note(Tone.C);
            ebivs[1] = new Note(Tone.CSHARP_DFLAT);
            ebivs[2] = new Note(Tone.D);
            ebivs[3] = new Note(Tone.DSHARP_EFLAT);
            ebivs[4] = new Note(Tone.E);
            ebivs[5] = new Note(Tone.F);
            ebivs[6] = new Note(Tone.FSHARP_GFLAT);
            ebivs[7] = new Note(Tone.G);
            ebivs[8] = new Note(Tone.GSHARP_AFLAT);
            ebivs[9] = new Note(Tone.A);
            ebivs[10] = new Note(Tone.ASHARP_BFLAT);
            ebivs[11] = new Note(Tone.B);
        }
        catch (MusicException me){
            me.printStackTrace();
            throw (new java.lang.ExceptionInInitializerError());
        }
    }

    private static Note getNote(int i_location) throws MusicException{
        if (i_location > 11 || i_location < 0){
            return (null);
        }
        else{
            return (new Note(ebivs[i_location]));
        }
    }

    private static int locateNote(Note n_target){
        int index;

        for (index = 0; index <= 11; index++){
            if (ebivs[index].equals(n_target)){
                break;
            }
        }

        if (index > 11){
            return (-1);
        }

        return index;
    }

    public static int measureHalfSteps(Note n_start, Note n_stop){
        int i_start;
        int i_stop;

        if ((i_start = locateNote(n_start)) < 0){
            return -1;
        }

        if ((i_stop = locateNote(n_stop)) < 0){
            return -1;
        }

        if (i_stop < i_start){
            i_stop += 12;
        }

        return (i_stop - i_start);
    }

	public static Interval measureInterval(Note n_start, Note n_stop){
		int halfSteps = measureHalfSteps(n_start, n_stop);
		Interval iInterval = null;
		
		try{
			iInterval = new Interval(halfSteps);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return(iInterval);
	}
	
	public static Note traverseIntervalForward(Note tonic, int interval) throws MusicException{
		int i_start;
		int i_stop;
		
		i_start = locateNote(tonic);
		i_stop = i_start + interval;
		if (i_stop > 11){
			i_stop -= 12;
		}
		
		return(getNote(i_stop));
	}
	
	public static Note traverseIntervalBackward(Note tonic, int interval) throws MusicException{
		int i_start;
		
		i_start = locateNote(tonic);
		if (i_start < 0){
			return null;
		}
		
		i_start--;
		
		if (i_start < 0){
			return (getNote(i_start + 12));
		}
		else{
			return (getNote(i_start));
		}	
	}

    public static Note traverseAugmentedFifth(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 8;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseDiminishedFifth(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 6;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseHalfStep(Note nStartPoint) throws MusicException{
        int iStart;

        iStart = locateNote(nStartPoint);

        if (iStart < 0){
            return null;
        }

        iStart++;

        if (iStart > 11){
            return (getNote(iStart - 12));
        }
        else{
            return (getNote(iStart));
        }
    }
	
	public static Note sharpen(Note nStartPoint) throws MusicException{
		return (traverseHalfStep(nStartPoint));
	}
	
	public static Note flatten(Note nStartPoint) throws MusicException{
		int iStart;
		
		iStart = locateNote(nStartPoint);
		
		if (iStart < 0){
			return null;
		}
		
		iStart--;
		
		if (iStart < 0){
			return (getNote(iStart + 12));
		}
		else{
			return (getNote(iStart));
		}
	}

    public static Note traverseMajorThird(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 4;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseMinorThird(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 3;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }
    
    public static Note traverseAugmentedSecond(Note tonic) throws MusicException{
   	 return (traverseMinorThird(tonic));
    }

    public static Note traversePerfectFifth(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 7;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseMajorSeventh(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 11;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseMinorSeventh(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 10;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseDiminishedSeventh(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 9;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseMajorSecond(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 2;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseMinorSecond(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 1;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseSuspendedFourth(Note tonic) throws MusicException{
        int i_start;
        int i_stop;

        i_start = locateNote(tonic);
        i_stop = i_start + 5;
        if (i_stop > 11){
            i_stop -= 12;
        }

        return (getNote(i_stop));
    }

    public static Note traverseWholeStep(Note nStartPoint) throws MusicException{
        int iStart;

        iStart = locateNote(nStartPoint);

        if (iStart < 0){
            return null;
        }

        iStart += 2;

        if (iStart > 11){
            return (getNote(iStart - 12));
        }
        else{
            return (getNote(iStart));
        }
    }
}
