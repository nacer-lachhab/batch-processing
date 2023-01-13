package ma.nacer.bankspringbatch.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankTransactionRepo extends JpaRepository<BankTransaction,Long> {
}
