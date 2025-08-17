package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*Using Built-in Functional Interfaces
Java has java.util.function package:

Predicate<T> → boolean test(T t)

Function<T, R> → R apply(T t)

Consumer<T> → void accept(T t)

Supplier<T> → T get()*/

public class BuiltInFunctional {
	public static void main(String[] args) {
		Predicate<Integer> p = (n) -> n % 2 == 0;
		System.out.println(p.test(3));
		
		Function<String,Integer>f= (s)->s.length();
		System.out.println(f.apply("java"));
		
		Consumer<String> c=(s)->System.out.println( s.toUpperCase());
		c.accept("java");
		
		Supplier<Double>s=()-> Math.random();
		System.out.println(s.get());

		Supplier<String>s1=()-> String.valueOf(1);

		System.out.println(s1.get());
	}
}
