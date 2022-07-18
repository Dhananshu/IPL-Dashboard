package io.dhananshu.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.dhananshu.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);

}
