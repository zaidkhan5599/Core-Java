import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.SetOfIntegerSyntax;

public class StreamIntExample {
public static void main(String[] args) {
	List<Integer>list = Arrays.asList(10,9,5,87,17,67,78);
	Stream<Integer> st = list.stream();
	List<Integer> filteredList = st.sorted().collect(Collectors.toList());
	System.out.println(filteredList);
	List<String>list1 = Arrays.asList("Mike","Myran","Abhishek","Bharat","Zaid");
	Stream<String> st1 = list1.stream();
	List<String> filteredList1 = st1.sorted().collect(Collectors.toList());
	System.out.println(filteredList1);
	List<Integer> num = Arrays.asList(1,2,3,4);
	num.stream().map(x->x*x).forEach(x->System.out.println(x));
	List<Integer>square = num.stream().map(x->x*x).collect(Collectors.toList());
	System.out.println(square);
	
	
	
	
	
}
}
