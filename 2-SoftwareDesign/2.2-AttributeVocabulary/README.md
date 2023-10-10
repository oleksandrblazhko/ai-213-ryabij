### Словник атрибутів об’єктів
| Об’єкт | Атрибут | 	Короткий опис | Тип |  Обмеження |
| --- | --- | --- | --- | --- |
| User | fullName | Як звати користувача | Текст| Довжина < 100 символів|
| User | email | Коли користувач народився | Текст| Довжина < 50 символів|
| User | location | Якої користувач статі | Текст| Довжина < 50 символів|
| AirConditionStateRequest | location | Локація місця запиту | Текст| Довжина < 50 символів|
| AirConditionStateRequest | requestType | Тип запиту | Текст| Довжина < 20 символів|
| AirConditionStateRequest | info | Додаткова інформація про запит | Текст| Довжина < 100 символів|
| AirConditionStateAnswer | answerTitle | Зашоловок відповіді | Текст| Довжина < 100 символів|
| AirConditionStateAnswer | info | Дані про стан повітря | Текст| Довжина < 100 символів|
| AirConditionStateAnswer | date | Дата та час | Дата | -|
| EFreshAir | location | Локація пристрою | Текст | Довжина < 50 символів|
| EFreshAir | airConditionState | Інформація про якість повітря | Текст | Довжина < 100 символів |
| PhysicalHealthSpecialist | fullName | Повне ім'я | Текст | Довжина < 100 символів |
| PhysicalHealthSpecialist | gender | Стать | Текст | Довжина < 10 символів |
| PhysicalHealthSpecialist | email | Пошта | Текст | Довжина < 50 символів |
| PhysicalHealthSpecialist | phoneNumber | Номер телефона | Текст | Довжина < 15 символів |
| HealthConsultationRequest | requestDate | Дата запиту | Дата | - |
| HealthConsultationRequest | description | Примітки | Текст | Довжина < 100 символів |
| HealthConsultationRequest | userInfo | Інформація про користувача | Текст | Довжина < 100 символів |
