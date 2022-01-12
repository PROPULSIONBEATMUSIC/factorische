package models;

enum ReputationType {
    WORKERS, CIVILIANS, GOVERNMENT,
    SCIENTISTS, FOREIGN_AGENT, BUSINESSMAN

        /* Подробнее о репутации:

    - Workers (wrk, 0-10, default 5) - работяги (труженики на заводе) могут бастовать, более и менее эффективно работать
    - Civilians (civ, 0-10, default 5) - гражданские (активисты, жители города) могут водить детей на экскурсии, бунтовать против завода
    - Government (gov, 0-10, default 5) - правительство может делать заказы, принимать взятки, или раздавить ваш мурвейник

    todo - Шкала (0,10), либо шкала от (-5,5), либо какая ещё подойдёт?

    todo - А нужны ли вообще шкалы репутации для остальных(sci, fag, bus)?
         - Можно ли построить на репутации ветку ивентов сотрудничества?

    - Scientists (sci, 0-5) - ученые могут делать заказы, продавать разработки по увеличению эффективности завода
    - Foreign Agent (fag, 0-5) - иностранный агент может предложить прибыльную сделку, которая может быть раскрыта правительством
    - Businessman (bus, 0-5) - предприниматель может предожить прибыльную легальную сделку */
}

abstract class Reputation {

    // todo multiton?

    abstract void increaseBy(int value);
    abstract void decreaseBy(int value);
}