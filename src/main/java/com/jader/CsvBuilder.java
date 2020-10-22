package com.jader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CsvBuilder {

    public static String createHeader() {
        return "|_desired_bed_cleanup\",\"|has_dry_leaves\",\"|has_wet_leaves\",\"|_has_fallen_limbs\"," +
                "\"|_has_cut_limbs\",\"|has_rocks\",\"|has_mulch\",\"|haspine\",\"|has_pet_waste\",\"" +
                "|_has_other\",\"|has_cement\",\"|has_acorns\",\"|_has_pine_cones\"," +
                "\"|_other_debris\",\"|last_service\",\"|desired_haulaway\",\"|_details\"+\n";
    }

    public static void buildCsv(List<Atributos> atributos) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.csv"));
        writer.write(createHeader());
        List<String> collect = atributos
                .stream()
                .map(Atributos::toCsv).collect(Collectors.toList());

        for (String line : collect) {
            writer.write(line+"\n");
        }
        writer.close();
    }
}
