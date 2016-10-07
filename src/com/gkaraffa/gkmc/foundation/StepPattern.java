package com.gkaraffa.gkmc.foundation;

import java.util.*;

public class StepPattern implements Iterable<Step>{
	ArrayList<Step> alPattern;
	int counter;
	
	public StepPattern(Step[] inStepArray){
		alPattern = new ArrayList<Step>();
		alPattern.addAll(Arrays.asList(inStepArray));
	}
	
	public Iterator<Step> iterator(){
		Iterator<Step> iStep = alPattern.iterator();
		return (iStep);
	}

	
}
