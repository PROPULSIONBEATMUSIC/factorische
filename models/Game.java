package models;

import java.util.ArrayList;

abstract class Game {

    private static final ArrayList<Cards>
            deck = new ArrayList<>();

    private int day;
    private boolean isBeingPlayed;

    protected void init() { /*
        1) Инициализация колоды из JSON
        2) Инициализация игрока из JSON */
    }

    protected void start() { /*
        1) Инициализация завода
        2) Инициализация игрового цикла */
    }

    protected void dailyLoop() { /*
        1) day++ начиная с нуля
        2) Принт ежедневных gains & losses
        3) Принт статов (день, рабочий ресурс, деньги, загрязнение, репутация)

        *** Генерация ежедневных картонок ***
        (challenge -> %ch-follow-up -> event/%e-follow-up)
        4) Принт карточки -> Выбор игрока -> Пересчет статов */
    }
}
