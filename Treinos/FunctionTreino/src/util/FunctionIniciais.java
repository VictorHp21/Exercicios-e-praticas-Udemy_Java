package util;

import java.util.function.Function;

public class FunctionIniciais implements Function<String, String> {
    @Override
    public String apply(String s) {
        String[] aux = s.split(" ");
        StringBuilder iniciais = new StringBuilder();

        for (String s1 : aux) {
            if (!s1.isEmpty()){
                iniciais.append(s1.substring(0, 1).toUpperCase()).append(". ");
            }

        }


        return iniciais.toString();
    }
}
