package models;

import java.util.ArrayList;

enum CardsCategories {
    CH, CUF, CNF, EV

        /* Расшифровка аббревиатур:

    - CH - Challenge Card
    - CUF - Challenge Urgent Follow-Up
    - CNF - Challenge Non-Urgent Follow-Up
    - EV - Event Card (includes follow-ups)

    todo - Расписать подробно о типах картонок
         - Возможно, стоит изменить аббревиатуры */
}

abstract class Cards {

    private String description;
    private double probability;

    private boolean isActive;
    private boolean isDisposable;

    private CardsCategories category;

    private final ArrayList<Options> options = new ArrayList<>();

    private Cards() {/*
        1) category
        2) isActive
        3) probability (random values scope)
        4) description
        5) options map (Integer, Option) */
    }

    abstract void setProbability();
    abstract void activate();
    abstract void deactivate();
}
