RM = rm -rf
INOTIFY = inotifywait -mrq -e modify --format '%w%f'

CJ = javac
CJFLAGS =

SRCS = $(shell find -name '*.java')
OBJS = $(SRCS:%.java=%.class)

%.class: %.java
	$(CJ) $(CJFLAGS) $<

all: $(OBJS)

run: $(OBJS)
	java drivenow.tests.BeispielTest

watch:
	$(INOTIFY) $(SRCS) | while read -r ln; do $(CJ) $$ln; done

clean:
	$(RM) $(OBJS)
