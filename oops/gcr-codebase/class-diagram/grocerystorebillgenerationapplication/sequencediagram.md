
```
Customer                 BillGenerator
   |                           |
   | checkout()                |
   |-------------------------->|
   |                           |
   | getProductDetails()       |
   |<--------------------------|
   |                           |
   | calculateItemCost()       |
   |-------------------------->|
   |                           |
   | calculateTotalBill()      |
   |-------------------------->|
   |                           |
   | generateBill()            |
   |-------------------------->|
   |                           |
   | returnTotalAmount()       |
   |<--------------------------|
   |                           |
```