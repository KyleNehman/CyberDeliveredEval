package com.eval
import com.eval.InputObj
/*
 * A simple main class used to try and get the hand of spring-boot, groovy, and gradle
 *
 * Created by Kyle on 11/15/2016.
 */
@Controller
class EvalMain {
   @RequestMapping("/")
   @ResponseBody
    public static String textTest() {
        def iO = new InputObj("dsa", "dasdsa", "U1dBRw==");

        return iO.xorString();
    }

/*
    static void main(String[] args) {
        textTest();
    }
*/
}
