import java.util.ArrayList;
import java.util.List;

public class FibonacciChallenge {

	public static void main(String[] args) {
		List<Integer> fibo = new ArrayList<>();

		int anterior = 1;
		int atual = 0;
		
		for(int i=0; i<350; i++ ){
			fibo.add(atual);
			atual += anterior;
			anterior = atual - anterior;
			if(anterior > 350){
				break;
			}
		}


		System.out.println(fibo);
}


}
