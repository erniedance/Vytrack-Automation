package com.vytrack.test;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBase {
    @BeforeClass
    public void beforeClass() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }
}
