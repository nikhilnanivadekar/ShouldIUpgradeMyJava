package nikhil.nani;

import org.openjdk.jmh.annotations.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@State(Scope.Thread)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(3)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
public class MapGetJmhJdk17Tests {

    @Param({"1000", "10000", "25000", "50000", "75000", "100000"})
    public int size;

    private Map<Integer, Integer> jdkInteger;
    private Map<String, String> jdkString;

    private List<Integer> elements;

    @Setup
    public void setUp() {
        this.elements = IntStream.range(0, this.size).boxed().collect(Collectors.toList());
        this.jdkInteger = new HashMap<>();
        this.jdkString = new HashMap<>();
        this.elements.forEach(each ->
        {
            jdkInteger.put(each, -each);
            jdkString.put(String.valueOf(each), String.valueOf(-each));
        });
    }

    @Benchmark
    public int jdkIntegerGet() {
        this.elements.forEach(each ->
        {
            if (this.jdkInteger.get(each) != -each) {
                throw new IllegalStateException();
            }
        });
        return this.jdkInteger.size();
    }

    @Benchmark
    public int jdkStringGet() {
        this.elements.forEach(each ->
        {
            if (!this.jdkString.get(String.valueOf(each)).equals(String.valueOf(-each))) {
                throw new IllegalStateException();
            }
        });
        return this.jdkString.size();
    }
}
