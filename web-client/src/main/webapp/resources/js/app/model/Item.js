/**
 * Created by istrakhouski on 2/14/14.
 */
Ext.define('Farm.model.Item', {
    extend: 'Ext.data.Model',
    idProperty: 'itemId',
    fields: [
        {name: 'itemId', type: 'string'},
        'name',
        'description',
        {name: 'price', type: 'string'}
    ]
});
