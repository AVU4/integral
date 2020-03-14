package math.app.integral.parser;

public class Result {

    private double acc;
    private String rest;

    public Result(double acc, String rest) {
        this.acc = acc;
        this.rest = rest;
    }

    public double getAcc() {
        return acc;
    }

    public void setAcc(double acc) {
        this.acc = acc;
    }

    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }
}
