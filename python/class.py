class attend :
    def __init__(self,name,tickets) :
        self.name = name
        self.ticktets = tickets

    def displayAttend (self):
        print("Name:{} ,tickets:{}".format(self.name,self.ticktets))
    def addTickets (self):
        self.ticktets +=1
        print("tickets become {}".format(self.ticktets))
    def decreaseTickets(self):
        self.ticktets -= 1
        print("tickets become {}".format(self.ticktets))

att1 = attend("Ahmed",2)
att2 = attend("mahmoud",1)
att2.displayAttend()
att2.addTickets()
att1.displayAttend()
att2.displayAttend()
