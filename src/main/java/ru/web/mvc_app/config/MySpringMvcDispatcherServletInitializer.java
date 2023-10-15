package ru.web.mvc_app.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer { // Класс наследует от абстрактного класса

	@Override // Аннотация, которая указывает, что этот метод переопределяет метод из суперкласса
	protected Class<?>[] getRootConfigClasses() { // Метод для получения корневых классов конфигурации
		return null; // Возвращаем null, так как не используем корневую конфигурацию
	}

	@Override // Аннотация, которая указывает, что этот метод переопределяет метод из суперкласса
	protected Class<?>[] getServletConfigClasses() { // Метод для получения классов конфигурации сервлета
		return new Class[] {SpringConfig.class}; // Возвращаем массив с одним элементом - классом SpringConfig, который содержит настройки приложения
	}

	@Override // Аннотация, которая указывает, что этот метод переопределяет метод из суперкласса
	protected String[] getServletMappings() { // Метод для получения маппингов сервлета
		return new String[] {"/"}; // Возвращаем массив с одним элементом - строкой "/", которая означает, что все запросы будут обрабатываться диспетчер-сервлетом
	}

}
