/*
 * Interface for those accounts that can exchange different currencies.
 */

package fancybank.account;

public interface Exchangeable {
    public boolean exchangeTo(Account accouunt, Balance exBalance);
}