const axios = require('../../MapStore2/web/client/libs/ajax');

const LOAD_TILES = 'LOAD_TILES';
const TILES_LOADED = 'TILES_LOADED';
const TILES_LOAD_ERROR = 'TILES_LOAD_ERROR';

function loadTiles() {
	return (dispatch) => {
		return axios.get('tiles.json').then((response) => {
            if (typeof response.data === 'object') {
                dispatch(tilesLoaded(response.data));
            } else {
                try {
                    JSON.parse(response.data);
                } catch(e) {
                    dispatch(loadTilesError('Configuration file for tiles broken: ' + e.message));
                }

            }

        }).catch((e) => {
            dispatch(loadTilesError(e));
        });
	};   
}

function tilesLoaded(data) {
	return {
		type: TILES_LOADED,
		tiles: data.tiles
	};
}

function loadTilesError(error) {
	return {
		type: TILES_LOAD_ERROR,
		error
	};
}

module.exports = {
		LOAD_TILES,
		TILES_LOADED,
		TILES_LOAD_ERROR,
		loadTiles
};