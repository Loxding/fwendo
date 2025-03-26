```json
{
  "title": "Lanterns",
  "icon": "minecraft:lantern",
  "category": "fwendo:amendments_category",
  "required_advancements": [
    "minecraft:recipes/decorations/lantern"
  ],
  "associated_items": [
    "minecraft:lantern",
    "minecraft:soul_lantern"
  ],
  "ordinal": 1
}
```

- Vanilla and modded lanterns can now be placed on walls!
- Wall lanterns are animated with actual physics and will swing if they are hit by an entity
- Lanterns will have a unique animation when in first or third person

;;;;;

- Animation and fancy renderer can be disabled and replaced with a static block model in the config.
  - This could give a very slight fps boost (this option is also always on when looking at them at a certain distance)
- Works with any modded lantern and is controlled by a tag
