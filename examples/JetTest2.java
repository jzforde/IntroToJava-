package examples;

public class JetTest2
{
	private static String[] models = { "Falcon", "Hawk", "Eagle", "Hummingbird" };
    private static float[] topSpeeds = { 1.0F, 2.0F, 3.0F };
    private static int[] ranges = { 200, 300};

    public static void main(String[] args)
    {
        int arraySize = 455;
        int lastIndex = arraySize - 1;
        
        Jet2[] fleet = new Jet2[arraySize];

        for (int i = 0; i < lastIndex; i++) // Loop one less time than array
        {
            fleet[i] = new Jet2(models[i % models.length], 
                               topSpeeds[i % topSpeeds.length], 
                               ranges[i % ranges.length]);
        }

        // To do: Read model, speed, range from Scanner
        String modelString = "Owl";
        String topSpeedString = "2.0";
        String rangeString = "200";

        // convert String to primitive
        float topSpeed = Float.parseFloat(topSpeedString);
        int range = Integer.parseInt(rangeString);

        // Create last Jet
        fleet[lastIndex] = new Jet2();
        
        // update last Jet to use read in data
        fleet[lastIndex].setModel(modelString);
        fleet[lastIndex].setTopSpeed(topSpeed);
        fleet[lastIndex].setRange(range);

        // Loop through the array printing each Jet
        for (Jet2 jet : fleet)
        {
            System.out.println(jet);
        }

    }
}
