.PHONY: build server

WEBPACK = ./node_modules/.bin/webpack
WEBPACKSERVER = ./node_modules/.bin/webpack-dev-server
WEBPACKFLAGS = --config config/webpack.js

ifdef NODE_ENV
	WEBPACKFLAGS += --mode $(NODE_ENV)
else
	WEBPACKFLAGS += --mode production
endif

build: clean
	if [ ! -d dist ]; then mkdir dist; fi
	cp index.html dist/
	cp -r assets dist/assets
	cp node_modules/tachyons/css/tachyons.min.css dist/
	$(WEBPACK) $(WEBPACKFLAGS)

clean:
	if [ -d dist ]; then rm -r dist; fi

server:
	$(WEBPACKSERVER) $(WEBPACKFLAGS)

deps:
	npm install
