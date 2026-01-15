package miniProject2;
import java.io.*;
import java.util.*;

public class FileUtil {

	private static final String FILE = "data/employees.txt";

    public static void save(List<Employee> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {
            for (Employee e : list) {
                bw.write(e.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("File write error");
        }
    }

    public static List<Employee> load() {
        List<Employee> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                list.add(new Employee(
                        Integer.parseInt(data[0]),
                        data[1],
                        Double.parseDouble(data[2]),
                        data[3]));
            }
        } catch (IOException e) {
            // file may be empty initially
        }
        return list;
    }
}
