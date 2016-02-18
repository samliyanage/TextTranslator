package com.translator.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.translator.service.TranslatorService;
import com.translator.util.Speech;

/**
 * Servlet implementation class Translate
 */
public class Translate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String outputLanguage= request.getParameter("outputLanguage");
		String text=request.getParameter("text");
		String translatedText="";
		
		try {
			translatedText=new TranslatorService().textToSpeech(text, outputLanguage);
			new Speech().textToSpeech(translatedText);
			request.setAttribute("translatedText", translatedText);
			request.setAttribute("outputLanguage", outputLanguage);
			RequestDispatcher dispatcher = 
					  getServletContext().getRequestDispatcher("/result.jsp");
					dispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
