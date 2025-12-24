```
+----------------------+
|      Customer        |
+----------------------+
| - customerName: String |
| - products: List<Product> |
+----------------------+
| + addProduct(p: Product) |
| + getProducts(): List<Product> |
+----------------------+
          ◆
          | Composition
          |
+----------------------+
|       Product        |
+----------------------+
| - productName: String |
| - quantity: double   |
| - pricePerUnit: double |
+----------------------+
| + getCost(): double  |
+----------------------+


+-----------------------------+
|      BillGenerator          |
+-----------------------------+
|                             |
+-----------------------------+
| + calculateTotal(c: Customer): double |
| + generateBill(c: Customer): void |
+-----------------------------+
              |
              | Uses
              ↓
           Customer
```