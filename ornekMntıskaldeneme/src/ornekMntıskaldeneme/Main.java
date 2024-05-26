package ornekMntýskaldeneme;

public class Main {
    public static void main(String[] args) {
        try {
            String filePath = "boole.txt";
            BooleFunction booleFunction = FileReaderUtil.readBooleFunction(filePath);

            TruthTable truthTable = new TruthTable(booleFunction);
            truthTable.printTruthTable();
            truthTable.printMinterms();
            truthTable.printMaxterms();
        } catch (Exception e) {
            System.err.println("Hata: " + e.getMessage());
        }
    }
}