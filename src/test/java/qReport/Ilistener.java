package qReport;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.IListenersAnnotation;
import tests.BaseTest;

import java.io.IOException;

public class Ilistener extends TestListenerAdapter {


        public void onTestStart(ITestResult results) {


            System.out.println("Test Case is starting");
        }

        public void onTestSuccess(ITestResult results) {

            System.out.println("Test Case is successful");
        }

        public void onTestFailure(ITestResult results) {
            BaseTest x= new BaseTest();
            try {
                x.screenshot();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Test Case Failed");
        }
        public void onTestSkipped(ITestResult results) {
            System.out.println("Test Case is being skipped");

        }
    }


