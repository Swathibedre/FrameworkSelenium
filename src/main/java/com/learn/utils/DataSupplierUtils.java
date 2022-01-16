package com.learn.utils;

import com.learn.testData.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataSupplierUtils {

    @DataSupplier(runInParallel = true)
    public StreamEx<TestData> getLoginData(Method method){
        return TestDataReader.use(XlsxReader.class).
                withTarget(TestData.class).withSource("testData.xlsx").
                read()
                .filter(testData -> testData.getTestCaseName().equalsIgnoreCase(method.getName()));

    }
}
