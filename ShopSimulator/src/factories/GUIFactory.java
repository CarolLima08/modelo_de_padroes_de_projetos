package factories;
import button.Button;
import checkbox.Checkbox;
//Cria��o da interface,os m�todos createButton e createCheckbox devem ser implementados por qualquer classe que implemente a GUIFactory..
public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox(); 
}
