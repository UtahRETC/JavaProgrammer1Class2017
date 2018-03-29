.PHONY: build server

WEBPACK = ./node_modules/.bin/webpack
WEBPACKSERVER = ./node_modules/.bin/webpack-dev-server
WEBPACKFLAGS = --config config/webpack.js

ifdef NODE_ENV
	WEBPACKFLAGS += --mode $(NODE_ENV)
else
	WEBPACKFLAGS += --mode production
endif

build:
	if [ ! -d dist ]; then mkdir dist; fi
	cp index.html dist/
	$(WEBPACK) $(WEBPACKFLAGS)

server:
	$(WEBPACKSERVER) $(WEBPACKFLAGS)

deps:
	npm install
