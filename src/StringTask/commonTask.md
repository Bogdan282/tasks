# 80 Завдань з Обробки Рядків (Без Використання Регулярних Виразів)

1. **Перевірка email без regex:**  
   Перевірте, чи містить рядок символ «@» та хоча б одну крапку після нього, а також що частини до та після «@» не є порожніми.

2. **Перевірка номера телефону:**  
   Визначте, чи відповідає номер телефону формату `+380 (XX) XXX-XX-XX`, порівнюючи символи на певних позиціях та перевіряючи наявність необхідних роздільників (дужок, пробілів, дефісів).

3. **Виділення домену з URL:**  
   Розбийте URL за символом «/» і виберіть ту частину, що містить доменне ім’я.

4. **Розбиття тексту на слова:**  
   Замініть звичайні знаки пунктуації на пробіли, а потім використовуйте метод `split`, щоб отримати список слів.

5. **Підрахунок кількості слів:**  
   Розбийте текст за пробілами та порахуйте кількість отриманих елементів.

6. **Заміна емодзі на текст:**  
   Створіть функцію, яка за допомогою послідовних викликів `replace` замінює відомі емодзі (наприклад, 😊) на їх текстові позначення (наприклад, `:smile:`).

7. **Підрахунок голосних та приголосних:**  
   Переберіть символи рядка та порівняйте кожен символ з набором голосних (наприклад, «aeiou» або відповідні українські голосні) для підрахунку голосних і приголосних.

8. **Генерація URL slug:**  
   Перетворіть заголовок, видаливши небажані символи (за допомогою циклу) та замінивши пробіли на дефіси, а потім переведіть весь рядок у нижній регістр.

9. **Перетворення в camelCase:**  
   Розбийте рядок за пробілами, перетворіть першу літеру кожного слова (крім першого) на верхній регістр та об’єднайте їх без пробілів.

10. **Перетворення в snake_case:**  
    Розбийте рядок за пробілами та з’єднайте слова за допомогою символу підкреслення, при цьому перевівши весь рядок у нижній регістр.

11. **Реверс порядку слів:**  
    Розбийте речення на слова, а потім створіть новий рядок, вставляючи слова у зворотному порядку, зберігаючи порядок символів у кожному слові.

12. **Виділення чисел з тексту:**  
    Пройдіться по рядку символ за символом та накопичуйте послідовності цифр, використовуючи метод `isdigit()` та накопичення підрядків.

13. **Підрахунок частоти слів:**  
    Розбийте текст на слова та створіть словник, де ключ — слово, а значення — кількість його входжень.

14. **Форматування з відступами:**  
    Розбийте багаторядковий текст за символами нового рядка та додайте задану кількість пробілів (відступ) на початку кожного рядка.

15. **Видалення HTML-тегів:**  
    Знайдіть позиції символів «<» та «>» за допомогою методів пошуку та видаліть вміст між ними, залишивши лише текст.

16. **Парсинг CSV-рядка:**  
    Розбийте рядок за комами, враховуючи, що якщо елемент оточений лапками, його коми не є роздільниками (реалізуйте за допомогою покрокового обходу рядка).

17. **Маскування конфіденційних даних:**  
    Замініть частину рядка (наприклад, номер кредитної картки) на символи `*`, залишаючи видимими лише останні чотири цифри.

18. **Перевірка на паліндром (з урахуванням регістру):**  
    Порівняйте рядок з його перевернутою версією (наприклад, використовуючи зріз [::-1]) та поверніть результат.

19. **Перевірка на паліндром (без урахування регістру та пробілів):**  
    Приведіть рядок до одного регістру, видаліть пробіли (за допомогою `replace` або комбінації `split` та `join`) та порівняйте його з перевернутою версією.

20. **Заміна послідовних пробілів:**  
    Розбийте рядок методом `split` (який ігнорує додаткові пробіли) та об’єднайте слова, розділяючи їх одним пробілом.

21. **Пошук найдовшого слова:**  
    Розбийте рядок на слова та за допомогою циклу визначте слово з максимальною довжиною.

22. **Обчислення суми чисел у тексті:**  
    Розбийте рядок на слова, перетворіть ті, що є числами (за допомогою `isdigit()`), і порахуйте їхню суму.

23. **Розбиття тексту на речення:**  
    Використовуючи знаки пунктуації (".", "!" та "?"), розділіть текст на окремі речення (наприклад, замінивши їх на спільний роздільник, а потім використовуючи `split`).

24. **Пошук слова, що починається з певної літери:**  
    Перевірте, чи містить текст слово, яке починається з заданої літери, перебираючи список слів та перевіряючи перший символ кожного.

25. **Заміна перших N входжень підрядка:**  
    Реалізуйте заміну перших N входжень заданого підрядка, використовуючи цикл, метод `find` та зрізи рядка.

26. **Підрахунок символів (без пробілів та знаків пунктуації):**  
    Пройдіться по рядку та порахуйте символи, для яких метод `isalpha()` повертає True.

27. **Форматування рядка за шаблоном:**  
    Використовуйте метод `format` (або f-string) для вставки змінних у заздалегідь заданий шаблон рядка.

28. **Розбиття email на частини:**  
    Розділіть адресу електронної пошти за символом «@» для отримання імені користувача та домену.

29. **Пошук усіх входжень слова:**  
    Використовуйте цикл із методом `find` (оновлюючи початкову позицію) для знаходження всіх індексів, де зустрічається задане слово.

30. **Виділення дат із тексту (формати DD-MM-YYYY або DD/MM/YYYY):**  
    Реалізуйте пошук дат, розбиваючи текст на частини та перевіряючи, чи відповідає знайдений підрядок шаблону (наприклад, за розташуванням символів "-" або "/").

31. **Обрізання рядка з додаванням багатокрапки:**  
    Якщо довжина рядка перевищує заданий ліміт, обріжте його та додайте в кінці символ «…» (еліпсис).

32. **Перевірка, чи починається рядок з цифри:**  
    Перевірте перший символ рядка за допомогою `isdigit()`.

33. **Валідація IP-адреси:**  
    Розбийте рядок за крапками, переконайтеся, що отримано рівно 4 частини, та перевірте, чи кожна частина є числом від 0 до 255.

34. **Виділення версії програми:**  
    Знайдіть у рядку послідовність, що починається з символу «v» та містить цифри і крапки, використовуючи методи пошуку та зрізи.

35. **Видалення послідовних повторюваних символів:**  
    Пройдіться по рядку та сформуйте новий, додаючи символ лише якщо він відрізняється від попереднього.

36. **Перетворення рядка в набір унікальних символів:**  
    Перетворіть рядок у множину (set), яка містить лише унікальні елементи, а потім, за бажанням, з’єднайте їх назад у рядок.

37. **Сортування символів у рядку:**  
    Перетворіть рядок у список, відсортуйте його за допомогою `sorted` та об’єднайте відсортовані символи назад у рядок.

38. **Генерація випадкового рядка:**  
    Згенеруйте рядок заданої довжини, випадково обираючи символи з певного набору (наприклад, за допомогою модуля `random`).

39. **Порівняння рядків за числовими значеннями:**  
    Виділіть цифри з обох рядків (перевіряючи за допомогою `isdigit()`) та порівняйте отримані числові послідовності.

40. **Вирівнювання тексту по центру:**  
    Використовуйте метод `center`, щоб відформатувати рядок у полі заданої ширини.

41. **Перетворення чисел у двійковий формат:**  
    Розбийте рядок на слова, визначте, які з них є числами, та перетворіть кожне число за допомогою функції `bin()`.

42. **Підрахунок кожного символу:**  
    Створіть словник, де кожен ключ — це символ із рядка, а значення — кількість його входжень.

43. **Перевірка на шістнадцятковий формат:**  
    Переконайтеся, що кожен символ рядка належить до допустимого набору (0–9, A–F або a–f).

44. **Кодування в Base64:**  
    Використовуйте стандартну бібліотеку (наприклад, модуль `base64` у Python) для перетворення рядка в його Base64-представлення.

45. **Декодування з Base64:**  
    Аналогічно, за допомогою стандартної бібліотеки перетворіть Base64-рядок назад у звичайний текст.

46. **Видалення неалфавітних символів:**  
    Пройдіться по рядку та сформуйте новий, додаючи лише ті символи, для яких метод `isalpha()` повертає True.

47. **Заміна спеціальних символів на текстові сутності:**  
    Використовуйте послідовні виклики `replace`, щоб замінити символи, такі як `&`, `<` та `>`, на їх відповідні текстові сутності.

48. **Виділення імені файлу з шляху:**  
    Розбийте повний шлях за символами `/` або `\` та виберіть останній елемент.

49. **Виділення розширення файлу:**  
    Розбийте ім’я файлу за крапкою (`.`) та візьміть останній елемент як розширення.

50. **Маскування частини рядка:**  
    Замініть певну частину рядка (наприклад, пароль або номер карти) символами `*`, залишаючи видимими лише певну кількість символів з початку або кінця.


51. **Перетворення рядка у список символів:**  
    Перетворіть рядок у список, де кожен елемент — окремий символ.

52. **Об’єднання списку рядків:**  
    За допомогою методу `join` об’єднайте список рядків в один рядок із заданим роздільником.

53. **Перевірка наявності підрядка:**  
    Напишіть функцію, яка визначає, чи міститься заданий підрядок у рядку (використовуючи оператор `in`).

54. **Перетворення рядка у верхній регістр:**  
    Використовуйте метод `upper()`, щоб перетворити всі символи рядка у верхній регістр.

55. **Перетворення рядка у нижній регістр:**  
    Аналогічно, використовуйте метод `lower()` для приведення рядка до нижнього регістру.

56. **Заміна символів на їх порядкові номери:**  
    Пройдіться по рядку та замініть кожен символ на його порядковий номер в алфавіті (наприклад, 'a' → 1, 'b' → 2).

57. **Створення абревіатури з фрази:**  
    Візьміть першу літеру кожного слова у фразі та сформуйте абревіатуру.

58. **Реверсування всього рядка:**  
    Напишіть функцію, яка перевертає весь рядок (усі символи у зворотному порядку).

59. **Перевірка, чи містить рядок лише букви:**  
    Використовуйте метод `isalpha()`, щоб визначити, чи складається рядок виключно з букв.

60. **Перевірка, чи містить рядок лише цифри:**  
    Аналогічно, використовуйте метод `isdigit()` для перевірки, чи містить рядок тільки числові символи.

61. **Видалення зайвих пробілів з країв:**  
    Використовуйте метод `strip()`, щоб видалити пробіли (або інші символи) на початку та в кінці рядка.

62. **Перетворення першої літери кожного слова у велику:**  
    Використовуйте метод `capitalize()` або `title()`, щоб кожне слово починалося з великої літери.

63. **Конкатенація рядків:**  
    Об’єднайте два або більше рядків за допомогою оператора `+` або методу `join`.

64. **Повторення рядка задану кількість разів:**  
    Напишіть функцію, яка повертає вихідний рядок, повторений `n` разів.

65. **Перевірка, чи містить рядок лише друковані символи:**  
    Використовуйте метод `isprintable()` для перевірки.

66. **Заміна всіх входжень символа на інший:**  
    Замініть в рядку один символ на інший за допомогою методу `replace`.

67. **Пошук позиції останнього входження символа:**  
    Використовуйте метод `rfind()`, щоб визначити індекс останнього входження заданого символа.

68. **Розбиття рядка за заданим роздільником:**  
    Розбийте рядок на частини за довільним символом-роздільником, використовуючи метод `split`.

69. **Створення списку пар (слово, довжина):**  
    Розбийте рядок на слова та сформуйте список кортежів, де кожному слову відповідає його довжина.

70. **Виділення підрядка за індексами:**  
    Напишіть функцію, яка повертає підрядок, заданий початковим та кінцевим індексами.

71. **Перевірка, чи закінчується рядок заданим підрядком:**  
    Використовуйте метод `endswith()` для перевірки закінчення рядка.

72. **Перевірка, чи починається рядок заданим підрядком:**  
    Аналогічно, використовуйте метод `startswith()` для перевірки початку рядка.

73. **Заміна символів у рядку за словником:**  
    Визначте словник замін (наприклад, `{'a': '@', 's': '$'}`) та пройдіться по рядку, замінюючи символи відповідно до словника.

74. **Перетворення рядка у список ASCII-кодів:**  
    Пройдіться по символах рядка та створіть список їх числових ASCII-кодів (за допомогою `ord`).

75. **Перетворення списку ASCII-кодів назад у рядок:**  
    Напишіть функцію, яка приймає список чисел та повертає рядок, конвертуючи кожне число у символ за допомогою `chr`.

76. **Перевірка, чи є рядок паліндромом (без пунктуації):**  
    Видаліть із рядка відомі знаки пунктуації (наприклад, за допомогою `replace`) та перевірте, чи є рядок паліндромом, за бажанням ігноруючи регістр.

77. **Перетворення рядка у список слів із збереженням пунктуації:**  
    Реалізуйте розбиття рядка на слова, зберігаючи пунктуаційні знаки, що прилегли до слів (наприклад, використовуючи метод, який зберігає роздільники).

78. **Перевірка наявності хоча б одного слова зі списку:**  
    За заданим списком ключових слів визначте, чи зустрічається хоча б одне з них у рядку.

79. **Видалення всіх голосних із рядка:**  
    Пройдіться по рядку та сформуйте новий, виключаючи символи, що належать до набору голосних (наприклад, "aeiou" або відповідні українські голосні).

80. **Видалення всіх приголосних із рядка:**  
    Аналогічно до попереднього завдання, але залиште лише голосні, видаляючи приголосні.