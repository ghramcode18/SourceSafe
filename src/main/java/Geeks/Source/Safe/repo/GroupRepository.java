package Geeks.Source.Safe.repo;

import Geeks.Source.Safe.Entity.Group;
import Geeks.Source.Safe.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

    public interface GroupRepository extends JpaRepository<Group, UUID> {
//        boolean existsByIdAndMembers_Id(UUID groupId, UUID userId);
//        List<Group> findByUsersNotContaining(User user);
    }
