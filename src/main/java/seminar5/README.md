Домашнее задание

*Задание 1. *Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

*Задание 2. *Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили.
Проверка того, что функция addContact корректно добавляет новый контакт в список контактов"".
""Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов"".
""Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление"".



1 Юнит-тест "Добавление контакта" (Unit Test "Add Contact"): Этот тест проверяет функциональность добавления нового контакта в записную книжку. Он убеждается, что приложение корректно обрабатывает добавление новой информации и сохраняет ее в базе данных.

Юнит-тест "Редактирование контакта" (Unit Test "Edit Contact"): Данный тест проверяет возможность редактирования существующего контакта в приложении. Он убеждается, что все изменения вносятся правильно и сохраняются в базе данных.

Юнит-тест "Удаление контакта" (Unit Test "Delete Contact"): Этот тест проверяет функциональность удаления контакта из записной книжки. Он убеждается, что приложение корректно удаляет выбранный контакт и обновляет базу данных.

Интеграционный тест "Добавление контакта с валидными данными" (Integration Test "Add Contact with Valid Data"): Данный тест проверяет взаимодействие различных компонентов приложения при добавлении контакта с корректными данными. Он убеждается, что данные корректно проходят через все уровни приложения и успешно сохраняются.

Интеграционный тест "Редактирование контакта с некорректными данными" (Integration Test "Edit Contact with Invalid Data"): Этот тест проверяет, как приложение обрабатывает попытку редактирования контакта с некорректными данными. Он убеждается, что приложение корректно обнаруживает ошибку и не позволяет сохранить некорректные данные.

Сквозной тест "Добавление контакта и проверка в интерфейсе" (End-to-End Test "Add Contact and Check in UI"): Этот тест проверяет, что добавленный контакт корректно отображается в пользовательском интерфейсе после добавления. Он убеждается, что данные отображаются верно и пользователь может успешно взаимодействовать с новым контактом.

2. 
Юнит-тест "Добавление контакта" : Этот тест является юнит-тестом, так как он впервые разработал функцию addContact для корректности добавления нового контакта в список контактов. Он сосредоточен на разработке и изменении конкретной функции независимо от других компонентов приложения.

Интеграционный тест «Отображение контакта через пользовательский интерфейс» : Этот тест является интеграционным, так как он вначале взаимодействует между различными компонентами приложения при добавлении контакта через пользовательский интерфейс и правильностью отображения этого контакта в списке контактов. Он определяет несколько компонентов приложения и их взаимодействие.

Сквозной тест "Полный цикл работы с контактом" : Этот тест является сквозным тестом, так как он впоследствии завершил полный цикл работы с контактом, включая создание, редактирование и удаление. Он описывает несколько компонентов приложения и их взаимодействие от начала до конца цикла работы с контактом.