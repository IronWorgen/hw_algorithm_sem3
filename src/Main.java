public class Main {
    public static void main(String[] args) {
        LinkedLIst<Integer> list = new LinkedLIst<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.printList();
        System.out.println();

        list.revers();
        list.printList();

    }
}