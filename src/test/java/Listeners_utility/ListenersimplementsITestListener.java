package Listeners_utility;

import org.testng.ITestContext;


import com.google.errorprone.annotations.ForOverride;


public class ListenersimplementsITestListener {

	
		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("on Test Start");
		}
		
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("on Test success");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("on Test Failure");
		}
		
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("on Test skipped");
		}
		
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("on Test start");
		}
		
		
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("on finish");
		}
		
		
	}


