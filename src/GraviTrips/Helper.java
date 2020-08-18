package GraviTrips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
    public static String readFromConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Exception exception;
        do {
            exception = null;
            try {
                return reader.readLine();
            } catch (IOException e) {
                exception = e;
                e.printStackTrace();
            }
        } while (exception != null);
        return null;
    }
}
