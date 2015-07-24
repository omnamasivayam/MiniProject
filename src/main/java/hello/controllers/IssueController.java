package hello.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.util.Date;
import hello.models.Issue;
import hello.models.IssueDao;


@Controller
public class IssueController{

@Autowired
	  public IssueDao issueDao;

@RequestMapping("/")
  @ResponseBody
  public ModelAndView index() {
	  ModelAndView modelAndView = new ModelAndView("Home");
	  modelAndView.addObject("Issue", new Issue("123", "abc", new Date()));
	  Object issueList = issueDao.findAll();
	  modelAndView.addObject("issueList", issueList);
	  return modelAndView;
  }
}