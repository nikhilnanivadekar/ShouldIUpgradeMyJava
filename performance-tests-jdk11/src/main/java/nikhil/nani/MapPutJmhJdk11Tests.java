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
public class MapPutJmhJdk11Tests {

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
    }

    @Benchmark
    public int jdkIntegerPut() {
        this.elements.forEach(each -> this.jdkInteger.put(each, each));
        return this.jdkInteger.size();
    }

    @Benchmark
    public int jdkStringPut() {
        this.elements.forEach(each -> {
            String string = String.valueOf(each);
            this.jdkString.put(string, string);
        });
        return this.jdkString.size();
    }
}
