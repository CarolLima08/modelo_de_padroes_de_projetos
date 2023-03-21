package app;

import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;
//Cria a classe publica Application e declara duas variaveis de instância do tipo botão e checkbox.
public class Application {
	private Button button;
	private Checkbox checkbox;
//Construtor Java para a classe Application e atribui dois objetos a dois variaveis(botão e checkbox).	
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}
//	Declara um metodo Java e define método público chamado "paint" com um tipo de retorno "void" e invoca o metodo paint dos objetos((botão e checkbox)) 
	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
