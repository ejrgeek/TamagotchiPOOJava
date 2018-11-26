package util;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class AppTamagotchi {

    public String menuJogar(){
        return "a";
    }

    public String menuPrincipal(){

        System.out.print("\t::: TAMAGOTCHI :::\n" +
                            "1 - JOGAR\n" +
                            "2 - SOBRE\n" +
                            "0 - SAIR\n" +
                            "Opção: ");
        Scanner ler = new Scanner(System.in);
        String op = ler.nextLine();
        return op;
    }

    void executar(){
        while (true){

            String op = menuPrincipal();

            if (op.equals("1")){

                System.out.println("                  .\"`\".\n" +
                        "              .-./ _=_ \\.-.\n" +
                        "             {  (,(oYo),) }}\n" +
                        "             {{ |   \"   |} }\n" +
                        "             { { \\(---)/  }}\n" +
                        "             {{  }'-=-'{ } }\n" +
                        "             { { }._:_.{  }}\n" +
                        "             {{  } -:- { } }\n" +
                        "             {_{ }`===`{  _}\n" +
                        "            ((((\\)     (/))))");


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
