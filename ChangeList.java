import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        String input = scanner.nextLine();

        for (int i = 0; i < parts.length; i++) {
            numbers.add(Integer.parseInt(parts[i]));
        }

        while (!input.equals("end")) {
            String [] temp = input.split("\\s+");

            if (temp[0].equals("Delete")) {
                for (int i = 0; i < numbers.size(); i++) {
                    int a = Integer.parseInt(temp[1]);
                    if (a == numbers.get(i)) {
                        numbers.remove(i);
                    }
                }
            }

            if (temp[0].equals("Insert")) {
                int index = Integer.parseInt(temp[2]);
                int value = Integer.parseInt(temp[1]);
                if (index < numbers.size()) {
                    numbers.add(index, value);
                } else {
                    break;
                }

            }
            input = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }
}
