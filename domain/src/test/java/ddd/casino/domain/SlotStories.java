package ddd.casino.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class SlotStories extends Stories {

    public SlotStories() {
        super();
    }

    protected List<Object> mySteps() {
        List<Object> steps = new ArrayList(2);
        steps.add(new SlotSteps());
        steps.add(new GameSteps());
        return steps;
    }
}
