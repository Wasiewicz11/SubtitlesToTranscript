import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        String path_to_file = args[0];
        String output_path = args[1];

        File File_toProcess = new File(path_to_file);
        File outputFile = new File(output_path);

        if (File_toProcess.exists()){
            try (BufferedReader reader = new BufferedReader(new FileReader(File_toProcess));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                String line;
                while((line = reader.readLine()) != null){
                    if (line.matches("^\\d+$") || line.matches(".*-->.*") ) {
                        continue;
                    }

                    writer.write(line);
                    writer.newLine();
                }

                System.out.println("Przetwarzanie zakończone. Wynik zapisano w " + outputFile);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Plik do przetworzenia nie istnieje.");
        }
    }
}