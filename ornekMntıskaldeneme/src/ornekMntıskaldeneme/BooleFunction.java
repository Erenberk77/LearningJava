package ornekMntýskaldeneme;

import java.util.List;

public class BooleFunction {
    private List<String> variables;
    private String function;

    public BooleFunction(List<String> variables, String function) {
        this.variables = variables;
        this.function = function;
    }

    public List<String> getVariables() {
        return variables;
    }

    public String getFunction() {
        return function;
    }
}

