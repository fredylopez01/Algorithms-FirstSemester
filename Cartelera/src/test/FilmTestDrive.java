package test;

import module.Film;
import module.Horario;

public class FilmTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Horario FirstHorario = new Horario();
		FirstHorario.sala = "Sala 1";
		FirstHorario.hora = "3:00";
		
		Horario SecondHorario = new Horario();
		SecondHorario.sala = "Sala 2";
		SecondHorario.hora = "6:00";
		
		Horario ThirdHorario = new Horario();
		ThirdHorario.sala = "Sala 3";
		ThirdHorario.hora = "8:00";
		
		Film FirstFilm = new Film();
		FirstFilm.titulo = "El Irlandes";
		FirstFilm.calificacion = 4;
		FirstFilm.genero = "DRAMA";
		FirstFilm.director = "Martin Escorses";
		FirstFilm.duracion = 209;
		
		Film SecondFilm = new Film();
		SecondFilm.titulo = "Yo antes de ti";
		SecondFilm.calificacion = 3;
		SecondFilm.genero = "DRAMA";
		SecondFilm.director = "Tea Sharrock";
		SecondFilm.duracion = 110;
		
		Film ThirdFilm = new Film();
		ThirdFilm.titulo = "La intriga";
		ThirdFilm.calificacion = 5;
		ThirdFilm.genero = "SUSPENSO";
		ThirdFilm.director = "Denis Villeneve";
		ThirdFilm.duracion = 153;
		
		FirstHorario.publicar();
		FirstFilm.imprimir();
		System.out.println("");
		SecondHorario.publicar();
		SecondFilm.imprimir();
		System.out.println("");
		ThirdHorario.publicar();
		ThirdFilm.imprimir();
		System.out.println("");
	}

}
