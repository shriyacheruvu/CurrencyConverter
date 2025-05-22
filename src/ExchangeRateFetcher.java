import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ExchangeRateFetcher {
    private static final String API_KEY = "951fb017c3ec30353c02b83b"; // Replace with your actual API key
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    // Method to get exchange rate from 'fromCurrency' to 'toCurrency'
    public static double getRate(String fromCurrency, String toCurrency) {
        try {
            String urlStr = BASE_URL + API_KEY + "/pair/" + fromCurrency + "/" + toCurrency;
            URL url = new URL(urlStr);

            // Open connection and send GET request
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Read the response
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();

            // Parse the JSON response
            JSONObject json = new JSONObject(response.toString());

            // Check if request was successful
            String result = json.getString("result");
            if (!"success".equalsIgnoreCase(result)) {
                System.out.println("API returned failure: " + json.getString("error-type"));
                return -1;
            }

            // Get the conversion rate
            double rate = json.getDouble("conversion_rate");
            return rate;

        } catch (Exception e) {
            System.out.println("Error fetching exchange rate: " + e.getMessage());
            return -1;
        }
    }
}
