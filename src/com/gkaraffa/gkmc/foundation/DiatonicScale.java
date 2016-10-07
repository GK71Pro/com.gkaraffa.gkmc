package com.gkaraffa.gkmc.foundation;

public abstract class DiatonicScale extends HarmonizableScale {
    private Note relativeDiatonicMajorKey;
    
    public DiatonicScale() {
        super();
    }

    public DiatonicScale(DiatonicScale pScale) throws MusicException{
        super(pScale);   
    }

    public Note getRelativeDiatonicMajorKey() {
        return relativeDiatonicMajorKey;
    }

    public void setRelativeDiatonicMajorKey(Note relativeDiatonicMajorKey) {
        this.relativeDiatonicMajorKey = relativeDiatonicMajorKey;
    }
}
