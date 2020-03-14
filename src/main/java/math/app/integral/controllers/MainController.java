package math.app.integral.controllers;

import math.app.integral.Math.mathWorker;
import math.app.integral.answers.IntegrateAnswer;
import math.app.integral.parser.MathParser;
import math.app.integral.request.IntegrateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

   @Autowired
    mathWorker mathWorker = new mathWorker();

    @CrossOrigin
    @PostMapping("/integration")
    public IntegrateAnswer integrate(@RequestBody IntegrateRequest request){
        try {
            String res = mathWorker.integration(request.getFormula(), request.getA(), request.getB(), request.getAccuracy());
            String result = res.split(" ")[0];
            String nums = res.split(" ")[1];
            String error = res.split(" ")[2];
            return new IntegrateAnswer(result, nums, error);
        }catch (Exception e){
            return null;
        }
    }
}
