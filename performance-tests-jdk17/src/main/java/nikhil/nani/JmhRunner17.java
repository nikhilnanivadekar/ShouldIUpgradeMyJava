package nikhil.nani;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class JmhRunner17 {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(MapGetJmhJdk17Tests.class.getSimpleName())
                .include(MapPutJmhJdk17Tests.class.getSimpleName())
                .forks(3)
                .warmupIterations(5)
                .measurementIterations(5)
                .mode(Mode.Throughput)
                .build();

        new Runner(opt).run();
    }
}
