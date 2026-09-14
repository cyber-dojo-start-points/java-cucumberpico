
lambda { |stdout,stderr,status|
  output = stdout + stderr
  return :red   if /^Tests run: (\d+),(\s)+Failures: (\d+)/.match(output)
  # JUnitCore says OK for a run in which nothing ran, which is what a kata with
  # no class named *Test*, or a feature file holding no scenario, gives it. The
  # count is what keeps that out of green: nothing ran, so nothing was proved.
  if match = /^OK \((\d+) test/.match(output)
    return :amber if match[1] == '0'
    return :green
  end
  return :amber
}
