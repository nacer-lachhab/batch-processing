package ma.nacer.bankspringbatch.config;

import ma.nacer.bankspringbatch.dao.BankTransaction;
import ma.nacer.bankspringbatch.dao.BankTransactionRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankTransactItemWriterConfig implements ItemWriter<BankTransaction> {
    @Autowired
    private BankTransactionRepo bankTransactionRepo;

    @Override
    public void write(List<? extends BankTransaction> list) throws Exception {
        bankTransactionRepo.saveAll(list);
    }
}
