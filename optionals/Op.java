package optionals;

import java.util.Optional;

import optionals.Cat;

public class Op {

	public static void main(String[] args) {
		
		Optional<Cat> anyCat = findCatByName("Jeremy");
//		
//		if(anyCat != null) {
//			System.out.println(anyCat.getIdade());
//		}
//		else {
//			System.out.println(0);
//		}
		
		if(anyCat.isPresent())
			System.out.println(anyCat.get().getIdade());	
		//or u can use:
		Cat myCat = anyCat.orElse(new Cat("Unknown", 0));
		
		//Cat myCat = anyCat.orElseGet("lambdas");
		
		
	}
	
	public static Optional<Cat> findCatByName(String nome) {
//		Cat cat = new Cat(nome, 3);
//		return cat;
		Cat cat = new Cat(nome, 4);
		return Optional.ofNullable(cat);
	}

}
