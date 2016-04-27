package br.ufpa.cbcc.marcio.console;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
private int dia, mes, ano;
private static final int DIAMAXIMO=31;
private static final int MESMAXIMO=12;

	public Data(int dia, int mes, int ano){
		if (dia<=DIAMAXIMO){
		    if (mes<=MESMAXIMO){
		        this.dia=dia;
		        this.mes=mes;
		        this.ano=ano;
		        }
		    }
	}
	public Data(Data data){
		    dia=data.dia;
		    mes=data.mes;
		    ano=data.ano;
		}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public static Data gerarDataAtual()
	{
		Calendar cal = new GregorianCalendar();
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);
        
		return new Data(dia, mes, ano);
	}

	@Override
	public String toString() {
		return "Data ["+ dia + "/" + mes + "/" + ano + "]";
	}
		
}
