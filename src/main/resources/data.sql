
DROP TABLE IF EXISTS premium;
CREATE TABLE premium(memberid INT PRIMARY KEY,
policyid int,
topup int,
premiumAmountDue int,
LastpremiumAmount int,
DueDate VARCHAR(30)
);