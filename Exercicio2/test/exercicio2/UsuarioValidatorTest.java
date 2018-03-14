/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author vitor
 */
public class UsuarioValidatorTest {
    
    UsuarioValidator usuarioValidator;
    UsuarioDAO usuarioDAO;
    Usuario usuario;
    SenhaValidator senhaValidator;
    
    
    
    
    public UsuarioValidatorTest() {
        usuario = new Usuario();
        usuarioDAO = mock(UsuarioDAO.class);
        senhaValidator = mock(SenhaValidator.class);
        usuarioValidator = new UsuarioValidator(usuarioDAO);
        usuarioValidator.setSenhaValidator(senhaValidator);
        
        
       
    }
    
    
    @Test
    public void validarUsuario() throws Exception {
        usuario = new Usuario();
        usuario.setNome("Vitor");
        usuario.setSenha("1235");
        usuario.setSenhaConfirmada("1235");
        assertTrue(this.usuarioValidator.ehUsuarioValido(usuario));
    }
    
    @Test
    public void VerificarSenhasDiferentes() throws Exception {
        usuario = new Usuario();
        usuario.setNome("Vitor");
        usuario.setSenha("1235");
        usuario.setSenhaConfirmada("12359");
        assertTrue(this.usuarioValidator.ehUsuarioValido(usuario));
    }
    
    @Test
     public void NomeComCaracter() throws Exception {
        usuario = new Usuario();
        usuario.setNome(" @@@@@@@@@@@@");
        usuario.setSenha("1235");
        usuario.setSenhaConfirmada("1235");
        assertFalse(this.usuarioValidator.ehUsuarioValido(usuario));
    }
     
     @Test(expected = Exception.class)
    public void ValidarNomeMenorQue5caracter() throws Exception {
        usuario = new Usuario();
        usuario.setNome("fabi");
        usuario.setSenha("123senha");
        usuario.setSenhaConfirmada("123senha");
        this.usuarioValidator.ehUsuarioValido(usuario);
        
    }

    
    
    
    

    
    
}
