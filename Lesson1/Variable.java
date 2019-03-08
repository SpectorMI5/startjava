public class Variable {
  public static void main(String[] args) {
    byte cores = 2;
    short memoryVolume = 4;
    int storageCapacity = 250;
    long frequencyVideoCard = 900;
    float frequencyCPU = 2.6F;
    double diagonal = 15.6d;
    char threadsNumber = 52;
    boolean weather = true;
    System.out.println("Number of Cores: " +cores
      +"\nMemory: " +memoryVolume
      +"\nStorage capacity: " +storageCapacity +"GB"
      +"\nVideo card frequency: " +frequencyVideoCard +"MHz"
      +"\nFrequency: " +frequencyCPU +"GHz"
      +"\nScreen diagonal: " +diagonal +"\""
      +"\nNumber of threads: " +threadsNumber
      +"\n-Good weather!  -" +weather +" :)");
  }
}