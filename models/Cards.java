package models;

import java.util.ArrayList;

enum CardsCategories {
    CH, CUF, CNF, E

        /* Расшифровка аббревиатур:

    - CH - Challenge Card
    - CUF - Challenge Urgent Follow-Up
    - CNF - Challenge Non-Urgent Follow-Up
    - E - Event Card (includes follow-ups)

    todo - Расписать подробно о типах картонок
         - Вомзонжо, стоит изменить аббревиатуры */
}

abstract class Cards {

    private String description;
    private double probability;
    private boolean isActive;

    private CardsCategories category;

    private final ArrayList<Options> options = new ArrayList<>();

    private Cards() {/*
        1) category
        2) isActive
        3) probability (random values scope)
        4) description
        5) options map (Integer, Option)
         */
    }
}
