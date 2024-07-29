package singltton.ex5_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    private String name;
    private static Map<String,Triple> map = new HashMap<>();
    static {
        String[] names = {"ALPHA","BETA","GAMMA"};
        Arrays.stream(names).forEach(s->map.put(s,new Triple(s)));
    }

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return "Triple{" +
                "name='" + name + '\'' +
                '}';
    }
}
