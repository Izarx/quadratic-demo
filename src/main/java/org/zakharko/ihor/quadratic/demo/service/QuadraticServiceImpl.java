package org.zakharko.ihor.quadratic.demo.service;

import org.springframework.stereotype.Service;
import org.zakharko.ihor.quadratic.demo.dao.QuadraticRepository;
import org.zakharko.ihor.quadratic.model.Quadratic;

@Service
public class QuadraticServiceImpl implements QuadraticService{

    private QuadraticRepository quadraticRepository;

    public QuadraticServiceImpl(final QuadraticRepository quadraticRepository) {
        this.quadraticRepository = quadraticRepository;
    }


    @Override
    public Quadratic create(final Quadratic quadratic)
    {
        return null;
    }

    @Override
    public Quadratic readById(final long id)
    {
        return null;
    }

    @Override
    public void delete(final long id)
    {

    }

    @Override
    public Quadratic[] getAll()
    {
        return new Quadratic[0];
    }

    @Override
    public Double[] answear(final int a, final int b, final int c) {
        Double[] answear =  new Double[2];
        int d = calculateD(a, b, c);
        if (d >= 0){
            answear[0] = (-b + Math.sqrt(d))/(2*a);
            answear[1] = (-b - Math.sqrt(calculateD(a, b, c)))/(2*a);
        }
        else {
            answear[0] = null;
            answear[1] = answear[0];
        }
        return answear;
    }

    @Override
    public int calculateD(final int a, final int b, final int c)
    {
        return b*b - 4*a*c;
    }
}
