package hw_1.task_1.after_1;

/**
 * Нарушение DRY (Don't Repeat Yourself) – дублирование кода
 * Задача: Устраните дублирование кода, применив перегрузку методов
 * или использование массива аргументов.
 */
public class MathOperations {
    public int add(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}
