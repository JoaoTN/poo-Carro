public class Carro{
	public int pass;
	public float gas;
	public float km;
	public Carro(){
		this.pass = 0;
		this.gas = 0;
		this.km = 0;	
	}
	public int entrar(int p){
		if(p == 1){
			if(this.pass == 2){
				System.out.println("Carro lotado!");
				return 0;
			}
			else{
				this.pass++;
			}
		}
		else if(p == 2){
			if(this.pass <= 0){
				System.out.println("Carro já está vazio!");
				return 0;
			}

			else{
				this.pass--;
			}
		}
		else{
			System.out.println("Erro!");
		}
		return 0;

	}
	public float abastecer(float q){
		this.gas += q;
		if(this.gas > 10){
			this.gas = 10;
		}
		return this.gas;
	}
	public float dirigir(float q){
		float andar = q;
		if(this.gas < (andar/10)){
			System.out.println("Gasolina insuficiente!");
			return 0;
		}
		else if (this.pass <= 0){
			System.out.println("Não a ninguém no carro!");
			return 0;
		}
		else{
			this.gas = gas - (andar/10);
			this.km = km + andar;
			return 0;
		}
	}
}