import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControlePonto {
    public String registraEntrada(Funcionario f) {
        //dia, mes, ano, hora, segundo
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy \nHH:mm:ss");
        String horaEntrada = agora.format(formatador);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // opcional: restabelece o status de interrupção
            // Você também pode optar por registrar esta exceção ou lidar de outra forma.
            System.out.println("Thread foi interrompida.");
        }
        return "Entrada de Gerente " + f.getNome() + " \nàs " + horaEntrada + "\n";

    }
    public String registraEntrada1(Funcionario f){
        //dia, mes, ano, hora, segundo
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy \nHH:mm:ss");
        String horaEntrada = agora.format(formatador);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // opcional: restabelece o status de interrupção
            // Você também pode optar por registrar esta exceção ou lidar de outra forma.
            System.out.println("Thread foi interrompida.");
        }
        return "Entrada de " + f.getNome() + " Telefonista" + " \nàs " + horaEntrada + "\n";

    }
    public String registraEntrada2(Funcionario f){
        //dia, mes, ano, hora, segundo
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy \nHH:mm:ss");
        String horaEntrada = agora.format(formatador);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // opcional: restabelece o status de interrupção
            // Você também pode optar por registrar esta exceção ou lidar de outra forma.
            System.out.println("Thread foi interrompida.");
        }
        return "Entrada de " + f.getNome() + " Secretaria" + " \nàs " + horaEntrada + "\n";

    }

    public String registraSaida(Funcionario f){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy \nHH:mm:ss");
        String horaSaida = agora.format(formatador);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // opcional: restabelece o status de interrupção
            // Você também pode optar por registrar esta exceção ou lidar de outra forma.
            System.out.println("Thread foi interrompida.");
        }
        return "Saída de Gerente " + f.getNome() + " \nàs " + horaSaida + "\n";
    }

    public String registraSaida1(Funcionario f){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy \nHH:mm:ss");
        String horaSaida = agora.format(formatador);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // opcional: restabelece o status de interrupção
            // Você também pode optar por registrar esta exceção ou lidar de outra forma.
            System.out.println("Thread foi interrompida.");
        }
        return "Saída de " + f.getNome() + " Telefonista" + " \nàs " + horaSaida + "\n";
    }
    public String registraSaida2(Funcionario f){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy \nHH:mm:ss");
        String horaSaida = agora.format(formatador);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // opcional: restabelece o status de interrupção
            // Você também pode optar por registrar esta exceção ou lidar de outra forma.
            System.out.println("Thread foi interrompida.");
        }
        return "Saída de " + f.getNome() + " Secretaria" + " \nàs " + horaSaida + "\n";
    }
}
