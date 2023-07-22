package collectionsframework.implementacoes.comparable;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks>{
	private double matematica;
	private double fisica;
	private double poo;
	
	public StudentMarks(double matematica, double fisica, double poo) {
		super();
		this.matematica = matematica;
		this.fisica = fisica;
		this.poo = poo;
	}

	public double getMatematica() {
		return matematica;
	}

	public void setMatematica(double matematica) {
		this.matematica = matematica;
	}

	public double getFisica() {
		return fisica;
	}

	public void setFisica(double fisica) {
		this.fisica = fisica;
	}

	public double getPoo() {
		return poo;
	}

	public void setPoo(double poo) {
		this.poo = poo;
	}

	@Override
	public int compareTo(StudentMarks o) {
		/*
		  objeto atual < outro objeto
		  	return -1
		  objeto atual > outro objeto
		  	return 1
		  objeto atual == outro objeto 
		  	return 0
		 */
		
//		if(this.matematica < o.matematica) return -1;
//		if(this.matematica > o.matematica) return 1;
//		if(this.matematica == o.matematica) return 0;
		
		//ou é só fazer isso:
		
		return (int) (o.matematica - this.matematica);
	}

	@Override
	public String toString() {
		return "StudentMarks [matematica=" + matematica + ", fisica=" + fisica + ", poo=" + poo + "]";
	}
	
	//override the equals and hashcode!
	
	@Override
	public int hashCode() {
		return Objects.hash(fisica, matematica, poo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentMarks other = (StudentMarks) obj;
		return Double.doubleToLongBits(fisica) == Double.doubleToLongBits(other.fisica)
				&& Double.doubleToLongBits(matematica) == Double.doubleToLongBits(other.matematica)
				&& Double.doubleToLongBits(poo) == Double.doubleToLongBits(other.poo);
	}
}
