package ua.lviv.iot.manager;

import ua.lviv.iot.models.Tools;

import java.io.*;
import java.util.List;

public class ToolsWriter {
    public void writeToFile(List<Tools> tools1) {

        File myFile = new File("result.csv");

        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw)) {

            for (Tools tools : tools1) {
                bufWriter.write(tools.getHeaders());
                bufWriter.newLine();
                bufWriter.write(tools.toCSV());
                bufWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
