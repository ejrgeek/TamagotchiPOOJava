package util;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import dao.UsuarioDAO;
import modelo.BichinhoVirtual;
import modelo.Usuario;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppTamagotchi {

    private UsuarioDAO usuarioDAO;

    public AppTamagotchi(){
        usuarioDAO = new UsuarioDAO();
    }

    public void criarUsuario(){

        System.out.println("                            __\n" +
                "     ,                    ,\" e`--o\n" +
                "    ((                   (  | __,'\n" +
                "     \\\\~----------------' \\_;/\n" +
                "     (                      /\n" +
                "     /) ._______________.  )\n" +
                "    (( (               (( (\n" +
                "     ``-'               ``-'\n" +
                "\n" +
                "\t.:: CRIAR CONTA ::.");

        Scanner ler = new Scanner(System.in);
        System.out.println("\n~~ CRIANDO USUÁRIO ~~");
        System.out.print("USER: ");
        String user = ler.nextLine();
        System.out.print("SENHA: ");
        String senha = ler.nextLine();

        System.out.println("~~ CRIANDO BICHINHO ~~");
        System.out.print("NOME DO BICHINHO: ");
        String nomeBichinho = ler.nextLine();
        System.out.print("RAÇA DO BICHINHO: ");
        String racaBichinho = ler.nextLine();
        int vida = 100;

        BichinhoVirtual bichinhoVirtual = new BichinhoVirtual(nomeBichinho, racaBichinho, vida);

        Usuario usuario = new Usuario(user, senha, bichinhoVirtual);

        if (usuarioDAO.criandoUsuario(usuario)){
            System.out.println("\n\t~~ USUÁRIO SALVO COM SUCESSO ~~\n");
        }else{
            System.out.println("\n\t~~ NÃO FOI POSSÍVEL SALVAR O USUÁRIO ~~\n");
        }

    }

    public void mostrarUsuarios(){

        List<Usuario> usuarios = usuarioDAO.listaUsuarios();

        System.out.println("\n\t.:: USUÁRIOS ::.\n");

        if (usuarios.size() == 0){
            System.out.println("        ()()         ____\n" +
                    "        (..)        /|o  |\n" +
                    "        /\\/\\       /o|  o|\n" +
                    "       c\\db/o...  /o_|_o_|\n");
            System.out.println("\t~~ SEM USUÁRIOS NO SISTEMA ~~");
        }else{
            System.out.print("              (\\-.\n" +
                            "              / _`> .---------.\n" +
                            "      _)     / _)=  |'-------'|\n" +
                            "     (      / _/    |O   O   o|\n" +
                            "      `-.__(___)_   | o O . o |\n" +
                            "                    `---------'\n");
            for (int i = 0; i < usuarios.size(); i++){
                System.out.println(usuarios.get(i) + "\n");
            }
        }
    }

    public void removerUsuario(){

        Scanner ler = new Scanner(System.in);
        System.out.println("\n\t~~ REMOVER USUÁRIO ~~");
        int index;

        while (true){
            try {
                System.out.print("INDICE DO USUÁRIO: ");
                index = ler.nextInt();

                if (usuarioDAO.deletarUsuario(index)){
                    System.out.println("         ___      ___\n" +
                            "        /   \\----/   \\\n" +
                            "       |-----|  |-----|\n" +
                            "       /\\_0_/    \\_0_/\\\n" +
                            "     -|      o  o      |-\n" +
                            "    /  \\______________/  \\\n" +
                            "    \\ \\ |   |    |   | / /\n" +
                            "     ww ooooo----ooooo ww\n" +
                            "\n");

                    System.out.println("\t~~ USUÁRIO DELETADO ~~");
                }

            }catch (InputMismatchException e){
                System.err.println("\n!! O INDICE DEVE SER UM NÚMERO !!\n");

            }finally {
                break;
            }
        }
    }

    public void atualizarUsuario(){

        Scanner ler = new Scanner(System.in);
        System.out.println("\n~~ ATUALIZAR USUÁRIO ~~");
        System.out.print("NOVO USER: ");
        String user = ler.nextLine();
        System.out.print("NOVA SENHA: ");
        String senha = ler.nextLine();

        System.out.println("~~ ATUALIZANDO BICHINHO ~~");
        System.out.print("NOVO NOME DO BICHINHO: ");
        String nomeBichinho = ler.nextLine();
        System.out.print("NOVA RAÇA DO BICHINHO: ");
        String racaBichinho = ler.nextLine();
        int vida = 100;

        BichinhoVirtual bichinhoVirtual = new BichinhoVirtual(nomeBichinho, racaBichinho, vida);

        Usuario usuario = new Usuario(user, senha, bichinhoVirtual);


        while (true){
            try {
                System.out.print("INDICE DO USUÁRIO: ");
                int index = ler.nextInt();

                if (usuarioDAO.atualzarUsuario(index, usuario)){
                    System.out.println("                          _,..,,,_ \n" +
                                        "                     '``````^~\"-,_`\"-,_\n" +
                                        "   ,~~._,-~c~-.                    `~:. ^-.     \n" +
                                        "        `c    ;                      `:.  `-,     _.-~~^^~:.\n" +
                                        "         `.   ;      _,--~~~~-._       `:.   ~. .~          `.\n" +
                                        "          .` ;'   .:`           `:       `:.   `    _.:-,.    `.\n" +
                                        "        .' .:   :'    _.-~^~-.    `.       `..'   .:      `.    '\n" +
                                        "       :  .' _:'   .-'        `.    :.     .:   .'`.        :    ;\n" +
                                        "       :  `-'   .:'             `.    `^~~^`   .:.  `.      ;    ;\n" +
                                        "        `-.__,-~                  ~-.        ,' ':    '.__.`    :'\n" +
                                        "                                     ~--..--'     ':.         .:'\n" +
                                        "                                                     ':..___.:'\n");
                    System.out.println("\n\t~~ USUÁRIO ATUALIZADO COM SUCESSO ~~\n");
                }else{
                    System.out.println("\n\t~~ NÃO FOI POSSÍVEL ATUALIZAR O USUÁRIO ~~\n");
                }
            }catch (InputMismatchException e){
                System.err.println("\n!! O INDICE DEVE SER UM NÚMERO !!\n");

            }finally {
                break;
            }
        }





    }



    public String menuJogar(){

        System.out.println("   __       __   ____       ____\n" +
                            "   ) \\     / (   )   \\     /   (\n" +
                            "  )_  \\_V_/  _(   )_  \\_V_/  _(\n" +
                            "    )__   __(       )__   __(\n" +
                            "       `-'             `-'");

        System.out.print("\t::: JOGAR :::\n" +
                            "1 - CRIAR CONTA\n" +
                            "2 - MOSTRAR USUÁRIOS\n" +
                            "3 - ATUALIZAR USUÁRIO\n" +
                            "4 - REMOVER USUÁRIO\n" +
                            "0 - VOLTAR\n" +
                            "OPÇÃO: ");
        Scanner ler = new Scanner(System.in);
        String op = ler.nextLine();
        return op;

    }

    public String menuPrincipal(){

        System.out.print("\t::: TAMAGOTCHI :::\n" +
                            "1 - JOGAR\n" +
                            "2 - SOBRE\n" +
                            "0 - SAIR\n" +
                            "OPÇÃO: ");
        Scanner ler = new Scanner(System.in);
        String op = ler.nextLine();
        return op;
    }

    void executar(){
        while (true){

            String op = menuPrincipal();

            if (op.equals("1")){

                while (true){
                    op = menuJogar();

                    if (op.equals("1")){
                        criarUsuario();
                    }else if (op.equals("2")){
                        mostrarUsuarios();
                    }else if (op.equals("3")) {
                        atualizarUsuario();
                    }else if (op.equals("4")){
                        removerUsuario();
                    }else if (op.equals("0")){
                        System.out.println("VOLTAR");
                        break;
                    }else{
                        System.out.println("\n\t::: OPÇÃO INVALIDA :::");
                        System.out.println("              n__n_\n" +
                                "             /  = =\\\n" +
                                "            /   ._Y_)\n" +
                                "           /      \"\n" +
                                "          (_/  (_,  \\\n" +
                                "            \\      ( \\_,--\"\"\"\"--.\n" +
                                "      __..-,-`.___,-` )-.______.'\n" +
                                "    <'     `-,'   `-, )-'    >\n" +
                                "     `----._/      ( /\"`>.--\"\n" +
                                "            \"--..___,--\"\n" +
                                "\t~~~~ TENTE NOVAMENTE ~~~~\n");
                    }
                }

            }

            else if (op.equals("2")){

                System.out.println("\n\t\t::: SOBRE :::\n\n" +
                                    "Desenvolvedor: Erlon Jr.\n" +
                                    "GitHub: github.com/ejrgeek\n" +
                                    "LinkedIn: linkedin.com/in/ejrgeek\n" +
                                    "Twitter: twitter.com/GeekEjr\n" +
                                    "Facebook: fb.com/erlondnjr\n" +
                                    "Telegram: @ejrgeek\n" +
                                    "Versão: 1.2a\n" +
                                    "Descrição: Tamagotchi Java -\nProjeto para Parte da Terceira nota de\nProgramação Orientada a Objetos\nem Java\n");

                System.out.println("--\n" +
                        "  /                        _.--._ _.---.__\n" +
                        " /                       .'  .-.'__.-----.\\\n" +
                        "J                       /    `-'(__--'\n" +
                        "|                     .'       `. _ `--._\n" +
                        "|                    /            .`--'''`\n" +
                        "|                   /           .'\n" +
                        "|                _.'-.         J\n" +
                        "L               /    J         F\n" +
                        "J             .'     F        J\n" +
                        " L           /      /         /-.\n" +
                        "J           /      /         /   \\\n" +
                        "|          /      /         J    |\n" +
                        "|         /      /          /   /\n" +
                        "|        /   /  /          J   /\n" +
                        "|       /   /  /           /-'/\n" +
                        "|      /   / -'           /  /\n" +
                        "|     J   / /            / .'\n" +
                        "|     / -'-'   /        /-'\n" +
                        "L    (/|      |        /\n" +
                        "J     /.'   ) | _.--  /\n" +
                        " L   //     < \\/   (  |\n" +
                        " J  //       `.\\    `.`.\n" +
                        "  \\//     ___/_\\ `-.__`.`._.----''\n" +
                        "   `.----'      )|`.\\)  `-))\\-')\n" +
                        "                '   )     ')/\n\n");

            }else if (op.equals("0")){
                System.out.println("\n" +
                                    "      (\"-^-/\")\n" +
                                    "      `o__o' ]\n" +
                                    "      (_Y_) _/\n" +
                                    "    _..`--'-.`,\n" +
                                    "   (__)_,--(__)\n" +
                                    "       7:   ; 1\n" +
                                    "     _/,`-.-' :\n" +
                                    "    (_,)-~~(_,)\n" +
                                    "\n" +
                                    "~~~~ (: TCHAU TCHAU :) ~~~~");
                break;
            }else{
                System.out.println("\n\t::: OPÇÃO INVALIDA :::");
                System.out.println("              n__n_\n" +
                        "             /  = =\\\n" +
                        "            /   ._Y_)\n" +
                        "           /      \"\n" +
                        "          (_/  (_,  \\\n" +
                        "            \\      ( \\_,--\"\"\"\"--.\n" +
                        "      __..-,-`.___,-` )-.______.'\n" +
                        "    <'     `-,'   `-, )-'    >\n" +
                        "     `----._/      ( /\"`>.--\"\n" +
                        "            \"--..___,--\"\n" +
                        "\t~~~~ TENTE NOVAMENTE ~~~~\n");
            }

        }
    }

}
