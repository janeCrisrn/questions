package br.ufrn.ceres.bsi.questions.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufrn.ceres.bsi.questions.dao.util.JPAUtil;
import br.ufrn.ceres.bsi.questions.model.Endereco;
import br.ufrn.ceres.bsi.questions.model.Usuario;

public class UserServiceTest {
	 private UserService dao;
	 private Endereco endereco;
	 private Usuario u;
	 
	 @Before
	 public void setUp() throws Exception{
	  dao = new UserService(JPAUtil.EMF);
	  endereco = new Endereco();
	  u = new Usuario();
	 }
	 
	 @After
	 public void tearDown() throws Exception{
	  dao = null;
	 }
	 
	}