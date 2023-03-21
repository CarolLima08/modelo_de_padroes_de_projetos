package app;

import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;
//Cria a classe publica Application e declara duas variaveis de inst�ncia do tipo bot�o e checkbox.
public class Application {
	private Button button;
	private Checkbox checkbox;
//Construtor Java para a classe Application e atribui dois objetos a dois variaveis(bot�o e checkbox).	
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}
//	Declara um metodo Java e define m�todo p�blico chamado "paint" com um tipo de retorno "void" e invoca o metodo paint dos objetos((bot�o e checkbox)) 
	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
