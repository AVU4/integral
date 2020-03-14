package math.app.integral.request;

import javax.validation.constraints.NotNull;

public class IntegrateRequest {

    @NotNull
    String formula;

    double a;

    double b;

    double accuracy;

    public IntegrateRequest() {
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }


    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
