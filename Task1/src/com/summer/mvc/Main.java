package com.summer.mvc;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();

    }
}
