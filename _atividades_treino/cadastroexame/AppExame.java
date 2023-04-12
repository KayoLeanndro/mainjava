package cadastroexame;

import java.util.Scanner;

public class AppExame {
    static Scanner input = new Scanner(System.in);
    static Exame exame[] = new Exame[3];
    static int contExame = 0;
    static int posicaoEncontrada;

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("\n*** Seletor de Opções ***");
            System.out.println();
            System.out.println("1 - Cadastrar exame");
            System.out.println("2 - Consultar exame");
            System.out.println("3 - Alterar exame");
            System.out.println("4 - Excluir exame");
            System.out.println("5 - Listar exames");
            System.out.println("0 - Finalizar programa");
            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    cadastraExame();
                    break;
                case 2:
                    consultarExame();
                    break;
                case 3:
                    alteraExame();
                    break;
                case 4:
                    excluiExame();
                    break;
                case 5:
                    listaExame();
                    break;
                case 0:
                    System.out.println("\n--- PROGRAMA FINALIZADO");
                    break;
                default:
                    System.out.println("\nOpção incorreta");
            }

        } while (opcao != 0);
        input.close();
    }

    public static int pesquisaExamePorCodigo(int codigo) {
        for (int i = 0; i < exame.length; i++) {
            if (exame[i] != null && codigo == exame[i].getIdExame()) {
                return i;
            }
        }
        return -1;
    }

    public static void cadastraExame() {
        System.out.println("-------------------------");
        System.out.println("\n*** Cadastro de Exame ***\n");
        System.out.printf("\nID do Exame: ");
        int idExame = input.nextInt();
        if (contExame == exame.length) {
            System.out.println("-------------------------");
            System.out.println("Não é possivel cadastrar mais Exames, Lista cheia.");
            return;
        }
        if (pesquisaExamePorCodigo(idExame) != -1) {
            System.out.println("---------------------------");
            System.out.println("\n-- ID já cadastrado --\n");
            return;
        }
        System.out.printf("\nNome do paciente: ");
        input.nextLine();
        String nomePaciente = input.nextLine();
        System.out.printf("\nNivel de Glicose: ");
        int nivelGlicose = input.nextInt();

        for (int i = 0; i < exame.length; i++) {
            if (exame[i] == null) {
                exame[i] = new Exame(idExame, nomePaciente, nivelGlicose);
                contExame++;
                System.out.println("\n-- Cadastro efetuado --\n");
                return;
            }
        }
        System.out.println("Não tem mais posição vazia para cadastro");
    }

    public static void consultarExame() {
        System.out.println("\n*** Consulta de Exame ***\n");
        if (contExame == 0) {
            System.out.println("Não tem mais Exames cadastrados");
            return;
        }
        System.out.printf("\nID do Exame que você deseja consultar:  ");
        if (posicaoEncontrada == -1) {
            System.out.println("\n-- ID não cadastrado --\n");
            return;
        }
        int idExame = input.nextInt();
        int posicaoEncontrada = pesquisaExamePorCodigo(idExame);

        System.out.printf("Id: %d", exame[posicaoEncontrada].getIdExame());
        System.out.printf("\nNome: %s", exame[posicaoEncontrada].getNomePaciente());
        System.out.printf("\nNivel glicose: %s", exame[posicaoEncontrada].getNivelGlicose());

        if (exame[posicaoEncontrada].getNivelGlicose() <= 99) {
            System.out.println("\nNivel de diabetes: Normal");
            System.out.println("-----------------------------");
        } else if (exame[posicaoEncontrada].getNivelGlicose() >= 100
                && exame[posicaoEncontrada].getNivelGlicose() <= 125) {
            System.out.println("\nNivel de diabetes: Pré-diabetes");
            System.out.println("-----------------------------");

        } else {
            System.out.println("\nNivel de diabetes: Diabetes");
            System.out.println("-----------------------------");

        }
    }

    public static void alteraExame() {
        System.out.println("------------------------------");
        System.out.println("\n*** Alteração de Exame ***\n");

        if (contExame == 0) {
            System.out.println("Vetor vazio");
            return;
        }
        System.out.printf("\nDigite o id que você quer consultar: ");
        int id = input.nextInt();

        if (posicaoEncontrada == -1) {
            System.out.println("\n-- Exame não cadastrado --\n");
            return;
        }
        if (id == posicaoEncontrada) {
            System.out.println("\"\\n-- impossivel altera valor do id--\\n");
            return;
        }
        System.out.println("-------------------------------------------");
        System.out.printf("\nID: %d\n", exame[posicaoEncontrada].getIdExame());
        System.out.printf("\nNome: %s\n", exame[posicaoEncontrada].getNomePaciente());
        System.out.printf("\nivel: %d\n", exame[posicaoEncontrada].getNivelGlicose());
        System.out.println("-------------------------------------------");
        System.out.println("\n--Novo Exame--\n");
        System.out.println("Novo nivel glicose: ");
        int novaGlicose = input.nextInt();
        exame[posicaoEncontrada].setNivelGlicose(novaGlicose);
        System.out.println("\n--Alteração no id feita com sucesso--\n");
    }

    public static void excluiExame() {
        System.out.println("\n*** Exclusão de exame ***\n");
        if (contExame == 0) {
            System.out.println("Vetor vazio");
            return;
        }
        System.out.printf("\nId que você deseja deletar: ");
        int codigo = input.nextInt();
        int posicaoEncontrada = pesquisaExamePorCodigo(codigo);
        if (posicaoEncontrada == -1) {
            System.out.println("\n-- Código não cadastrado --\n");
            return;
        }
        System.out.printf("\nID...............: %d\n", exame[posicaoEncontrada].getIdExame());
        System.out.printf("\nNome...............: %s\n", exame[posicaoEncontrada].getNomePaciente());
        System.out.printf("\nNivel glicose...............: %d\n", exame[posicaoEncontrada].getNivelGlicose());
        char confirma;
        do {

            System.out.printf("\nConfirma exclusão [S/N]: ");
            input.nextLine();
            confirma = input.nextLine().charAt(0);
            confirma = Character.toUpperCase(confirma);
            if (confirma != 'S' && confirma != 'N') {
                continue;
            }
            break;
        } while (true);

        if (confirma == 'S') {
            if(posicaoEncontrada == exame.length-1) {
				exame[posicaoEncontrada] = null;
				System.out.println("-- Exclusão efetuada");	
				contExame--;
				return;
			}
			for(int i=posicaoEncontrada; i<exame.length-1;i++) {
				exame[posicaoEncontrada] = exame[i + 1];	
			}
			exame[exame.length-1]=null;
			contExame--;
		}
    }

    public static void listaExame() {
        System.out.println("\n*** Listagem dos Exames ***\n");
        if (contExame == 0) {
            System.out.println("Vetor vazio");
            return;
        }

        System.out.println("=====================================");

        System.out.println("Codigo   Nome   Nivel glicose ");

        System.out.println("=====================================");

        for (int i = 0; i < exame.length; i++) {

            if (exame[i] != null) {

                System.out.printf("%-6d| %-4s| %9d| \n",
                        exame[i].getIdExame(),
                        exame[i].getNomePaciente(),
                        exame[i].getNivelGlicose());
            } else {
                System.out.printf("%dº Elemento nulo\n", i);
            }
        }
        System.out.println("=====================================");
    }
}
