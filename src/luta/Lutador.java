package luta;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int numVitorias;
    private int numEmpates;
    private int numDerrotas;

    public Lutador(String nome, String nacionalidade, int idade, double altura,
                   double peso, int numVitorias, int numEmpates, int numDerrotas) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setNumVitorias(numVitorias);
        setNumEmpates(numEmpates);
        setNumDerrotas(numDerrotas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido.");
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade != null && !nacionalidade.isEmpty()) {
            this.nacionalidade = nacionalidade;
        } else {
            throw new IllegalArgumentException("Nacionalidade inválida.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        try {
            if(idade <= 0) {
                throw new IllegalArgumentException("idade inválida! ");
            }
            else {
                this.idade = idade;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Erro de entrada");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        try {
            if(altura <= 0) {
                throw new IllegalArgumentException("Altura inválida! ");
            }
            else {
                this.altura = altura;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Erro de entrada");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        try {
            if(peso <= 0) {
                throw new IllegalArgumentException("Peso inválido! ");
            }
            else {
                this.peso = peso;
                setCategoria();
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Erro de entrada");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(peso < 52.2 || peso > 120.2){
            categoria = "Inválido!";
        }
        else if(peso <= 70.3) {
            categoria = "Leve";
        }
        else if(peso <= 83.9) {
            categoria = "Médio";
        }
        else {
            categoria = "Pesado";
        }
    }

    public int getNumVitorias() {
        return numVitorias;
    }

    public void setNumVitorias(int numVitorias) {
        try {
            if(numVitorias < 0) {
                throw new IllegalArgumentException("Número de vitórias inválida! ");
            }
            else {
                this.numVitorias = numVitorias;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Erro de entrada");
        }
    }

    public int getNumEmpates() {
        return numEmpates;
    }

    public void setNumEmpates(int numEmpates) {
        try {
            if(numEmpates < 0) {
                throw new IllegalArgumentException("Número de empates inválido! ");
            }
            else {
                this.numEmpates = numEmpates;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Erro de entrada");
        }
    }

    public int getNumDerrotas() {
        return numDerrotas;
    }

    public void setNumDerrotas(int numDerrotas) {
        try {
            if(numDerrotas < 0) {
                throw new IllegalArgumentException("Número de derrotas inválida! ");
            }
            else {
                this.numDerrotas = numDerrotas;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Erro de entrada");
        }
    }

    public void apresentar() {
        System.out.println("-----------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println("com " + getIdade() + " anos e " + getAltura() + " metros de altura");
        System.out.println("Pesando " + getPeso() + " Kg");
        System.out.println(getNumVitorias() + " vitória(s)");
        System.out.println(getNumEmpates() + " empates(s) e");
        System.out.println(getNumDerrotas() + " derrotas(s)!");
    }

    public void status() {
        System.out.println("Nome do lutador: " + getNome());
        System.out.println("Peso " + getCategoria());
        System.out.println("Número de Vitórias: " + getNumVitorias());
        System.out.println("Número de Empates: " + getNumEmpates());
        System.out.println("Número de Derrotas: " + getNumDerrotas());
    }

    public void ganharLuta() {
        setNumVitorias(getNumVitorias() + 1);
    }

    public void perderLuta() {
        setNumDerrotas(getNumDerrotas() + 1);
    }

    public void empatarLuta() {
        setNumEmpates(getNumEmpates() + 1);
    }
}