package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "Xpto@gaMa.com";
		
		System.out.println("Original: "   + email);
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Qtde de caracteres: " + email.length());
		System.out.println("Tem @?" + email.contains("@"));
		System.out.println("@ na Posição: " + email.indexOf("@"));
		System.out.println("Parte da String:" + email.substring(2,5));
		System.out.println("Primeira Parte: " + email.substring(0,email.length()/2));
		if (email.contains("@")==true)
		{
		
		/*Exercício:
		
		System.out.println("Somente Usuário: " + email.substring(0,email.length()/3));
		System.out.println("Servidor do email: " + email.substring(5));
		*/
		
		//Exemplo com outro email
		
		System.out.println("Somente Usuário: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor do email: " + email.substring(email.indexOf("@")+1));
		}
		
		
	}

}
