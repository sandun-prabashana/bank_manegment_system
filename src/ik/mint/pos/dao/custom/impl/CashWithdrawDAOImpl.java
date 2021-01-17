package ik.mint.pos.dao.custom.impl;

import ik.mint.pos.dao.CrudUtil;
import ik.mint.pos.dao.custom.CashWithdrawDAO;
import ik.mint.pos.entity.AccountDetail;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public class CashWithdrawDAOImpl implements CashWithdrawDAO {
    @Override
    public boolean add(AccountDetail accountDetail) throws ClassNotFoundException, SQLException {
        String SQL = "INSERT INTO Account_Detail VALUES (?,?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(SQL,accountDetail.getRef(),accountDetail.getDate(),accountDetail.getAccountNumber(),accountDetail.getDeatil(),accountDetail.getWithdraw(),accountDetail.getDeposit(),accountDetail.getBalance());
    }

    @Override
    public boolean delete(Integer integer) throws ClassNotFoundException, SQLException {
        return false;
    }

    @Override
    public boolean update(AccountDetail accountDetail) throws ClassNotFoundException, SQLException {
        return false;
    }

    @Override
    public AccountDetail search(Integer integer) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public ObservableList<AccountDetail> getAll() throws ClassNotFoundException, SQLException {
        return null;
    }
}
