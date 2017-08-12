/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Original method
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    /**
     * Ex 7.10
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCountsV2()
    {
        System.out.println("Hr: Count");
        int hour = 0;
        while(hour < hourCounts.length) {
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
    }
    
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }

	/**
	 * Ex 7.13
	 * Return thr number of accesses recorded in the log file.
	 */
	public int numberOfAccesses(){
		int total = 0;
		for(int hour = 0; hour < hourCounts.length; hour++){
				total += hourCounts[hour];
        }
		return total;
	}

	/**
	 * Ex 7.15
     * Returns the busisest hour
     */
	public int busietHour(){
		int busiestHour = 0;
		for(int hour = 0; hour < hourCounts.length; hour++){
			if(hourCounts[hour] > busiestHour){
			busiestHour = hour;
			}
		}	   
		return busiestHour;
	}

	/**
	 * Ex 7.16
     * Returns the slowest hour
     */
	public int slowesthour(){
		int slowestHour = 0;
		for(int hour = 0; hour < hourCounts.length; hour++){
			if(hourCounts[hour] < slowestHour && hourCounts[hour] > 0 ){
			slowestHour = hour;
			}
		}	   
		return slowestHour;
	}

	/**
	 * Ex 7.18 
	 * Returns the busiest two hour period
 	 */
	public int busiestTwoHourPeriod(){
		int busiestTwoHours = 0;
		int busiestBlock = 0;
		for( int hour = 0; hour < hourCounts.length-1; hour++){
		    int hourBlock = hourCounts[hour] + hourCounts[hour+1];
			if(hourBlock > busiestTwoHours){
			busiestTwoHours = hour;
			busiestBlock =hourBlock; 
			}
		}
		return busiestTwoHours;
	}
}