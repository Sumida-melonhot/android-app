package space.codejun.hedwigapp.network;

import space.codejun.hedwigapp.data.TestData;

public class HedwigRequestReturn {
    public static TestData getTestData() {
        try {
            return HedwigRequestFactory.getHedwigAPI()
                    .getTestData()
                    .get();
        } catch (Exception e) {
            return TestData.failed();
        }
    }
}
