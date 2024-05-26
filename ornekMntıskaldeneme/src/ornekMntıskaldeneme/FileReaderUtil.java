package ornekMntýskaldeneme;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderUtil {
    public static BooleFunction readBooleFunction(String filePath) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        if (lines.isEmpty()) {
            throw new Exception("Dosya boþ!");
        }
        String function = lines.get(0);
        List<String> variables = List.of("A", "B", "C", "D"); 
        return new BooleFunction(variables, function);
    }
}
