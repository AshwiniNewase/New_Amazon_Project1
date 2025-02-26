package amazon_TestFile;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzer_Logic implements IRetryAnalyzer
{
	int init_count=0;
	int retry_count=1;
	@Override
	public boolean retry(ITestResult result)
	{
		if(init_count<retry_count)
		{
			init_count++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
