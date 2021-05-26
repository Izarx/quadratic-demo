package org.zakharko.ihor.quadratic.demo.service;

import org.zakharko.ihor.quadratic.model.Quadratic;

public interface QuadraticService {
    Quadratic create(Quadratic quadratic);
    Quadratic readById(long id);
    void delete(long id);

    Quadratic[] getAll();

    Double[] answear (int a, int b, int c);
    int calculateD (int a, int b, int c);
}
