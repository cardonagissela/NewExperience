package definitions;

import util.TestData;

import java.util.List;
import java.util.Map;

public class LoadTestData {


    public static void values(List<Map<String, String>> listado) {

        TestData testData = new TestData();
        testData.setTestdata(listado);


    }
}
