package AtividadeGeneration04POO;

/*Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o.
 * Defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */


public class Aviao01 {

	private String modeloAviao;
	private String capacidadeAviao;
	private String velocidadeAviao;
	private String pesoAviao;
	
	public Aviao01 (String modelo, String capacidade, String velocidade, String peso)
	{
		modeloAvi�o = modelo;
		capacidadeAviao = capacidade;
		velocidadeAviao = velocidade;
		pesoAvi�o = peso;

}
	public String getinformacoesAviao() {
		String informacoesAviao = modeloAviao + " "+ capacidadeAviao + " " + velocidadeAviao + " " + pesoAviao;
		return informacoesAviao;
		
		
	}

}
	

