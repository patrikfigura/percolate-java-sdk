package com.percolate.sdk;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 */
public class TestMain {
    public static void main(String[] args) {
        final List<String> platformOrder = new ArrayList<>();
        platformOrder.add("facebook");
        platformOrder.add("twitter");
        platformOrder.add("tumblr");
        platformOrder.add("linkedin");

        System.out.println(platformOrder.subList(0, 2));
    }
}
