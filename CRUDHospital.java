import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Classe que representa um paciente
class Paciente {
    private int id;
    private String nome;
    private int idade;

    public Paciente(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade + " anos";
    }
}

// Classe que representa um médico
class Medico {
    private int id;
    private String nome;
    private String especialidade;

    public Medico(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Especialidade: " + especialidade;
    }
}

// Classe que representa um fichário para pacientes
class FicharioPacientes {
    private Map<Integer, Paciente> pacientes;

    public FicharioPacientes() {
        pacientes = new HashMap<>();
    }

    public void adicionarPaciente(int id, String nome, int idade) {
        Paciente paciente = new Paciente(id, nome, idade);
        pacientes.put(id, paciente);
    }

    public Paciente buscarPaciente(int id) {
        return pacientes.get(id);
    }

    public void atualizarPaciente(int id, String nome, int idade) {
        Paciente paciente = pacientes.get(id);
        if (paciente != null) {
            paciente.setNome(nome);
            paciente.setIdade(idade);
        }
    }

    public void removerPaciente(int id) {
        pacientes.remove(id);
    }

    public List<Paciente> listarPacientes() {
        return new ArrayList<>(pacientes.values());
    }
}

// Classe que representa um fichário para médicos
class FicharioMedicos {
    private Map<Integer, Medico> medicos;

    public FicharioMedicos() {
        medicos = new HashMap<>();
    }

    public void adicionarMedico(int id, String nome, String especialidade) {
        Medico medico = new Med
