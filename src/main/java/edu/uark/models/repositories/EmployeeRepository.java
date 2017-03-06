package edu.uark.models.repositories;

import edu.uark.dataaccess.repository.BaseRepository;
import edu.uark.dataaccess.repository.DatabaseTable;
import edu.uark.models.entities.EmployeeEntity;
import edu.uark.models.repositories.interfaces.EmployeeRepositoryInterface;

public class EmployeeRepository extends BaseRepository<EmployeeEntity> implements EmployeeRepositoryInterface
{
	public EmployeeRepository () {
		super(DatabaseTable.NONE); //Need to add Employee implementation
		//More to be added
	}

	@Override
	protected EmployeeEntity createOne() {
		//More to be Added
		return null;
	}

	@Override
	public EmployeeEntity byEmployeeId(String employeeId) {
		//More to be added
		return null;
	}
	

}
