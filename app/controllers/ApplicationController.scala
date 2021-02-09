import javax.inject.Inject
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

class ApplicationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index() = TODO

}