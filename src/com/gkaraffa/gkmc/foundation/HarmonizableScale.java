package com.gkaraffa.gkmc.foundation;

public abstract class HarmonizableScale extends Scale{
    private Note relativeMajorKey = null;
    public HarmonizableScale(){
        super();
    }

    public HarmonizableScale(HarmonizableScale pScale) throws MusicException{
        super(pScale);       
    }

    public Triad getTriad(int location) throws MusicException{
        return (new Triad(this.noteFind(location), this));
    }

    public Triad getTriad(Note nTonic) throws MusicException{
        return (new Triad(nTonic, this));
    }

    public SeventhChord getSeventhChord(int location) throws MusicException{
        return (new SeventhChord(this.noteFind(location), this));
    }

    public SeventhChord getSeventhChord(Note nTonic) throws MusicException{
        return (new SeventhChord(nTonic, this));
    }

    public Note fifthofNote(Note source) throws MusicException{
        int i_sp;

        if (!getDefined()){
            return null;
        }

        i_sp = getPosition(source);

        i_sp += 4;

        if (i_sp > 7){
            i_sp -= 7;
        }

        return (getNote(i_sp));
    }

    public Note thirdofNote(Note source) throws MusicException{
        int i_sp;

        if (!getDefined()){
            return null;
        }

        i_sp = getPosition(source);

        i_sp += 2;

        if (i_sp > 7){
            i_sp -= 8;
        }

        return (getNote(i_sp));
    }

    public final Note getRelativeMajorKey() throws MusicException {
        return new Note(relativeMajorKey);
    }

    public final void setRelativeMajorKey(Note nKey) {
        relativeMajorKey = nKey;
    }
}
