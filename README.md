# A convenient tool for if-else
```
 @Test
 public void br2() {
     String resultStringx =
             BranchUtils.br(String.class)
                     .ef(true)
                     .then(() -> "string")
                     .elf(false)
                     .then(String::new)
                     .elf(false)
                     .then(String::new)
                     .els(() -> "last")
                     .eval();
     Assertions.assertTrue(resultStringx.equals("string"));
 }
 
 @Test
 public void br1() {
     BranchUtils.br().ef(2 < 1)
             .then(() -> System.out.println("Whats up"))
             .els(() -> System.out.println("I am els")).exec();
 }
 ```
