package ru.constantin.testspring;

import java.util.ArrayList;
import java.util.List;

public class ListGenre {
    private List<Music> list = new ArrayList();

    public ListGenre (ClassicalMusic classicalMusic, RockMusic rockMusic, DrumAndBaseMusic drumAndBaseMusic) {
        this.list.add(classicalMusic);
        this.list.add(rockMusic);
        this.list.add(drumAndBaseMusic);
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
