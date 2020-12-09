package in.codegram.ppmtoolapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.ppmtoolapi.domain.Project;
import in.codegram.ppmtoolapi.exception.ProjectIDException;
import in.codegram.ppmtoolapi.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdate(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		}
		catch (Exception e) {
			throw new ProjectIDException("ProjectIdentifier "+project.getProjectIdentifier()+" already available");
		}
	}
	
	public Project findProjectByProjectIdentifier(String projectIdentifier) {
		Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if (project == null) {
			throw new ProjectIDException("ProjectIdentifier " + projectIdentifier + " not available");
		}
		return project;

	}
	
	public Iterable<Project> findAllProjects(){
		return projectRepository.findAll();
	}
	
	public void deleteProjectByProjectIdentifier(String projectIdentifier) {
		Project project=findProjectByProjectIdentifier(projectIdentifier.toUpperCase());
		if(project==null) {
			throw new ProjectIDException("ProjectIdentifier " + projectIdentifier + " not available");
		}
		projectRepository.delete(project);
	}

}