package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ HeroTests.class , IncomeTests.class , ItemTests.class , ItemFileTesting.class})
public class TestSuite {

}

