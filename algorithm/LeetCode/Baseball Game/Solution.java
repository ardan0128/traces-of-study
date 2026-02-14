
class Solution {

    public int calPoints(String[] operations) {
        LinkedList<Integer> list = new LinkedList<>();
        int sum = 0;

        for (String op : operations) {
            switch (op) {
                case "C" ->
                    sum -= list.removeLast();
                case "D" -> {
                    int item = list.getLast();
                    list.addLast(item * 2);
                    sum += item * 2;
                }
                case "+" -> {
                    int value = list.get(list.size() - 2) + list.getLast();
                    list.addLast(value);
                    sum += value;
                }
                default -> {
                    list.addLast(Integer.parseInt(op));
                    sum += Integer.parseInt(op);
                }
            }
        }

        return sum;
    }
}
