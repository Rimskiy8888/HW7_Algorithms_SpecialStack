package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("Размер очереди - " + queue.size());
        System.out.println("Пустая ли очередь? - " + queue.empty());
        System.out.println(queue);

        queue.push("AAA");
        queue.push("BBB");
        queue.push("CCC");
        queue.push("DDD");
        queue.push("EEE");
        queue.push("FFF");
        queue.push("GGG");
        queue.push("HHH");

        System.out.println("Размер очереди - " + queue.size());
        System.out.println("Пустая ли очередь? - " + queue.empty());
        System.out.println(queue);

        String removedElement = queue.pop();
        System.out.println(queue);
        System.out.println("Удалённый элемент - " + removedElement);

        removedElement = queue.pop();
        System.out.println(queue);
        System.out.println("Удалённый элемент - " + removedElement);

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();

        System.out.println("Размер очереди - " + queue.size());
        System.out.println("Пустая ли очередь? - " + queue.empty());
        System.out.println(queue);

        queue.push("III");
        queue.push("JJJ");
        queue.push("KKK");
        queue.push("LLL");
        queue.push("MMM");

        System.out.println("Размер очереди - " + queue.size());
        System.out.println("Пустая ли очередь? - " + queue.empty());
        System.out.println(queue);



    }
}
