package checkbox;

//Criação da classe MacOSCheckbox e implementação da interface Checkbox. 
public class MacOSCheckbox implements Checkbox {
//Garantia de que está sobrescrevendo um método.		
	@Override
//Imprimir uma mensagem(falando que MacOSCheckbox foi criado).
	public void paint() {
		System.out.print("You have created MacOSCheckbox");
	}
}
