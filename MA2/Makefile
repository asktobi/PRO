#############################################
#    MAKEFILE FOR A GENERIC JAVA PROJECT    #
#############################################
#                                           #
# This is a simple Projectmanagement script #
#       written and maintained by asktj     #
#                                           #
#                                           #
# Im writing this for everyone so pls feel  #
# free to edit, modify and change the whole #
#        Makefile as much as u like.        #
#                                           #
#############################################


# The main git repository
 GITREPO = 

# The C compiler u wanna use
 CC      = javac
 LD      = 

# General Optimization flags
 CCFLAGS =
 LDFLAGS =

# Library flags
 LIBS    =

# Different executeables you can build
 MAIN    = TimeTest
 TESTS   =

# Source files
 SRC    := $(wildcard *.java)

# Class files
 CLS    := $(patsubst %.java, %.class, $(SRC) )

# Header files
 HDR    :=

# Debugging flags
 DEBUG   =

# Lets make know these are not meant to be files
.PHONY: all run getdeps clean 

# first rule is the one executed when make has no Arguments
all: $(CLS)

run: $(CLS)
	java $(MAIN)

# Compiling the main executable
$(CLS): $(SRC) $(HDR)
	$(CC) $(DEBUG) $(CCFLAGS) $(LDFLAGS) $(LIBS) $(SRC) 

# Some stuff that was usefull in the past and might be in the future
#
#$(SRC): %.o : %.c $(HDR) 
#	$(CC) $(CCFLAGS) -o $@ $<

getdeps: 
	echo "BIN: $(MAIN) $(TESTS)"
	echo "SRC: $(SRC)"
	echo "CLS: $(CLS)"
	echo "HDR: $(HDR)"

# Clean the project from any build and temporary files
clean:
	rm -rf $(CLS)
