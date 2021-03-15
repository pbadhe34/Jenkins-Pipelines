def env = System.getenv()
  env.each {
 println it
}
or:
def env = System.getenv()
println env['BUILD_NUMBER']