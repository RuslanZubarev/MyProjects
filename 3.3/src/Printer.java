public class Printer {
    private static String queue = "";
    private int pendingPagesCount;
    private int totalAmountPage;

    public void append(String name) {
        append(name, "");
    }

    public void append(String name, String text) {
        append(name, text, 1);
    }

    public void append(String name, String text, int amountPage) {

        pendingPagesCount = pendingPagesCount + amountPage;
        queue = queue + "\n" + "Имя: " + name +
                "\n" + "Текст: " + text +
                "\n" + "Количество страниц: " + amountPage;
    }


    public void clear() {
        queue = "";
        pendingPagesCount = 0;
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("Очередь очищена");
            return;
        }
        totalAmountPage = totalAmountPage + pendingPagesCount;
        System.out.println(queue);
        System.out.println("Общее количество страниц: " + getPendingPagesCount());
        System.out.println("Общее количество распечатанных страниц: " + getTotalAmountPage());
        clear();
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;

    }

    public int getTotalAmountPage() {
        return totalAmountPage;
    }
}
