import scala.language.experimental.macros
import scala.reflect.macros._

object Macros {
  def impl(c: scala.reflect.macros.blackbox.Context) = {
    import c.universe._
    c.Expr[Unit](q"""println("Hello World")""")
  }

  def hello: Unit = macro impl
}
