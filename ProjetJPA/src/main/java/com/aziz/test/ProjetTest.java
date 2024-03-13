package com.aziz.test;

import com.aziz.dao.ProjetDao;
import com.aziz.entities.Projet;

public class ProjetTest {
	public static void main(String[] args) {
		Projet p = new Projet();
		p.setNomProjet("app web");
		p.setCout(200);
		ProjetDao prtDao = new ProjetDao();
		prtDao.ajouter(p);
		System.out.println("Appel de la méthode listerTous");
		for (Projet pr : prtDao.listerTous())
		System.out.println(pr.getIdProjet()+" "+pr.getNomProjet());
		System.out.println("Appel de la méthode listerParNom");
		for (Projet pr : prtDao.listerParnomProjet("app"))
		System.out.println(pr.getIdProjet()+" "+pr.getNomProjet());
		 }

}
