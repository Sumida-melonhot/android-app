package space.codejun.hedwigapp.network;

import space.codejun.hedwigapp.data.TestData;

public class HedwigRequestReturn {
    public static TestData getTestData(String asdad) {
        try {
            return HedwigRequestFactory.getHedwigAPI()
                    .getTestData(asdad)
                    .get();
        } catch (Exception e) {
            return TestData.failed();
        }
    }

    public static TestData getTestData1(String asdad) {
        try {
            return HedwigRequestFactory.getHedwigAPI()
                    .getTestData(asdad)
                    .get();
        } catch (Exception e) {
            return TestData.failed();
        }
    }
}
