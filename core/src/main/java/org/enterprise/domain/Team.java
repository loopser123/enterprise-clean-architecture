package org.enterprise.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class Team {
	
	private TeamId teamId; 
	private String team_name; 
	private Set<Employer> teaMembers = new HashSet<Employer>(); 
	
	public Team(Long teamId , String teamName) {
		this.teamId = new TeamId(teamId); 
		this.team_name = teamName; 
	}
	public boolean contains(Employer o) {
		return teaMembers.contains(o);
	}

	public boolean add(Employer e) {
		return teaMembers.add(e);
	}

	public boolean addAll(Collection<? extends Employer> employers) {
		return teaMembers.addAll(employers);
	}

	public void clear() {
		teaMembers.clear();
	}

	public int  calculateTeamEfficiency() {
		return 0; 
	}
	@AllArgsConstructor
	@Data
	public static class TeamId { 
		Long id; 
	}
}
