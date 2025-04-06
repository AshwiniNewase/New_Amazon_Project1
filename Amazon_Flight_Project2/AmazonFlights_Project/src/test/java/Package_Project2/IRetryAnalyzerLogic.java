package Package_Project2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerLogic implements IRetryAnalyzer
{
    int retry_count=2;
    int init_count=0;
    @Override
    public boolean retry(ITestResult result)
    {
        if(init_count<retry_count)
        {
            init_count++;
            return true;
        }
        return false;
    }
}
