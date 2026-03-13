package org.example.dailyboost;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;

@RestController
public class MotivationController {

    List<String> messages = List.of(
            "Keep your curiosity alive; the world is full of wonders.",
            "Even small steps forward are victories worth celebrating.",
            "Your energy can light up even the darkest days.",
            "Bravery isn’t the absence of fear, it’s acting despite it.",
            "Every ending is the start of something new and beautiful.",
            "Trust your instincts; they know more than you think.",
            "Kindness always comes back around, in ways you can’t imagine.",
            "Your potential is limitless when you believe in yourself.",
            "Challenges are just opportunities dressed in disguise.",
            "Take a deep breath; clarity often follows stillness.",
            "Your smile can inspire someone more than you realize.",
            "Growth happens when you step outside your comfort zone.",
            "Every day is a blank page—write something amazing.",
            "You are stronger than any obstacle in your path.",
            "Even the tiniest effort compounds into greatness over time.",
            "Let your passions guide you; they are your true compass.",
            "Hope is a seed; nurture it and watch it bloom.",
            "You are allowed to pause and recharge; it makes you unstoppable.",
            "Dream boldly, act courageously, and watch magic unfold.",
            "Your story is unique, and the world needs it.",
            "Even your mistakes are worth celebrating.",
            "Don’t forget to dance like nobody’s watching.",
            "Sometimes doing nothing is exactly what you need.",
            "Your laugh is more powerful than you think.",
            "Today is a perfect day to start a tiny adventure.",
            "The clouds have stories too; imagine them.",
            "Your curiosity is a superpower in disguise.",
            "Remember: cookies exist for a reason."
    );

    @GetMapping("/motivation")
    public String getMotivation() {
        Random rand = new Random();
        return messages.get(rand.nextInt(messages.size()));
    }

}