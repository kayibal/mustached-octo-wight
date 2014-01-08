RM = rm -rf

CJ = javac
CJFLAGS =

SRCS = $(shell find -name '*.java')
OBJS = $(SRCS:%.java=%.class)

%.class: %.java
	$(CJ) $(CJFLAGS) $<

all: $(OBJS)

run: $(OBJS)
	java drivenow.tests.BeispielTest

clean:
	$(RM) $(OBJS)
