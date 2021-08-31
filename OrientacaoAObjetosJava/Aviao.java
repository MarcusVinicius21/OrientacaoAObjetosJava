package AtividadeGeneration04POO;

/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião.
 * Defina as instancias deste objeto e apresente as informações deste objeto no console.
 */


public class Aviao01 {

	private String modeloAviao;
	private String capacidadeAviao;
	private String velocidadeAviao;
	private String pesoAviao;
	
	public Aviao01 (String modelo, String capacidade, String velocidade, String peso)
	{
		modeloAvião = modelo;
		capacidadeAviao = capacidade;
		velocidadeAviao = velocidade;
		pesoAvião = peso;

}
	public String getinformacoesAviao() {
		String informacoesAviao = modeloAviao + " "+ capacidadeAviao + " " + velocidadeAviao + " " + pesoAviao;
		return informacoesAviao;
		
		
	}

}
	

