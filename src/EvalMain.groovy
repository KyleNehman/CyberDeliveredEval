/*
 * A simple main class used to try and get the hand of spring-boot, groovy, and gradle
 *
 * Created by Kyle on 11/15/2016.
 */
@Controller
class EvalMain {
    @RequestMapping("/")
    @ResponseBody
    String textTest() {

        return "Hello, spring-boot world!";
    }
}
