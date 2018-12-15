package space.codejun.hedwigapp.data;

public class TestData {
    private String testString;
    private int testInt;

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    public TestData(String testString, int testInt) {
        this.testString = testString;
        this.testInt = testInt;
    }

    public static TestData failed() {
        return new TestData("error", 0);
    }
}
