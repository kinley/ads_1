package Sort_4.Exercise_23;

// Секундомер
public class Stopwatch
{
    private final long start;

    public Stopwatch()
    {
        start = System.currentTimeMillis();
    }

    public double elapsedTime()
    {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
