import java.io.*;
import java.net.*;

public class Website {
    private String domain;
    private String topLevelDomain;
    private Long numUsers;
    private GeoLocation geoLocation;

    // Default constructor
    public Website() {
        domain = "google";
        topLevelDomain = "com";
        numUsers = 4_300_000_000L;
        geoLocation = new GeoLocation(41.2219, 171.2219);
    }

    // Constructor with domain name and top-level domain
    public Website(String domainName, String topDomain) {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = 0L;
        geoLocation = new GeoLocation(40.935, -74.1176);
    }

    // Constructor with domain, top domain, number of users, and GeoLocation
    public Website(String domainName1, String topDomain1, Long users, GeoLocation g) {
        domain = domainName1;
        topLevelDomain = topDomain1;
        numUsers = users;
        geoLocation = g;
    }

    // Get the GeoLocation object
    public GeoLocation getLocation() {
        return geoLocation;
    }

    // Method to fetch data from a given API
    public void fetchData(String api) {
        String urlString = toString() + "/" + api + "/";

        try {
            // Create the URL from the provided string
            URL url = new URL(urlString);
            
            // Open a connection to the API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Read the response and print each line
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            System.out.println("Response from the API:");

            // Print each line of the response directly
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // String representation for printing
    public String toString() {
        String res = "https://" + domain + "." + topLevelDomain;
        return res;
    }

    // Main method to test the API call and distance calculation
    public static void main(String[] args) {
        Website website = new Website("randomuser", "me"); // Create an instance of Website
        website.fetchData("json"); // Call the instance method to fetch data

        Website google = new Website(); // Default Google website
        Website website1 = new Website("ip.api", "com"); // Create another website
        Website aws = new Website(domainName: "aws", topDomain:"com", numPeople:1_000_000, new GeoLocation(theLatitude:38.9339, 77.1773));

        // Calculate the distance between two websites' GeoLocations
        System.out.println("Distance: " + google.getLocation().distanceFrom(website1.getLocation()));

        // Print some location info
        System.out.println(website1.getLocation().getLongitude());
        System.out.println(google.getLocation().getLatitude());
    }
}
