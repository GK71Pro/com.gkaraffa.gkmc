import com.gkaraffa.gkmc.foundation.*;

public class TestPlatform{
    public static void main(String[] args){
		/*
		try{
			Scale myScale = new HarmonicMinorScale(Tone.A.name());
			
			for (int x = 0; x < 7; x++){
				Note myNote = myScale.getNote(x);
				System.out.println("\n" + myNote);
			    ArrayList myArrayList = SeventhChord.getSeventhChordList(myNote, myScale);
				
				for(Object myObjSC : myArrayList){
					SeventhChord mySC = (SeventhChord)myObjSC;
					System.out.println("\t" + mySC);
					System.out.println("\t\t" + mySC.getSpellingString());
				}
			}
		}
		catch(Exception e){
			System.out.println("Exception Caught");
			System.out.println(e);
		}
		* 
		*/
        /*
		try{
			
			
			Scale myScale = new IonianScale(new Note("C"));
			System.out.println(myScale);
			System.out.println(myScale.getSpellingString());
		
		
		}
		catch(Exception e){
			System.out.println("Exception Caught");
			System.out.println(e);
			e.printStackTrace();
		}	
                */
        try{
            Scale b = new BluesScale("A");
            System.out.println(b);
        }
        catch (Exception e){
            
        }
    }
}
