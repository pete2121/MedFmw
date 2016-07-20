package com.site.tests;

import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(ParallelSuite.class)
@SuiteClasses({ CreatePolicyDAMAN.class, CreatePolicyENSA.class })
public class AllTests {

}
