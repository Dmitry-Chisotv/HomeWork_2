public class HomeTask_2 {
    public static void main(String[] args) {
        String str1 = "Hello world and olleH";
        String str2 = "Hello";

//  1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        System.out.println(String.valueOf(str1.contains(str2)));

//  2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        StringBuilder str2rev = new StringBuilder(str2);
        System.out.println(str2rev.reverse());
        System.out.println(String.valueOf(str1.contains(str2rev)));

//  3. Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        char[] c = str1.toCharArray();
        reverse(c, 0, c.length-1);
        String str1rev = new String(c);
        System.out.println(c);

//  4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
//     3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        int i1 = 3;
        int i2 = 56;
        int i3 = i1+i2;
        int i4 = i1-i2;
        int i5 = i1 * i2;

        StringBuilder s1 = new StringBuilder();
        s1.append(i1 + " + " + i2 + " = " + i3);
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder();
        s2.append(i1 + " - " + i2 + " = " + i4);
        System.out.println(s2);

        StringBuilder s3 = new StringBuilder();
        s3.append(i1 + " * " + i2 + " = " + i5);
        System.out.println(s3);

//  5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        s2.deleteCharAt(7);
        s2.insert(7, "равно");
        System.out.println(s2);

//  6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        s3.replace(7, 8, "равно");
        System.out.println(s3);

//  7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

        double begin = System.currentTimeMillis();
        String r1 = "=".repeat(10000);
        System.out.println(r1);
        r1 = r1.replace("=", "равно ");
        System.out.println(r1);
        System.out.println(System.currentTimeMillis()-begin);

        StringBuilder r2 = new StringBuilder("=".repeat(10000));
        System.out.println(r2);
        for (int i=0; i< 10000; i++){
            r2.replace(0, 1, " равно ");
        }
        System.out.println(r2);
        System.out.println(System.currentTimeMillis()-begin);
    }

    private static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c [j];
        c[j] = temp;
    }

    public static void reverse(char[] c, int  l, int h) {
        if (l<h) {
            swap(c, l, h);
            reverse(c, l+1, h-1);
        }
    }
}
