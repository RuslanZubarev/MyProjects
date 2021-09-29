public class Printer {
    private static String queue = "";
    private int amountPage = 1;
    private int pendingPagesCount;
    private int totalAmountPage;
    private int a;

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
        totalAmountPage = totalAmountPage + pendingPagesCount;
        if (queue.isEmpty()) {
            System.out.println("Очередь очищена");
        } else {
            System.out.println(queue);
            System.out.println("Общее количество страниц: " + getPendingPagesCount());
            System.out.println("Общее количество распечатанных страниц: " + getTotalAmountPage());
        }
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;

    }

    public int getTotalAmountPage() {
        return totalAmountPage;
    }
}
