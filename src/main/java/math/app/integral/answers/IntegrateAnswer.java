package math.app.integral.answers;

public class IntegrateAnswer {
    private String result;
    private String nums;
    private String error;

    public IntegrateAnswer(String result, String nums, String error) {
        this.result = result;
        this.nums = nums;
        this.error = error;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNums() {
        return nums;
    }

    public void setNums(String nums) {
        this.nums = nums;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
