package com.stormnet.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utility.logerator.Logger;

import java.util.Arrays;


public class CustomITestNgListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Logger.getLogger().debug("Test start{}", result.getTestName());
	}

	@Override

	public void onTestSuccess(ITestResult result) {
		Logger.getLogger().info("Test{} finished success. STATUS: {}", result.getTestName(), result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Logger.getLogger().debug("Test {} failed. STATUS: {} ", result.getTestName(), result.getStatus());
	}

	enum TestStatus {
		CREATED(-1),
		SUCCESS(1),
		FAILURE(2),
		SKIP(3),
		SUCCESS_PERCENTAGE_FAILURE(4),
		STARTED(16);
		int intStatus;

		TestStatus(int intStatus) {
			this.intStatus = intStatus;
		}

		public String getStatus(int intStatus) {
			return Arrays.stream(TestStatus.values())
					.filter(statusItem -> statusItem.intStatus == intStatus)
					.findFirst()
					.orElseThrow(() -> new RuntimeException("Unsupported status number" + intStatus))
					.name();
		}

	}

}


