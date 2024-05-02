package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Grade;

public interface IGradeRepo extends CrudRepository<Grade, Integer>{

	ArrayList<Grade> findByStudentIdS(int id);

	ArrayList<Grade> findByStudentIdSAndGrvalueLessThan(int id, int i);

}
