package org.example.dailyboost;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;

@RestController
public class MotivationController {

    List<String> messages = List.of(
            "Start before you're ready.",
            "Progress beats perfection.",
            "Stay consistent.",
            "Small steps every day.",
            "You are capable."
    );

    @GetMapping("/motivation")
    public String getMotivation() {
        Random rand = new Random();
        return messages.get(rand.nextInt(messages.size()));
    }
}