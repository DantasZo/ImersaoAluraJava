package PrimeiraAula01;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class fabricadesticker {
	
 public void cria() throws Exception {
	 
	 //ler a imagem
	 
	 BufferedImage imagemOriginal = ImageIO.read(new File("entrada/filme")); 
	 
	 
	 
	 
	 //criar a nova imagem em memoria com transparencia e redimensionada
	 
	 int largura = imagemOriginal.getWidth();
	 int altura = imagemOriginal.getHeight();
	 int novaAltura = altura;
	 BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
	 
	 
	 // copiar a imagem original para a nova imagem (em memoria)
	 
	 Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
	 
	 graphics.drawImage(imagemOriginal, 0, 0, null);
	 
	 
	 
	 //escrever uma frase na imagem
	 
	 
	
	 
	 
	 
	 //escrever a nova imagem em um arquivo

	 ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));
	 }
 
 public static void main(String[] args) throws Exception {
	
	 var geradora = new fabricadesticker();
	 geradora.cria();
	 
	 
	 
	 
}
 
}