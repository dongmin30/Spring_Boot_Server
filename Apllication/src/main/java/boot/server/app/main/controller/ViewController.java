package boot.server.app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : boot.server.app.main.controller
 * fileName       : ViewController
 * author         : dongm
 * date           : 2022-07-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-19        dongm       최초 생성
 */
@Controller
public class ViewController {
    @GetMapping("/")
    public String openIndex(Model model) {
        model.addAttribute("master", "Value Test");
        return "index";
    }
}
