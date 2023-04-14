import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CoordenadorExtensaoDAO {
    public void insere(CoordenadorExtensao coordenador) {
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO coordenador_extensao (nome, email, data_nascimento, cpf) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, coordenador.getNome());
            ps.setString(2, coordenador.getEmail());
            ps.setDate(3, java.sql.Date.valueOf(coordenador.getDataNascimento()));
            ps.setString(4, coordenador.getCpf());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
