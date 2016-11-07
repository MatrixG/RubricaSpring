package it.alfasoft.gruppo.dao;

import it.alfasoft.gruppo.model.Rubrica;
import it.alfasoft.gruppo.model.Voce;
import it.alfasoft.gruppo.util.HibernateUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;




public class RubricaDao {
	
	// 1- CREATE
	public boolean creaRubrica(Rubrica r){
		
		boolean res = false;
		
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		
		try{
			tx = session.getTransaction();
			tx.begin();
			
			// INIZIO ELABORAZIONE DATI
			
			session.persist(r);
			
			tx.commit(); //INSERISCE NEL DATABASE
			res = true;
		
		}catch(Exception e){ 
			
			tx.rollback(); // SE LANCIA ECCEZIONE, CANCELLA TUTTA L'ELABORAZIONE FATTA SOPRA
			
		}finally{
			
			session.close();
			
		}
		
		return res;
		
	}
	
	
	// 2A- READ: READ ONE
	public Rubrica readRubricaConId(long id) {

		Rubrica r = null;
		
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		
		try{
			tx = session.getTransaction();
			tx.begin();
			
			// INIZIO ELABORAZIONE DATI
			
			session.get(Rubrica.class,id);
			tx.commit(); //INSERISCE NEL DATABASE
			
		
		}catch(Exception e){ 
			
			tx.rollback(); // SE LANCIA ECCEZIONE, CANCELLA TUTTA L'ELABORAZIONE FATTA SOPRA
			
		}finally{
			
			session.close();
			
		}
		
		return r;
		
	}
	
	// 2B- READ: READ WITH NAME
	public Rubrica readRubricaConNome(String n) {

		Rubrica r = null;
		
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		
		try{
			tx = session.getTransaction();
			tx.begin();
			
			// INIZIO ELABORAZIONE DATI
			
			Query query = session
					.createQuery("from Rubrica where nomeRubrica =: nomeInserito");
			query.setString("nomeInserito", n);
			
			r = (Rubrica) query.uniqueResult();
			
			tx.commit(); //INSERISCE NEL DATABASE
			
		
		}catch(Exception e){ 
			
			tx.rollback(); // SE LANCIA ECCEZIONE, CANCELLA TUTTA L'ELABORAZIONE FATTA SOPRA
			
		}finally{
			
			session.close();
			
		}
		
		return r;
		
	}
	
	// 2C- READ: READ ALL
		@SuppressWarnings("unchecked")
		public List<Voce> readAllRubrica() {

			List<Voce> v = null;

			Session session = HibernateUtil.openSession();
			Transaction tx = null;

			try {
				tx = session.getTransaction();
				tx.begin();

				// INIZIO ELABORAZIONE DATI

				Query query = session.createQuery("from Rubrica");

				v = (List<Voce>) query.list();

				tx.commit(); // INSERISCE NEL DATABASE

			} catch (Exception e) {

				tx.rollback(); // SE LANCIA ECCEZIONE, CANCELLA TUTTA L'ELABORAZIONE
								// FATTA SOPRA

			} finally {

				session.close();

			}

			return v;

		}

	
	// 3- UPDATE
	public boolean updateRubrica(Rubrica r){
		
		boolean res = false;
		
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		
		try{
			tx = session.getTransaction();
			tx.begin();
			
			// INIZIO ELABORAZIONE DATI
			
			session.update(r);
			tx.commit(); //INSERISCE NEL DATABASE
			res = true;
		
		}catch(Exception e){ 
			
			tx.rollback(); // SE LANCIA ECCEZIONE, CANCELLA TUTTA L'ELABORAZIONE FATTA SOPRA
			
		}finally{
			
			session.close();
			
		}
		
		return res;
	}
	
	// 4- DELETE
	public boolean deleteRubrica(Rubrica r){
		
		boolean res = false;
		
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		
		try{
			tx = session.getTransaction();
			tx.begin();
			
			// INIZIO ELABORAZIONE DATI
			
			session.delete(r);
			tx.commit(); //INSERISCE NEL DATABASE
			res = true;
		
		}catch(Exception e){ 
			
			tx.rollback(); // SE LANCIA ECCEZIONE, CANCELLA TUTTA L'ELABORAZIONE FATTA SOPRA
			
		}finally{
			
			session.close();
			
		}
		
		return res;
	}

	
}
