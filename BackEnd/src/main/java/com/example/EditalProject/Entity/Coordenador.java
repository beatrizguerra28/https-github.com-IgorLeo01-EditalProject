public abstract class Coordenador {
    protected String titulo;
    protected String descricao;
    protected LocalDate prazo;
    protected String criteriosSelecao;
    protected String requisitos;

    // construtor, getters e setters
}

public class CoordenadorExtensao extends Coordenador {
    // construtor, getters e setters
}

public class CoordenadorPesquisa extends Coordenador {
   
}

public class CoordenadorInovacao extends Coordenador {
  
}

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioGeral extends Coordenador {
    

    public static class UsuarioGeralDAO {
        public void insere(UsuarioGeral usuario) {
            try (Connection conexao = ConnectionFactory.getConnection()) {
                PreparedStatement stmt = conexao.prepareStatement("INSERT INTO tabela_usuarios_gerais (titulo, descricao, prazo, criterios_selecao, requisitos) VALUES (?, ?, ?, ?, ?)");
                stmt.setString(1, usuario.getTitulo());
                stmt.setString(2, usuario.getDescricao());
                stmt.setDate(3, java.sql.Date.valueOf(usuario.getPrazo()));
                stmt.setString(4, usuario.getCriteriosSelecao());
                stmt.setString(5, usuario.getRequisitos());
                stmt.executeUpdate();
            } catch (SQLException e) {
                System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            }
        }
    }
}
