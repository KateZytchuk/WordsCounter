package Graph.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vertex {
    private char name;
    private boolean isVisited;

    public Vertex(Character name) {
        this.name = name;
        isVisited = false;
    }
}
