package com.scrumcreator.admin.core.web;

import com.scrumcreator.admin.core.data.User;
import com.scrumcreator.admin.core.utils.ModelUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by VMoskalenko on 10.01.2017.
 *
 */
@Controller
public class AuthController extends BasicWebController {

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @PostMapping("profile")
    public String updateProfile(@RequestParam(value = "luxEmail") String luxMail,
                               @RequestParam(value = "signature") String signature,
                               Model model) {

        User user = getCurrentUser();

        user.setLuxMail(luxMail);
        user.setSignature(signature);

        mongoOperations.save(user);

        ModelUtils.userToModel(model, user);

        return "main";
    }

}
