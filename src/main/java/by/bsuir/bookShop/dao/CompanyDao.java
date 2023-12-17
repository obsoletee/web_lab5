package by.bsuir.bookShop.dao;

import by.bsuir.bookShop.entity.Company;

import java.util.List;

public interface CompanyDao {
    boolean addCompany(Company company);
    boolean updateCompany(Company company);
    boolean deleteCompany(int id);
    List<Company> showCompanies();
    Company findCompanyById(int id);
    Company findCompanyByName(String name);
}