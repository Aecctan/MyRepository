import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер таблицы умножения:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int res = input(reader);
        int[][] result = new int[res][res];

        for (int i = 0; i < res; i++)
            System.out.print("\t" + (i+1));
        System.out.println();

        for (int i = 0; i < res; i++)
        {
            System.out.print(i+1 + "\t");
            for (int j = 0; j < res; j++)
            {
                result[i][j] = (i+1)*(j+1);
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    private static int input(BufferedReader reader) throws IOException {
        String s = reader.readLine();
        while (!isNumber(s))
        {
            System.out.println("Введите верное число!");
            s = reader.readLine();
        }
        return Integer.parseInt(s);
    }
}
