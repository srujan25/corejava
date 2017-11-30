package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvReader {
    public static final String KEY_NOT_FOUND = "Not Found";
    public static String read(String departure, String arrival, String date) {
        FlightKey findKey = new FlightKey(departure, arrival, date);
        Map<FlightKey, String> oneRow = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\i\\src\\csv\\Flight-one.csv"));
            BufferedReader reader2 = new BufferedReader(new FileReader("C:\\i\\src\\csv\\Flight-two.csv"));
            BufferedReader reader3 = new BufferedReader(new FileReader("C:\\i\\src\\csv\\Flight-three.csv"));
            if (bufferReader(findKey, oneRow, reader)) return oneRow.get(findKey).replace("|", "   ");
            if (bufferReader(findKey, oneRow, reader2)) return oneRow.get(findKey).replace("|", "   ");
            if (bufferReader(findKey, oneRow, reader3)) return oneRow.get(findKey).replace("|", "   ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return KEY_NOT_FOUND;
    }

    private static boolean bufferReader(FlightKey findKey, Map<FlightKey, String> oneRow, BufferedReader reader) throws IOException {
        while (reader.read() != -1) {
            String line = reader.readLine();
            String[] split = line.split("\\|");
            FlightKey flightKey = new FlightKey(split[1], split[2], split[3]);
            if (oneRow.get(flightKey) == null)
                oneRow.put(flightKey, line);

            if (oneRow.get(findKey) != null)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(read(args[0], args[1], args[2]));
    }
}
