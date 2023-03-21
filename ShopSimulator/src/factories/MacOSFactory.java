package factories;

import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;
//Cria��o da classe MacOSFactory e implementa��o da interface GUIFactory. 
public class MacOSFactory implements GUIFactory {
//Garantia de que est� sobrescrevendo um m�todo.		
	@Override
//Criar bot�es especificamente para o sistema operacional MacOS
	public Button createButton() {
		return new MacOSButton();
	}
	@Override
//Criar um Checkbox especificamente para o sistema operacional MacOS
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}
