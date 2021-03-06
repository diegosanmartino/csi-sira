/**
 * Copyright 2016, GeoSolutions Sas.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */
const DebugUtils = require('../../MapStore2/web/client/utils/DebugUtils');
const {combineReducers} = require('redux');
const {syncHistory, routeReducer} = require('redux-simple-router');
const {hashHistory} = require('react-router');
const reduxRouterMiddleware = syncHistory(hashHistory);

const {isArray} = require('lodash');
const LayersUtils = require('../../MapStore2/web/client/utils/LayersUtils');

const layers = require('../../MapStore2/web/client/reducers/layers');
const mapConfig = require('../../MapStore2/web/client/reducers/config');

const map = require('../../MapStore2/web/client/reducers/map');

const queryform = require('../reducers/queryform');
const siradec = require('../reducers/siradec');

const grid = require('../reducers/grid');

const assign = require('object-assign');

const allReducers = combineReducers({
    userprofile: require('../reducers/userprofile'),
    mapInfo: require('../reducers/mapInfo'),
    search: require('../../MapStore2/web/client/reducers/search'),
    browser: require('../../MapStore2/web/client/reducers/browser'),
    locale: require('../../MapStore2/web/client/reducers/locale'),
    draw: require('../../MapStore2/web/client/reducers/draw'),
    siraControls: require('../reducers/controls'),
    controls: require('../../MapStore2/web/client/reducers/controls'),
    locate: require('../../MapStore2/web/client/reducers/locate'),
    measurement: require('../../MapStore2/web/client/reducers/measurement'),
    routing: routeReducer,
    queryform: queryform,
    siradec: siradec,
    map: () => {return null; },
    layers: () => {return null; },
    mapInitialConfig: () => {return null; },
    cardtemplate: require('../reducers/card'),
    featuregrid: require('../reducers/featuregrid'),
    grid: grid
});

const rootReducer = (state = {}, action) => {
    let mapState = LayersUtils.splitMapAndLayers(mapConfig(state, action));

    if (mapState && isArray(mapState.layers)) {
        let groups = LayersUtils.getLayersByGroup(mapState.layers);
        mapState.layers = {flat: LayersUtils.reorder(groups, mapState.layers), groups: groups};
    }

    let newState = assign({}, {...allReducers(state, action)}, {
        mapInitialConfig: mapState ? mapState.mapInitialConfig : null,
        map: mapState && mapState.map ? map(mapState.map, action) : null,
        layers: mapState ? layers(mapState.layers, action) : null
    });

    return newState;
};

const store = DebugUtils.createDebugStore(rootReducer, {}, [reduxRouterMiddleware]);

// Required for replaying actions from devtools to work
reduxRouterMiddleware.listenForReplays(store);

module.exports = store;
