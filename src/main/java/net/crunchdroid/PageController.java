package net.crunchdroid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author CrunchDroid
 */
@Controller
public class PageController {

    @GetMapping("/page01")
    public String page01() {
        return "page01";
    }

    @GetMapping("/page02")
    public String page02() {
        return "page02";
    }

}
