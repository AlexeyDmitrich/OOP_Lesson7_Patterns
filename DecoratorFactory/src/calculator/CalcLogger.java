package calculator;

public class CalcLogger implements Calculable{

    private Calculable calculable;
    private Loggable loggable;

    public CalcLogger(Calculable calculable, Loggable loggable) {
        this.calculable = calculable;
        this.loggable = loggable;
        loggable.log(String.format("Число %d \n", calculable.getResult()));
    }

    @Override
    public Calculable sum(int arg) {
        loggable.log(String.format("Прибавляем %d \n",arg));
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        loggable.log(String.format("Умножаем на %d \n",arg));
        return calculable.multi(arg);
    }


    @Override
    public int getResult() {
        int res = calculable.getResult();
        loggable.log(String.format("Получили результат: %d \n", res));
        return res;
    }

}
