package singleton;

public class Presidente {
    private Presidente(){};
    private static Presidente instance = new Presidente();
    public static Presidente getInstance() {
        return instance;
    }

    private String nomePresidente;
    private String cpfPresidente;
    private String enderecoPresidente;

    public String getNomePresidente() {
        return nomePresidente;
    }

    public void setNomePresidente(String nomePresidente) {
        this.nomePresidente = nomePresidente;
    }

    public String getCpfPresidente() {
        return cpfPresidente;
    }

    public void setCpfPresidente(String cpfPresidente) {
        this.cpfPresidente = cpfPresidente;
    }

    public String getEnderecoPresidente() {
        return enderecoPresidente;
    }

    public void setEnderecoPresidente(String enderecoPresidente) {
        this.enderecoPresidente = enderecoPresidente;
    }
}
