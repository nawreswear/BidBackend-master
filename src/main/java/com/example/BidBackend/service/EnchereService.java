package com.example.BidBackend.service;

import java.util.Date;
import java.util.List;

import com.example.BidBackend.model.Enchere;

public interface EnchereService {
	Enchere save(Enchere commande);
	 String deleteEnchere(long id);
	 List<Enchere> getAllEncheres();
	 Enchere updateEnchere(Long id,Enchere c);
	  Enchere getEnchereById(Long id);
	  List<Enchere> getEncheresByArticleId(Long articleId);

	  List<Enchere> getEncheresByDateFinAfter(Date date);
	  List<Enchere> getEncheresByDateDebutBefore(Date date);
	  List<Enchere> getEncheresByDateDebutBetween(Date dateDebut1, Date dateDebut2);
}
