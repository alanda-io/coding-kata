package io.alanda.codingkata.rest;

import io.alanda.codingkata.model.ExampleData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExampleController {

  @GetMapping("/example")
  public String getExample(
      @RequestParam(name = "text", required = false, defaultValue = "") String text,
      @RequestParam(name = "number", required = false, defaultValue = "0") int number,
      Model model) {

    model.addAttribute(new ExampleData(number, text));

    return "exampleResult";
  }

}
