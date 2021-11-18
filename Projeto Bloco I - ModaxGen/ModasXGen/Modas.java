package ModasXGen;

public class Modas {

	private String login;
	private String nome;
	private int cor;
	private String tamanho;
	private int frase;
	private int senha;
	private String genero;
	
	coresModaXGen xx = new coresModaXGen();

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	void finalizando2() {
		System.out.println("=   Agora Vamos para parte final ok!   =");
	
	}
	void endereco() {
		System.out.println("Muito bem!, agora vamos para parte de endereço ok! ");
	}

	void comprar() {
		System.out.println("Agradeçemos sua Compra!");
	}

	void cadastron() {
		System.out.println("Mesmo assim de uma olhada em nossos produtos genderless! :)");
	}

	void recuperarsenha() {
		System.out.println("=  Digite seu email para recuperar a senha  =");
	}

	void lembrarsenha() {
		System.out.println("=   Verifique seu endereço de email pois    =");
		System.out.println("=     enviamos um link de acesso para:      =");
	}

	void brinde() {
		System.out.println("Parabéns!!! Você recebeu um brinde de primeira compra"
				+ "\nIrá junto com o seu produto uma camiseta Wesley curtindo o verão.");
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getFrase() {
		return frase;
	}

	public void setFrase(int frase) {
		this.frase = frase;
	}

	void camisetas() {
		System.out.println("=         ENCAMINHANDO PARA A COMPRA            =");
		System.out.println("=       Qual o tipo de camiseta optado?         =");
		System.out.println("1- Steven Universe");
		System.out.println("2- Eu não parei em pé....");
		System.out.println("3- Orgulho Sáfico");
		System.out.println("4- Eu não queria ter medo...");
	}

	void cores() {
		System.out.println("=       Qual o cor da camiseta desejada?        =");
		System.out.println("1- Azul");
		System.out.println("2- Cinza");
		System.out.println("3- Branca");
		System.out.println("4- Preta");
	}

	void tamanho() {
		System.out.println("=     Qual Tamanho de Camiseta você Deseja?     =");
		System.out.println("1- P");
		System.out.println("2- M");
		System.out.println("3- G");
		System.out.println("4- GG");
	}

	void finalizacao() {
		System.out.println("=             FINALIZANDO A COMPRA              =");
	}

}