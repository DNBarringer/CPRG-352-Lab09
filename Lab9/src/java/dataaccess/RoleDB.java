package dataaccess;

import java.util.List;
import javax.persistence.EntityManager;
import models.Role;

public class RoleDB {
    
    public List<Role> getAll() throws Exception {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        try {
            List<Role> roles = em.createNamedQuery("Role.findAll", Role.class).getResultList();
            return roles;
        } finally {
            em.close();
        }
        
        
        
        
        
//        List<Role> roles = new ArrayList<>();
//        ConnectionPool cp = ConnectionPool.getInstance();
//        Connection con = cp.getConnection();
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        
//        // gets all the roles in the role table
//        String sql = "SELECT * FROM role";
//        
//        try {
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                int roleId = rs.getInt(1);
//                String roleName = rs.getString(2);
//                Role role = new Role(roleId, roleName);
//                roles.add(role);
//            }
//        } finally {
//            DBUtil.closeResultSet(rs);
//            DBUtil.closePreparedStatement(ps);
//            cp.freeConnection(con);
//        }
//
//        return roles;
    }
}
