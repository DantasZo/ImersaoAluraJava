package PrimeiraAula01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
	public static void main(String[] args) throws IOException, InterruptedException {
    //conexão http 250 filmes
		String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
		URI endereco = URI.create(url);
		var client = HttpClient.newHttpClient();
		var request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String body = response.body();
		//System.out.println(body);
		
    //extrair somente os dados principais(Titulo,classificação,poster)
	    JsonParser parser = new JsonParser();
		List<Map<String, String>>  listadeFilmes = parser.parse(body);
	    System.out.println(listadeFilmes.size());
	    System.out.println(listadeFilmes.get(0));
	//exibir e manipular os dados
	    for (Map<String,String> filme : listadeFilmes) {
	    	System.out.println(filme.get("title"));
	    	System.out.println(filme.get("image"));
	    	System.out.println(filme.get("imDbRating"));
	    	System.out.println();
	    }
		
		
		
		
		
		
		
		
		
	}
}
