class MathUtils {
    static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    
    public static void main(String[] args) {
          double[] numbers = { 5.5, 6.0, 7.2, 8.1, 9.3 };
          double average = MathUtils.calculateAverage(numbers);
        
          System.out.println("Average: " + average);
    }
}
