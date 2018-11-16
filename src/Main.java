import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {

    private static final int CITY_INDEX = 1;

    public static void main(String[] args) throws IOException {

        Path csvDataBase = Paths.get("src", "MySource", "baza.csv");

        List<String> csvFile = Files.readAllLines(csvDataBase);
        csvFile.remove(0);

        List<Transaction> transactions = new ArrayList<>();

        for (String lines : csvFile){

            List<String> l = Arrays.asList(lines.split(","));

            Transaction transaction = new Transaction();
            transaction.setCity(l.get(CITY_INDEX));

            String price = l.get(5);
            //System.out.println(price);
            transaction.setPrice(new BigDecimal(price));

            transactions.add(transaction);

        }


        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}


