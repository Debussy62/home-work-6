public class Consol {
    public void print(){
    }
}
class PlayStation extends Consol {
    public void print() {
        System.out.println("Я лучше всех");
    }
}
class Xbox extends Consol {
    public void print() {
        System.out.println("Нет я лучше всех");
    }
}
class XboxOne extends Xbox {
    public void print() {
        System.out.println("Да, да, пошла ка я ...");
    }
}
class Ns extends Consol {
    public void print() {
        System.out.println("Шли вон, я самая");
    }
}
// Ваша задача достаточно простая. Напапишите код с суперклассом Consol на основе которого будут
// 4 подкласса (xbox, playstation, nintendo). И да, чтобы класс хвох расширялся еще до xbox one.
// И с помощью instanceof проверяйте, что к чему принадлежит.