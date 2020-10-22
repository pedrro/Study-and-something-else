package com.jader;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        List<Atributos> atributos = Arrays.asList(gson.fromJson(Files.readString(Paths.get("./arquivo.json"), StandardCharsets.UTF_8), Atributos[].class));
        CsvBuilder.buildCsv(atributos);
    }
}
