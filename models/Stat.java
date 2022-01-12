package models;

enum StatType {
    MANPOWER, EFFICIENCY, BUDGET, POLLUTION

        /* Подробнее о статах:

    - Manpower (int 0-100, default ?) = рабочий ресурс, условное количество работников; значение может меняться
    - Efficiency (double 0-5, default 1) = коэффициент эффективности рабочих; может меняться в зависимости от модификаторов (усталость, уважение к начальству, эргономичное пространство и тд)
    - Budget (int 0-any, default ?) = бюджет, неограничен; ежедневно пополняется на revenue = manpower*efficiency, может пополняться и тратиться при долговременных и мгновенных сделках
    - Pollution (int 0-100, default ?) = загрязненность; влияет на настрой гражданских, на появление и развитие тараканов-мутантов */
}

abstract class Stat {

    // todo multiton?

    abstract void increaseBy(int value);
    abstract void decreaseBy(int value);

    // todo - А нужно ли два метода для прибавления-убавления?
    // todo - А может ли понадобиться процентное увеличение значения?
}
