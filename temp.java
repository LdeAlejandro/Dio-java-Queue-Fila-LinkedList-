/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Queue<Carro> queueCarros = new LinkedList <>();
		
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Chevrolet"));
		queueCarros.add(new Carro("Fiat"));
		
		//diferencças add e offer (ambos adicionam mas em caso de não adicionar o retornodo é diferente para cada um)
		//offer em caso de não conseguir adicionar retornas false;
		//add em caso de não conseguir adicionar gera um erro
		
		System.out.println(queueCarros.add(new Carro("Peugeot")));
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);
        
        //Peek pega o primeiro element da fila (não remove o elemento da fila), se a fila estiver vazia retorna null
		System.out.println(queueCarros.peek);
		System.out.println(queueCarros);
		
		// Pool pega o primeiro elemento e remove ele tambem
		System.out.println(queueCarros.pool);
		System.out.println(queueCarros);
		
		//empty indica se a fila esta vazia
		System.out.println(queueCarros.empty);
		
		//size indica o tamanho da fila
		System.out.println(queueCarros.size);

	}
}

// package dio;

import java.util.Objects;

public class Carro{

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o){
        // Se o objeto comparado for o mesmo objeto (mesma referência na memória), retorna verdadeiro

        if (this == o) return true;

        // Verifica se o objeto atual é nulo ou se o objeto recebido não é da mesma classe
        if(this == null || getClass() != o.getClass()) return false;

        // Converte o objeto para o tipo Carro
        Carro carro = (Carro) o;

        // Compara a marca dos carros, usando Objects.equals para tratar casos de nulo
        return Objects.equals(marca, carro.marca);

    }

    @Override
    public int hashCode(){
        return Objects.hash(marca);
    }
    
    @Override
    public String toString() {
        return  "Carro{" +
                "marca=" + marca + "\'" +
                '"}";
    }


}

