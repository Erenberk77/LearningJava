package ornekMntýskaldeneme;

import java.util.ArrayList;
import java.util.List;

public class TruthTable {
    private BooleFunction booleFunction;

    public TruthTable(BooleFunction booleFunction) {
        this.booleFunction = booleFunction;
    }

    public void printTruthTable() {
        List<String> variables = booleFunction.getVariables();
        int numVars = variables.size();
        int rows = (int) Math.pow(2, numVars);

        System.out.println("Doðruluk Tablosu:");
        for (String var : variables) {
            System.out.print(var + " ");
        }
        System.out.println("F");

        for (int i = 0; i < rows; i++) {
            String binary = String.format("%" + numVars + "s", Integer.toBinaryString(i)).replace(' ', '0');
            for (char bit : binary.toCharArray()) {
                System.out.print(bit + " ");
            }
            System.out.println(evaluateFunction(binary) ? "1" : "0");
        }
    }

    private boolean evaluateFunction(String binary) {
        String function = booleFunction.getFunction();
        List<String> variables = booleFunction.getVariables();

        for (int i = 0; i < variables.size(); i++) {
            char var = variables.get(i).charAt(0);
            char value = binary.charAt(i);
            function = function.replace(String.valueOf(var), String.valueOf(value));
            function = function.replace(String.valueOf(var) + "'", value == '0' ? "1" : "0");
 

        }

        return evaluateExpression(function);
    }

    private boolean evaluateExpression(String expression) {
        String[] terms = expression.split("\\+");
        for (String term : terms) {
            if (evaluateTerm(term.trim())) {
                return true;
            }
        }
        return false;
    }

    private boolean evaluateTerm(String term) {
        for (char c : term.toCharArray()) {
            if (c == '0') {
                return false;
            }
        }
        return true;
    }

    public void printMinterms() {
        List<String> variables = booleFunction.getVariables();
        int numVars = variables.size();
        int rows = (int) Math.pow(2, numVars);

        List<Integer> minterms = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            String binary = String.format("%" + numVars + "s", Integer.toBinaryString(i)).replace(' ', '0');
            if (evaluateFunction(binary)) {
                minterms.add(i);
            }
        }

        System.out.println("Minterm Ýfadeleri:");
        StringBuilder mintermExpression = new StringBuilder("F = ");
        StringBuilder mintermIndices = new StringBuilder("E(");
        for (int i = 0; i < minterms.size(); i++) {
            int index = minterms.get(i);
            mintermIndices.append(index);
            if (i < minterms.size() - 1) {
                mintermIndices.append(", ");
            }
            String binary = String.format("%" + numVars + "s", Integer.toBinaryString(index)).replace(' ', '0');
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '0') {
                    mintermExpression.append(variables.get(j)).append("'");
                } else {
                    mintermExpression.append(variables.get(j));
                }
            }
            if (i < minterms.size() - 1) {
                mintermExpression.append(" + ");
            }
        }
        mintermIndices.append(")");
        System.out.println(mintermExpression.toString());
        System.out.println(mintermIndices.toString());
    }

    public void printMaxterms() {
        List<String> variables = booleFunction.getVariables();
        int numVars = variables.size();
        int rows = (int) Math.pow(2, numVars);

        List<Integer> maxterms = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            String binary = String.format("%" + numVars + "s", Integer.toBinaryString(i)).replace(' ', '0');
            if (!evaluateFunction(binary)) {
                maxterms.add(i);
            }
        }

        System.out.println("Maxterm Ýfadeleri:");
        StringBuilder maxtermExpression = new StringBuilder("F = ");
        StringBuilder maxtermIndices = new StringBuilder("n(");
        for (int i = 0; i < maxterms.size(); i++) {
            int index = maxterms.get(i);
            maxtermIndices.append(index);
            if (i < maxterms.size() - 1) {
                maxtermIndices.append(", ");
            }
            String binary = String.format("%" + numVars + "s", Integer.toBinaryString(index)).replace(' ', '0');
            maxtermExpression.append("(");
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '0') {
                    maxtermExpression.append(variables.get(j)).append(" + ");
                } else {
                    maxtermExpression.append(variables.get(j)).append("' + ");
                }
            }
            maxtermExpression.delete(maxtermExpression.length() - 3, maxtermExpression.length());
            maxtermExpression.append(")");
            if (i < maxterms.size() - 1) {
                maxtermExpression.append(".");
            }
        }
        maxtermIndices.append(")");
        System.out.println(maxtermExpression.toString());
        System.out.println(maxtermIndices.toString());
    }
}
