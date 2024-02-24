# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.sevenhundreds.SevenHundreds {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/sevenhundreds/repack'
-flattenpackagehierarchy
-dontpreverify
