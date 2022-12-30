package com.example.frameforklabs.Service;


import com.example.frameforklabs.Test.KramaTest;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestRunnerService {

    private static final Logger logger = LoggerFactory.getLogger(TestRunnerService.class);

    @Test
    public void runTestsInParallel(){

        Class [] testClasses = {KramaTest.class};
        Result result = JUnitCore.runClasses(new ParallelComputer(true, true), testClasses);

        for (Failure failure : result.getFailures()) {
            logger.error(failure.toString());
        }
        if (result.wasSuccessful()) {
            logger.info("All tests finished successfully");
        }
    }
}
