package models;

import models.Player;

import java.util.ArrayList;

abstract class Game {

    private static final ArrayList<Cards> deck = new ArrayList<>();
    // вообще все существующие в игре картонки

    private int day;
    private boolean isBeingPlayed;

    private Player player;

    protected void init() {/*
        1) Инициалзиация игрока
        2) Инциализация завода
        3) Инциализация цикла с днями
        до тех пор, пока игра не проиграна
         */
    }

    protected void initNewDay() {/*
        1) Для day=1 - askIfIntroductionIsNeeded()
        2) Для day>1 - принт ежедневных утрат и прибылей
        3) Принт статов (день, рабочий ресурс, деньги, загрязнение, репутация)

        *** Генерация ежедневных картонок ***
        (challenge -> %ch-follow-up -> event/%e-follow-up)
        4) Принт карточки
        5) Выбор игрока
        6) Пересчет статов
         */
    }
}
