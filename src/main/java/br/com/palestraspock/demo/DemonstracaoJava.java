package br.com.palestraspock.demo;

import java.util.*;
import java.util.stream.Collectors;

public class DemonstracaoJava {
    public static void main(String[] args) {
		String bairro = "";

		String consulta = "select * from minha_tabela " +
				" where campo1 > 10" +
				" order by campo2 desc";

		System.out.println("O bairro "+ bairro + "é mó dahora!");

		List<String> frutas = new ArrayList<>(Arrays.asList("Mamão", "Abacaxi", "Banana"));
		Collections.sort(frutas);
		System.out.println(frutas);

        List<String> comx = frutas.stream().filter(f -> f.contains("x")).collect(Collectors.toList());
        System.out.println(comx);

        List<UsuarioJ> usuarios = Arrays.asList(new UsuarioJ("HAHAHA@gmail.com"), new UsuarioJ("emailoko@inpe.br"));
        usuarios.forEach(u -> u.corrigirEmail());
        System.out.println(usuarios.stream().map(usuarioJ -> usuarioJ.getEmail()).collect(Collectors.toList()));

        usuarios.sort(Comparator.comparing(UsuarioJ::getEmail));
        System.out.println(usuarios.stream().map(usuarioJ -> usuarioJ.getEmail()).collect(Collectors.toList()));

        Map<String, String> mapaCapitais = new HashMap<>();
    	mapaCapitais.put("SP", "São Paulo");
		mapaCapitais.put("RJ", "Rio de Janeiro");
    	mapaCapitais.put("MG", "Belo Horizonte");
 
		System.out.println("Capital de São Paulo: "+ mapaCapitais.get("SP"));
		
		System.out.println("Digite uma palavra: ");
		String palavra = new Scanner(System.in).next();
		
		if(palavra.equals("amor")){
			System.out.println("Só o amor constrói");
		}
		else {
			System.out.println("Deu ruim no amor");
		}		
    }
}


class UsuarioJ {

    private String email;

    public UsuarioJ(String email) {
        this.email = email;
    }

    void corrigirEmail() {
        email = email.toLowerCase();
    }

    public String getEmail() {
        return email;
    }
}