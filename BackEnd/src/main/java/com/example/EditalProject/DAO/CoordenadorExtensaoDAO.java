import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CoordenadorExtensaoDAO {
    public void insere(CoordenadorExtensao coordenador) {
        try (Connection conexao = ConnectionFactory.getConnection()) {
            // Inserir os dados em uma tabela
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO tabela_coordenador_extensao (titulo, descricao, prazo, criterios_selecao, requisitos) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, coordenador.getTitulo());
            stmt.setString(2, coordenador.getDescricao());
            stmt.setDate(3, java.sql.Date.valueOf(coordenador.getPrazo()));
            stmt.setString(4, coordenador.getCriteriosSelecao());
            stmt.setString(5, coordenador.getRequisitos());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }
}