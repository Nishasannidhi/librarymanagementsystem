package com.capgemini.librarymanagementsystem.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexInfo {
	//RegEx
		public Integer regexId(String id) {
			Pattern pat = Pattern.compile("\\d+");
			Matcher mat = pat.matcher(id);
			if(mat.matches()) {
				return Integer.parseInt(id);
			}else {
				return null;
			}
		}
		public String regexEmail(String email) {
			Pattern pat = Pattern.compile("\\w+\\@\\w+\\.\\w+");
			Matcher mat = pat.matcher(email);
			if(mat.matches()) {
				return email;
			}else {
				return null;
			}
		}
		public String regexPassword(String password) {
			Pattern pat = Pattern.compile("\\w+\\@\\d+");
			Matcher mat = pat.matcher(password);
			if(mat.matches()) {
				return password;
			}else {
				return null;
			}
		}
		public Long regexMobileno(String mobileNo) {
			Pattern pat = Pattern.compile("\\d{10}");
			Matcher mat = pat.matcher(mobileNo);
			if(mat.matches()) {
				return Long.parseLong(mobileNo);
			}else {
				return null;
			}
		}
}
