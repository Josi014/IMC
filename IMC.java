import java.util.Scanner;

public class IMC {
    public static void main(String args[]) {
        Double altura, peso;
        char genero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual é o seu gênero?\nf.Feminino\nm.Masculino");
        genero = entrada.next().charAt(0);

    

        System.out.println("Qual é a sua altura?");
        altura = entrada.nextDouble();

        System.out.println("Qual é o seu peso?");
        peso = entrada.nextDouble();

        entrada.close();
    

        Double imc = peso/(altura*altura);

        System.out.println("Prazer " + nome + ",você se indentifica com o gênero " + genero + " a sua altura é  " + altura + " e o seu peso é " + peso + " .O seu imc é " + imc);


        boolean generoFemininoObsidadeMorbida = imc > 39;
        boolean generoFemininoObsidadeModerada = imc > 29 & imc <= 38.9;
        boolean generoFemininoObsidadeLeve = imc > 24 & imc < 28.9;
        boolean generoFemninoNormal = imc > 19 & imc < 23.9;
        boolean generoFemininoAbaixoDoNormal = imc < 19;

        boolean generoMasculinoObsidadeMorbida = imc > 40;
        boolean generoMasculinoObsidadeModerada = imc > 30 & imc <= 39.9;
        boolean generoMasculinoObsidadeLeve = imc > 25 & imc <= 29.9;
        boolean generoMasculinoNormal = imc > 20 & imc <= 24.9;
        boolean generoMasculinoAbaixoDoNormal = imc < 20;


        if(genero == 'f'){
            if(generoFemininoObsidadeMorbida == true){
                    System.out.println("Cuide-se mais, você está com Obsidade mórbida.");
                };
            if (generoFemininoObsidadeModerada == true){
                    System.out.println("Cuide-se mais, você esta com obsidade moderada.");
                };
            if (generoFemininoObsidadeLeve == true){
                    System.out.println("Continue cuidando da sua saúde, você está com obsidade leve.");

                }
            if(generoFemninoNormal==true){
                    System.out.println("ótimo!! você está peso adequado.");

                };
            if (generoFemininoAbaixoDoNormal == true){
                    System.out.println("Cuide-se, você está abaixo do normal.");

            }
        }else { 
            if(generoMasculinoObsidadeMorbida == true){
                System.out.println("Cuide-se mais, você está com Obsidade mórbida.");
            }
            if (generoMasculinoObsidadeModerada == true){
                System.out.println("Cuide-se mais, você esta com obsidade moderada.");
            };
            if (generoMasculinoObsidadeLeve == true){
                System.out.println("Continue cuidando da sua saúde, você está com obsidade leve.");
                }
            if(generoMasculinoNormal==true){
                System.out.println("ótimo!! você está peso adequado.");
                };
            if (generoMasculinoAbaixoDoNormal == true){
                System.out.println("Cuide-se, você está abaixo do normal.");
            }
        }
        

        
    }
}
