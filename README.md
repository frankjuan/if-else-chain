# A convenient tool
 @Test
 void br2() {
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
