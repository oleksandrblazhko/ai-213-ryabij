|FR id|TC id|Опис кроків тестового сценарію|Опис очікуваних результатів|
|:-----:|:-----:|:-----|:-----:|
|FR1.1|TC 1.1|Початкові умови: користувач має бути авторизований<br> Кроки сценарію:<br> user = "Andrii"<br> location = "New York"|Результат:<br>airQuality=The city of New York today has excellent air quality.The level of air pollution at the moment meets all norms and safety standards. Citizens can enjoy fresh air and safe living conditions <br> temperature=24<br>result=1|
|FR1.1|TC 1.2|Початкові умови: користувач має бути авторизований<br> Кроки сценарію:<br> user = ""<br> location = "New York"|result=-1|
|FR1.1|TC 1.3|Початкові умови: користувач має бути авторизований<br> Кроки сценарію:<br> user = "Andrii"<br> location = "New York 131"|result=-1|
|FR1.1|TC 1.4|Початкові умови: користувач має бути авторизований<br> Кроки сценарію:<br> user = "Andrii"<br> location = "Tooo long input location "|result=-1|
