package ModasXGen;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ModasXGen {
	// Grupo 02: Gabriel, Gabrielly, Larissa, Lucas, Wesley
	// ModasXGen
	// Relação com ODS 5 - Igualdade de gênero
	
	public static void main(String[] args) throws InterruptedException {
			String nome;
			String sobrenome;
			String genero;
			String login;
			String email;
			String cpf;
			String whats;
			String datav;

			int telefone;
			int y = 1, n = 2;
			int user = 0, cor = 0;
			int frase = 0, tamanho = 0;
			int senha;
			int ddd;
			int cartao = 1, boleto = 2, pix = 3;
			int pagt = 0, numc1, numc2, numc3, numc4, cods;

			// Informativos do código by wesley.
			// endereço. Primeira parte, a partir da linha 1011 e segunda parte a partir da
			// linha 2248
			// !!!!!!!!!!!!
			// Bora clã!!
			// Quando pensar em desistir ! termine o código primeiro! Depois Desista Á
			// Vontade!!!

			Scanner scan = new Scanner(System.in);

			Modas cliente = new Modas();
			coresModaXGen xx = new coresModaXGen();
			pagamentosModaXGen pag = new pagamentosModaXGen();

			JOptionPane.showMessageDialog(null,
					"==========================" + "\n=               ModasXGen                  ="
							+ "\n=           Moda Para Todes            =" + "\n==========================");

			System.out.println("==========================================");
			System.out.println("=               ModasXGen                =");
			System.out.println("=             Moda Para Todes            =");
			System.out.println("==========================================");
			System.out.println("=   Você já tem cadastro na nossa loja?  =");
			System.out.println("=  Digite |1| para sim e |2| para não:   =");
			user = scan.nextInt();
			System.out.println();

			for (int i = 0; i < 1; i++) {

				if (user == y) {
					System.out.println("=           Faça seu login:              =");
					System.out.println("=        Digite o Login desejado:        =");
					login = scan.next();
					System.out.println("=         Digite sua senha:              =");
					System.out.println("=     Caso não se recorde digite 2       =");
					senha = scan.nextInt();
					System.out.println();

					if (senha == 2) {
						cliente.recuperarsenha();
						email = scan.next();
						cliente.lembrarsenha();
						System.out.println(email);

					} else {
						cliente.camisetas();
						frase = scan.nextInt();

						cliente.cores();
						cor = scan.nextInt();

						cliente.tamanho();
						tamanho = scan.nextInt();
						System.out.println();

						cliente.setLogin(login);
						cliente.setSenha(senha);
						cliente.setFrase(frase);
						cliente.setCor(cor);

						cliente.finalizacao();
						System.out.println("Seu login é:" + cliente.getLogin() + "\nSua senha: " + cliente.getSenha());

						// Tamanho P
						if (cor == 1 && frase == 1 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1ap();
						}
						if (cor == 1 && frase == 2 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1bp();
						}
						if (cor == 1 && frase == 3 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1cp();
						}
						if (cor == 1 && frase == 4 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1dp();
						}
						if (cor == 2 && frase == 1 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2ap();
						}
						if (cor == 2 && frase == 2 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2bp();
						}
						if (cor == 2 && frase == 3 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2cp();
						}
						if (cor == 2 && frase == 4 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2dp();
						}
						if (cor == 3 && frase == 1 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3ap();
						}
						if (cor == 3 && frase == 2 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3bp();
						}
						if (cor == 3 && frase == 3 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3cp();
						}
						if (cor == 3 && frase == 4 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3dp();
						}
						if (cor == 4 && frase == 1 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4ap();
						}
						if (cor == 4 && frase == 2 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4bp();
						}
						if (cor == 4 && frase == 3 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4cp();
						}
						if (cor == 4 && frase == 4 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4dp();
						}
						// Tamanho M
						if (cor == 1 && frase == 1 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1am();
						}
						if (cor == 1 && frase == 2 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1bm();
						}
						if (cor == 1 && frase == 3 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1cm();
						}
						if (cor == 1 && frase == 4 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1dm();
						}
						if (cor == 2 && frase == 1 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2am();
						}
						if (cor == 2 && frase == 2 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2bm();
						}
						if (cor == 2 && frase == 3 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2cm();
						}
						if (cor == 2 && frase == 4 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2dm();
						}
						if (cor == 3 && frase == 1 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3am();
						}
						if (cor == 3 && frase == 2 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3bm();
						}
						if (cor == 3 && frase == 3 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3cm();
						}
						if (cor == 3 && frase == 4 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3dm();
						}
						if (cor == 4 && frase == 1 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4am();
						}
						if (cor == 4 && frase == 2 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4bm();
						}
						if (cor == 4 && frase == 3 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4cm();
						}
						if (cor == 4 && frase == 4 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4dm();
						}
						// Tamanho G
						if (cor == 1 && frase == 1 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1bg();
						}
						if (cor == 1 && frase == 2 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1bg();
						}
						if (cor == 1 && frase == 3 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1cg();
						}
						if (cor == 1 && frase == 4 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1dg();
						}
						if (cor == 2 && frase == 1 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2ag();
						}
						if (cor == 2 && frase == 2 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2bg();
						}
						if (cor == 2 && frase == 3 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2cg();
						}
						if (cor == 2 && frase == 4 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2dg();
						}
						if (cor == 3 && frase == 1 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3ag();
						}
						if (cor == 3 && frase == 2 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3bg();
						}
						if (cor == 3 && frase == 3 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3cg();
						}
						if (cor == 3 && frase == 4 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3dg();
						}
						if (cor == 4 && frase == 1 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4ag();
						}
						if (cor == 4 && frase == 2 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4bg();
						}
						if (cor == 4 && frase == 3 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4cg();
						}
						if (cor == 4 && frase == 4 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4dg();
						}
						// Tamanho GG

						if (cor == 1 && frase == 1 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1agg();
						}
						if (cor == 1 && frase == 2 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1bgg();
						}
						if (cor == 1 && frase == 3 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1cgg();
						}
						if (cor == 1 && frase == 4 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor1dgg();
						}
						if (cor == 2 && frase == 1 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2agg();
						}
						if (cor == 2 && frase == 2 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2bgg();
						}
						if (cor == 2 && frase == 3 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2cgg();
						}
						if (cor == 2 && frase == 4 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor2dgg();
						}
						if (cor == 3 && frase == 1 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3agg();
						}
						if (cor == 3 && frase == 2 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3bgg();
						}
						if (cor == 3 && frase == 3 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3cgg();
						}
						if (cor == 3 && frase == 4 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor3dgg();
						}
						if (cor == 4 && frase == 1 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4agg();
						}
						if (cor == 4 && frase == 2 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4bgg();
						}
						if (cor == 4 && frase == 3 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4cgg();
						}
						if (cor == 4 && frase == 4 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");

							cliente.comprar();
							System.out.println();
							xx.cor4dgg();
						}

						System.out.println();
						cliente.finalizando2();
						pag.pagamentoP();
						System.out.println();
						System.out.println("Como você gostaria de efetuar o Pagamento? ");
						System.out.println("Digite 1 para CARTÃO: ");
						System.out.println("Digite 2 para BOLETO: ");
						System.out.println("Digite 3 para pagar em Pix:  ");
						pagt = scan.nextInt();

						// Pagamento no cartão
						if (pagt == cartao) {

							pag.cartãoP();
							System.out.println("Digite os primeiros 4 números do cartão: ");
							numc1 = scan.nextInt();
							System.out.println("Digite os proximos 4 números do cartão: ");
							numc2 = scan.nextInt();
							System.out.println("Digite os próximos 4 números do cartão: ");
							numc3 = scan.nextInt();
							System.out.println("Digite os 4 últimos números do cartão: ");
							numc4 = scan.nextInt();
							System.out.println();
							System.out.println("Digite a Data de Validade, separe com '/': ");
							datav = scan.next();
							System.out.println("Digite o código de segurança: ");
							cods = scan.nextInt();
							System.out.println("Confirmando... Data de Validade:" + datav + " Código de Segurança:" + cods);
							System.out.println();
							System.out.println("Aguarde confirmação de pagamento...");
							Thread.sleep(2000);
							System.out.println("...");
							Thread.sleep(2000);
							System.out.println("...");
							Thread.sleep(1000);
							System.out.println("Número do seu cartão é:");
							System.out.println(numc1 + "-" + numc2 + "-" + numc3 + "-" + numc4);
							System.out.println();
							System.out.println("Pagamento Realizado!");

							// cliente.endereco();

						}
						// Pagamento no Boleto

						if (pagt == boleto) {

							System.out.println();
							System.out.println("Devido a novas regulamentações, agora é necessário solicitar o CPF"
									+ " ao realizar a compra/ativação do código QR.");
							System.out.println(" Isso tornará o ambiente de compra mais seguro.");
							System.out.println();
							System.out.println("Digite o seu CPF: ");
							cpf = scan.next();
							System.out.println("Digite seu primeiro nome: ");
							nome = scan.next();
							System.out.println("Digite seu sobrenome: ");
							sobrenome = scan.next();

							System.out.println("Seu cpf :" + cpf + "\nSeu nome: " + nome + " " + sobrenome);
							System.out.println();
							System.out.println("Digite Seu Email para recebimento do Boleto:");
							email = scan.next();
							System.out.println("Sua compra foi efetuada com sucesso!");
							System.out.println("Valor R$150,00");
							System.out.println("Boleto enviado ao email: " + email);
							System.out.println("Vencimento da compra até em dois dias úteis");

							cliente.comprar();

						}

						// Pagamento VIA PIX
						if (pagt == pix) {

							System.out.println();
							System.out.println("Devido a novas regulamentações, agora é necessário solicitar o CPF"
									+ " ao realizar a compra/ativação do código QR.");
							System.out.println();
							System.out.println("Digite o seu CPF: ");
							cpf = scan.next();
							System.out.println("Digite seu primeiro nome: ");
							nome = scan.next();
							System.out.println("Digite seu sobrenome: ");
							sobrenome = scan.next();

							System.out.println("Seu cpf :" + cpf + "\nSeu nome: " + nome + " " + sobrenome);
							System.out.println();
							System.out.println("Digite O whatsapp para recebimento do código PIX:");
							whats = scan.next();
							System.out.println("Código QR PIX enviado Via Whatsapp!" + whats);
							System.out.println();
							System.out.println("Pagamento em até 2 dias úteis");

							cliente.comprar();

						}
						// Parte para endereço da entrega!
		                cliente.endereco();
		                
		                Scanner scanend = new Scanner(System.in);
		                Scanner scancep = new Scanner(System.in);
		                
		                System.out.println();
		                System.out.println("Digite o seu CEP:");
		                String endcep = scancep.next();
		                System.out.println("Digite o seu endereço:");
		                String ends = scanend.nextLine();
		                
		                EnderecoModaXGen objeto1 = new EnderecoModaXGen(endcep);
		                System.out.println("O seu pedido será enviado para o CEP: ");
		                System.out.println("|" + objeto1.enderecofim + " |");
		                
		                EnderecoModaXGen objeto = new EnderecoModaXGen(ends);
		                System.out.println("Endereço: ");
		                System.out.println("|" + objeto.enderecofim + " |");
		                System.out.println();
		                cliente.brinde();
		                JOptionPane.showMessageDialog(null, "O seu pedido será enviado para o CEP: " + objeto1.enderecofim
		                        + "\nEndereço: " + objeto.enderecofim + 
		                        "\n\nParabéns!!! Você recebeu um brinde de primeira compra!"
		                + "\nIrá junto com o seu produto uma camiseta Wesley curtindo o verão.");
		                scanend.close();
		                scancep.close();

					}
				} else {
					System.out.println("=       Deseja fazer seu cadastro:       =");
					System.out.println("=  Digite |1| para sim e |2| para não:   =");
					user = scan.nextInt();

					if (user == n) {
						System.out.println();

						cliente.cadastron();

					} else if (user == y) {
						System.out.println("=    Por gentileza nos diga apenas seu nome:   =");
						nome = scan.next();
						System.out.println("=              Bem vinde " + nome + "                =");
						System.out.println("=             Informe seu sobrenome:            =");
						sobrenome = scan.next();
						System.out.println("=         Qual o nome de login desejado:        =");
						login = scan.next();
						System.out.println("=                Digite uma senha:              =");
						senha = scan.nextInt();
						System.out.println("=            Nos diga seu Gênero:               =");
						System.out.println("- Masculino ");
						System.out.println("- Feminino");
						System.out.println("- Não-Binário ");
						System.out.println("- Outro, nesse caso, nos informe qual: ");
						System.out.println();
						genero = scan.next();
						cliente.camisetas();
						frase = scan.nextInt();

						cliente.cores();
						cor = scan.nextInt();

						cliente.tamanho();
						tamanho = scan.nextInt();
						System.out.println();
						cliente.setLogin(login);
						cliente.setNome(nome);
						cliente.setGenero(genero);
						cliente.setSenha(senha);
						cliente.setFrase(frase);
						cliente.setCor(cor);

						// Tamanho P
						if (cor == 1 && frase == 1 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1ap();
						}
						if (cor == 1 && frase == 2 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1bp();
						}
						if (cor == 1 && frase == 3 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1cp();
						}
						if (cor == 1 && frase == 4 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1dp();
						}
						if (cor == 2 && frase == 1 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2ap();
						}
						if (cor == 2 && frase == 2 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2bp();
						}
						if (cor == 2 && frase == 3 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2cp();
						}
						if (cor == 2 && frase == 4 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2dp();
						}
						if (cor == 3 && frase == 1 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3ap();
						}
						if (cor == 3 && frase == 2 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3bp();
						}
						if (cor == 3 && frase == 3 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3cp();
						}
						if (cor == 3 && frase == 4 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3dp();
						}
						if (cor == 4 && frase == 1 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4ap();
						}
						if (cor == 4 && frase == 2 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4bp();
						}
						if (cor == 4 && frase == 3 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4cp();
						}
						if (cor == 4 && frase == 4 && tamanho == 1) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4dp();
						}
						// Tamanho M
						if (cor == 1 && frase == 1 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1am();
						}
						if (cor == 1 && frase == 2 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1bm();
						}
						if (cor == 1 && frase == 3 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1cm();
						}
						if (cor == 1 && frase == 4 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1dm();
						}
						if (cor == 2 && frase == 1 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2am();
						}
						if (cor == 2 && frase == 2 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2bm();
						}
						if (cor == 2 && frase == 3 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2cm();
						}
						if (cor == 2 && frase == 4 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2dm();
						}
						if (cor == 3 && frase == 1 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3am();
						}
						if (cor == 3 && frase == 2 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3bm();
						}
						if (cor == 3 && frase == 3 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3cm();
						}
						if (cor == 3 && frase == 4 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3dm();
						}
						if (cor == 4 && frase == 1 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4am();
						}
						if (cor == 4 && frase == 2 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4bm();
						}
						if (cor == 4 && frase == 3 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4cm();
						}
						if (cor == 4 && frase == 4 && tamanho == 2) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4dm();
						}
						// Tamanho G
						if (cor == 1 && frase == 1 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1bg();
						}
						if (cor == 1 && frase == 2 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1bg();
						}
						if (cor == 1 && frase == 3 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1cg();
						}
						if (cor == 1 && frase == 4 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1dg();
						}
						if (cor == 2 && frase == 1 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2ag();
						}
						if (cor == 2 && frase == 2 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2bg();
						}
						if (cor == 2 && frase == 3 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2cg();
						}
						if (cor == 2 && frase == 4 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2dg();
						}
						if (cor == 3 && frase == 1 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3ag();
						}
						if (cor == 3 && frase == 2 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3bg();
						}
						if (cor == 3 && frase == 3 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3cg();
						}
						if (cor == 3 && frase == 4 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3dg();
						}
						if (cor == 4 && frase == 1 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4ag();
						}
						if (cor == 4 && frase == 2 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4bg();
						}
						if (cor == 4 && frase == 3 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4cg();
						}
						if (cor == 4 && frase == 4 && tamanho == 3) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4dg();
						}
						// Tamanho GG

						if (cor == 1 && frase == 1 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1agg();
						}
						if (cor == 1 && frase == 2 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1bgg();
						}
						if (cor == 1 && frase == 3 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1cgg();
						}
						if (cor == 1 && frase == 4 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor1dgg();
						}
						if (cor == 2 && frase == 1 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2agg();
						}
						if (cor == 2 && frase == 2 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2bgg();
						}
						if (cor == 2 && frase == 3 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2cgg();
						}
						if (cor == 2 && frase == 4 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor2dgg();
						}
						if (cor == 3 && frase == 1 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3agg();
						}
						if (cor == 3 && frase == 2 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3bgg();
						}
						if (cor == 3 && frase == 3 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3cgg();
						}
						if (cor == 3 && frase == 4 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor3dgg();
						}
						if (cor == 4 && frase == 1 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4agg();
						}
						if (cor == 4 && frase == 2 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4bgg();
						}
						if (cor == 4 && frase == 3 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4cgg();
						}
						if (cor == 4 && frase == 4 && tamanho == 4) {
							System.out.println("=  Digite seu número de telefone para contato: =");
							System.out.println("=                Apenas o DDD:                 =");
							ddd = scan.nextInt();
							System.out.println("=          Digite agora seu telefone:          =");
							telefone = scan.nextInt();
							cliente.finalizacao();
							System.out.println("=               CONFIRMANDO DADOS:             =" + "\n= Seu nome: "
									+ cliente.getNome() + " " + sobrenome + "\n= Seu gênero: " + cliente.getGenero()
									+ "    =");
							System.out.println("\n= Seu login é:" + cliente.getLogin() + "     =" + "\n= Sua senha: "
									+ cliente.getSenha() + "       =");
							System.out.println("=      Seu Telefone: " + ddd + "-" + telefone + "       =");
							cliente.comprar();
							System.out.println();
							xx.cor4dgg();

						}
						System.out.println();
						cliente.finalizando2();
						pag.pagamentoP();
						System.out.println();
						System.out.println();
						System.out.println("Como você gostaria de efetuar o Pagamento? ");
						System.out.println("Digite 1 para CARTÃO: ");
						System.out.println("Digite 2 para BOLETO: ");
						System.out.println("Digite 3 para pagar em Pix:  ");
						pagt = scan.nextInt();

						// Pagamento no cartão
						if (pagt == cartao) {

							pag.cartãoP();
							System.out.println("Digite os primeiros 4 números do cartão: ");
							numc1 = scan.nextInt();
							System.out.println("Digite os proximos 4 números do cartão: ");
							numc2 = scan.nextInt();
							System.out.println("Digite os próximos 4 números do cartão: ");
							numc3 = scan.nextInt();
							System.out.println("Digite os 4 últimos números do cartão: ");
							numc4 = scan.nextInt();
							System.out.println();
							System.out.println("Digite a Data de Validade, separe com '/' ");
							datav = scan.next();
							System.out.println("Digite o código de segurança: ");
							cods = scan.nextInt();
							System.out.println("Confirmando... Data de validade: " + datav + " Código de segurança: " + cods);
							System.out.println();
							System.out.println("Aguarde confirmação de pagamento...");
							Thread.sleep(2000);
							System.out.println("...");
							Thread.sleep(2000);
							System.out.println("...");
							Thread.sleep(1000);
							System.out.println("Número do seu cartão é:");
							System.out.println(numc1 + "-" + numc2 + "-" + numc3 + "-" + numc4);
							System.out.println();
							System.out.println("Pagamento Realizado");

							cliente.endereco();

						}
						// Pagamento no Boleto

						if (pagt == boleto) {

							System.out.println();
							System.out.println("Devido a novas regulamentações, agora é necessário solicitar o CPF"
									+ " ao realizar a compra/ativação do código QR.");
							System.out.println("Isso tornará o ambiente de compra mais seguro.");
							System.out.println();
							System.out.println("Digite o seu CPF: ");
							cpf = scan.next();
							System.out.println("Digite seu primeiro nome: ");
							nome = scan.next();
							System.out.println("Digite seu sobrenome: ");
							sobrenome = scan.next();

							System.out.println("Seu cpf :" + cpf + "\nSeu nome: " + nome + " " + sobrenome);
							System.out.println();
							System.out.println("Digite Seu Email para recebimento do Boleto");
							email = scan.next();
							System.out.println("Sua compra foi efetuada com sucesso!");
							System.out.println("Valor R$150,00");
							System.out.println("Boleto enviado ao email: " + email);
							System.out.println("Vencimento da compra até em dois dias úteis");

							cliente.comprar();

						}
						// Pagamento via PIx
						if (pagt == pix) {

							System.out.println();
							System.out.println("Devido a novas regulamentações, agora é necessário solicitar o CPF"
									+ " ao realizar a compra/ativação do código QR.");
							System.out.println();
							System.out.println("Digite o seu CPF: ");
							cpf = scan.next();
							System.out.println("Digite seu primeiro nome: ");
							nome = scan.next();
							System.out.println("Digite seu sobrenome: ");
							sobrenome = scan.next();

							System.out.println("Seu cpf :" + cpf + "\nSeu nome: " + nome + " " + sobrenome);
							System.out.println();
							System.out.println("Digite O whatsapp para recebimento do código PIX:");
							whats = scan.next();
							System.out.println("Código QR/PIX enviado Via Whatsapp! " + whats);
							System.out.println();
							System.out.println("Pagamento em até 2 dias úteis");

							cliente.comprar();

						}
						// Parte Para endereço da entrega!
		                
		                Scanner scanend = new Scanner(System.in);
		                Scanner scancep = new Scanner(System.in);
		                
		                System.out.println();
		                System.out.println("Digite o seu CEP:");
		                String endcep = scancep.next();
		                System.out.println("Digite o seu endereço:");
		                String ends = scanend.nextLine();
		                
		                EnderecoModaXGen objeto1 = new EnderecoModaXGen(endcep);
		                System.out.println("O seu pedido será enviado para o CEP: ");
		                System.out.println("|" + objeto1.enderecofim + " |");
		                
		                EnderecoModaXGen objeto = new EnderecoModaXGen(ends);
		                System.out.println("Endereço: ");
		                System.out.println("|" + objeto.enderecofim + " |");
		                System.out.println();
		                cliente.brinde();
		                JOptionPane.showMessageDialog(null, "O seu pedido será enviado para o CEP: " + objeto1.enderecofim
		                        + "\nEndereço: " + objeto.enderecofim + 
		                        "\n\nParabéns!!! Você recebeu um brinde de primeira compra!"
		                + "\nIrá junto com o seu produto uma camiseta Wesley curtindo o verão.");
		                scanend.close();
		                scancep.close();					}
				}

			}scan.close();
		}
}