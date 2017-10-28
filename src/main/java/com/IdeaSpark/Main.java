/**
 * Created by Hugo Silva on 25/10/2017.
 */
package com.IdeaSpark;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello, World!");
    }
}