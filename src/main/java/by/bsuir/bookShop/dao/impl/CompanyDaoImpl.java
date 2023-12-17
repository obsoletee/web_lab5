package by.bsuir.bookShop.dao.impl;


import by.bsuir.bookShop.dao.CompanyDao;
import by.bsuir.bookShop.entity.Company;
import by.bsuir.bookShop.sessionFactory.SessionFactoryImpl;
import by.bsuir.bookShop.utils.SessionUtils;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class CompanyDaoImpl implements CompanyDao {
    @Override
    public boolean addCompany(Company company) {
        return SessionUtils.saveEntity(company);
    }

    @Override
    public boolean updateCompany(Company company) {
        return SessionUtils.updateEntity(company);
    }

    @Override
    public boolean deleteCompany(int id) {
        return SessionUtils.deleteEntity(id, Company.class);
    }

    @Override
    public Company findCompanyById(int id) {
        return SessionUtils.find(Company.class, id, "companyId");
    }

    @Override
    public Company findCompanyByName(String name) {
        return SessionUtils.find(Company.class, name, "companyName");
    }

    @Override
    public List<Company> showCompanies() {
        return (List<Company>) SessionFactoryImpl.getSessionFactory().openSession().createQuery("From Company").list();
    }
}

