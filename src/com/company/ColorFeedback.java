package com.company;

import java.util.Random;

public class ColorFeedback {
    public static String getFeedback() {
        String[] feedbacks = {
                "It pops!",
                "It is a nice color",
                "Ok"
        };

        int randomIndex = new Random().nextInt(feedbacks.length);
        return feedbacks[randomIndex];
    }
}
