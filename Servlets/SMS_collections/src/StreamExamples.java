import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class StreamExamples {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Vivian","Veronica","Myran","Mike","Ryan");
		Stream<String> st = list.stream();
		List<String> filteredList = st.filter(x->x.startsWith("M")).collect(Collectors.toList());
		System.out.println(filteredList);
		
		
		
				
				
	}

}
