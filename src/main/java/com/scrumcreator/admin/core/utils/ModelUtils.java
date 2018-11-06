package com.scrumcreator.admin.core.utils;

import com.scrumcreator.admin.core.data.ScrumPractice;
import com.scrumcreator.admin.core.data.User;
import org.springframework.ui.Model;

/**
 * Created by VMoskalenko on 06.01.2017.
 */
public class ModelUtils {

    public static void webinarToModel(Model model, ScrumPractice scrumPractice) {
        model.addAttribute("topic", scrumPractice.getPracticeIndex());
        model.addAttribute("description", scrumPractice.getScrumElement());
        model.addAttribute("id", scrumPractice.getId());
    }

    public static void userToModel(Model model, User user) {
        model.addAttribute("userId", user.getId());
        model.addAttribute("userImage", user.getImage());
        model.addAttribute("signature", user.getSignature());
    }

}
