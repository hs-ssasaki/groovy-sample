// @Grabはgroovyでライブラリを読み込むアノテーション
@Grab("thymeleaf-spring4")
@Controller
class App {
  // @ResponseBodyの場合、レスポンスとしてはModelAndViewクラスを返す
  @RequestMapping("/")
  @ResponseBody
  def home(ModelAndView mav) {
    // viewの名前設定
    mav.setViewName("home")
    // groovyではメソッドの最後の値が返り値になる
    mav
  }
}
