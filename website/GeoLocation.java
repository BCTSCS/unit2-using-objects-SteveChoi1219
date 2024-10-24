public class GeoLocation  
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;  

    // Declaring latitude and longitude as private fields
    private double latitude;
    private double longitude;

    /**
     * Constructs a geo location object with given latitude and longitude
     */
    public GeoLocation(double theLatitude, double theLongitude) 
    {
        this.latitude = theLatitude;
        this.longitude = theLongitude;
    }

    /**
     * Returns the latitude of this geo location
     */
    public double getLatitude() 
    {
        return latitude;
    }

    /**
     * Returns the longitude of this geo location
     */
    public double getLongitude() 
    {
        return longitude;
    }

    // Returns a string representation of this geo location
    public String toString() 
    {
        return "latitude: " + latitude + ", longitude: " + longitude;
    }

    // Returns the distance in miles between this geo location and the given other geo location
    public double distanceFrom(GeoLocation other) 
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        
        // Apply the spherical law of cosines
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        
        // Clamp theCos to the range [-1, 1] to avoid precision errors
        theCos = Math.min(1.0, Math.max(-1.0, theCos));
        
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}
