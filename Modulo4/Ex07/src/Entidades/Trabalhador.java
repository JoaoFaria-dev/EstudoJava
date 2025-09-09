package Entidades;
import Enum.NivelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NivelTrabalhador nivel;
    private Double baseSalarial;


    //Associações
    private Departamento departamento;
    private List<HoraContrato> contrato = new ArrayList<>();

    public Trabalhador(String nome, Double baseSalarial, NivelTrabalhador nivel, Departamento departamento) {
        this.nome = nome;
        this.baseSalarial = baseSalarial;
        this.nivel = nivel;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContrato() {
        return contrato;
    }

    //Não se pode deixar o set para listas, pois ele irá deixar que essa lista  possa ser trocada.

    public void AdicionarContrato(HoraContrato contrato){
        this.contrato.add(contrato);
    }

    public void RemoverContrato(HoraContrato contrato){
        this.contrato.remove(contrato);
    }

    public double Valor (int ano, int mes){
        double soma = baseSalarial;
        Calendar cal = Calendar.getInstance();
        for(HoraContrato c : contrato){
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH); //Mes começa com zero
            if(ano == c_ano && mes == c_mes){
                soma += c.valorTotal();

            }
        }
        return soma;
    }
}
