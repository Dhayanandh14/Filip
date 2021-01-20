a,b=gets.chomp.split.map(&:to_i)
if a.to_s.reverse.to_i>b.to_s.reverse.to_i
  print a.to_s.reverse.to_i
else
  print b.to_s.reverse.to_i
end


