package by.academy.junit.listeners;

import org.junit.runner.notification.RunListener;

import com.ibm.icu.util.BytesTrie.Result;

public class OutListner extends RunListener {
	
	public void testRunFinished(Result result) {
		System.out.println("Test cases executed "+ result.getRunCount());
	}
	

}
