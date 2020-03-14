package math.app.integral.Math;

import math.app.integral.parser.MathParser;
import math.app.integral.parser.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mathWorker {

    @Autowired
    MathParser mathParser = new MathParser();


    public String integration(String formula, double a, double b, double accuracy) throws Exception{
        if (a > b){
            double tmp = a;
            a = b;
            b = tmp;
        }
        int n = 2;
        double I1 = 0;
        double I2 = 0;
        double lengthFirst = 0;
        double lengthSecond = 0;
        double range = ((double) b - a)/n;
        for (int i = 0; i < n; i++) {
            mathParser.setVariables("x", a + i*range);
            lengthFirst = mathParser.Parse(formula);
            mathParser.setVariables("x", a + (i + 1) * range);
            lengthSecond = mathParser.Parse(formula);
            I2 += (lengthFirst + lengthSecond) / 2 * range;
        }

        while (Math.abs(((I2 - I1)/3)) > accuracy) {
            I1 = I2;
            n *= 2;
            I2 = 0;
            range = ( b - a)/((double)n );
            for (int i = 0; i < n; i++) {
                mathParser.setVariables("x", a + i * range);
                lengthFirst = mathParser.Parse(formula);
                mathParser.setVariables("x", a + (i + 1) * range);
                lengthSecond = mathParser.Parse(formula);
                I2 += (lengthFirst + lengthSecond) / 2 * range;
            }
        }
        return I2 + " " + n + " " + Math.abs((I2 - I1)/3);
    }
}
