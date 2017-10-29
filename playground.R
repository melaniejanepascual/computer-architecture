ll = list(1:5, 6:8)
t(ll)
setDT(t(ll, fill=0))[]

dt = data.table(x=1:5, y=6:10)
t(dt)