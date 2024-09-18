package com.sachith.kie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sachith Lakmal
 * @since 1.0.0
 */
// Working Memory (WM)
public class WorkingMemory {
    List<WorkingMemoryElement> wmes = new ArrayList<>();

    public void addWME(WorkingMemoryElement wme) {
        wmes.add(wme);
    }

    public List<WorkingMemoryElement> getWMEs() {
        return wmes;
    }
}
