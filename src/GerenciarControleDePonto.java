

public class GerenciarControleDePonto {
    public static void main(String[] args){
        Gerente gerente = new Gerente(1, "João", "joao@gmail.com", "123456", "joao1", "1234");
        Operador telefonista = new Operador(2, "Maria", "maria@gmail.com", "654987", 15.5);
        Secretaria secretaria = new Secretaria(3, "Ana", "Ana@gmail.com", "987654", "123", "321");

        ControlePonto controlePonto = new ControlePonto();

        String resultadoEntrada = controlePonto.registraEntrada(gerente);
        String resultadoEntrada1 = controlePonto.registraEntrada1(telefonista);
        String resultadoEntrada2 = controlePonto.registraEntrada2(secretaria);
        String resultadoSaida = controlePonto.registraSaida(gerente);
        String resultadoSaida1 = controlePonto.registraSaida1(telefonista);
        String resultadoSaida2 = controlePonto.registraSaida2(secretaria);

        System.out.println(resultadoEntrada);
        System.out.println(resultadoEntrada1);
        System.out.println(resultadoEntrada2);
        System.out.println(resultadoSaida);
        System.out.println(resultadoSaida1);
        System.out.println(resultadoSaida2);

    }
}
