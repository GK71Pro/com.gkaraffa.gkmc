package com.gkaraffa.gkmc.foundation;

public abstract class MusicComponent extends Object{
    private String sName = null;
    private boolean bDefined = false;
    private int iVal = -99;

    public MusicComponent(){
        super();
    }

    public MusicComponent(MusicComponent pMC){
        super();
        sName = pMC.getName();
        bDefined = pMC.getDefined();
        iVal = pMC.getVal();
    }

    public final void setName(String pName){
        sName = pName;
    }

    public final String getName(){
        return (sName);
    }

    public final void setDefined(boolean b_set){
        bDefined = b_set;
    }

    public final boolean getDefined(){
        return (bDefined);
    }

    public final void setVal(int pVal){
        iVal = pVal;
    }

    public final int getVal(){
        return (iVal);
    }

    @Override
    public String toString(){
        return (getName());
    }

    @Override
    public boolean equals(Object other){
        //1 - identity check
        //2 - type check
        //3 - content check
        if (this == other){
            //identity
            return (true);
        }

        if(!(this.getClass().getName().equals(other.getClass().getName()))){
            //type
            return (false);
        }        

        return ((getDefined() == ((MusicComponent)other).getDefined()
                && getName() == null)
                ? ((MusicComponent)other).getName() == null
                : getName().equals(((MusicComponent)other).getName()));
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 29 * hash + (this.sName != null ? this.sName.hashCode() : 0);
        hash = 29 * hash + (this.bDefined ? 1 : 0);
        return hash;
    }
}
