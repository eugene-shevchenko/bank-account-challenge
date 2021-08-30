package com.db.awmd.challenge.service.account.events;

import com.db.awmd.challenge.domain.Account;
import com.db.awmd.challenge.event.GenericEvent;
import lombok.Data;

import java.math.BigDecimal;


public class AccountBalanceTransferredEvent extends GenericEvent<AccountBalanceTransferredEvent.Payload> {

  @Data
  public static class Payload {
    private final Account sender;
    private final Account receiver;
    private final BigDecimal amount;
  }

  public AccountBalanceTransferredEvent(Account sender, Account receiver, BigDecimal amount) {
    super(new Payload(sender, receiver, amount));
  }
}
