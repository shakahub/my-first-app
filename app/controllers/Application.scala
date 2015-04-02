package controllers

import play.api._
import play.api.mvc._


object Application extends Controller {

//  def index = Action {
//    Ok(views.html.index("Hello World!"))
//  }

  def hello(name:String) = Action {
    //Ok("YODA")
    Ok(views.html.hello("yixing"+name))
  }

  def index = Action {
    //Redirect(routes.Products.list())
    val f:Future[Response]  =


  }
}