package app;

import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Demo {//define uma classe p�blica
	private static Application configureApplication() { // Define um m�todo est�tico privado chamado "configureApplication" que retorna um objeto da classe "Application"
		Application app;// declara uma vari�vel
		GUIFactory factory;// declara uma vari�vel
		String osName = System.getProperty("os.name").toLowerCase(); // recupera o valor da propriedade de sistema e atribui a uma vari�vel chamada "osName"
		if (osName.contains("mac")) {
			factory = new MacOSFactory();  // cria uma nova inst�ncia da classe "MacOSFactory" e a atribui � vari�vel "factory".
		} else {
			factory = new WindowsFactory(); // caso a condi��o anterior do if n�o seja alcan�ada, vai para uma nova inst�ncia da classe "WindowsFactory"
		}
		app = new Application(factory);
		return app;
	}
	
	public static void main(String[] args) { // realiza a inicia��o do c�digo 
		Application app = configureApplication(); // cria uma nova inst�ncia da classe "Application" chamando o m�todo "configureApplication" e atribui essa inst�ncia � vari�vel "app".
		app.paint(); // chama o m�todo "paint" da inst�ncia da classe "Application" que foi criada anteriormente e atribu�da � vari�vel "app".
	}
}
