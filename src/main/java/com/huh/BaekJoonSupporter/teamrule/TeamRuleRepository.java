package com.huh.BaekJoonSupporter.teamrule;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamRuleRepository extends JpaRepository<TeamRule, Long> {
    Optional<TeamRule> findByTarget(String Target);
}
